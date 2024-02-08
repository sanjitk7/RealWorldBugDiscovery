# coding: utf-8

"""
    Echo Server API

    Echo Server API

    The version of the OpenAPI document: 0.1.0
    Contact: team@openapitools.org
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import io
import warnings

from pydantic import validate_call, Field
from typing import Dict, List, Optional, Tuple, Union, Any

try:
    from typing import Annotated
except ImportError:
    from typing_extensions import Annotated

from pydantic import StrictInt, StrictStr, field_validator

from openapi_client.models.string_enum_ref import StringEnumRef

from openapi_client.api_client import ApiClient
from openapi_client.api_response import ApiResponse
from openapi_client.rest import RESTResponseType

from multiprocessing.pool import ApplyResult


class PathApi:
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None) -> None:
        if api_client is None:
            api_client = ApiClient.get_default()
        self.api_client = api_client


    @validate_call
    def tests_path_string_path_string_integer_path_integer_enum_nonref_string_path_enum_ref_string_path(
        self,
        path_string: StrictStr,
        path_integer: StrictInt,
        enum_nonref_string_path: StrictStr,
        enum_ref_string_path: StringEnumRef,
        _request_timeout: Annotated[Union[float, Tuple[float, float], None], Field(
            description="timeout setting for this request. If one number provided, it will be total request timeout. It can also be a pair (tuple) of (connection, read) timeouts.",
        )] = None,
        _request_auth: Annotated[Optional[Dict[str, Any]], Field(
            description="set to override the auth_settings for an a single request; this effectively ignores the authentication in the spec for a single request.",
        )] = None,
        _content_type: Annotated[Optional[str], Field(
            description="force content-type for the request",
        )] = None,
        _headers: Annotated[Optional[Dict[str, Any]], Field(
            description="set to override the header params for an a single request; this effectively ignores the header params in the spec for a single request.",
        )] = None,
        _host_index: Annotated[int, Field(
            ge=0,
            le=0,
            description="index of the host to use, if the server has multiple hosts",
        )] = 0,
    ) -> str:
        """Test path parameter(s)
        Test path parameter(s)
                This method makes a synchronous HTTP request by default.
        :param path_string: (required)
        :type path_string: str
        :param path_integer: (required)
        :type path_integer: int
        :param enum_nonref_string_path: (required)
        :type enum_nonref_string_path: str
        :param enum_ref_string_path: (required)
        :type enum_ref_string_path: StringEnumRef
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :type _request_timeout: int, tuple(int, int), optional
        :param _request_auth: set to override the auth_settings for an a single
                              request; this effectively ignores the authentication
                              in the spec for a single request.
        :type _request_auth: dict, optional
        :param _content_type: force content-type for the request.
        :type _content_type: str, Optional
        :param _headers: set to override the headers for a single
                         request; this effectively ignores the headers
                         in the spec for a single request.
        :type _headers: dict, optional
        :param _host_index: set to override the host_index for a single
                            request; this effectively ignores the host_index
                            in the spec for a single request.
        :type _host_index: int, optional
        :return: Returns the result object.
                 If the method is called asynchronously,
                 returns the request thread.
        """

        param = self._tests_path_string_path_string_integer_path_integer_enum_nonref_string_path_enum_ref_string_path_serialize(
            path_string=path_string,
            path_integer=path_integer,
            enum_nonref_string_path=enum_nonref_string_path,
            enum_ref_string_path=enum_ref_string_path,
            _request_auth=_request_auth,
            _content_type=_content_type,
            _headers=_headers,
            _host_index=_host_index
        )

        _response_types_map: Dict[str, Optional[str]] = {
            '200': "str"
            
        }
        response_data = self.api_client.call_api(*param, _request_timeout=_request_timeout)
        response_data.read()
        return self.api_client.response_deserialize(
            response_data=response_data,
            response_types_map=_response_types_map,
        ).data


    @validate_call
    def tests_path_string_path_string_integer_path_integer_enum_nonref_string_path_enum_ref_string_path_with_http_info(
        self,
        path_string: StrictStr,
        path_integer: StrictInt,
        enum_nonref_string_path: StrictStr,
        enum_ref_string_path: StringEnumRef,
        _request_timeout: Annotated[Union[float, Tuple[float, float], None], Field(
            description="timeout setting for this request. If one number provided, it will be total request timeout. It can also be a pair (tuple) of (connection, read) timeouts.",
        )] = None,
        _request_auth: Annotated[Optional[Dict[str, Any]], Field(
            description="set to override the auth_settings for an a single request; this effectively ignores the authentication in the spec for a single request.",
        )] = None,
        _content_type: Annotated[Optional[str], Field(
            description="force content-type for the request",
        )] = None,
        _headers: Annotated[Optional[Dict[str, Any]], Field(
            description="set to override the header params for an a single request; this effectively ignores the header params in the spec for a single request.",
        )] = None,
        _host_index: Annotated[int, Field(
            ge=0,
            le=0,
            description="index of the host to use, if the server has multiple hosts",
        )] = 0,
    ) -> ApiResponse[str]:
        """Test path parameter(s)
        Test path parameter(s)
                This method makes a synchronous HTTP request by default.
        :param path_string: (required)
        :type path_string: str
        :param path_integer: (required)
        :type path_integer: int
        :param enum_nonref_string_path: (required)
        :type enum_nonref_string_path: str
        :param enum_ref_string_path: (required)
        :type enum_ref_string_path: StringEnumRef
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :type _request_timeout: int, tuple(int, int), optional
        :param _request_auth: set to override the auth_settings for an a single
                              request; this effectively ignores the authentication
                              in the spec for a single request.
        :type _request_auth: dict, optional
        :param _content_type: force content-type for the request.
        :type _content_type: str, Optional
        :param _headers: set to override the headers for a single
                         request; this effectively ignores the headers
                         in the spec for a single request.
        :type _headers: dict, optional
        :param _host_index: set to override the host_index for a single
                            request; this effectively ignores the host_index
                            in the spec for a single request.
        :type _host_index: int, optional
        :return: Returns the result object.
                 If the method is called asynchronously,
                 returns the request thread.
        """

        param = self._tests_path_string_path_string_integer_path_integer_enum_nonref_string_path_enum_ref_string_path_serialize(
            path_string=path_string,
            path_integer=path_integer,
            enum_nonref_string_path=enum_nonref_string_path,
            enum_ref_string_path=enum_ref_string_path,
            _request_auth=_request_auth,
            _content_type=_content_type,
            _headers=_headers,
            _host_index=_host_index
        )

        _response_types_map: Dict[str, Optional[str]] = {
            '200': "str"
            
        }
        response_data = self.api_client.call_api(*param, _request_timeout=_request_timeout)
        response_data.read()
        return self.api_client.response_deserialize(
            response_data=response_data,
            response_types_map=_response_types_map,
        )


    @validate_call
    def tests_path_string_path_string_integer_path_integer_enum_nonref_string_path_enum_ref_string_path_without_preload_content(
        self,
        path_string: StrictStr,
        path_integer: StrictInt,
        enum_nonref_string_path: StrictStr,
        enum_ref_string_path: StringEnumRef,
        _request_timeout: Annotated[Union[float, Tuple[float, float], None], Field(
            description="timeout setting for this request. If one number provided, it will be total request timeout. It can also be a pair (tuple) of (connection, read) timeouts.",
        )] = None,
        _request_auth: Annotated[Optional[Dict[str, Any]], Field(
            description="set to override the auth_settings for an a single request; this effectively ignores the authentication in the spec for a single request.",
        )] = None,
        _content_type: Annotated[Optional[str], Field(
            description="force content-type for the request",
        )] = None,
        _headers: Annotated[Optional[Dict[str, Any]], Field(
            description="set to override the header params for an a single request; this effectively ignores the header params in the spec for a single request.",
        )] = None,
        _host_index: Annotated[int, Field(
            ge=0,
            le=0,
            description="index of the host to use, if the server has multiple hosts",
        )] = 0,
    ) -> RESTResponseType:
        """Test path parameter(s)
        Test path parameter(s)
                This method makes a synchronous HTTP request by default.
        :param path_string: (required)
        :type path_string: str
        :param path_integer: (required)
        :type path_integer: int
        :param enum_nonref_string_path: (required)
        :type enum_nonref_string_path: str
        :param enum_ref_string_path: (required)
        :type enum_ref_string_path: StringEnumRef
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :type _request_timeout: int, tuple(int, int), optional
        :param _request_auth: set to override the auth_settings for an a single
                              request; this effectively ignores the authentication
                              in the spec for a single request.
        :type _request_auth: dict, optional
        :param _content_type: force content-type for the request.
        :type _content_type: str, Optional
        :param _headers: set to override the headers for a single
                         request; this effectively ignores the headers
                         in the spec for a single request.
        :type _headers: dict, optional
        :param _host_index: set to override the host_index for a single
                            request; this effectively ignores the host_index
                            in the spec for a single request.
        :type _host_index: int, optional
        :return: Returns the result object.
                 If the method is called asynchronously,
                 returns the request thread.
        """

        param = self._tests_path_string_path_string_integer_path_integer_enum_nonref_string_path_enum_ref_string_path_serialize(
            path_string=path_string,
            path_integer=path_integer,
            enum_nonref_string_path=enum_nonref_string_path,
            enum_ref_string_path=enum_ref_string_path,
            _request_auth=_request_auth,
            _content_type=_content_type,
            _headers=_headers,
            _host_index=_host_index
        )

        _response_types_map: Dict[str, Optional[str]] = {
            '200': "str"
            
        }
        response_data = self.api_client.call_api(*param, _request_timeout=_request_timeout)
        return response_data.response


    @validate_call
    def tests_path_string_path_string_integer_path_integer_enum_nonref_string_path_enum_ref_string_path_with_async(
        self,
        path_string: StrictStr,
        path_integer: StrictInt,
        enum_nonref_string_path: StrictStr,
        enum_ref_string_path: StringEnumRef,
        _request_timeout: Annotated[Union[float, Tuple[float, float], None], Field(
            description="timeout setting for this request. If one number provided, it will be total request timeout. It can also be a pair (tuple) of (connection, read) timeouts.",
        )] = None,
        _request_auth: Annotated[Optional[Dict[str, Any]], Field(
            description="set to override the auth_settings for an a single request; this effectively ignores the authentication in the spec for a single request.",
        )] = None,
        _content_type: Annotated[Optional[str], Field(
            description="force content-type for the request",
        )] = None,
        _headers: Annotated[Optional[Dict[str, Any]], Field(
            description="set to override the header params for an a single request; this effectively ignores the header params in the spec for a single request.",
        )] = None,
        _host_index: Annotated[int, Field(
            ge=0,
            le=0,
            description="index of the host to use, if the server has multiple hosts",
        )] = 0,
    ) -> ApplyResult:
        """Test path parameter(s)
        Test path parameter(s)
                This method makes a synchronous HTTP request by default.
        :param path_string: (required)
        :type path_string: str
        :param path_integer: (required)
        :type path_integer: int
        :param enum_nonref_string_path: (required)
        :type enum_nonref_string_path: str
        :param enum_ref_string_path: (required)
        :type enum_ref_string_path: StringEnumRef
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :type _request_timeout: int, tuple(int, int), optional
        :param _request_auth: set to override the auth_settings for an a single
                              request; this effectively ignores the authentication
                              in the spec for a single request.
        :type _request_auth: dict, optional
        :param _content_type: force content-type for the request.
        :type _content_type: str, Optional
        :param _headers: set to override the headers for a single
                         request; this effectively ignores the headers
                         in the spec for a single request.
        :type _headers: dict, optional
        :param _host_index: set to override the host_index for a single
                            request; this effectively ignores the host_index
                            in the spec for a single request.
        :type _host_index: int, optional
        :return: Returns the result object.
                 If the method is called asynchronously,
                 returns the request thread.
        """

        param = self._tests_path_string_path_string_integer_path_integer_enum_nonref_string_path_enum_ref_string_path_serialize(
            path_string=path_string,
            path_integer=path_integer,
            enum_nonref_string_path=enum_nonref_string_path,
            enum_ref_string_path=enum_ref_string_path,
            _request_auth=_request_auth,
            _content_type=_content_type,
            _headers=_headers,
            _host_index=_host_index
        )

        _response_types_map: Dict[str, Optional[str]] = {
            '200': "str"
            
        }
        def callback(*args):
            response_data = self.api_client.call_api(*args)
            response_data.read()
            return self.api_client.response_deserialize(
                response_data=response_data,
                response_types_map=_response_types_map,
            ).data
        return self.api_client.pool.apply_async(callback, param + (_request_timeout,))


    @validate_call
    def tests_path_string_path_string_integer_path_integer_enum_nonref_string_path_enum_ref_string_path_with_http_info_async(
        self,
        path_string: StrictStr,
        path_integer: StrictInt,
        enum_nonref_string_path: StrictStr,
        enum_ref_string_path: StringEnumRef,
        _request_timeout: Annotated[Union[float, Tuple[float, float], None], Field(
            description="timeout setting for this request. If one number provided, it will be total request timeout. It can also be a pair (tuple) of (connection, read) timeouts.",
        )] = None,
        _request_auth: Annotated[Optional[Dict[str, Any]], Field(
            description="set to override the auth_settings for an a single request; this effectively ignores the authentication in the spec for a single request.",
        )] = None,
        _content_type: Annotated[Optional[str], Field(
            description="force content-type for the request",
        )] = None,
        _headers: Annotated[Optional[Dict[str, Any]], Field(
            description="set to override the header params for an a single request; this effectively ignores the header params in the spec for a single request.",
        )] = None,
        _host_index: Annotated[int, Field(
            ge=0,
            le=0,
            description="index of the host to use, if the server has multiple hosts",
        )] = 0,
    ) -> ApplyResult:
        """Test path parameter(s)
        Test path parameter(s)
                This method makes a synchronous HTTP request by default.
        :param path_string: (required)
        :type path_string: str
        :param path_integer: (required)
        :type path_integer: int
        :param enum_nonref_string_path: (required)
        :type enum_nonref_string_path: str
        :param enum_ref_string_path: (required)
        :type enum_ref_string_path: StringEnumRef
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :type _request_timeout: int, tuple(int, int), optional
        :param _request_auth: set to override the auth_settings for an a single
                              request; this effectively ignores the authentication
                              in the spec for a single request.
        :type _request_auth: dict, optional
        :param _content_type: force content-type for the request.
        :type _content_type: str, Optional
        :param _headers: set to override the headers for a single
                         request; this effectively ignores the headers
                         in the spec for a single request.
        :type _headers: dict, optional
        :param _host_index: set to override the host_index for a single
                            request; this effectively ignores the host_index
                            in the spec for a single request.
        :type _host_index: int, optional
        :return: Returns the result object.
                 If the method is called asynchronously,
                 returns the request thread.
        """

        param = self._tests_path_string_path_string_integer_path_integer_enum_nonref_string_path_enum_ref_string_path_serialize(
            path_string=path_string,
            path_integer=path_integer,
            enum_nonref_string_path=enum_nonref_string_path,
            enum_ref_string_path=enum_ref_string_path,
            _request_auth=_request_auth,
            _content_type=_content_type,
            _headers=_headers,
            _host_index=_host_index
        )

        _response_types_map: Dict[str, Optional[str]] = {
            '200': "str"
            
        }
        def callback(*args):
            response_data = self.api_client.call_api(*args)
            response_data.read()
            return self.api_client.response_deserialize(
                response_data=response_data,
                response_types_map=_response_types_map,
            )
        return self.api_client.pool.apply_async(callback, param + (_request_timeout,))


    def _tests_path_string_path_string_integer_path_integer_enum_nonref_string_path_enum_ref_string_path_serialize(
        self,
        path_string,
        path_integer,
        enum_nonref_string_path,
        enum_ref_string_path,
        _request_auth,
        _content_type,
        _headers,
        _host_index,
    ) -> Tuple:

        _hosts = [
            
        ]
        _host=None if len(_hosts) == 0 else _hosts[_host_index]

        _collection_formats: Dict[str, str] = {
            
        }

        _path_params: Dict[str, str] = {}
        _query_params: List[Tuple[str, str]] = []
        _header_params: Dict[str, str] = _headers or {}
        _form_params: List[Tuple[str, str]] = []
        _files: Dict[str, str] = {}
        _body_params: Optional[bytes] = None

        # process the path parameters
        if path_string is not None:
            _path_params['path_string'] = path_string
        if path_integer is not None:
            _path_params['path_integer'] = path_integer
        if enum_nonref_string_path is not None:
            _path_params['enum_nonref_string_path'] = enum_nonref_string_path
        if enum_ref_string_path is not None:
            _path_params['enum_ref_string_path'] = enum_ref_string_path.value
        # process the query parameters
        # process the header parameters
        # process the form parameters
        # process the body parameter


        # set the HTTP header `Accept`
        _header_params['Accept'] = self.api_client.select_header_accept(
            ['text/plain'])  # noqa: E501


        # authentication setting
        _auth_settings: List[str] = []  # noqa: E501

        return self.api_client.param_serialize(
            method='GET',
            resource_path='/path/string/{path_string}/integer/{path_integer}/{enum_nonref_string_path}/{enum_ref_string_path}',
            path_params=_path_params,
            query_params=_query_params,
            header_params=_header_params,
            body=_body_params,
            post_params=_form_params,
            files=_files,
            auth_settings=_auth_settings,
            collection_formats=_collection_formats,
            _host=_host,
            _request_auth=_request_auth
        )


