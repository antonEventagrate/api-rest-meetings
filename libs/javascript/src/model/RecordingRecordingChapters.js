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
    define(['ApiClient', 'model/RecordingSession'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./RecordingSession'));
  } else {
    // Browser globals (root is window)
    if (!root.BlueJeansMeetingsRestApi) {
      root.BlueJeansMeetingsRestApi = {};
    }
    root.BlueJeansMeetingsRestApi.RecordingRecordingChapters = factory(root.BlueJeansMeetingsRestApi.ApiClient, root.BlueJeansMeetingsRestApi.RecordingSession);
  }
}(this, function(ApiClient, RecordingSession) {
  'use strict';




  /**
   * The RecordingRecordingChapters model module.
   * @module model/RecordingRecordingChapters
   * @version 1.0.4402212019
   */

  /**
   * Constructs a new <code>RecordingRecordingChapters</code>.
   * @alias module:model/RecordingRecordingChapters
   * @class
   */
  var exports = function() {
    var _this = this;












  };

  /**
   * Constructs a <code>RecordingRecordingChapters</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/RecordingRecordingChapters} obj Optional instance to populate.
   * @return {module:model/RecordingRecordingChapters} The populated <code>RecordingRecordingChapters</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('chapterId')) {
        obj['chapterId'] = ApiClient.convertToType(data['chapterId'], 'String');
      }
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'Number');
      }
      if (data.hasOwnProperty('startTimeOffset')) {
        obj['startTimeOffset'] = ApiClient.convertToType(data['startTimeOffset'], 'Number');
      }
      if (data.hasOwnProperty('endTimeOffset')) {
        obj['endTimeOffset'] = ApiClient.convertToType(data['endTimeOffset'], 'Number');
      }
      if (data.hasOwnProperty('chapterName')) {
        obj['chapterName'] = ApiClient.convertToType(data['chapterName'], 'String');
      }
      if (data.hasOwnProperty('totalSize')) {
        obj['totalSize'] = ApiClient.convertToType(data['totalSize'], 'Number');
      }
      if (data.hasOwnProperty('compositeContentId')) {
        obj['compositeContentId'] = ApiClient.convertToType(data['compositeContentId'], 'Number');
      }
      if (data.hasOwnProperty('compositeContentStatus')) {
        obj['compositeContentStatus'] = ApiClient.convertToType(data['compositeContentStatus'], 'String');
      }
      if (data.hasOwnProperty('parentRecordingId')) {
        obj['parentRecordingId'] = ApiClient.convertToType(data['parentRecordingId'], 'Number');
      }
      if (data.hasOwnProperty('viewCount')) {
        obj['viewCount'] = ApiClient.convertToType(data['viewCount'], 'Number');
      }
      if (data.hasOwnProperty('recordingSessions')) {
        obj['recordingSessions'] = ApiClient.convertToType(data['recordingSessions'], [RecordingSession]);
      }
    }
    return obj;
  }

  /**
   * @member {String} chapterId
   */
  exports.prototype['chapterId'] = undefined;
  /**
   * @member {Number} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {Number} startTimeOffset
   */
  exports.prototype['startTimeOffset'] = undefined;
  /**
   * @member {Number} endTimeOffset
   */
  exports.prototype['endTimeOffset'] = undefined;
  /**
   * @member {String} chapterName
   */
  exports.prototype['chapterName'] = undefined;
  /**
   * @member {Number} totalSize
   */
  exports.prototype['totalSize'] = undefined;
  /**
   * @member {Number} compositeContentId
   */
  exports.prototype['compositeContentId'] = undefined;
  /**
   * @member {String} compositeContentStatus
   */
  exports.prototype['compositeContentStatus'] = undefined;
  /**
   * @member {Number} parentRecordingId
   */
  exports.prototype['parentRecordingId'] = undefined;
  /**
   * @member {Number} viewCount
   */
  exports.prototype['viewCount'] = undefined;
  /**
   * @member {Array.<module:model/RecordingSession>} recordingSessions
   */
  exports.prototype['recordingSessions'] = undefined;



  return exports;
}));


