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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.BlueJeansMeetingsRestApi) {
      root.BlueJeansMeetingsRestApi = {};
    }
    root.BlueJeansMeetingsRestApi.UserDeprecated = factory(root.BlueJeansMeetingsRestApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The UserDeprecated model module.
   * @module model/UserDeprecated
   * @version 1.0.4402212019
   */

  /**
   * Constructs a new <code>UserDeprecated</code>.
   * DEPRECATED (2/5/2018) -- This JSON object contains the BlueJeans&#39; user profile fields prior to MeetMe35.
   * @alias module:model/UserDeprecated
   * @class
   */
  var exports = function() {
    var _this = this;














  };

  /**
   * Constructs a <code>UserDeprecated</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/UserDeprecated} obj Optional instance to populate.
   * @return {module:model/UserDeprecated} The populated <code>UserDeprecated</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'Number');
      }
      if (data.hasOwnProperty('username')) {
        obj['username'] = ApiClient.convertToType(data['username'], 'String');
      }
      if (data.hasOwnProperty('firstName')) {
        obj['firstName'] = ApiClient.convertToType(data['firstName'], 'String');
      }
      if (data.hasOwnProperty('middleName')) {
        obj['middleName'] = ApiClient.convertToType(data['middleName'], 'String');
      }
      if (data.hasOwnProperty('lastName')) {
        obj['lastName'] = ApiClient.convertToType(data['lastName'], 'String');
      }
      if (data.hasOwnProperty('emailId')) {
        obj['emailId'] = ApiClient.convertToType(data['emailId'], 'String');
      }
      if (data.hasOwnProperty('company')) {
        obj['company'] = ApiClient.convertToType(data['company'], 'String');
      }
      if (data.hasOwnProperty('title')) {
        obj['title'] = ApiClient.convertToType(data['title'], 'String');
      }
      if (data.hasOwnProperty('phone')) {
        obj['phone'] = ApiClient.convertToType(data['phone'], 'String');
      }
      if (data.hasOwnProperty('profilePicture')) {
        obj['profilePicture'] = ApiClient.convertToType(data['profilePicture'], 'String');
      }
      if (data.hasOwnProperty('timezone')) {
        obj['timezone'] = ApiClient.convertToType(data['timezone'], 'String');
      }
      if (data.hasOwnProperty('timeFormat')) {
        obj['timeFormat'] = ApiClient.convertToType(data['timeFormat'], 'Number');
      }
      if (data.hasOwnProperty('language')) {
        obj['language'] = ApiClient.convertToType(data['language'], 'String');
      }
    }
    return obj;
  }

  /**
   * Unique identifier for the user.
   * @member {Number} id
   */
  exports.prototype['id'] = undefined;
  /**
   * User's username
   * @member {String} username
   */
  exports.prototype['username'] = undefined;
  /**
   * User's first name
   * @member {String} firstName
   */
  exports.prototype['firstName'] = undefined;
  /**
   * User's middle name
   * @member {String} middleName
   */
  exports.prototype['middleName'] = undefined;
  /**
   * User's last name
   * @member {String} lastName
   */
  exports.prototype['lastName'] = undefined;
  /**
   * User's email address
   * @member {String} emailId
   */
  exports.prototype['emailId'] = undefined;
  /**
   * User's company name
   * @member {String} company
   */
  exports.prototype['company'] = undefined;
  /**
   * User's title
   * @member {String} title
   */
  exports.prototype['title'] = undefined;
  /**
   * User's phone
   * @member {String} phone
   */
  exports.prototype['phone'] = undefined;
  /**
   * Path to user's profile picture
   * @member {String} profilePicture
   */
  exports.prototype['profilePicture'] = undefined;
  /**
   * User's timezone
   * @member {String} timezone
   */
  exports.prototype['timezone'] = undefined;
  /**
   * User's preference of 12 or 24 hour time display
   * @member {Number} timeFormat
   */
  exports.prototype['timeFormat'] = undefined;
  /**
   * User's language code
   * @member {String} language
   */
  exports.prototype['language'] = undefined;



  return exports;
}));


