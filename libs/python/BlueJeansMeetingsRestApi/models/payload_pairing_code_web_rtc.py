# coding: utf-8

"""
    BlueJeans Meetings REST API

     ## Video That Works Where You Do. <p>This site provides developers access to APIs from BlueJean's Meetings meeting service.  From here you can see and try actual API calls to manage User Accounts, Meetings, and Recordings, pull Analytical Data and Current State information.</p>    <nosdk> <hr> <div> <div class=\"key\">     <a href=\"./basics.html\" target=\"_\"><img class=\"keyimg\" src=\"./img/bjnmeeting.png\"/></a> </div> <div class=\"keybox\"> Basic instructions about What is a BlueJeans Meeting, and Getting Started Using API's, are <a href=\"./basics.html\" target=\"_blank\">available here <i class=\"glyphicon glyphicon-new-window\"></i></a>. </div> </div> <hr> <alert>2/21/2019</alert> Change response of Change layout and Endpoint API's to 204<br/> 12/03/2018 Add API for setting user profile photograph.<br/> 10/17/2018 Updated API field definitions for time variables to be 64-bit .<br/> 7/23/2018 Corrected errors in API definition file.<br/> 7/10/2018 Deprecated some Command Center API's.  Exposed API's that Summarize usage.<br/> 7/06/2018 Added API for changing ownership of recordings.<br/> 6/28/2018 Restored Create Enterprise Account, added Enterprise and User Profile Tag API's.<br/> 6/01/2018 Clarified Access Token requirements for meeting endpoint API's.<br/> 5/21/2018 Corrected return model for meeting history call.<br/> </nosdk> <hr>   # noqa: E501

    OpenAPI spec version: 1.0.4402212019
    Contact: glenn@bluejeans.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class PayloadPairingCodeWebRTC(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'endpoint_type': 'str',
        'user_id': 'int',
        'language_code': 'str',
        'capabilities': 'list[str]'
    }

    attribute_map = {
        'endpoint_type': 'endpointType',
        'user_id': 'userId',
        'language_code': 'languageCode',
        'capabilities': 'capabilities'
    }

    def __init__(self, endpoint_type=None, user_id=None, language_code=None, capabilities=None):  # noqa: E501
        """PayloadPairingCodeWebRTC - a model defined in Swagger"""  # noqa: E501

        self._endpoint_type = None
        self._user_id = None
        self._language_code = None
        self._capabilities = None
        self.discriminator = None

        if endpoint_type is not None:
            self.endpoint_type = endpoint_type
        if user_id is not None:
            self.user_id = user_id
        if language_code is not None:
            self.language_code = language_code
        if capabilities is not None:
            self.capabilities = capabilities

    @property
    def endpoint_type(self):
        """Gets the endpoint_type of this PayloadPairingCodeWebRTC.  # noqa: E501

        Type of physical device is pairing.  # noqa: E501

        :return: The endpoint_type of this PayloadPairingCodeWebRTC.  # noqa: E501
        :rtype: str
        """
        return self._endpoint_type

    @endpoint_type.setter
    def endpoint_type(self, endpoint_type):
        """Sets the endpoint_type of this PayloadPairingCodeWebRTC.

        Type of physical device is pairing.  # noqa: E501

        :param endpoint_type: The endpoint_type of this PayloadPairingCodeWebRTC.  # noqa: E501
        :type: str
        """
        allowed_values = ["GENERIC", "LYNC", "JABBER", "BlueJeansBrowserEndpoint", "BlueJeansMobileEndpoint", "WranglerSkypeEndpoint", "PSTN", "DCPAudioOnly"]  # noqa: E501
        if endpoint_type not in allowed_values:
            raise ValueError(
                "Invalid value for `endpoint_type` ({0}), must be one of {1}"  # noqa: E501
                .format(endpoint_type, allowed_values)
            )

        self._endpoint_type = endpoint_type

    @property
    def user_id(self):
        """Gets the user_id of this PayloadPairingCodeWebRTC.  # noqa: E501


        :return: The user_id of this PayloadPairingCodeWebRTC.  # noqa: E501
        :rtype: int
        """
        return self._user_id

    @user_id.setter
    def user_id(self, user_id):
        """Sets the user_id of this PayloadPairingCodeWebRTC.


        :param user_id: The user_id of this PayloadPairingCodeWebRTC.  # noqa: E501
        :type: int
        """

        self._user_id = user_id

    @property
    def language_code(self):
        """Gets the language_code of this PayloadPairingCodeWebRTC.  # noqa: E501


        :return: The language_code of this PayloadPairingCodeWebRTC.  # noqa: E501
        :rtype: str
        """
        return self._language_code

    @language_code.setter
    def language_code(self, language_code):
        """Sets the language_code of this PayloadPairingCodeWebRTC.


        :param language_code: The language_code of this PayloadPairingCodeWebRTC.  # noqa: E501
        :type: str
        """
        allowed_values = ["en"]  # noqa: E501
        if language_code not in allowed_values:
            raise ValueError(
                "Invalid value for `language_code` ({0}), must be one of {1}"  # noqa: E501
                .format(language_code, allowed_values)
            )

        self._language_code = language_code

    @property
    def capabilities(self):
        """Gets the capabilities of this PayloadPairingCodeWebRTC.  # noqa: E501

        Reserved for future use. Pass just an empty array for now. No parameters are currently accepted.  # noqa: E501

        :return: The capabilities of this PayloadPairingCodeWebRTC.  # noqa: E501
        :rtype: list[str]
        """
        return self._capabilities

    @capabilities.setter
    def capabilities(self, capabilities):
        """Sets the capabilities of this PayloadPairingCodeWebRTC.

        Reserved for future use. Pass just an empty array for now. No parameters are currently accepted.  # noqa: E501

        :param capabilities: The capabilities of this PayloadPairingCodeWebRTC.  # noqa: E501
        :type: list[str]
        """
        allowed_values = ["AUDIO", "VIDEO", "CONTENT"]  # noqa: E501
        if not set(capabilities).issubset(set(allowed_values)):
            raise ValueError(
                "Invalid values for `capabilities` [{0}], must be a subset of [{1}]"  # noqa: E501
                .format(", ".join(map(str, set(capabilities) - set(allowed_values))),  # noqa: E501
                        ", ".join(map(str, allowed_values)))
            )

        self._capabilities = capabilities

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(PayloadPairingCodeWebRTC, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, PayloadPairingCodeWebRTC):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
