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
    root.BlueJeansMeetingsRestApi.PersonalMeetingRoomModerator = factory(root.BlueJeansMeetingsRestApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The PersonalMeetingRoomModerator model module.
   * @module model/PersonalMeetingRoomModerator
   * @version 1.0.4402212019
   */

  /**
   * Constructs a new <code>PersonalMeetingRoomModerator</code>.
   * @alias module:model/PersonalMeetingRoomModerator
   * @class
   */
  var exports = function() {
    var _this = this;






  };

  /**
   * Constructs a <code>PersonalMeetingRoomModerator</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PersonalMeetingRoomModerator} obj Optional instance to populate.
   * @return {module:model/PersonalMeetingRoomModerator} The populated <code>PersonalMeetingRoomModerator</code> instance.
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
      if (data.hasOwnProperty('firstname')) {
        obj['firstname'] = ApiClient.convertToType(data['firstname'], 'String');
      }
      if (data.hasOwnProperty('lastname')) {
        obj['lastname'] = ApiClient.convertToType(data['lastname'], 'String');
      }
      if (data.hasOwnProperty('profile_pic_url')) {
        obj['profile_pic_url'] = ApiClient.convertToType(data['profile_pic_url'], 'String');
      }
    }
    return obj;
  }

  /**
   * This is the unique number associated with the moderator's account.
   * @member {Number} id
   */
  exports.prototype['id'] = undefined;
  /**
   * This is the moderator account's user name
   * @member {String} username
   */
  exports.prototype['username'] = undefined;
  /**
   * This is the moderator account's first name.
   * @member {String} firstname
   */
  exports.prototype['firstname'] = undefined;
  /**
   * This is the moderator account's last name.
   * @member {String} lastname
   */
  exports.prototype['lastname'] = undefined;
  /**
   * This is a URL to a profile picture associated with the moderator's BlueJeans account.
   * @member {String} profile_pic_url
   */
  exports.prototype['profile_pic_url'] = undefined;



  return exports;
}));


