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


class MeetingHistorySharing(object):
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
        'meeting_guid': 'str',
        'owner_id': 'int',
        'sharing_url': 'str',
        'recepient_type': 'str',
        'properties': 'str',
        'status': 'str',
        'downloadable': 'bool',
        'passcode': 'str',
        'validity': 'str',
        'created': 'int',
        'lastmodified': 'int'
    }

    attribute_map = {
        'id': 'id',
        'meeting_guid': 'meetingGuid',
        'owner_id': 'ownerId',
        'sharing_url': 'sharingUrl',
        'recepient_type': 'recepientType',
        'properties': 'properties',
        'status': 'status',
        'downloadable': 'downloadable',
        'passcode': 'passcode',
        'validity': 'validity',
        'created': 'created',
        'lastmodified': 'lastmodified'
    }

    def __init__(self, id=None, meeting_guid=None, owner_id=None, sharing_url=None, recepient_type=None, properties=None, status=None, downloadable=None, passcode=None, validity=None, created=None, lastmodified=None):  # noqa: E501
        """MeetingHistorySharing - a model defined in Swagger"""  # noqa: E501

        self._id = None
        self._meeting_guid = None
        self._owner_id = None
        self._sharing_url = None
        self._recepient_type = None
        self._properties = None
        self._status = None
        self._downloadable = None
        self._passcode = None
        self._validity = None
        self._created = None
        self._lastmodified = None
        self.discriminator = None

        if id is not None:
            self.id = id
        if meeting_guid is not None:
            self.meeting_guid = meeting_guid
        if owner_id is not None:
            self.owner_id = owner_id
        if sharing_url is not None:
            self.sharing_url = sharing_url
        if recepient_type is not None:
            self.recepient_type = recepient_type
        if properties is not None:
            self.properties = properties
        if status is not None:
            self.status = status
        if downloadable is not None:
            self.downloadable = downloadable
        if passcode is not None:
            self.passcode = passcode
        if validity is not None:
            self.validity = validity
        if created is not None:
            self.created = created
        if lastmodified is not None:
            self.lastmodified = lastmodified

    @property
    def id(self):
        """Gets the id of this MeetingHistorySharing.  # noqa: E501


        :return: The id of this MeetingHistorySharing.  # noqa: E501
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this MeetingHistorySharing.


        :param id: The id of this MeetingHistorySharing.  # noqa: E501
        :type: int
        """

        self._id = id

    @property
    def meeting_guid(self):
        """Gets the meeting_guid of this MeetingHistorySharing.  # noqa: E501


        :return: The meeting_guid of this MeetingHistorySharing.  # noqa: E501
        :rtype: str
        """
        return self._meeting_guid

    @meeting_guid.setter
    def meeting_guid(self, meeting_guid):
        """Sets the meeting_guid of this MeetingHistorySharing.


        :param meeting_guid: The meeting_guid of this MeetingHistorySharing.  # noqa: E501
        :type: str
        """

        self._meeting_guid = meeting_guid

    @property
    def owner_id(self):
        """Gets the owner_id of this MeetingHistorySharing.  # noqa: E501

        Numeric user ID for the meeting owner.  # noqa: E501

        :return: The owner_id of this MeetingHistorySharing.  # noqa: E501
        :rtype: int
        """
        return self._owner_id

    @owner_id.setter
    def owner_id(self, owner_id):
        """Sets the owner_id of this MeetingHistorySharing.

        Numeric user ID for the meeting owner.  # noqa: E501

        :param owner_id: The owner_id of this MeetingHistorySharing.  # noqa: E501
        :type: int
        """

        self._owner_id = owner_id

    @property
    def sharing_url(self):
        """Gets the sharing_url of this MeetingHistorySharing.  # noqa: E501


        :return: The sharing_url of this MeetingHistorySharing.  # noqa: E501
        :rtype: str
        """
        return self._sharing_url

    @sharing_url.setter
    def sharing_url(self, sharing_url):
        """Sets the sharing_url of this MeetingHistorySharing.


        :param sharing_url: The sharing_url of this MeetingHistorySharing.  # noqa: E501
        :type: str
        """

        self._sharing_url = sharing_url

    @property
    def recepient_type(self):
        """Gets the recepient_type of this MeetingHistorySharing.  # noqa: E501


        :return: The recepient_type of this MeetingHistorySharing.  # noqa: E501
        :rtype: str
        """
        return self._recepient_type

    @recepient_type.setter
    def recepient_type(self, recepient_type):
        """Sets the recepient_type of this MeetingHistorySharing.


        :param recepient_type: The recepient_type of this MeetingHistorySharing.  # noqa: E501
        :type: str
        """
        allowed_values = ["ENTERPRISE", "PUBLIC"]  # noqa: E501
        if recepient_type not in allowed_values:
            raise ValueError(
                "Invalid value for `recepient_type` ({0}), must be one of {1}"  # noqa: E501
                .format(recepient_type, allowed_values)
            )

        self._recepient_type = recepient_type

    @property
    def properties(self):
        """Gets the properties of this MeetingHistorySharing.  # noqa: E501


        :return: The properties of this MeetingHistorySharing.  # noqa: E501
        :rtype: str
        """
        return self._properties

    @properties.setter
    def properties(self, properties):
        """Sets the properties of this MeetingHistorySharing.


        :param properties: The properties of this MeetingHistorySharing.  # noqa: E501
        :type: str
        """

        self._properties = properties

    @property
    def status(self):
        """Gets the status of this MeetingHistorySharing.  # noqa: E501


        :return: The status of this MeetingHistorySharing.  # noqa: E501
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this MeetingHistorySharing.


        :param status: The status of this MeetingHistorySharing.  # noqa: E501
        :type: str
        """
        allowed_values = ["ACTIVE"]  # noqa: E501
        if status not in allowed_values:
            raise ValueError(
                "Invalid value for `status` ({0}), must be one of {1}"  # noqa: E501
                .format(status, allowed_values)
            )

        self._status = status

    @property
    def downloadable(self):
        """Gets the downloadable of this MeetingHistorySharing.  # noqa: E501


        :return: The downloadable of this MeetingHistorySharing.  # noqa: E501
        :rtype: bool
        """
        return self._downloadable

    @downloadable.setter
    def downloadable(self, downloadable):
        """Sets the downloadable of this MeetingHistorySharing.


        :param downloadable: The downloadable of this MeetingHistorySharing.  # noqa: E501
        :type: bool
        """

        self._downloadable = downloadable

    @property
    def passcode(self):
        """Gets the passcode of this MeetingHistorySharing.  # noqa: E501


        :return: The passcode of this MeetingHistorySharing.  # noqa: E501
        :rtype: str
        """
        return self._passcode

    @passcode.setter
    def passcode(self, passcode):
        """Sets the passcode of this MeetingHistorySharing.


        :param passcode: The passcode of this MeetingHistorySharing.  # noqa: E501
        :type: str
        """

        self._passcode = passcode

    @property
    def validity(self):
        """Gets the validity of this MeetingHistorySharing.  # noqa: E501


        :return: The validity of this MeetingHistorySharing.  # noqa: E501
        :rtype: str
        """
        return self._validity

    @validity.setter
    def validity(self, validity):
        """Sets the validity of this MeetingHistorySharing.


        :param validity: The validity of this MeetingHistorySharing.  # noqa: E501
        :type: str
        """

        self._validity = validity

    @property
    def created(self):
        """Gets the created of this MeetingHistorySharing.  # noqa: E501

        A [UNIX Timestamp](https://currentmillis.com/) in milliseconds  # noqa: E501

        :return: The created of this MeetingHistorySharing.  # noqa: E501
        :rtype: int
        """
        return self._created

    @created.setter
    def created(self, created):
        """Sets the created of this MeetingHistorySharing.

        A [UNIX Timestamp](https://currentmillis.com/) in milliseconds  # noqa: E501

        :param created: The created of this MeetingHistorySharing.  # noqa: E501
        :type: int
        """

        self._created = created

    @property
    def lastmodified(self):
        """Gets the lastmodified of this MeetingHistorySharing.  # noqa: E501

        A [UNIX Timestamp](https://currentmillis.com/) in milliseconds  # noqa: E501

        :return: The lastmodified of this MeetingHistorySharing.  # noqa: E501
        :rtype: int
        """
        return self._lastmodified

    @lastmodified.setter
    def lastmodified(self, lastmodified):
        """Sets the lastmodified of this MeetingHistorySharing.

        A [UNIX Timestamp](https://currentmillis.com/) in milliseconds  # noqa: E501

        :param lastmodified: The lastmodified of this MeetingHistorySharing.  # noqa: E501
        :type: int
        """

        self._lastmodified = lastmodified

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
        if issubclass(MeetingHistorySharing, dict):
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
        if not isinstance(other, MeetingHistorySharing):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
