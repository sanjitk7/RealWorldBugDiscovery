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


from openapi_client.api_client import ApiClient
from openapi_client.api_response import ApiResponse
from openapi_client.rest import RESTResponseType

from multiprocessing.pool import ApplyResult


class AuthApi:
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None) -> None:
        if api_client is None:
            api_client = ApiClient.get_default()
        self.api_client = api_client


    @validate_call
    def test_auth_http_basic(
        self,
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
        """To test HTTP basic authentication
        To test HTTP basic authentication
                This method makes a synchronous HTTP request by default.
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

        param = self._test_auth_http_basic_serialize(
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
    def test_auth_http_basic_with_http_info(
        self,
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
        """To test HTTP basic authentication
        To test HTTP basic authentication
                This method makes a synchronous HTTP request by default.
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

        param = self._test_auth_http_basic_serialize(
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
    def test_auth_http_basic_without_preload_content(
        self,
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
        """To test HTTP basic authentication
        To test HTTP basic authentication
                This method makes a synchronous HTTP request by default.
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

        param = self._test_auth_http_basic_serialize(
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
    def test_auth_http_basic_with_async(
        self,
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
        """To test HTTP basic authentication
        To test HTTP basic authentication
                This method makes a synchronous HTTP request by default.
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

        param = self._test_auth_http_basic_serialize(
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
    def test_auth_http_basic_with_http_info_async(
        self,
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
        """To test HTTP basic authentication
        To test HTTP basic authentication
                This method makes a synchronous HTTP request by default.
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

        param = self._test_auth_http_basic_serialize(
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


    def _test_auth_http_basic_serialize(
        self,
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
        # process the query parameters
        # process the header parameters
        # process the form parameters
        # process the body parameter


        # set the HTTP header `Accept`
        _header_params['Accept'] = self.api_client.select_header_accept(
            ['text/plain'])  # noqa: E501


        # authentication setting
        _auth_settings: List[str] = ['http_auth']  # noqa: E501

        return self.api_client.param_serialize(
            method='POST',
            resource_path='/auth/http/basic',
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


