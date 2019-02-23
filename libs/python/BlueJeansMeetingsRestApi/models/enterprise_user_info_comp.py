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


class EnterpriseUserInfoComp(object):
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
        'id': 'int',
        'username': 'str',
        'email': 'str',
        'first_name': 'str',
        'middle_name': 'str',
        'last_name': 'str',
        'enterprise_join_date': 'int',
        'is_enterprise_admin': 'bool',
        'uri': 'str'
    }

    attribute_map = {
        'id': 'id',
        'username': 'username',
        'email': 'email',
        'first_name': 'firstName',
        'middle_name': 'middleName',
        'last_name': 'lastName',
        'enterprise_join_date': 'enterpriseJoinDate',
        'is_enterprise_admin': 'isEnterpriseAdmin',
        'uri': 'uri'
    }

    def __init__(self, id=None, username=None, email=None, first_name=None, middle_name=None, last_name=None, enterprise_join_date=None, is_enterprise_admin=None, uri=None):  # noqa: E501
        """EnterpriseUserInfoComp - a model defined in Swagger"""  # noqa: E501

        self._id = None
        self._username = None
        self._email = None
        self._first_name = None
        self._middle_name = None
        self._last_name = None
        self._enterprise_join_date = None
        self._is_enterprise_admin = None
        self._uri = None
        self.discriminator = None

        if id is not None:
            self.id = id
        if username is not None:
            self.username = username
        if email is not None:
            self.email = email
        if first_name is not None:
            self.first_name = first_name
        if middle_name is not None:
            self.middle_name = middle_name
        if last_name is not None:
            self.last_name = last_name
        if enterprise_join_date is not None:
            self.enterprise_join_date = enterprise_join_date
        if is_enterprise_admin is not None:
            self.is_enterprise_admin = is_enterprise_admin
        if uri is not None:
            self.uri = uri

    @property
    def id(self):
        """Gets the id of this EnterpriseUserInfoComp.  # noqa: E501

        Unique enteprise account identifier  # noqa: E501

        :return: The id of this EnterpriseUserInfoComp.  # noqa: E501
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this EnterpriseUserInfoComp.

        Unique enteprise account identifier  # noqa: E501

        :param id: The id of this EnterpriseUserInfoComp.  # noqa: E501
        :type: int
        """

        self._id = id

    @property
    def username(self):
        """Gets the username of this EnterpriseUserInfoComp.  # noqa: E501

        Name of user's account  # noqa: E501

        :return: The username of this EnterpriseUserInfoComp.  # noqa: E501
        :rtype: str
        """
        return self._username

    @username.setter
    def username(self, username):
        """Sets the username of this EnterpriseUserInfoComp.

        Name of user's account  # noqa: E501

        :param username: The username of this EnterpriseUserInfoComp.  # noqa: E501
        :type: str
        """

        self._username = username

    @property
    def email(self):
        """Gets the email of this EnterpriseUserInfoComp.  # noqa: E501

        Email associated with this enterprise account.  # noqa: E501

        :return: The email of this EnterpriseUserInfoComp.  # noqa: E501
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email):
        """Sets the email of this EnterpriseUserInfoComp.

        Email associated with this enterprise account.  # noqa: E501

        :param email: The email of this EnterpriseUserInfoComp.  # noqa: E501
        :type: str
        """

        self._email = email

    @property
    def first_name(self):
        """Gets the first_name of this EnterpriseUserInfoComp.  # noqa: E501

        User's first (Given) name  # noqa: E501

        :return: The first_name of this EnterpriseUserInfoComp.  # noqa: E501
        :rtype: str
        """
        return self._first_name

    @first_name.setter
    def first_name(self, first_name):
        """Sets the first_name of this EnterpriseUserInfoComp.

        User's first (Given) name  # noqa: E501

        :param first_name: The first_name of this EnterpriseUserInfoComp.  # noqa: E501
        :type: str
        """

        self._first_name = first_name

    @property
    def middle_name(self):
        """Gets the middle_name of this EnterpriseUserInfoComp.  # noqa: E501

        User's middle name  # noqa: E501

        :return: The middle_name of this EnterpriseUserInfoComp.  # noqa: E501
        :rtype: str
        """
        return self._middle_name

    @middle_name.setter
    def middle_name(self, middle_name):
        """Sets the middle_name of this EnterpriseUserInfoComp.

        User's middle name  # noqa: E501

        :param middle_name: The middle_name of this EnterpriseUserInfoComp.  # noqa: E501
        :type: str
        """

        self._middle_name = middle_name

    @property
    def last_name(self):
        """Gets the last_name of this EnterpriseUserInfoComp.  # noqa: E501

        User's last (Family) name  # noqa: E501

        :return: The last_name of this EnterpriseUserInfoComp.  # noqa: E501
        :rtype: str
        """
        return self._last_name

    @last_name.setter
    def last_name(self, last_name):
        """Sets the last_name of this EnterpriseUserInfoComp.

        User's last (Family) name  # noqa: E501

        :param last_name: The last_name of this EnterpriseUserInfoComp.  # noqa: E501
        :type: str
        """

        self._last_name = last_name

    @property
    def enterprise_join_date(self):
        """Gets the enterprise_join_date of this EnterpriseUserInfoComp.  # noqa: E501

        Date since epoch (in milliseconds) when account was added to the entperprise  # noqa: E501

        :return: The enterprise_join_date of this EnterpriseUserInfoComp.  # noqa: E501
        :rtype: int
        """
        return self._enterprise_join_date

    @enterprise_join_date.setter
    def enterprise_join_date(self, enterprise_join_date):
        """Sets the enterprise_join_date of this EnterpriseUserInfoComp.

        Date since epoch (in milliseconds) when account was added to the entperprise  # noqa: E501

        :param enterprise_join_date: The enterprise_join_date of this EnterpriseUserInfoComp.  # noqa: E501
        :type: int
        """

        self._enterprise_join_date = enterprise_join_date

    @property
    def is_enterprise_admin(self):
        """Gets the is_enterprise_admin of this EnterpriseUserInfoComp.  # noqa: E501

        Indicates if this profile has Administrative BlueJeans privileges within its enterprise.  # noqa: E501

        :return: The is_enterprise_admin of this EnterpriseUserInfoComp.  # noqa: E501
        :rtype: bool
        """
        return self._is_enterprise_admin

    @is_enterprise_admin.setter
    def is_enterprise_admin(self, is_enterprise_admin):
        """Sets the is_enterprise_admin of this EnterpriseUserInfoComp.

        Indicates if this profile has Administrative BlueJeans privileges within its enterprise.  # noqa: E501

        :param is_enterprise_admin: The is_enterprise_admin of this EnterpriseUserInfoComp.  # noqa: E501
        :type: bool
        """

        self._is_enterprise_admin = is_enterprise_admin

    @property
    def uri(self):
        """Gets the uri of this EnterpriseUserInfoComp.  # noqa: E501

        Internal enterprise profile URI for referencing BlueJeans resources.  # noqa: E501

        :return: The uri of this EnterpriseUserInfoComp.  # noqa: E501
        :rtype: str
        """
        return self._uri

    @uri.setter
    def uri(self, uri):
        """Sets the uri of this EnterpriseUserInfoComp.

        Internal enterprise profile URI for referencing BlueJeans resources.  # noqa: E501

        :param uri: The uri of this EnterpriseUserInfoComp.  # noqa: E501
        :type: str
        """

        self._uri = uri

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
        if issubclass(EnterpriseUserInfoComp, dict):
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
        if not isinstance(other, EnterpriseUserInfoComp):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
