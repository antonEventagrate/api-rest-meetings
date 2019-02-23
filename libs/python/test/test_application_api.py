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
from BlueJeansMeetingsRestApi.api.application_api import ApplicationApi  # noqa: E501
from BlueJeansMeetingsRestApi.rest import ApiException


class TestApplicationApi(unittest.TestCase):
    """ApplicationApi unit test stubs"""

    def setUp(self):
        self.api = BlueJeansMeetingsRestApi.api.application_api.ApplicationApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_create_client_application(self):
        """Test case for create_client_application

        Create Client Application  # noqa: E501
        """
        pass

    def test_list_client_applications(self):
        """Test case for list_client_applications

        List Client Applications  # noqa: E501
        """
        pass

    def test_regenerate_client_application_secret(self):
        """Test case for regenerate_client_application_secret

        Regenerate Client Application Secret  # noqa: E501
        """
        pass

    def test_update_client_application(self):
        """Test case for update_client_application

        Update Client Application  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
