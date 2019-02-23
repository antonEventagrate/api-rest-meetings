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
    define(['ApiClient', 'model/EndpointIndigo', 'model/MeetingIndigo'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./EndpointIndigo'), require('./MeetingIndigo'));
  } else {
    // Browser globals (root is window)
    if (!root.BlueJeansMeetingsRestApi) {
      root.BlueJeansMeetingsRestApi = {};
    }
    root.BlueJeansMeetingsRestApi.MeetingExtendedIndigo = factory(root.BlueJeansMeetingsRestApi.ApiClient, root.BlueJeansMeetingsRestApi.EndpointIndigo, root.BlueJeansMeetingsRestApi.MeetingIndigo);
  }
}(this, function(ApiClient, EndpointIndigo, MeetingIndigo) {
  'use strict';




  /**
   * The MeetingExtendedIndigo model module.
   * @module model/MeetingExtendedIndigo
   * @version 1.0.4402212019
   */

  /**
   * Constructs a new <code>MeetingExtendedIndigo</code>.
   * @alias module:model/MeetingExtendedIndigo
   * @class
   * @implements module:model/MeetingIndigo
   */
  var exports = function() {
    var _this = this;

    MeetingIndigo.call(_this);

  };

  /**
   * Constructs a <code>MeetingExtendedIndigo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MeetingExtendedIndigo} obj Optional instance to populate.
   * @return {module:model/MeetingExtendedIndigo} The populated <code>MeetingExtendedIndigo</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      MeetingIndigo.constructFromObject(data, obj);
      if (data.hasOwnProperty('endpoints')) {
        obj['endpoints'] = ApiClient.convertToType(data['endpoints'], [EndpointIndigo]);
      }
    }
    return obj;
  }

  /**
   * @member {Array.<module:model/EndpointIndigo>} endpoints
   */
  exports.prototype['endpoints'] = undefined;

  // Implement MeetingIndigo interface:
  /**
   * This is the same as the numericMeetingId found elsewhere. We should have been more consistent.
   * @member {String} meetingId
   */
exports.prototype['meetingId'] = undefined;

  /**
   * The universally unique identifier (UUID) of the meeting. This value is a string which contains 6 alphanumeric segments separated by dashes.
   * @member {String} meetingUUID
   */
exports.prototype['meetingUUID'] = undefined;

  /**
   * @member {String} userName
   */
exports.prototype['userName'] = undefined;

  /**
   * @member {String} email
   */
exports.prototype['email'] = undefined;

  /**
   * @member {Number} encryptionType
   */
exports.prototype['encryptionType'] = undefined;

  /**
   * @member {String} title
   */
exports.prototype['title'] = undefined;

  /**
   * @member {String} userFullName
   */
exports.prototype['userFullName'] = undefined;

  /**
   * @member {String} phoneNumber
   */
exports.prototype['phoneNumber'] = undefined;

  /**
   * @member {String} userFeatures
   */
exports.prototype['userFeatures'] = undefined;

  /**
   * @member {module:model/MeetingIndigo.ScheduledFromEnum} scheduledFrom
   */
exports.prototype['scheduledFrom'] = undefined;

  /**
   * @member {Number} inviteeCount
   */
exports.prototype['inviteeCount'] = undefined;

  /**
   * @member {Boolean} personal
   */
exports.prototype['personal'] = undefined;

  /**
   * @member {Boolean} muteOnEntry
   */
exports.prototype['muteOnEntry'] = undefined;

  /**
   * @member {Boolean} autoRecord
   */
exports.prototype['autoRecord'] = undefined;

  /**
   * @member {String} enterpriseName
   */
exports.prototype['enterpriseName'] = undefined;

  /**
   * @member {Boolean} moderatorLess
   */
exports.prototype['moderatorLess'] = undefined;

  /**
   * @member {Number} startTime
   */
exports.prototype['startTime'] = undefined;

  /**
   * @member {Number} endTime
   */
exports.prototype['endTime'] = undefined;

  /**
   * @member {Number} totalCallSeconds
   */
exports.prototype['totalCallSeconds'] = undefined;

  /**
   * @member {Number} createTime
   */
exports.prototype['createTime'] = undefined;

  /**
   * @member {Number} endpointsCount
   */
exports.prototype['endpointsCount'] = undefined;

  /**
   * @member {Number} concurrentEndpoints
   */
exports.prototype['concurrentEndpoints'] = undefined;

  /**
   * @member {Number} liveVisibleEndpointsCount
   */
exports.prototype['liveVisibleEndpointsCount'] = undefined;

  /**
   * @member {Number} qualarooRating
   */
exports.prototype['qualarooRating'] = undefined;

  /**
   * @member {Number} qualarooCount
   */
exports.prototype['qualarooCount'] = undefined;

  /**
   * @member {Boolean} meetingRecording
   */
exports.prototype['meetingRecording'] = undefined;

  /**
   * @member {Boolean} videoShare
   */
exports.prototype['videoShare'] = undefined;

  /**
   * @member {Boolean} contentShare
   */
exports.prototype['contentShare'] = undefined;

  /**
   * @member {Boolean} liveRecording
   */
exports.prototype['liveRecording'] = undefined;

  /**
   * @member {Boolean} liveVideoShare
   */
exports.prototype['liveVideoShare'] = undefined;

  /**
   * @member {Boolean} liveContentShare
   */
exports.prototype['liveContentShare'] = undefined;

  /**
   * @member {Boolean} largeMeeting
   */
exports.prototype['largeMeeting'] = undefined;

  /**
   * @member {Number} roiDistance
   */
exports.prototype['roiDistance'] = undefined;

  /**
   * @member {Boolean} mpls
   */
exports.prototype['mpls'] = undefined;

  /**
   * Same as the meetingUUID property in this object.
   * @member {String} id
   */
exports.prototype['id'] = undefined;



  return exports;
}));


