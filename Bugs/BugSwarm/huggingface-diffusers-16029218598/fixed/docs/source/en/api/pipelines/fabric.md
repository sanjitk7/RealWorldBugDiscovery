## changes required
<!--Copyright 2023 The HuggingFace Team. All rights reserved.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.
-->

# Text-to-Image Generation

## FabricPipeline

[FABRIC: Personalizing Diffusion Models with Iterative Feedback](https://huggingface.co/papers/2307.10159) (FABRIC) is by Dimitri von Rütte, Elisabetta Fedele, Jonathan Thomm and Lukas Wolf

FABRIC is training-free approach that conditions the diffusion process on a set of feedback images, applicable to a wide range of popular diffusion models, created by the researchers and engineers from [ETH Zürich, Switzerland](https://github.com/sd-fabric). The [`FabricPipeline`] is capable of generating photo-realistic images given any text input using Stable Diffusion and finetune them on the basis of feedback.

The original codebase can be found here: 
- *FABRIC*: [sd-fabric/fabric](https://github.com/sd-fabric/fabric)

Available Checkpoints are:
- *dreamlike-photoreal-2.0 (512x512 resolution)* [dreamlike-art/dreamlike-photoreal-2.0](https://huggingface.co/dreamlike-art/dreamlike-photoreal-2.0)

[[autodoc]] FabricPipeline
	- all
	- __call__

