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


class CountryEndpoint(object):
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
        'country_code': 'str',
        'endpoint_count': 'int',
        'country_name': 'str'
    }

    attribute_map = {
        'country_code': 'country_code',
        'endpoint_count': 'endpoint_count',
        'country_name': 'country_name'
    }

    def __init__(self, country_code=None, endpoint_count=None, country_name=None):  # noqa: E501
        """CountryEndpoint - a model defined in Swagger"""  # noqa: E501

        self._country_code = None
        self._endpoint_count = None
        self._country_name = None
        self.discriminator = None

        if country_code is not None:
            self.country_code = country_code
        if endpoint_count is not None:
            self.endpoint_count = endpoint_count
        if country_name is not None:
            self.country_name = country_name

    @property
    def country_code(self):
        """Gets the country_code of this CountryEndpoint.  # noqa: E501

        Two letter standard abbreviation of the country's name  # noqa: E501

        :return: The country_code of this CountryEndpoint.  # noqa: E501
        :rtype: str
        """
        return self._country_code

    @country_code.setter
    def country_code(self, country_code):
        """Sets the country_code of this CountryEndpoint.

        Two letter standard abbreviation of the country's name  # noqa: E501

        :param country_code: The country_code of this CountryEndpoint.  # noqa: E501
        :type: str
        """

        self._country_code = country_code

    @property
    def endpoint_count(self):
        """Gets the endpoint_count of this CountryEndpoint.  # noqa: E501

        The number of endpoints  # noqa: E501

        :return: The endpoint_count of this CountryEndpoint.  # noqa: E501
        :rtype: int
        """
        return self._endpoint_count

    @endpoint_count.setter
    def endpoint_count(self, endpoint_count):
        """Sets the endpoint_count of this CountryEndpoint.

        The number of endpoints  # noqa: E501

        :param endpoint_count: The endpoint_count of this CountryEndpoint.  # noqa: E501
        :type: int
        """

        self._endpoint_count = endpoint_count

    @property
    def country_name(self):
        """Gets the country_name of this CountryEndpoint.  # noqa: E501

        The full name of the country  # noqa: E501

        :return: The country_name of this CountryEndpoint.  # noqa: E501
        :rtype: str
        """
        return self._country_name

    @country_name.setter
    def country_name(self, country_name):
        """Sets the country_name of this CountryEndpoint.

        The full name of the country  # noqa: E501

        :param country_name: The country_name of this CountryEndpoint.  # noqa: E501
        :type: str
        """

        self._country_name = country_name

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
        if issubclass(CountryEndpoint, dict):
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
        if not isinstance(other, CountryEndpoint):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
