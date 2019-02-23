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
    define(['ApiClient', 'model/MeetingSharingProperties', 'model/RecepientOptionsComp'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./MeetingSharingProperties'), require('./RecepientOptionsComp'));
  } else {
    // Browser globals (root is window)
    if (!root.BlueJeansMeetingsRestApi) {
      root.BlueJeansMeetingsRestApi = {};
    }
    root.BlueJeansMeetingsRestApi.MeetingSharing = factory(root.BlueJeansMeetingsRestApi.ApiClient, root.BlueJeansMeetingsRestApi.MeetingSharingProperties, root.BlueJeansMeetingsRestApi.RecepientOptionsComp);
  }
}(this, function(ApiClient, MeetingSharingProperties, RecepientOptionsComp) {
  'use strict';




  /**
   * The MeetingSharing model module.
   * @module model/MeetingSharing
   * @version 1.0.4402212019
   */

  /**
   * Constructs a new <code>MeetingSharing</code>.
   * @alias module:model/MeetingSharing
   * @class
   */
  var exports = function() {
    var _this = this;













  };

  /**
   * Constructs a <code>MeetingSharing</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MeetingSharing} obj Optional instance to populate.
   * @return {module:model/MeetingSharing} The populated <code>MeetingSharing</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'Number');
      }
      if (data.hasOwnProperty('meetingGuid')) {
        obj['meetingGuid'] = ApiClient.convertToType(data['meetingGuid'], 'String');
      }
      if (data.hasOwnProperty('ownerId')) {
        obj['ownerId'] = ApiClient.convertToType(data['ownerId'], 'Number');
      }
      if (data.hasOwnProperty('sharingUrl')) {
        obj['sharingUrl'] = ApiClient.convertToType(data['sharingUrl'], 'String');
      }
      if (data.hasOwnProperty('recepientType')) {
        obj['recepientType'] = RecepientOptionsComp.constructFromObject(data['recepientType']);
      }
      if (data.hasOwnProperty('properties')) {
        obj['properties'] = MeetingSharingProperties.constructFromObject(data['properties']);
      }
      if (data.hasOwnProperty('status')) {
        obj['status'] = ApiClient.convertToType(data['status'], 'String');
      }
      if (data.hasOwnProperty('downloadable')) {
        obj['downloadable'] = ApiClient.convertToType(data['downloadable'], 'Boolean');
      }
      if (data.hasOwnProperty('passcode')) {
        obj['passcode'] = ApiClient.convertToType(data['passcode'], 'String');
      }
      if (data.hasOwnProperty('validity')) {
        obj['validity'] = ApiClient.convertToType(data['validity'], 'String');
      }
      if (data.hasOwnProperty('created')) {
        obj['created'] = ApiClient.convertToType(data['created'], 'Number');
      }
      if (data.hasOwnProperty('lastmodified')) {
        obj['lastmodified'] = ApiClient.convertToType(data['lastmodified'], 'Number');
      }
    }
    return obj;
  }

  /**
   * This field is the Sharing Authorization unique identifier.
   * @member {Number} id
   */
  exports.prototype['id'] = undefined;
  /**
   * The meetingGuid is a globally unique Id for this particular recording. It is a string which contains the numeric meeting id, followed by a colon, followed by a 128-bit integer number formatted as 6 alphanumeric segments separated by dashes.
   * @member {String} meetingGuid
   */
  exports.prototype['meetingGuid'] = undefined;
  /**
   * The ownerId field is the unique Id number of the BlueJeans account that owns the recording
   * @member {Number} ownerId
   */
  exports.prototype['ownerId'] = undefined;
  /**
   * @member {String} sharingUrl
   */
  exports.prototype['sharingUrl'] = undefined;
  /**
   * @member {module:model/RecepientOptionsComp} recepientType
   */
  exports.prototype['recepientType'] = undefined;
  /**
   * @member {module:model/MeetingSharingProperties} properties
   */
  exports.prototype['properties'] = undefined;
  /**
   * This status field indicates the state of the sharing authorization record.
   * @member {module:model/MeetingSharing.StatusEnum} status
   */
  exports.prototype['status'] = undefined;
  /**
   * The downloadable field indicates whether the recording can be downloaded
   * @member {Boolean} downloadable
   */
  exports.prototype['downloadable'] = undefined;
  /**
   * TBD
   * @member {String} passcode
   */
  exports.prototype['passcode'] = undefined;
  /**
   * TBD
   * @member {String} validity
   */
  exports.prototype['validity'] = undefined;
  /**
   * Date, since epoch time, that the recording was created (in milliseconds).
   * @member {Number} created
   */
  exports.prototype['created'] = undefined;
  /**
   * Date, since epoch time, that the recording was last modified (in milliseconds).
   * @member {Number} lastmodified
   */
  exports.prototype['lastmodified'] = undefined;


  /**
   * Allowed values for the <code>status</code> property.
   * @enum {String}
   * @readonly
   */
  exports.StatusEnum = {
    /**
     * value: "ACTIVE"
     * @const
     */
    "ACTIVE": "ACTIVE",
    /**
     * value: "DELETED"
     * @const
     */
    "DELETED": "DELETED"  };


  return exports;
}));


