# This file is autogenerated by the command `make fix-copies`, do not edit.
from ..utils import DummyObject, requires_backends


class StableDiffusionXLImg2ImgPipeline(metaclass=DummyObject):
    _backends = ["torch", "transformers", "invisible_watermark"]

    def __init__(self, *args, **kwargs):
        requires_backends(self, ["torch", "transformers", "invisible_watermark"])

    @classmethod
    def from_config(cls, *args, **kwargs):
        requires_backends(cls, ["torch", "transformers", "invisible_watermark"])

    @classmethod
    def from_pretrained(cls, *args, **kwargs):
        requires_backends(cls, ["torch", "transformers", "invisible_watermark"])


class StableDiffusionXLInpaintPipeline(metaclass=DummyObject):
    _backends = ["torch", "transformers", "invisible_watermark"]

    def __init__(self, *args, **kwargs):
        requires_backends(self, ["torch", "transformers", "invisible_watermark"])

    @classmethod
    def from_config(cls, *args, **kwargs):
        requires_backends(cls, ["torch", "transformers", "invisible_watermark"])

    @classmethod
    def from_pretrained(cls, *args, **kwargs):
        requires_backends(cls, ["torch", "transformers", "invisible_watermark"])


class StableDiffusionXLPipeline(metaclass=DummyObject):
    _backends = ["torch", "transformers", "invisible_watermark"]

    def __init__(self, *args, **kwargs):
        requires_backends(self, ["torch", "transformers", "invisible_watermark"])

    @classmethod
    def from_config(cls, *args, **kwargs):
        requires_backends(cls, ["torch", "transformers", "invisible_watermark"])

    @classmethod
    def from_pretrained(cls, *args, **kwargs):
        requires_backends(cls, ["torch", "transformers", "invisible_watermark"])


class StableDiffusionXLControlNetPipeline(metaclass=DummyObject):
    _backends = ["torch", "transformers", "invisible_watermark"]

    def __init__(self, *args, **kwargs):
        requires_backends(self, ["torch", "transformers", "invisible_watermark"])

    @classmethod
    def from_config(cls, *args, **kwargs):
        requires_backends(cls, ["torch", "transformers", "invisible_watermark"])

    @classmethod
    def from_pretrained(cls, *args, **kwargs):
        requires_backends(cls, ["torch", "transformers", "invisible_watermark"])
