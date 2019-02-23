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


class EnterpriseCreateUser(object):
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
        'email_id': 'str',
        'username': 'str',
        'user_name': 'str',
        'first_name': 'str',
        'last_name': 'str',
        'password': 'str',
        'company': 'str',
        'title': 'str'
    }

    attribute_map = {
        'email_id': 'emailId',
        'username': 'username',
        'user_name': 'userName',
        'first_name': 'firstName',
        'last_name': 'lastName',
        'password': 'password',
        'company': 'company',
        'title': 'title'
    }

    def __init__(self, email_id=None, username=None, user_name=None, first_name=None, last_name=None, password=None, company=None, title=None):  # noqa: E501
        """EnterpriseCreateUser - a model defined in Swagger"""  # noqa: E501

        self._email_id = None
        self._username = None
        self._user_name = None
        self._first_name = None
        self._last_name = None
        self._password = None
        self._company = None
        self._title = None
        self.discriminator = None

        if email_id is not None:
            self.email_id = email_id
        if username is not None:
            self.username = username
        if user_name is not None:
            self.user_name = user_name
        if first_name is not None:
            self.first_name = first_name
        if last_name is not None:
            self.last_name = last_name
        if password is not None:
            self.password = password
        if company is not None:
            self.company = company
        if title is not None:
            self.title = title

    @property
    def email_id(self):
        """Gets the email_id of this EnterpriseCreateUser.  # noqa: E501

        UNIQUE email address for this user  # noqa: E501

        :return: The email_id of this EnterpriseCreateUser.  # noqa: E501
        :rtype: str
        """
        return self._email_id

    @email_id.setter
    def email_id(self, email_id):
        """Sets the email_id of this EnterpriseCreateUser.

        UNIQUE email address for this user  # noqa: E501

        :param email_id: The email_id of this EnterpriseCreateUser.  # noqa: E501
        :type: str
        """

        self._email_id = email_id

    @property
    def username(self):
        """Gets the username of this EnterpriseCreateUser.  # noqa: E501

        UNIQUE username to assign to this account  # noqa: E501

        :return: The username of this EnterpriseCreateUser.  # noqa: E501
        :rtype: str
        """
        return self._username

    @username.setter
    def username(self, username):
        """Sets the username of this EnterpriseCreateUser.

        UNIQUE username to assign to this account  # noqa: E501

        :param username: The username of this EnterpriseCreateUser.  # noqa: E501
        :type: str
        """

        self._username = username

    @property
    def user_name(self):
        """Gets the user_name of this EnterpriseCreateUser.  # noqa: E501

        duplicate field - same value as 'username' field  # noqa: E501

        :return: The user_name of this EnterpriseCreateUser.  # noqa: E501
        :rtype: str
        """
        return self._user_name

    @user_name.setter
    def user_name(self, user_name):
        """Sets the user_name of this EnterpriseCreateUser.

        duplicate field - same value as 'username' field  # noqa: E501

        :param user_name: The user_name of this EnterpriseCreateUser.  # noqa: E501
        :type: str
        """

        self._user_name = user_name

    @property
    def first_name(self):
        """Gets the first_name of this EnterpriseCreateUser.  # noqa: E501

        first (Given) name of the user  # noqa: E501

        :return: The first_name of this EnterpriseCreateUser.  # noqa: E501
        :rtype: str
        """
        return self._first_name

    @first_name.setter
    def first_name(self, first_name):
        """Sets the first_name of this EnterpriseCreateUser.

        first (Given) name of the user  # noqa: E501

        :param first_name: The first_name of this EnterpriseCreateUser.  # noqa: E501
        :type: str
        """

        self._first_name = first_name

    @property
    def last_name(self):
        """Gets the last_name of this EnterpriseCreateUser.  # noqa: E501

        last (Family) name of the user  # noqa: E501

        :return: The last_name of this EnterpriseCreateUser.  # noqa: E501
        :rtype: str
        """
        return self._last_name

    @last_name.setter
    def last_name(self, last_name):
        """Sets the last_name of this EnterpriseCreateUser.

        last (Family) name of the user  # noqa: E501

        :param last_name: The last_name of this EnterpriseCreateUser.  # noqa: E501
        :type: str
        """

        self._last_name = last_name

    @property
    def password(self):
        """Gets the password of this EnterpriseCreateUser.  # noqa: E501

        cleartext password to be assigned to the account  # noqa: E501

        :return: The password of this EnterpriseCreateUser.  # noqa: E501
        :rtype: str
        """
        return self._password

    @password.setter
    def password(self, password):
        """Sets the password of this EnterpriseCreateUser.

        cleartext password to be assigned to the account  # noqa: E501

        :param password: The password of this EnterpriseCreateUser.  # noqa: E501
        :type: str
        """

        self._password = password

    @property
    def company(self):
        """Gets the company of this EnterpriseCreateUser.  # noqa: E501

        Name of company for the user  # noqa: E501

        :return: The company of this EnterpriseCreateUser.  # noqa: E501
        :rtype: str
        """
        return self._company

    @company.setter
    def company(self, company):
        """Sets the company of this EnterpriseCreateUser.

        Name of company for the user  # noqa: E501

        :param company: The company of this EnterpriseCreateUser.  # noqa: E501
        :type: str
        """

        self._company = company

    @property
    def title(self):
        """Gets the title of this EnterpriseCreateUser.  # noqa: E501

        User's job title  # noqa: E501

        :return: The title of this EnterpriseCreateUser.  # noqa: E501
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title):
        """Sets the title of this EnterpriseCreateUser.

        User's job title  # noqa: E501

        :param title: The title of this EnterpriseCreateUser.  # noqa: E501
        :type: str
        """

        self._title = title

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
        if issubclass(EnterpriseCreateUser, dict):
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
        if not isinstance(other, EnterpriseCreateUser):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
