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


package com.bluejeans.api.rest;

import com.bluejeans.api.ApiException;
import io.swagger.client.model.Enterprise;
import io.swagger.client.model.Error;
import io.swagger.client.model.User;
import io.swagger.client.model.Room;
import io.swagger.client.model.Meeting;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
public class UserApiTest {

    private final UserApi api = new UserApi();

    
    /**
     * Get Enterprise Profile
     *
     * This endpoint retrieves the enterprise profile associated with the user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1UserUserIdEnterpriseProfileGetTest() throws ApiException {
        Integer userId = null;
        // Enterprise response = api.v1UserUserIdEnterpriseProfileGet(userId);

        // TODO: test validations
    }
    
    /**
     * Get User Account Details
     *
     * This endpoint retrieves the basic account details for a given user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1UserUserIdGetTest() throws ApiException {
        Integer userId = null;
        // User response = api.v1UserUserIdGet(userId);

        // TODO: test validations
    }
    
    /**
     * Update User Account Details
     *
     * This endpoint allows updating a user’s basic account details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1UserUserIdPutTest() throws ApiException {
        Integer userId = null;
        User user = null;
        // User response = api.v1UserUserIdPut(userId, user);

        // TODO: test validations
    }
    
    /**
     * Get User’s Default Meeting Settings
     *
     * This endpoint gets a user’s default meeting settings.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1UserUserIdRoomGetTest() throws ApiException {
        Integer userId = null;
        // Room response = api.v1UserUserIdRoomGet(userId);

        // TODO: test validations
    }
    
    /**
     * Update User’s Default Meeting Settings
     *
     * This endpoint allows updating a user’s default meeting settings.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1UserUserIdRoomPutTest() throws ApiException {
        Integer userId = null;
        Room room = null;
        // Room response = api.v1UserUserIdRoomPut(userId, room);

        // TODO: test validations
    }
    
    /**
     * Meeting
     *
     * This endpoint gets a user’s default meeting settings.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1UserUserIdScheduledMeetingGetTest() throws ApiException {
        Integer userId = null;
        // List<Meeting> response = api.v1UserUserIdScheduledMeetingGet(userId);

        // TODO: test validations
    }
    
}