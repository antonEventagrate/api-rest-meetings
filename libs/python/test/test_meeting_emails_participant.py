# coding: utf-8

"""
    BlueJeans Meetings REST API

     ## Video That Works Where You Do. <p>This site provides developers access to APIs from BlueJean's Meetings meeting service.  From here you can see and try actual API calls to manage User Accounts, Meetings, and Recordings, pull Analytical Data and Current State information.</p>    <nosdk> <hr> <div> <div class=\"key\">     <a href=\"./basics.html\" target=\"_\"><img class=\"keyimg\" src=\"./img/bjnmeeting.png\"/></a> </div> <div class=\"keybox\"> Basic instructions about What is a BlueJeans Meeting, and Getting Started Using API's, are <a href=\"./basics.html\" target=\"_blank\">available here <i class=\"glyphicon glyphicon-new-window\"></i></a>. </div> </div> <hr> <alert>2/21/2019</alert> Change response of Change layout and Endpoint API's to 204<br/> 12/03/2018 Add API for setting user profile photograph.<br/> 10/17/2018 Updated API field definitions for time variables to be 64-bit .<br/> 7/23/2018 Corrected errors in API definition file.<br/> 7/10/2018 Deprecated some Command Center API's.  Exposed API's that Summarize usage.<br/> 7/06/2018 Added API for changing ownership of recordings.<br/> 6/28/2018 Restored Create Enterprise Account, added Enterprise and User Profile Tag API's.<br/> 6/01/2018 Clarified Access Token requirements for meeting endpoint API's.<br/> 5/21/2018 Corrected return model for meeting history call.<br/> </nosdk> <hr>   # noqa: E501

    OpenAPI spec version: 1.0.4402212019
    Contact: glenn@bluejeans.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import BlueJeansMeetingsRestApi
from BlueJeansMeetingsRestApi.models.meeting_emails_participant import MeetingEmailsParticipant  # noqa: E501
from BlueJeansMeetingsRestApi.rest import ApiException


class TestMeetingEmailsParticipant(unittest.TestCase):
    """MeetingEmailsParticipant unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testMeetingEmailsParticipant(self):
        """Test MeetingEmailsParticipant"""
        # FIXME: construct object with mandatory attributes with example values
        # model = BlueJeansMeetingsRestApi.models.meeting_emails_participant.MeetingEmailsParticipant()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
