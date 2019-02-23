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


class EndpointIndigoTracerouteTracePath(object):
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
        'name': 'str',
        'ip': 'str',
        'delay1': 'float',
        'delay2': 'float',
        'delay3': 'float',
        'asapath': 'str'
    }

    attribute_map = {
        'name': 'name',
        'ip': 'ip',
        'delay1': 'delay1',
        'delay2': 'delay2',
        'delay3': 'delay3',
        'asapath': 'asapath'
    }

    def __init__(self, name=None, ip=None, delay1=None, delay2=None, delay3=None, asapath=None):  # noqa: E501
        """EndpointIndigoTracerouteTracePath - a model defined in Swagger"""  # noqa: E501

        self._name = None
        self._ip = None
        self._delay1 = None
        self._delay2 = None
        self._delay3 = None
        self._asapath = None
        self.discriminator = None

        if name is not None:
            self.name = name
        if ip is not None:
            self.ip = ip
        if delay1 is not None:
            self.delay1 = delay1
        if delay2 is not None:
            self.delay2 = delay2
        if delay3 is not None:
            self.delay3 = delay3
        if asapath is not None:
            self.asapath = asapath

    @property
    def name(self):
        """Gets the name of this EndpointIndigoTracerouteTracePath.  # noqa: E501


        :return: The name of this EndpointIndigoTracerouteTracePath.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this EndpointIndigoTracerouteTracePath.


        :param name: The name of this EndpointIndigoTracerouteTracePath.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def ip(self):
        """Gets the ip of this EndpointIndigoTracerouteTracePath.  # noqa: E501


        :return: The ip of this EndpointIndigoTracerouteTracePath.  # noqa: E501
        :rtype: str
        """
        return self._ip

    @ip.setter
    def ip(self, ip):
        """Sets the ip of this EndpointIndigoTracerouteTracePath.


        :param ip: The ip of this EndpointIndigoTracerouteTracePath.  # noqa: E501
        :type: str
        """

        self._ip = ip

    @property
    def delay1(self):
        """Gets the delay1 of this EndpointIndigoTracerouteTracePath.  # noqa: E501


        :return: The delay1 of this EndpointIndigoTracerouteTracePath.  # noqa: E501
        :rtype: float
        """
        return self._delay1

    @delay1.setter
    def delay1(self, delay1):
        """Sets the delay1 of this EndpointIndigoTracerouteTracePath.


        :param delay1: The delay1 of this EndpointIndigoTracerouteTracePath.  # noqa: E501
        :type: float
        """

        self._delay1 = delay1

    @property
    def delay2(self):
        """Gets the delay2 of this EndpointIndigoTracerouteTracePath.  # noqa: E501


        :return: The delay2 of this EndpointIndigoTracerouteTracePath.  # noqa: E501
        :rtype: float
        """
        return self._delay2

    @delay2.setter
    def delay2(self, delay2):
        """Sets the delay2 of this EndpointIndigoTracerouteTracePath.


        :param delay2: The delay2 of this EndpointIndigoTracerouteTracePath.  # noqa: E501
        :type: float
        """

        self._delay2 = delay2

    @property
    def delay3(self):
        """Gets the delay3 of this EndpointIndigoTracerouteTracePath.  # noqa: E501


        :return: The delay3 of this EndpointIndigoTracerouteTracePath.  # noqa: E501
        :rtype: float
        """
        return self._delay3

    @delay3.setter
    def delay3(self, delay3):
        """Sets the delay3 of this EndpointIndigoTracerouteTracePath.


        :param delay3: The delay3 of this EndpointIndigoTracerouteTracePath.  # noqa: E501
        :type: float
        """

        self._delay3 = delay3

    @property
    def asapath(self):
        """Gets the asapath of this EndpointIndigoTracerouteTracePath.  # noqa: E501


        :return: The asapath of this EndpointIndigoTracerouteTracePath.  # noqa: E501
        :rtype: str
        """
        return self._asapath

    @asapath.setter
    def asapath(self, asapath):
        """Sets the asapath of this EndpointIndigoTracerouteTracePath.


        :param asapath: The asapath of this EndpointIndigoTracerouteTracePath.  # noqa: E501
        :type: str
        """

        self._asapath = asapath

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
        if issubclass(EndpointIndigoTracerouteTracePath, dict):
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
        if not isinstance(other, EndpointIndigoTracerouteTracePath):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
