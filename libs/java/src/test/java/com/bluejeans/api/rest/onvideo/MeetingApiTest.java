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


package com.bluejeans.api.rest.onvideo;

import com.bluejeans.api.rest.ApiException;
import io.swagger.client.model.Error;
import io.swagger.client.model.Meeting;
import io.swagger.client.model.Layout;
import io.swagger.client.model.Endpoint;
import io.swagger.client.model.Endpoints;
import io.swagger.client.model.MeetingState;
import io.swagger.client.model.PayloadInvite;
import io.swagger.client.model.PayloadMeetingState;
import io.swagger.client.model.Numbers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MeetingApi
 */
public class MeetingApiTest {

    private final MeetingApi api = new MeetingApi();

    
    /**
     * Cancel Meeting
     *
     * This endpoint deletes a scheuled meeting.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelMeetingTest() throws ApiException {
        Integer userId = null;
        Integer meetingId = null;
        // api.cancelMeeting(userId, meetingId);

        // TODO: test validations
    }
    
    /**
     * Create Meeting
     *
     * This endpoint will create a scheduled meeting.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMeetingTest() throws ApiException {
        Integer userId = null;
        Meeting meeting = null;
        Boolean email = null;
        // Meeting response = api.createMeeting(userId, meeting, email);

        // TODO: test validations
    }
    
    /**
     * Get Meeting Settings
     *
     * This endpoint gets a user’s default meeting settings.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDefaultMeetingTest() throws ApiException {
        Integer userId = null;
        // List<Meeting> response = api.getDefaultMeeting(userId);

        // TODO: test validations
    }
    
    /**
     * Get Endpoint Layout
     *
     * This endpoint allows you to retrieve an individual endpoint’s current layout setting.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEndpointLayoutTest() throws ApiException {
        Integer userId = null;
        Integer meetingId = null;
        String endpointGuid = null;
        // Layout response = api.getEndpointLayout(userId, meetingId, endpointGuid);

        // TODO: test validations
    }
    
    /**
     * Get Meeting
     *
     * This endpoint gets the settings for a user&#39;s meeting.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMeetingTest() throws ApiException {
        Integer userId = null;
        Integer meetingId = null;
        // Meeting response = api.getMeeting(userId, meetingId);

        // TODO: test validations
    }
    
    /**
     * Update Endpoint Layout
     *
     * This endpoint allows you to update an individual endpoint’s current layout setting.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateEndpointLayoutTest() throws ApiException {
        Integer userId = null;
        Integer meetingId = null;
        String endpointGuid = null;
        Boolean isLeader = null;
        Boolean push = null;
        // Layout response = api.updateEndpointLayout(userId, meetingId, endpointGuid, isLeader, push);

        // TODO: test validations
    }
    
    /**
     * Update Meeting
     *
     * This endpoint changes the settings for a user&#39;s meeting. For example, use for rescheduling.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMeetingTest() throws ApiException {
        Integer userId = null;
        Integer meetingId = null;
        Meeting meeting = null;
        // Meeting response = api.updateMeeting(userId, meetingId, meeting);

        // TODO: test validations
    }
    
    /**
     * Get Endpoint Information
     *
     * This endpoint allows you to retrieve information about an endpoint in the meeting.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1UserUserIdLiveMeetingsMeetingIdEndpointsEndpointGuidGetTest() throws ApiException {
        Integer userId = null;
        Integer meetingId = null;
        String endpointGuid = null;
        // Endpoint response = api.v1UserUserIdLiveMeetingsMeetingIdEndpointsEndpointGuidGet(userId, meetingId, endpointGuid);

        // TODO: test validations
    }
    
    /**
     * Update Endpoint Video/Audio State
     *
     * This endpoint allows you to update an individual endpoint’s ability to send audio or video, and also allows removing an endpoint from the meeting.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1UserUserIdLiveMeetingsMeetingIdEndpointsEndpointGuidPutTest() throws ApiException {
        Integer userId = null;
        Integer meetingId = null;
        String endpointGuid = null;
        Boolean muteAudio = null;
        Boolean muteVideo = null;
        Boolean leaveMeeting = null;
        // Endpoint response = api.v1UserUserIdLiveMeetingsMeetingIdEndpointsEndpointGuidPut(userId, meetingId, endpointGuid, muteAudio, muteVideo, leaveMeeting);

        // TODO: test validations
    }
    
    /**
     * List Meeting Endpoints
     *
     * This endpoint returns an array of all endpoints in the current meeting.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1UserUserIdLiveMeetingsMeetingIdEndpointsGetTest() throws ApiException {
        Integer userId = null;
        Integer meetingId = null;
        // Endpoints response = api.v1UserUserIdLiveMeetingsMeetingIdEndpointsGet(userId, meetingId);

        // TODO: test validations
    }
    
    /**
     * Update Meeting Endpoints State
     *
     * This endpoint’s purpose is to be able to modify the endpoints in a meeting. Seems to require a Meeting-level access token.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1UserUserIdLiveMeetingsMeetingIdEndpointsPutTest() throws ApiException {
        Integer userId = null;
        Integer meetingId = null;
        Boolean mute = null;
        String media = null;
        // api.v1UserUserIdLiveMeetingsMeetingIdEndpointsPut(userId, meetingId, mute, media);

        // TODO: test validations
    }
    
    /**
     * Get Meeting State
     *
     * This endpoint’s purpose is to return whether the meeting is in progress or not.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1UserUserIdLiveMeetingsMeetingIdGetTest() throws ApiException {
        Integer userId = null;
        Integer meetingId = null;
        // MeetingState response = api.v1UserUserIdLiveMeetingsMeetingIdGet(userId, meetingId);

        // TODO: test validations
    }
    
    /**
     * Send Email Invite
     *
     * This endpoint generates an email invite to the specified meeting.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1UserUserIdLiveMeetingsMeetingIdInvitePostTest() throws ApiException {
        Integer userId = null;
        Integer meetingId = null;
        PayloadInvite payloadInvite = null;
        // api.v1UserUserIdLiveMeetingsMeetingIdInvitePost(userId, meetingId, payloadInvite);

        // TODO: test validations
    }
    
    /**
     * Generate SIP Pairing Code
     *
     * This endpoint generates a SIP pairing code that can be used to connect to a meeting.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1UserUserIdLiveMeetingsMeetingIdPairingCodeSIPPostTest() throws ApiException {
        Integer userId = null;
        Integer meetingId = null;
        // Meeting response = api.v1UserUserIdLiveMeetingsMeetingIdPairingCodeSIPPost(userId, meetingId);

        // TODO: test validations
    }
    
    /**
     * Update Meeting State
     *
     * This endpoint’s purpose is to be able to modify a meeting.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1UserUserIdLiveMeetingsMeetingIdPutTest() throws ApiException {
        Integer userId = null;
        Integer meetingId = null;
        PayloadMeetingState payloadMeetingState = null;
        Integer delay = null;
        // Meeting response = api.v1UserUserIdLiveMeetingsMeetingIdPut(userId, meetingId, payloadMeetingState, delay);

        // TODO: test validations
    }
    
    /**
     * Get Meeting Join Info
     *
     * This endpoint retrieves the join information for a scheduled meeting.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1UserUserIdMeetingsMeetingIdNumbersGetTest() throws ApiException {
        Integer userId = null;
        Integer meetingId = null;
        // Numbers response = api.v1UserUserIdMeetingsMeetingIdNumbersGet(userId, meetingId);

        // TODO: test validations
    }
    
    /**
     * Get Meeting Email
     *
     * This endpoint retrieves the email object for a scheduled meeting.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1UserUserIdScheduledMeetingMeetingIdEmailsGetTest() throws ApiException {
        Integer userId = null;
        Integer meetingId = null;
        String type = null;
        String role = null;
        String action = null;
        // Meeting response = api.v1UserUserIdScheduledMeetingMeetingIdEmailsGet(userId, meetingId, type, role, action);

        // TODO: test validations
    }
    
}
