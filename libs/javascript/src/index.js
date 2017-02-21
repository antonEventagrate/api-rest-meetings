/**
 * BlueJeans onVideo REST API
 * _Video That Works Where You Do, from the world's leader in cloud video communication._ # Authentication Each API request that is sent to BlueJeans requires an access token, which is obtained through the BlueJeans Authentication API. There are several methods (grant types) for obtaining an access token, which follow the OAuth2.0 specification. ## Grant Types * Authorization Code Grant – This grant type is used in an authentication flow commonly referred to as \"three-legged OAuth\". The user authenticates via a BlueJeans page, which provides an authorization code. This code, along with a few other elements, can be used to obtain an access code. * Password Credentials Grant – This grant type is used in a two-legged OAuth flow. Username and password are sent to retrieve an access code. * Client Credentials Grant – This grant type is used in a two-legged OAuth flow.  ## Access & Permissions The access level that is associated with each access token is referred to as the scope. There are three basic levels of access that BlueJeans allows, which affect the level of scope.  Three access levels exist within the Blue Jeans service today. * Meeting-level – Authentication takes place using a meeting ID and passcode, and the scope is limited to APIs that relate to the individual meeting. * User-level – Authentication either takes place via three-legged OAuth, or else a direct authorization token request containing a username or password. Access level depends on the requested scope permissions. * App-level – An application is provisioned either by BlueJeans personnel, or within the BlueJeans Enterprise Admin interface. When provisioning an app, a client key and secret are provided, which is then used to obtain an access token, via the BlueJeans Authentication API. The scope that is associated with the token will provide access to an entire enterprise and all of its users.  All endpoints in this document that require Enterprise Admin access will be marked as such. ## Testing In order to make effective use of this page, you will first use one of the authentication methods to obtain an access token. Once the token is given, use the Authenticate button up in the header to store the token. Each BlueJeans API called after that will use the access token provided. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: brandon@bluejeans.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

(function(factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/AnalyticsEndpointDistribution', 'model/AnalyticsEndpointDistributionDistribution', 'model/AnalyticsFeedbackComments', 'model/AnalyticsFeedbackCommentsComments', 'model/AnalyticsFeedbackScores', 'model/AnalyticsRoiData', 'model/AnalyticsRoiDataRoiRanges', 'model/AnalyticsTopUsers', 'model/AnalyticsTopUsersUsage', 'model/AnalyticsUsage', 'model/AnalyticsUsageUsage', 'model/Content', 'model/ContentContentProperties', 'model/ContentContentPropertiesLevels', 'model/Endpoint', 'model/Endpoints', 'model/EndpointsInner', 'model/EndpointsInnerConnections', 'model/Enterprise', 'model/EnterpriseUserList', 'model/EnterpriseUserListUsers', 'model/Error', 'model/GrantClient', 'model/GrantClientScope', 'model/GrantMeeting', 'model/GrantMeetingScope', 'model/GrantMeetingScopeMeeting', 'model/GrantPassword', 'model/GrantPasswordScope', 'model/GrantTypeClient', 'model/GrantTypeMeeting', 'model/GrantTypePassword', 'model/Layout', 'model/Meeting', 'model/MeetingAdvancedMeetingOptions', 'model/MeetingHistory', 'model/MeetingHistoryLeaderInfo', 'model/MeetingHistoryParticipantList', 'model/MeetingState', 'model/MeetingStateRecordinginfo', 'model/Numbers', 'model/NumbersLabel', 'model/NumbersNumbers', 'model/Partition', 'model/PayloadInvite', 'model/PayloadMeetingState', 'model/Recording', 'model/RecordingRecordingChapters', 'model/RecordingRecordingSessions', 'model/RecordingStartedBy', 'model/RecordingSummary', 'model/Room', 'model/User', 'api/AnalyticsApi', 'api/AuthenticationApi', 'api/CommandCenterApi', 'api/EnterpriseApi', 'api/HistoryApi', 'api/MeetingApi', 'api/RecordingApi', 'api/UserApi'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('./ApiClient'), require('./model/AnalyticsEndpointDistribution'), require('./model/AnalyticsEndpointDistributionDistribution'), require('./model/AnalyticsFeedbackComments'), require('./model/AnalyticsFeedbackCommentsComments'), require('./model/AnalyticsFeedbackScores'), require('./model/AnalyticsRoiData'), require('./model/AnalyticsRoiDataRoiRanges'), require('./model/AnalyticsTopUsers'), require('./model/AnalyticsTopUsersUsage'), require('./model/AnalyticsUsage'), require('./model/AnalyticsUsageUsage'), require('./model/Content'), require('./model/ContentContentProperties'), require('./model/ContentContentPropertiesLevels'), require('./model/Endpoint'), require('./model/Endpoints'), require('./model/EndpointsInner'), require('./model/EndpointsInnerConnections'), require('./model/Enterprise'), require('./model/EnterpriseUserList'), require('./model/EnterpriseUserListUsers'), require('./model/Error'), require('./model/GrantClient'), require('./model/GrantClientScope'), require('./model/GrantMeeting'), require('./model/GrantMeetingScope'), require('./model/GrantMeetingScopeMeeting'), require('./model/GrantPassword'), require('./model/GrantPasswordScope'), require('./model/GrantTypeClient'), require('./model/GrantTypeMeeting'), require('./model/GrantTypePassword'), require('./model/Layout'), require('./model/Meeting'), require('./model/MeetingAdvancedMeetingOptions'), require('./model/MeetingHistory'), require('./model/MeetingHistoryLeaderInfo'), require('./model/MeetingHistoryParticipantList'), require('./model/MeetingState'), require('./model/MeetingStateRecordinginfo'), require('./model/Numbers'), require('./model/NumbersLabel'), require('./model/NumbersNumbers'), require('./model/Partition'), require('./model/PayloadInvite'), require('./model/PayloadMeetingState'), require('./model/Recording'), require('./model/RecordingRecordingChapters'), require('./model/RecordingRecordingSessions'), require('./model/RecordingStartedBy'), require('./model/RecordingSummary'), require('./model/Room'), require('./model/User'), require('./api/AnalyticsApi'), require('./api/AuthenticationApi'), require('./api/CommandCenterApi'), require('./api/EnterpriseApi'), require('./api/HistoryApi'), require('./api/MeetingApi'), require('./api/RecordingApi'), require('./api/UserApi'));
  }
}(function(ApiClient, AnalyticsEndpointDistribution, AnalyticsEndpointDistributionDistribution, AnalyticsFeedbackComments, AnalyticsFeedbackCommentsComments, AnalyticsFeedbackScores, AnalyticsRoiData, AnalyticsRoiDataRoiRanges, AnalyticsTopUsers, AnalyticsTopUsersUsage, AnalyticsUsage, AnalyticsUsageUsage, Content, ContentContentProperties, ContentContentPropertiesLevels, Endpoint, Endpoints, EndpointsInner, EndpointsInnerConnections, Enterprise, EnterpriseUserList, EnterpriseUserListUsers, Error, GrantClient, GrantClientScope, GrantMeeting, GrantMeetingScope, GrantMeetingScopeMeeting, GrantPassword, GrantPasswordScope, GrantTypeClient, GrantTypeMeeting, GrantTypePassword, Layout, Meeting, MeetingAdvancedMeetingOptions, MeetingHistory, MeetingHistoryLeaderInfo, MeetingHistoryParticipantList, MeetingState, MeetingStateRecordinginfo, Numbers, NumbersLabel, NumbersNumbers, Partition, PayloadInvite, PayloadMeetingState, Recording, RecordingRecordingChapters, RecordingRecordingSessions, RecordingStartedBy, RecordingSummary, Room, User, AnalyticsApi, AuthenticationApi, CommandCenterApi, EnterpriseApi, HistoryApi, MeetingApi, RecordingApi, UserApi) {
  'use strict';

  /**
   * _Video_That_Works_Where_You_Do_from_the_worlds_leader_in_cloud_video_communication___AuthenticationEach_API_request_that_is_sent_to_BlueJeans_requires_an_access_token_which_is_obtained_through_the_BlueJeans_Authentication_API__There_are_several_methods__grant_types_for_obtaining_an_access_token_which_follow_the_OAuth2_0_specification__Grant_Types_Authorization_Code_Grant__This_grant_type_is_used_in_an_authentication_flow_commonly_referred_to_as_three_legged_OAuth__The_user_authenticates_via_a_BlueJeans_page_which_provides_an_authorization_code__This_code_along_with_a_few_other_elements_can_be_used_to_obtain_an_access_code__Password_Credentials_Grant__This_grant_type_is_used_in_a_two_legged_OAuth_flow__Username_and_password_are_sent_to_retrieve_an_access_code__Client_Credentials_Grant__This_grant_type_is_used_in_a_two_legged_OAuth_flow__Access__PermissionsThe_access_level_that_is_associated_with_each_access_token_is_referred_to_as_the_scope__There_are_three_basic_levels_of_access_that_BlueJeans_allows_which_affect_the_level_of_scope_Three_access_levels_exist_within_the_Blue_Jeans_service_today__Meeting_level__Authentication_takes_place_using_a_meeting_ID_and_passcode_and_the_scope_is_limited_to_APIs_that_relate_to_the_individual_meeting__User_level__Authentication_either_takes_place_via_three_legged_OAuth_or_else_a_direct_authorization_token_request_containing_a_username_or_password__Access_level_depends_on_the_requested_scope_permissions__App_level__An_application_is_provisioned_either_by_BlueJeans_personnel_or_within_the_BlueJeans_Enterprise_Admin_interface__When_provisioning_an_app_a_client_key_and_secret_are_provided_which_is_then_used_to_obtain_an_access_token_via_the_BlueJeans_Authentication_API__The_scope_that_is_associated_with_the_token_will_provide_access_to_an_entire_enterprise_and_all_of_its_users_All_endpoints_in_this_document_that_require_Enterprise_Admin_access_will_be_marked_as_such__TestingIn_order_to_make_effective_use_of_this_page_you_will_first_use_one_of_the_authentication_methods_to_obtain_an_access_token__Once_the_token_is_given_use_the_Authenticate_button_up_in_the_header_to_store_the_token__Each_BlueJeans_API_called_after_that_will_use_the_access_token_provided_.<br>
   * The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
   * <p>
   * An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
   * <pre>
   * var BlueJeansOnVideoRestApi = require('index'); // See note below*.
   * var xxxSvc = new BlueJeansOnVideoRestApi.XxxApi(); // Allocate the API class we're going to use.
   * var yyyModel = new BlueJeansOnVideoRestApi.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
   * and put the application logic within the callback function.</em>
   * </p>
   * <p>
   * A non-AMD browser application (discouraged) might do something like this:
   * <pre>
   * var xxxSvc = new BlueJeansOnVideoRestApi.XxxApi(); // Allocate the API class we're going to use.
   * var yyy = new BlueJeansOnVideoRestApi.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * </p>
   * @module index
   * @version 1.0.0
   */
  var exports = {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient: ApiClient,
    /**
     * The AnalyticsEndpointDistribution model constructor.
     * @property {module:model/AnalyticsEndpointDistribution}
     */
    AnalyticsEndpointDistribution: AnalyticsEndpointDistribution,
    /**
     * The AnalyticsEndpointDistributionDistribution model constructor.
     * @property {module:model/AnalyticsEndpointDistributionDistribution}
     */
    AnalyticsEndpointDistributionDistribution: AnalyticsEndpointDistributionDistribution,
    /**
     * The AnalyticsFeedbackComments model constructor.
     * @property {module:model/AnalyticsFeedbackComments}
     */
    AnalyticsFeedbackComments: AnalyticsFeedbackComments,
    /**
     * The AnalyticsFeedbackCommentsComments model constructor.
     * @property {module:model/AnalyticsFeedbackCommentsComments}
     */
    AnalyticsFeedbackCommentsComments: AnalyticsFeedbackCommentsComments,
    /**
     * The AnalyticsFeedbackScores model constructor.
     * @property {module:model/AnalyticsFeedbackScores}
     */
    AnalyticsFeedbackScores: AnalyticsFeedbackScores,
    /**
     * The AnalyticsRoiData model constructor.
     * @property {module:model/AnalyticsRoiData}
     */
    AnalyticsRoiData: AnalyticsRoiData,
    /**
     * The AnalyticsRoiDataRoiRanges model constructor.
     * @property {module:model/AnalyticsRoiDataRoiRanges}
     */
    AnalyticsRoiDataRoiRanges: AnalyticsRoiDataRoiRanges,
    /**
     * The AnalyticsTopUsers model constructor.
     * @property {module:model/AnalyticsTopUsers}
     */
    AnalyticsTopUsers: AnalyticsTopUsers,
    /**
     * The AnalyticsTopUsersUsage model constructor.
     * @property {module:model/AnalyticsTopUsersUsage}
     */
    AnalyticsTopUsersUsage: AnalyticsTopUsersUsage,
    /**
     * The AnalyticsUsage model constructor.
     * @property {module:model/AnalyticsUsage}
     */
    AnalyticsUsage: AnalyticsUsage,
    /**
     * The AnalyticsUsageUsage model constructor.
     * @property {module:model/AnalyticsUsageUsage}
     */
    AnalyticsUsageUsage: AnalyticsUsageUsage,
    /**
     * The Content model constructor.
     * @property {module:model/Content}
     */
    Content: Content,
    /**
     * The ContentContentProperties model constructor.
     * @property {module:model/ContentContentProperties}
     */
    ContentContentProperties: ContentContentProperties,
    /**
     * The ContentContentPropertiesLevels model constructor.
     * @property {module:model/ContentContentPropertiesLevels}
     */
    ContentContentPropertiesLevels: ContentContentPropertiesLevels,
    /**
     * The Endpoint model constructor.
     * @property {module:model/Endpoint}
     */
    Endpoint: Endpoint,
    /**
     * The Endpoints model constructor.
     * @property {module:model/Endpoints}
     */
    Endpoints: Endpoints,
    /**
     * The EndpointsInner model constructor.
     * @property {module:model/EndpointsInner}
     */
    EndpointsInner: EndpointsInner,
    /**
     * The EndpointsInnerConnections model constructor.
     * @property {module:model/EndpointsInnerConnections}
     */
    EndpointsInnerConnections: EndpointsInnerConnections,
    /**
     * The Enterprise model constructor.
     * @property {module:model/Enterprise}
     */
    Enterprise: Enterprise,
    /**
     * The EnterpriseUserList model constructor.
     * @property {module:model/EnterpriseUserList}
     */
    EnterpriseUserList: EnterpriseUserList,
    /**
     * The EnterpriseUserListUsers model constructor.
     * @property {module:model/EnterpriseUserListUsers}
     */
    EnterpriseUserListUsers: EnterpriseUserListUsers,
    /**
     * The Error model constructor.
     * @property {module:model/Error}
     */
    Error: Error,
    /**
     * The GrantClient model constructor.
     * @property {module:model/GrantClient}
     */
    GrantClient: GrantClient,
    /**
     * The GrantClientScope model constructor.
     * @property {module:model/GrantClientScope}
     */
    GrantClientScope: GrantClientScope,
    /**
     * The GrantMeeting model constructor.
     * @property {module:model/GrantMeeting}
     */
    GrantMeeting: GrantMeeting,
    /**
     * The GrantMeetingScope model constructor.
     * @property {module:model/GrantMeetingScope}
     */
    GrantMeetingScope: GrantMeetingScope,
    /**
     * The GrantMeetingScopeMeeting model constructor.
     * @property {module:model/GrantMeetingScopeMeeting}
     */
    GrantMeetingScopeMeeting: GrantMeetingScopeMeeting,
    /**
     * The GrantPassword model constructor.
     * @property {module:model/GrantPassword}
     */
    GrantPassword: GrantPassword,
    /**
     * The GrantPasswordScope model constructor.
     * @property {module:model/GrantPasswordScope}
     */
    GrantPasswordScope: GrantPasswordScope,
    /**
     * The GrantTypeClient model constructor.
     * @property {module:model/GrantTypeClient}
     */
    GrantTypeClient: GrantTypeClient,
    /**
     * The GrantTypeMeeting model constructor.
     * @property {module:model/GrantTypeMeeting}
     */
    GrantTypeMeeting: GrantTypeMeeting,
    /**
     * The GrantTypePassword model constructor.
     * @property {module:model/GrantTypePassword}
     */
    GrantTypePassword: GrantTypePassword,
    /**
     * The Layout model constructor.
     * @property {module:model/Layout}
     */
    Layout: Layout,
    /**
     * The Meeting model constructor.
     * @property {module:model/Meeting}
     */
    Meeting: Meeting,
    /**
     * The MeetingAdvancedMeetingOptions model constructor.
     * @property {module:model/MeetingAdvancedMeetingOptions}
     */
    MeetingAdvancedMeetingOptions: MeetingAdvancedMeetingOptions,
    /**
     * The MeetingHistory model constructor.
     * @property {module:model/MeetingHistory}
     */
    MeetingHistory: MeetingHistory,
    /**
     * The MeetingHistoryLeaderInfo model constructor.
     * @property {module:model/MeetingHistoryLeaderInfo}
     */
    MeetingHistoryLeaderInfo: MeetingHistoryLeaderInfo,
    /**
     * The MeetingHistoryParticipantList model constructor.
     * @property {module:model/MeetingHistoryParticipantList}
     */
    MeetingHistoryParticipantList: MeetingHistoryParticipantList,
    /**
     * The MeetingState model constructor.
     * @property {module:model/MeetingState}
     */
    MeetingState: MeetingState,
    /**
     * The MeetingStateRecordinginfo model constructor.
     * @property {module:model/MeetingStateRecordinginfo}
     */
    MeetingStateRecordinginfo: MeetingStateRecordinginfo,
    /**
     * The Numbers model constructor.
     * @property {module:model/Numbers}
     */
    Numbers: Numbers,
    /**
     * The NumbersLabel model constructor.
     * @property {module:model/NumbersLabel}
     */
    NumbersLabel: NumbersLabel,
    /**
     * The NumbersNumbers model constructor.
     * @property {module:model/NumbersNumbers}
     */
    NumbersNumbers: NumbersNumbers,
    /**
     * The Partition model constructor.
     * @property {module:model/Partition}
     */
    Partition: Partition,
    /**
     * The PayloadInvite model constructor.
     * @property {module:model/PayloadInvite}
     */
    PayloadInvite: PayloadInvite,
    /**
     * The PayloadMeetingState model constructor.
     * @property {module:model/PayloadMeetingState}
     */
    PayloadMeetingState: PayloadMeetingState,
    /**
     * The Recording model constructor.
     * @property {module:model/Recording}
     */
    Recording: Recording,
    /**
     * The RecordingRecordingChapters model constructor.
     * @property {module:model/RecordingRecordingChapters}
     */
    RecordingRecordingChapters: RecordingRecordingChapters,
    /**
     * The RecordingRecordingSessions model constructor.
     * @property {module:model/RecordingRecordingSessions}
     */
    RecordingRecordingSessions: RecordingRecordingSessions,
    /**
     * The RecordingStartedBy model constructor.
     * @property {module:model/RecordingStartedBy}
     */
    RecordingStartedBy: RecordingStartedBy,
    /**
     * The RecordingSummary model constructor.
     * @property {module:model/RecordingSummary}
     */
    RecordingSummary: RecordingSummary,
    /**
     * The Room model constructor.
     * @property {module:model/Room}
     */
    Room: Room,
    /**
     * The User model constructor.
     * @property {module:model/User}
     */
    User: User,
    /**
     * The AnalyticsApi service constructor.
     * @property {module:api/AnalyticsApi}
     */
    AnalyticsApi: AnalyticsApi,
    /**
     * The AuthenticationApi service constructor.
     * @property {module:api/AuthenticationApi}
     */
    AuthenticationApi: AuthenticationApi,
    /**
     * The CommandCenterApi service constructor.
     * @property {module:api/CommandCenterApi}
     */
    CommandCenterApi: CommandCenterApi,
    /**
     * The EnterpriseApi service constructor.
     * @property {module:api/EnterpriseApi}
     */
    EnterpriseApi: EnterpriseApi,
    /**
     * The HistoryApi service constructor.
     * @property {module:api/HistoryApi}
     */
    HistoryApi: HistoryApi,
    /**
     * The MeetingApi service constructor.
     * @property {module:api/MeetingApi}
     */
    MeetingApi: MeetingApi,
    /**
     * The RecordingApi service constructor.
     * @property {module:api/RecordingApi}
     */
    RecordingApi: RecordingApi,
    /**
     * The UserApi service constructor.
     * @property {module:api/UserApi}
     */
    UserApi: UserApi
  };

  return exports;
}));
