# coding: utf-8

# flake8: noqa

"""
    BlueJeans Meetings REST API

     ## Video That Works Where You Do. <p>This site provides developers access to APIs from BlueJean's Meetings meeting service.  From here you can see and try actual API calls to manage User Accounts, Meetings, and Recordings, pull Analytical Data and Current State information.</p>    <nosdk> <hr> <div> <div class=\"key\">     <a href=\"./basics.html\" target=\"_\"><img class=\"keyimg\" src=\"./img/bjnmeeting.png\"/></a> </div> <div class=\"keybox\"> Basic instructions about What is a BlueJeans Meeting, and Getting Started Using API's, are <a href=\"./basics.html\" target=\"_blank\">available here <i class=\"glyphicon glyphicon-new-window\"></i></a>. </div> </div> <hr> <alert>2/21/2019</alert> Change response of Change layout and Endpoint API's to 204<br/> 12/03/2018 Add API for setting user profile photograph.<br/> 10/17/2018 Updated API field definitions for time variables to be 64-bit .<br/> 7/23/2018 Corrected errors in API definition file.<br/> 7/10/2018 Deprecated some Command Center API's.  Exposed API's that Summarize usage.<br/> 7/06/2018 Added API for changing ownership of recordings.<br/> 6/28/2018 Restored Create Enterprise Account, added Enterprise and User Profile Tag API's.<br/> 6/01/2018 Clarified Access Token requirements for meeting endpoint API's.<br/> 5/21/2018 Corrected return model for meeting history call.<br/> </nosdk> <hr>   # noqa: E501

    OpenAPI spec version: 1.0.4402212019
    Contact: glenn@bluejeans.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

# import apis into sdk package
from BlueJeansMeetingsRestApi.api.application_api import ApplicationApi
from BlueJeansMeetingsRestApi.api.authentication_api import AuthenticationApi
from BlueJeansMeetingsRestApi.api.command_center_api import CommandCenterApi
from BlueJeansMeetingsRestApi.api.enterprise_api import EnterpriseApi
from BlueJeansMeetingsRestApi.api.history_api import HistoryApi
from BlueJeansMeetingsRestApi.api.meeting_api import MeetingApi
from BlueJeansMeetingsRestApi.api.recording_api import RecordingApi
from BlueJeansMeetingsRestApi.api.user_api import UserApi

# import ApiClient
from BlueJeansMeetingsRestApi.api_client import ApiClient
from BlueJeansMeetingsRestApi.configuration import Configuration
# import models into sdk package
from BlueJeansMeetingsRestApi.models.analytics_endpoint_distribution import AnalyticsEndpointDistribution
from BlueJeansMeetingsRestApi.models.analytics_endpoint_distribution_distribution import AnalyticsEndpointDistributionDistribution
from BlueJeansMeetingsRestApi.models.analytics_endpoint_distribution_v2 import AnalyticsEndpointDistributionV2
from BlueJeansMeetingsRestApi.models.analytics_endpoint_distribution_v2_distribution_new import AnalyticsEndpointDistributionV2DistributionNew
from BlueJeansMeetingsRestApi.models.analytics_feedback_comments import AnalyticsFeedbackComments
from BlueJeansMeetingsRestApi.models.analytics_feedback_comments_comments import AnalyticsFeedbackCommentsComments
from BlueJeansMeetingsRestApi.models.analytics_feedback_scores import AnalyticsFeedbackScores
from BlueJeansMeetingsRestApi.models.analytics_roi_data import AnalyticsRoiData
from BlueJeansMeetingsRestApi.models.analytics_roi_data_roi_ranges import AnalyticsRoiDataRoiRanges
from BlueJeansMeetingsRestApi.models.analytics_top_users import AnalyticsTopUsers
from BlueJeansMeetingsRestApi.models.analytics_top_users_usage import AnalyticsTopUsersUsage
from BlueJeansMeetingsRestApi.models.analytics_usage import AnalyticsUsage
from BlueJeansMeetingsRestApi.models.analytics_usage_usage import AnalyticsUsageUsage
from BlueJeansMeetingsRestApi.models.application import Application
from BlueJeansMeetingsRestApi.models.application_list import ApplicationList
from BlueJeansMeetingsRestApi.models.application_list_inner import ApplicationListInner
from BlueJeansMeetingsRestApi.models.application_secret import ApplicationSecret
from BlueJeansMeetingsRestApi.models.attendee import Attendee
from BlueJeansMeetingsRestApi.models.content import Content
from BlueJeansMeetingsRestApi.models.content_content_properties import ContentContentProperties
from BlueJeansMeetingsRestApi.models.content_content_properties_levels import ContentContentPropertiesLevels
from BlueJeansMeetingsRestApi.models.countries_count_rec import CountriesCountRec
from BlueJeansMeetingsRestApi.models.country_endpoint import CountryEndpoint
from BlueJeansMeetingsRestApi.models.dialout_pstn import DialoutPstn
from BlueJeansMeetingsRestApi.models.endpoint import Endpoint
from BlueJeansMeetingsRestApi.models.endpoint_indigo import EndpointIndigo
from BlueJeansMeetingsRestApi.models.endpoint_indigo_endpoint_attributes1 import EndpointIndigoEndpointAttributes1
from BlueJeansMeetingsRestApi.models.endpoint_indigo_location import EndpointIndigoLocation
from BlueJeansMeetingsRestApi.models.endpoint_indigo_summary_stats import EndpointIndigoSummaryStats
from BlueJeansMeetingsRestApi.models.endpoint_indigo_traceroute import EndpointIndigoTraceroute
from BlueJeansMeetingsRestApi.models.endpoint_indigo_traceroute_trace_path import EndpointIndigoTracerouteTracePath
from BlueJeansMeetingsRestApi.models.endpoint_location_summary import EndpointLocationSummary
from BlueJeansMeetingsRestApi.models.endpoints import Endpoints
from BlueJeansMeetingsRestApi.models.endpoints_inner import EndpointsInner
from BlueJeansMeetingsRestApi.models.endpoints_inner_connections import EndpointsInnerConnections
from BlueJeansMeetingsRestApi.models.enterprise import Enterprise
from BlueJeansMeetingsRestApi.models.enterprise_create_user import EnterpriseCreateUser
from BlueJeansMeetingsRestApi.models.enterprise_daily_users import EnterpriseDailyUsers
from BlueJeansMeetingsRestApi.models.enterprise_user_info_comp import EnterpriseUserInfoComp
from BlueJeansMeetingsRestApi.models.enterprise_user_list import EnterpriseUserList
from BlueJeansMeetingsRestApi.models.enterprise_user_list_users import EnterpriseUserListUsers
from BlueJeansMeetingsRestApi.models.enterprise_user_search import EnterpriseUserSearch
from BlueJeansMeetingsRestApi.models.enterprise_users_active import EnterpriseUsersActive
from BlueJeansMeetingsRestApi.models.error import Error
from BlueJeansMeetingsRestApi.models.filter_high_low_ts import FilterHighLowTs
from BlueJeansMeetingsRestApi.models.filter_object import FilterObject
from BlueJeansMeetingsRestApi.models.filter_specification import FilterSpecification
from BlueJeansMeetingsRestApi.models.filter_ts import FilterTs
from BlueJeansMeetingsRestApi.models.grant_client import GrantClient
from BlueJeansMeetingsRestApi.models.grant_client_scope import GrantClientScope
from BlueJeansMeetingsRestApi.models.grant_code import GrantCode
from BlueJeansMeetingsRestApi.models.grant_code_scope import GrantCodeScope
from BlueJeansMeetingsRestApi.models.grant_code_scope_app_permissions import GrantCodeScopeAppPermissions
from BlueJeansMeetingsRestApi.models.grant_meeting import GrantMeeting
from BlueJeansMeetingsRestApi.models.grant_meeting_scope import GrantMeetingScope
from BlueJeansMeetingsRestApi.models.grant_meeting_scope_meeting import GrantMeetingScopeMeeting
from BlueJeansMeetingsRestApi.models.grant_password import GrantPassword
from BlueJeansMeetingsRestApi.models.grant_password_scope import GrantPasswordScope
from BlueJeansMeetingsRestApi.models.grant_refresh import GrantRefresh
from BlueJeansMeetingsRestApi.models.grant_refresh_scope import GrantRefreshScope
from BlueJeansMeetingsRestApi.models.grant_request_client import GrantRequestClient
from BlueJeansMeetingsRestApi.models.grant_request_code import GrantRequestCode
from BlueJeansMeetingsRestApi.models.grant_request_meeting import GrantRequestMeeting
from BlueJeansMeetingsRestApi.models.grant_request_password import GrantRequestPassword
from BlueJeansMeetingsRestApi.models.grant_request_refresh import GrantRequestRefresh
from BlueJeansMeetingsRestApi.models.grant_request_revoke import GrantRequestRevoke
from BlueJeansMeetingsRestApi.models.granted_applications import GrantedApplications
from BlueJeansMeetingsRestApi.models.inline_response200 import InlineResponse200
from BlueJeansMeetingsRestApi.models.layout import Layout
from BlueJeansMeetingsRestApi.models.meeting import Meeting
from BlueJeansMeetingsRestApi.models.meeting_advanced_meeting_options import MeetingAdvancedMeetingOptions
from BlueJeansMeetingsRestApi.models.meeting_advanced_meeting_options_editability import MeetingAdvancedMeetingOptionsEditability
from BlueJeansMeetingsRestApi.models.meeting_deprecated import MeetingDeprecated
from BlueJeansMeetingsRestApi.models.meeting_deprecated_advanced_meeting_options import MeetingDeprecatedAdvancedMeetingOptions
from BlueJeansMeetingsRestApi.models.meeting_emails import MeetingEmails
from BlueJeansMeetingsRestApi.models.meeting_emails_moderator import MeetingEmailsModerator
from BlueJeansMeetingsRestApi.models.meeting_emails_participant import MeetingEmailsParticipant
from BlueJeansMeetingsRestApi.models.meeting_emails_property import MeetingEmailsProperty
from BlueJeansMeetingsRestApi.models.meeting_history import MeetingHistory
from BlueJeansMeetingsRestApi.models.meeting_history_leader_info import MeetingHistoryLeaderInfo
from BlueJeansMeetingsRestApi.models.meeting_history_participant_list import MeetingHistoryParticipantList
from BlueJeansMeetingsRestApi.models.meeting_history_sharing import MeetingHistorySharing
from BlueJeansMeetingsRestApi.models.meeting_indigo import MeetingIndigo
from BlueJeansMeetingsRestApi.models.meeting_indigo_list import MeetingIndigoList
from BlueJeansMeetingsRestApi.models.meeting_moderator import MeetingModerator
from BlueJeansMeetingsRestApi.models.meeting_recurrence_pattern import MeetingRecurrencePattern
from BlueJeansMeetingsRestApi.models.meeting_sharing import MeetingSharing
from BlueJeansMeetingsRestApi.models.meeting_sharing_properties import MeetingSharingProperties
from BlueJeansMeetingsRestApi.models.meeting_state import MeetingState
from BlueJeansMeetingsRestApi.models.meeting_state_recordinginfo import MeetingStateRecordinginfo
from BlueJeansMeetingsRestApi.models.meeting_summary_info import MeetingSummaryInfo
from BlueJeansMeetingsRestApi.models.meetings_summary_rec import MeetingsSummaryRec
from BlueJeansMeetingsRestApi.models.modify_sharing import ModifySharing
from BlueJeansMeetingsRestApi.models.numbers import Numbers
from BlueJeansMeetingsRestApi.models.numbers_label import NumbersLabel
from BlueJeansMeetingsRestApi.models.numbers_numbers import NumbersNumbers
from BlueJeansMeetingsRestApi.models.pairing_code_pstn import PairingCodePSTN
from BlueJeansMeetingsRestApi.models.pairing_code_sip import PairingCodeSIP
from BlueJeansMeetingsRestApi.models.pairing_code_sip_turnservers import PairingCodeSIPTurnservers
from BlueJeansMeetingsRestApi.models.pairing_code_web_rtc import PairingCodeWebRTC
from BlueJeansMeetingsRestApi.models.partition import Partition
from BlueJeansMeetingsRestApi.models.payload_dialout import PayloadDialout
from BlueJeansMeetingsRestApi.models.payload_invite import PayloadInvite
from BlueJeansMeetingsRestApi.models.payload_meeting_state import PayloadMeetingState
from BlueJeansMeetingsRestApi.models.payload_pairing_code_pstn import PayloadPairingCodePstn
from BlueJeansMeetingsRestApi.models.payload_pairing_code_sip import PayloadPairingCodeSIP
from BlueJeansMeetingsRestApi.models.payload_pairing_code_web_rtc import PayloadPairingCodeWebRTC
from BlueJeansMeetingsRestApi.models.personal_meeting_room import PersonalMeetingRoom
from BlueJeansMeetingsRestApi.models.personal_meeting_room_advanced_meeting_options import PersonalMeetingRoomAdvancedMeetingOptions
from BlueJeansMeetingsRestApi.models.personal_meeting_room_advanced_meeting_options_editability import PersonalMeetingRoomAdvancedMeetingOptionsEditability
from BlueJeansMeetingsRestApi.models.personal_meeting_room_attendees import PersonalMeetingRoomAttendees
from BlueJeansMeetingsRestApi.models.personal_meeting_room_first import PersonalMeetingRoomFirst
from BlueJeansMeetingsRestApi.models.personal_meeting_room_last import PersonalMeetingRoomLast
from BlueJeansMeetingsRestApi.models.personal_meeting_room_moderator import PersonalMeetingRoomModerator
from BlueJeansMeetingsRestApi.models.personal_meeting_room_next import PersonalMeetingRoomNext
from BlueJeansMeetingsRestApi.models.recepient_options_comp import RecepientOptionsComp
from BlueJeansMeetingsRestApi.models.recording import Recording
from BlueJeansMeetingsRestApi.models.recording_history import RecordingHistory
from BlueJeansMeetingsRestApi.models.recording_history_list import RecordingHistoryList
from BlueJeansMeetingsRestApi.models.recording_moved_comp import RecordingMovedComp
from BlueJeansMeetingsRestApi.models.recording_recording_chapters import RecordingRecordingChapters
from BlueJeansMeetingsRestApi.models.recording_session import RecordingSession
from BlueJeansMeetingsRestApi.models.recording_session_started_by import RecordingSessionStartedBy
from BlueJeansMeetingsRestApi.models.recording_summary import RecordingSummary
from BlueJeansMeetingsRestApi.models.room import Room
from BlueJeansMeetingsRestApi.models.schedule_meeting_min_comp import ScheduleMeetingMinComp
from BlueJeansMeetingsRestApi.models.set_sharing import SetSharing
from BlueJeansMeetingsRestApi.models.start_end import StartEnd
from BlueJeansMeetingsRestApi.models.tag_list_comp import TagListComp
from BlueJeansMeetingsRestApi.models.upload_photo_response import UploadPhotoResponse
from BlueJeansMeetingsRestApi.models.user import User
from BlueJeansMeetingsRestApi.models.user_deprecated import UserDeprecated
from BlueJeansMeetingsRestApi.models.user_id import UserId
from BlueJeansMeetingsRestApi.models.meeting_extended_indigo import MeetingExtendedIndigo
