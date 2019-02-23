/**
 * BlueJeans Meetings REST API
 *  ## Video That Works Where You Do. <p>This site provides developers access to APIs from BlueJean's Meetings meeting service.  From here you can see and try actual API calls to manage User Accounts, Meetings, and Recordings, pull Analytical Data and Current State information.</p>    <nosdk> <hr> <div> <div class=\"key\">     <a href=\"./basics.html\" target=\"_\"><img class=\"keyimg\" src=\"./img/bjnmeeting.png\"/></a> </div> <div class=\"keybox\"> Basic instructions about What is a BlueJeans Meeting, and Getting Started Using API's, are <a href=\"./basics.html\" target=\"_blank\">available here <i class=\"glyphicon glyphicon-new-window\"></i></a>. </div> </div> <hr> <alert>2/21/2019</alert> Change response of Change layout and Endpoint API's to 204<br/> 12/03/2018 Add API for setting user profile photograph.<br/> 10/17/2018 Updated API field definitions for time variables to be 64-bit .<br/> 7/23/2018 Corrected errors in API definition file.<br/> 7/10/2018 Deprecated some Command Center API's.  Exposed API's that Summarize usage.<br/> 7/06/2018 Added API for changing ownership of recordings.<br/> 6/28/2018 Restored Create Enterprise Account, added Enterprise and User Profile Tag API's.<br/> 6/01/2018 Clarified Access Token requirements for meeting endpoint API's.<br/> 5/21/2018 Corrected return model for meeting history call.<br/> </nosdk> <hr> 
 *
 * OpenAPI spec version: 1.0.4402212019
 * Contact: glenn@bluejeans.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.0-SNAPSHOT
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/Enterprise', 'model/Error', 'model/GrantedApplications', 'model/PersonalMeetingRoom', 'model/Room', 'model/TagListComp', 'model/UploadPhotoResponse', 'model/User'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/Enterprise'), require('../model/Error'), require('../model/GrantedApplications'), require('../model/PersonalMeetingRoom'), require('../model/Room'), require('../model/TagListComp'), require('../model/UploadPhotoResponse'), require('../model/User'));
  } else {
    // Browser globals (root is window)
    if (!root.BlueJeansMeetingsRestApi) {
      root.BlueJeansMeetingsRestApi = {};
    }
    root.BlueJeansMeetingsRestApi.UserApi = factory(root.BlueJeansMeetingsRestApi.ApiClient, root.BlueJeansMeetingsRestApi.Enterprise, root.BlueJeansMeetingsRestApi.Error, root.BlueJeansMeetingsRestApi.GrantedApplications, root.BlueJeansMeetingsRestApi.PersonalMeetingRoom, root.BlueJeansMeetingsRestApi.Room, root.BlueJeansMeetingsRestApi.TagListComp, root.BlueJeansMeetingsRestApi.UploadPhotoResponse, root.BlueJeansMeetingsRestApi.User);
  }
}(this, function(ApiClient, Enterprise, Error, GrantedApplications, PersonalMeetingRoom, Room, TagListComp, UploadPhotoResponse, User) {
  'use strict';

  /**
   * User service.
   * @module api/UserApi
   * @version 1.0.4402212019
   */

  /**
   * Constructs a new UserApi. 
   * @alias module:api/UserApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the changeUserTags operation.
     * @callback module:api/UserApi~changeUserTagsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TagListComp} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Set User Tags
     * This endpoint modifies the list of tags associated with the specified user. &lt;b&gt;NOTE&lt;/b&gt; Adding a tag that is not defined in the user&#39;s Enterprise returns a 200 (success) status code.  It is recommended you validate the returned list of tags.
     * @param {Number} userId The user ID for the account to retrieve tags.  This value is an integer which can be retrieved for the current user via the Get Enterprise Profile endpoint.
     * @param {module:model/String} action Type of operation to be done
     * @param {String} tag The name of tag
     * @param {module:api/UserApi~changeUserTagsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TagListComp}
     */
    this.changeUserTags = function(userId, action, tag, callback) {
      var postBody = null;

      // verify the required parameter 'userId' is set
      if (userId === undefined || userId === null) {
        throw new Error("Missing the required parameter 'userId' when calling changeUserTags");
      }

      // verify the required parameter 'action' is set
      if (action === undefined || action === null) {
        throw new Error("Missing the required parameter 'action' when calling changeUserTags");
      }

      // verify the required parameter 'tag' is set
      if (tag === undefined || tag === null) {
        throw new Error("Missing the required parameter 'tag' when calling changeUserTags");
      }


      var pathParams = {
        'userId': userId
      };
      var queryParams = {
        'action': action,
        'tag': tag,
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = TagListComp;

      return this.apiClient.callApi(
        '/v1/user/{userId}/tags', 'PUT',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the createRoom operation.
     * @callback module:api/UserApi~createRoomCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Room} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create User’s Default Meeting Settings
     * This endpoint creates the user’s default meeting settings.
     * @param {Number} userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint.
     * @param {module:model/Room} room The user&#39;s room details
     * @param {module:api/UserApi~createRoomCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Room}
     */
    this.createRoom = function(userId, room, callback) {
      var postBody = room;

      // verify the required parameter 'userId' is set
      if (userId === undefined || userId === null) {
        throw new Error("Missing the required parameter 'userId' when calling createRoom");
      }

      // verify the required parameter 'room' is set
      if (room === undefined || room === null) {
        throw new Error("Missing the required parameter 'room' when calling createRoom");
      }


      var pathParams = {
        'user_id': userId
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = Room;

      return this.apiClient.callApi(
        '/v1/user/{user_id}/room', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getEnterpriseProfile operation.
     * @callback module:api/UserApi~getEnterpriseProfileCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Enterprise} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get Enterprise Profile
     * This endpoint retrieves the enterprise profile associated with the user.
     * @param {Number} userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint.
     * @param {module:api/UserApi~getEnterpriseProfileCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Enterprise}
     */
    this.getEnterpriseProfile = function(userId, callback) {
      var postBody = null;

      // verify the required parameter 'userId' is set
      if (userId === undefined || userId === null) {
        throw new Error("Missing the required parameter 'userId' when calling getEnterpriseProfile");
      }


      var pathParams = {
        'user_id': userId
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = Enterprise;

      return this.apiClient.callApi(
        '/v1/user/{user_id}/enterprise_profile', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getGrantedApplications operation.
     * @callback module:api/UserApi~getGrantedApplicationsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/GrantedApplications} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get Granted Applications
     * This endpoint retrieves the granted applications associated with the user.
     * @param {Number} userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint.
     * @param {module:api/UserApi~getGrantedApplicationsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/GrantedApplications}
     */
    this.getGrantedApplications = function(userId, callback) {
      var postBody = null;

      // verify the required parameter 'userId' is set
      if (userId === undefined || userId === null) {
        throw new Error("Missing the required parameter 'userId' when calling getGrantedApplications");
      }


      var pathParams = {
        'user_id': userId
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = GrantedApplications;

      return this.apiClient.callApi(
        '/v1/user/{user_id}/granted_applications', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getGroups operation.
     * @callback module:api/UserApi~getGroupsCallback
     * @param {String} error Error message, if any.
     * @param {Array.<'String'>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get User Feature Groups
     * This endpoint retrieves the feature groups associated with the user.
     * @param {Number} userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint.
     * @param {module:api/UserApi~getGroupsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<'String'>}
     */
    this.getGroups = function(userId, callback) {
      var postBody = null;

      // verify the required parameter 'userId' is set
      if (userId === undefined || userId === null) {
        throw new Error("Missing the required parameter 'userId' when calling getGroups");
      }


      var pathParams = {
        'user_id': userId
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = ['String'];

      return this.apiClient.callApi(
        '/v1/user/{user_id}/groups', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getPersonalMeeting operation.
     * @callback module:api/UserApi~getPersonalMeetingCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PersonalMeetingRoom} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get Personal Meeting
     * This endpoint gets the settings for a user&#39;s personal meeting.
     * @param {Number} userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint.
     * @param {module:api/UserApi~getPersonalMeetingCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PersonalMeetingRoom}
     */
    this.getPersonalMeeting = function(userId, callback) {
      var postBody = null;

      // verify the required parameter 'userId' is set
      if (userId === undefined || userId === null) {
        throw new Error("Missing the required parameter 'userId' when calling getPersonalMeeting");
      }


      var pathParams = {
        'user_id': userId
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = PersonalMeetingRoom;

      return this.apiClient.callApi(
        '/v1/user/{user_id}/personal_meeting', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getRoom operation.
     * @callback module:api/UserApi~getRoomCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Room} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get User’s Default Meeting Settings
     * This endpoint gets a user’s default meeting settings.
     * @param {Number} userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint.
     * @param {module:api/UserApi~getRoomCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Room}
     */
    this.getRoom = function(userId, callback) {
      var postBody = null;

      // verify the required parameter 'userId' is set
      if (userId === undefined || userId === null) {
        throw new Error("Missing the required parameter 'userId' when calling getRoom");
      }


      var pathParams = {
        'user_id': userId
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = Room;

      return this.apiClient.callApi(
        '/v1/user/{user_id}/room', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getUser operation.
     * @callback module:api/UserApi~getUserCallback
     * @param {String} error Error message, if any.
     * @param {module:model/User} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get User Account Details
     * This endpoint retrieves the basic account details for a given user.
     * @param {Number} userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint.
     * @param {module:api/UserApi~getUserCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/User}
     */
    this.getUser = function(userId, callback) {
      var postBody = null;

      // verify the required parameter 'userId' is set
      if (userId === undefined || userId === null) {
        throw new Error("Missing the required parameter 'userId' when calling getUser");
      }


      var pathParams = {
        'user_id': userId
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = User;

      return this.apiClient.callApi(
        '/v1/user/{user_id}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getUserTags operation.
     * @callback module:api/UserApi~getUserTagsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TagListComp} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List User Tags
     * This endpoint retrieves all tags associated with the specified user.
     * @param {Number} userId The user ID for the account to retrieve tags.  This value is an integer which can be retrieved for the current user via the Get Enterprise Profile endpoint.
     * @param {module:api/UserApi~getUserTagsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TagListComp}
     */
    this.getUserTags = function(userId, callback) {
      var postBody = null;

      // verify the required parameter 'userId' is set
      if (userId === undefined || userId === null) {
        throw new Error("Missing the required parameter 'userId' when calling getUserTags");
      }


      var pathParams = {
        'userId': userId
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = TagListComp;

      return this.apiClient.callApi(
        '/v1/user/{userId}/tags', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the revokeGrantedApplication operation.
     * @callback module:api/UserApi~revokeGrantedApplicationCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Remove Granted Application
     * This endpoint revokes the granted application associated with the user.
     * @param {Number} userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint.
     * @param {String} clientId The ID of the granted application.
     * @param {module:api/UserApi~revokeGrantedApplicationCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.revokeGrantedApplication = function(userId, clientId, callback) {
      var postBody = null;

      // verify the required parameter 'userId' is set
      if (userId === undefined || userId === null) {
        throw new Error("Missing the required parameter 'userId' when calling revokeGrantedApplication");
      }

      // verify the required parameter 'clientId' is set
      if (clientId === undefined || clientId === null) {
        throw new Error("Missing the required parameter 'clientId' when calling revokeGrantedApplication");
      }


      var pathParams = {
        'user_id': userId,
        'client_id': clientId
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/v1/user/{user_id}/granted_applications/{client_id}', 'DELETE',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the setGroups operation.
     * @callback module:api/UserApi~setGroupsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Set User Feature Groups
     * This endpoint sets the feature groups associated with the user.
     * @param {Number} userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint.
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.enable The feature group you want to enable.
     * @param {module:model/String} opts.disable The feature group you want to disable.
     * @param {module:api/UserApi~setGroupsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.setGroups = function(userId, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'userId' is set
      if (userId === undefined || userId === null) {
        throw new Error("Missing the required parameter 'userId' when calling setGroups");
      }


      var pathParams = {
        'user_id': userId
      };
      var queryParams = {
        'enable': opts['enable'],
        'disable': opts['disable'],
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/v1/user/{user_id}/groups', 'PUT',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updatePeresonalMeeting operation.
     * @callback module:api/UserApi~updatePeresonalMeetingCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PersonalMeetingRoom} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update Personal Meeting
     * This endpoint changes the settings for a user&#39;s personal meeting.
     * @param {Number} userId The ID of the user of interest.  This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint.
     * @param {module:model/PersonalMeetingRoom} personalMeeting The user&#39;s personal meeting room details that you wish to update.
     * @param {module:api/UserApi~updatePeresonalMeetingCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PersonalMeetingRoom}
     */
    this.updatePeresonalMeeting = function(userId, personalMeeting, callback) {
      var postBody = personalMeeting;

      // verify the required parameter 'userId' is set
      if (userId === undefined || userId === null) {
        throw new Error("Missing the required parameter 'userId' when calling updatePeresonalMeeting");
      }

      // verify the required parameter 'personalMeeting' is set
      if (personalMeeting === undefined || personalMeeting === null) {
        throw new Error("Missing the required parameter 'personalMeeting' when calling updatePeresonalMeeting");
      }


      var pathParams = {
        'user_id': userId
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = PersonalMeetingRoom;

      return this.apiClient.callApi(
        '/v1/user/{user_id}/personal_meeting', 'PUT',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updateRoom operation.
     * @callback module:api/UserApi~updateRoomCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Room} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update User’s Default Meeting Settings
     * This endpoint allows updating a user’s default meeting settings.
     * @param {Number} userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint.
     * @param {module:model/Room} room The user&#39;s room details that you wish to update.
     * @param {module:api/UserApi~updateRoomCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Room}
     */
    this.updateRoom = function(userId, room, callback) {
      var postBody = room;

      // verify the required parameter 'userId' is set
      if (userId === undefined || userId === null) {
        throw new Error("Missing the required parameter 'userId' when calling updateRoom");
      }

      // verify the required parameter 'room' is set
      if (room === undefined || room === null) {
        throw new Error("Missing the required parameter 'room' when calling updateRoom");
      }


      var pathParams = {
        'user_id': userId
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = Room;

      return this.apiClient.callApi(
        '/v1/user/{user_id}/room', 'PUT',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updateUser operation.
     * @callback module:api/UserApi~updateUserCallback
     * @param {String} error Error message, if any.
     * @param {module:model/User} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update User Account Details
     * This endpoint allows updating a user’s basic account details.
     * @param {Number} userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint.
     * @param {module:model/User} user The user details that you wish to update.
     * @param {module:api/UserApi~updateUserCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/User}
     */
    this.updateUser = function(userId, user, callback) {
      var postBody = user;

      // verify the required parameter 'userId' is set
      if (userId === undefined || userId === null) {
        throw new Error("Missing the required parameter 'userId' when calling updateUser");
      }

      // verify the required parameter 'user' is set
      if (user === undefined || user === null) {
        throw new Error("Missing the required parameter 'user' when calling updateUser");
      }


      var pathParams = {
        'user_id': userId
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = User;

      return this.apiClient.callApi(
        '/v1/user/{user_id}', 'PUT',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updateUserProfilePicture operation.
     * @callback module:api/UserApi~updateUserProfilePictureCallback
     * @param {String} error Error message, if any.
     * @param {module:model/UploadPhotoResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update User Account Photograph
     * This endpoint uploads a photograph to the user profile
     * @param {Number} userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint.
     * @param {File} file The user details that you wish to update.
     * @param {module:api/UserApi~updateUserProfilePictureCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/UploadPhotoResponse}
     */
    this.updateUserProfilePicture = function(userId, file, callback) {
      var postBody = null;

      // verify the required parameter 'userId' is set
      if (userId === undefined || userId === null) {
        throw new Error("Missing the required parameter 'userId' when calling updateUserProfilePicture");
      }

      // verify the required parameter 'file' is set
      if (file === undefined || file === null) {
        throw new Error("Missing the required parameter 'file' when calling updateUserProfilePicture");
      }


      var pathParams = {
        'user_id': userId
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
        'file': file
      };

      var authNames = ['access_token'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = UploadPhotoResponse;

      return this.apiClient.callApi(
        '/v1/user/{user_id}/profile_picture/upload', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
