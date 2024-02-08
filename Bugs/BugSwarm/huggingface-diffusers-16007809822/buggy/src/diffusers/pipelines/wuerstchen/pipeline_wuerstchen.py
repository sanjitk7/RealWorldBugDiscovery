# Copyright 2023 The HuggingFace Team. All rights reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

from typing import List, Optional, Union

import numpy as np
import torch
from transformers import CLIPTextModel, CLIPTokenizer

from ...models import VQModelPaella
from ...schedulers import DDPMWuerstchenScheduler
from ...utils import is_accelerate_available, logging, randn_tensor
from ..pipeline_utils import DiffusionPipeline, ImagePipelineOutput
from .diffnext import DiffNeXt


logger = logging.get_logger(__name__)  # pylint: disable=invalid-name

EXAMPLE_DOC_STRING = """
    Examples:
        ```py
        >>> import torch
        >>> from diffusers import WuerstchenPriorPipeline, WuerstchenDecoderPipeline

        >>> prior_pipe = WuerstchenPriorPipeline.from_pretrained(
        ...     "warp-diffusion/WuerstchenPriorPipeline", torch_dtype=torch.float16
        ... ).to("cuda")
        >>> gen_pipe = WuerstchenDecoderPipeline.from_pretrain(
        ...     "warp-diffusion/WuerstchenDecoderPipeline", torch_dtype=torch.float16
        ... ).to("cuda")

        >>> prompt = "an image of a shiba inu, donning a spacesuit and helmet"
        >>> prior_output = pipe(prompt)
        >>> images = gen_pipe(prior_output.image_embeds, prompt=prompt)
        ```
"""


