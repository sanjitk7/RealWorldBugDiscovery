# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

    The version of the OpenAPI document: 1.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import Any, ClassVar, Dict, List, Optional
from pydantic import BaseModel, StrictBool, StrictStr, field_validator
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class MapTest(BaseModel):
    """
    MapTest
    """
    map_map_of_string: Optional[Dict[str, Dict[str, StrictStr]]] = None
    map_of_enum_string: Optional[Dict[str, StrictStr]] = None
    direct_map: Optional[Dict[str, StrictBool]] = None
    indirect_map: Optional[Dict[str, StrictBool]] = None
    additional_properties: Dict[str, Any] = {}
    __properties: ClassVar[List[str]] = ["map_map_of_string", "map_of_enum_string", "direct_map", "indirect_map"]

    @field_validator('map_of_enum_string')
    def map_of_enum_string_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in ('UPPER', 'lower'):
            raise ValueError("must be one of enum values ('UPPER', 'lower')")
        return value

    model_config = {
        "populate_by_name": True,
        "validate_assignment": True
    }


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of MapTest from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        * Fields in `self.additional_properties` are added to the output dict.
        """
        _dict = self.model_dump(
            by_alias=True,
            exclude={
                "additional_properties",
            },
            exclude_none=True,
        )
        # puts key-value pairs in additional_properties in the top level
        if self.additional_properties is not None:
            for _key, _value in self.additional_properties.items():
                _dict[_key] = _value

        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of MapTest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "map_map_of_string": obj.get("map_map_of_string"),
            "map_of_enum_string": obj.get("map_of_enum_string"),
            "direct_map": obj.get("direct_map"),
            "indirect_map": obj.get("indirect_map")
        })
        # store additional fields in additional_properties
        for _key in obj.keys():
            if _key not in cls.__properties:
                _obj.additional_properties[_key] = obj.get(_key)

        return _obj