class WuerstchenDecoderPipeline(DiffusionPipeline):
    """
    Pipeline for generating images from the Wuerstchen model.

    This model inherits from [`DiffusionPipeline`]. Check the superclass documentation for the generic methods the
    library implements for all the pipelines (such as downloading or saving, running on a particular device, etc.)

    Args:
        tokenizer (`CLIPTokenizer`):
            The CLIP tokenizer.
        text_encoder (`CLIPTextModel`):
            The CLIP text encoder.
        generator ([`DiffNeXt`]):
            The DiffNeXt unet generator.
        vqgan ([`VQModelPaella`]):
            The VQGAN model.
        scheduler ([`DDPMWuerstchenScheduler`]):
            A scheduler to be used in combination with `prior` to generate image embedding.
        latent_dim_scale (float, `optional`, defaults to 10.67):
            The scale of the latent dimension. This is used to determine the size of the latent space.
    """

    def __init__(
        self,
        tokenizer: CLIPTokenizer,
        text_encoder: CLIPTextModel,
        generator: DiffNeXt,
        scheduler: DDPMWuerstchenScheduler,
        vqgan: VQModelPaella,
        latent_dim_scale: float = 10.67,
    ) -> None:
        super().__init__()
        self.register_modules(
            tokenizer=tokenizer,
            text_encoder=text_encoder,
            generator=generator,
            scheduler=scheduler,
            vqgan=vqgan,
        )
        self.register_to_config(latent_dim_scale=latent_dim_scale)

    def prepare_latents(self, shape, dtype, device, generator, latents):
        if latents is None:
            latents = randn_tensor(shape, generator=generator, device=device, dtype=dtype)
        else:
            if latents.shape != shape:
                raise ValueError(f"Unexpected latents shape, got {latents.shape}, expected {shape}")
            latents = latents.to(device)

        return latents

    def enable_sequential_cpu_offload(self, gpu_id=0):
        r"""
        Offloads all models to CPU using accelerate, significantly reducing memory usage. When called, text_encoder,
        and vqgan have their state dicts saved to CPU and then are moved to a `torch.device('meta') and
        loaded to GPU only when their specific submodule has its `forward` method called.
        """
        if is_accelerate_available():
            from accelerate import cpu_offload
        else:
            raise ImportError("Please install accelerate via `pip install accelerate`")

        device = torch.device(f"cuda:{gpu_id}")

        for cpu_offloaded_model in [self.text_encoder, self.vqgan]:
            if cpu_offloaded_model is not None:
                cpu_offload(cpu_offloaded_model, device)

    def _encode_prompt(
        self,
        prompt,
        device,
        num_images_per_prompt,
        do_classifier_free_guidance,
        negative_prompt=None,
    ):
        batch_size = len(prompt) if isinstance(prompt, list) else 1
        # get prompt text embeddings
        text_inputs = self.tokenizer(
            prompt,
            padding="max_length",
            max_length=self.tokenizer.model_max_length,
            truncation=True,
            return_tensors="pt",
        )
        text_input_ids = text_inputs.input_ids
        attention_mask = text_inputs.attention_mask

        untruncated_ids = self.tokenizer(prompt, padding="longest", return_tensors="pt").input_ids

        if untruncated_ids.shape[-1] >= text_input_ids.shape[-1] and not torch.equal(text_input_ids, untruncated_ids):
            removed_text = self.tokenizer.batch_decode(untruncated_ids[:, self.tokenizer.model_max_length - 1 : -1])
            logger.warning(
                "The following part of your input was truncated because CLIP can only handle sequences up to"
                f" {self.tokenizer.model_max_length} tokens: {removed_text}"
            )
            text_input_ids = text_input_ids[:, : self.tokenizer.model_max_length]
            attention_mask = attention_mask[:, : self.tokenizer.model_max_length]

        text_encoder_output = self.text_encoder(text_input_ids.to(device), attention_mask=attention_mask.to(device))
        text_encoder_hidden_states = text_encoder_output.last_hidden_state
        text_encoder_hidden_states = text_encoder_hidden_states.repeat_interleave(num_images_per_prompt, dim=0)

        if do_classifier_free_guidance:
            uncond_tokens: List[str]
            if negative_prompt is None:
                uncond_tokens = [""] * batch_size
            elif type(prompt) is not type(negative_prompt):
                raise TypeError(
                    f"`negative_prompt` should be the same type to `prompt`, but got {type(negative_prompt)} !="
                    f" {type(prompt)}."
                )
            elif isinstance(negative_prompt, str):
                uncond_tokens = [negative_prompt]
            elif batch_size != len(negative_prompt):
                raise ValueError(
                    f"`negative_prompt`: {negative_prompt} has batch size {len(negative_prompt)}, but `prompt`:"
                    f" {prompt} has batch size {batch_size}. Please make sure that passed `negative_prompt` matches"
                    " the batch size of `prompt`."
                )
            else:
                uncond_tokens = negative_prompt

            uncond_input = self.tokenizer(
                uncond_tokens,
                padding="max_length",
                max_length=self.tokenizer.model_max_length,
                truncation=True,
                return_tensors="pt",
            )
            negative_prompt_embeds_text_encoder_output = self.text_encoder(
                uncond_input.input_ids.to(device), attention_mask=uncond_input.attention_mask.to(device)
            )

            uncond_text_encoder_hidden_states = negative_prompt_embeds_text_encoder_output.last_hidden_state

            # duplicate unconditional embeddings for each generation per prompt, using mps friendly method
            seq_len = uncond_text_encoder_hidden_states.shape[1]
            uncond_text_encoder_hidden_states = uncond_text_encoder_hidden_states.repeat(1, num_images_per_prompt, 1)
            uncond_text_encoder_hidden_states = uncond_text_encoder_hidden_states.view(
                batch_size * num_images_per_prompt, seq_len, -1
            )
            # done duplicates

            # For classifier free guidance, we need to do two forward passes.
            # Here we concatenate the unconditional and text embeddings into a single batch
            # to avoid doing two forward passes
            text_encoder_hidden_states = torch.cat([text_encoder_hidden_states, uncond_text_encoder_hidden_states])

        return text_encoder_hidden_states

    def check_inputs(
        self, predicted_image_embeddings, text_encoder_hidden_states, do_classifier_free_guidance, device
    ):
        if not isinstance(text_encoder_hidden_states, torch.Tensor):
            raise TypeError(
                f"'text_encoder_hidden_states' must be of type 'torch.Tensor', but got {type(predicted_image_embeddings)}."
            )
        if isinstance(predicted_image_embeddings, np.ndarray):
            predicted_image_embeddings = torch.Tensor(predicted_image_embeddings, device=device).to(
                dtype=text_encoder_hidden_states.dtype
            )
        if not isinstance(predicted_image_embeddings, torch.Tensor):
            raise TypeError(
                f"'predicted_image_embeddings' must be of type 'torch.Tensor' or 'np.array', but got {type(predicted_image_embeddings)}."
            )

        if do_classifier_free_guidance:
            assert (
                predicted_image_embeddings.size(0) == text_encoder_hidden_states.size(0) // 2
            ), f"'text_encoder_hidden_states' must be double the size of 'predicted_image_embeddings' in the first dimension, but {predicted_image_embeddings.size(0)} != {text_encoder_hidden_states.size(0)}."
        else:
            if predicted_image_embeddings.size(0) * 2 == text_encoder_hidden_states.size(0):
                text_encoder_hidden_states = text_encoder_hidden_states.chunk(2)[0]
            assert predicted_image_embeddings.size(0) == text_encoder_hidden_states.size(
                0
            ), f"'text_encoder_hidden_states' must be the size of 'predicted_image_embeddings' in the first dimension, but {predicted_image_embeddings.size(0)} != {text_encoder_hidden_states.size(0)}."

        return predicted_image_embeddings, text_encoder_hidden_states

    @torch.no_grad()
    def __call__(
        self,
        image_embeds: torch.Tensor,
        prompt: Union[str, List[str]] = None,
        negative_prompt: Optional[Union[str, List[str]]] = None,
        num_inference_steps: dict[float, int] = {0.0: 12},
        guidance_scale: float = 0.0,
        num_images_per_prompt: int = 1,
        generator: Optional[Union[torch.Generator, List[torch.Generator]]] = None,
        latents: Optional[torch.FloatTensor] = None,
        output_type: Optional[str] = "pil",
        return_dict: bool = True,
    ):
        device = self._execution_device
        do_classifier_free_guidance = guidance_scale > 1.0

        if isinstance(num_inference_steps, int):
            num_inference_steps = {0.0: num_inference_steps}

        if isinstance(prompt, str):
            prompt = [prompt]
        elif not isinstance(prompt, list):
            raise ValueError(f"`prompt` has to be of type `str` or `list` but is {type(prompt)}")

        text_encoder_hidden_states = self._encode_prompt(
            prompt, device, num_images_per_prompt, do_classifier_free_guidance, negative_prompt
        )
        predicted_image_embeddings, text_encoder_hidden_states = self.check_inputs(
            image_embeds, text_encoder_hidden_states, do_classifier_free_guidance, device
        )

        dtype = predicted_image_embeddings.dtype
        latent_height = int(predicted_image_embeddings.size(2) * self.config.latent_dim_scale)
        latent_width = int(predicted_image_embeddings.size(3) * self.config.latent_dim_scale)
        latent_features_shape = (predicted_image_embeddings.size(0), 4, latent_height, latent_width)

        self.scheduler.set_timesteps(num_inference_steps, device=device)
        timesteps = self.scheduler.timesteps

        latents = self.prepare_latents(latent_features_shape, dtype, device, generator, latents)

        for t in self.progress_bar(timesteps[:-1]):
            ratio = t.expand(latents.size(0)).to(dtype)
            effnet = (
                torch.cat([predicted_image_embeddings, torch.zeros_like(predicted_image_embeddings)])
                if do_classifier_free_guidance
                else predicted_image_embeddings
            )
            predicted_latents = self.generator(
                torch.cat([latents] * 2) if do_classifier_free_guidance else latents,
                r=torch.cat([ratio] * 2) if do_classifier_free_guidance else ratio,
                effnet=effnet,
                clip=text_encoder_hidden_states,
            )

            if do_classifier_free_guidance:
                predicted_latents_text, predicted_latents_uncond = predicted_latents.chunk(2)
                predicted_latents = torch.lerp(predicted_latents_uncond, predicted_latents_text, guidance_scale)

            latents = self.scheduler.step(
                model_output=predicted_latents,
                timestep=ratio,
                sample=latents,
                generator=generator,
            ).prev_sample

        images = self.vqgan.decode(latents).sample.clamp(0, 1)

        if output_type not in ["pt", "np", "pil"]:
            raise ValueError(f"Only the output types `pt`, `np` and `pil` are supported not output_type={output_type}")

        if output_type == "np":
            images = images.permute(0, 2, 3, 1).cpu().numpy()
        elif output_type == "pil":
            images = images.permute(0, 2, 3, 1).cpu().numpy()
            images = self.numpy_to_pil(images)

        if not return_dict:
            return images
        return ImagePipelineOutput(images)
