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
    root.BlueJeansMeetingsRestApi.AnalyticsUsageUsage = factory(root.BlueJeansMeetingsRestApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The AnalyticsUsageUsage model module.
   * @module model/AnalyticsUsageUsage
   * @version 1.0.4402212019
   */

  /**
   * Constructs a new <code>AnalyticsUsageUsage</code>.
   * @alias module:model/AnalyticsUsageUsage
   * @class
   */
  var exports = function() {
    var _this = this;





  };

  /**
   * Constructs a <code>AnalyticsUsageUsage</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AnalyticsUsageUsage} obj Optional instance to populate.
   * @return {module:model/AnalyticsUsageUsage} The populated <code>AnalyticsUsageUsage</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('endpointMinutes')) {
        obj['endpointMinutes'] = ApiClient.convertToType(data['endpointMinutes'], 'Number');
      }
      if (data.hasOwnProperty('numEndpoints')) {
        obj['numEndpoints'] = ApiClient.convertToType(data['numEndpoints'], 'Number');
      }
      if (data.hasOwnProperty('numMeetings')) {
        obj['numMeetings'] = ApiClient.convertToType(data['numMeetings'], 'Number');
      }
      if (data.hasOwnProperty('Date')) {
        obj['Date'] = ApiClient.convertToType(data['Date'], 'Number');
      }
    }
    return obj;
  }

  /**
   * @member {Number} endpointMinutes
   */
  exports.prototype['endpointMinutes'] = undefined;
  /**
   * @member {Number} numEndpoints
   */
  exports.prototype['numEndpoints'] = undefined;
  /**
   * @member {Number} numMeetings
   */
  exports.prototype['numMeetings'] = undefined;
  /**
   * @member {Number} Date
   */
  exports.prototype['Date'] = undefined;



  return exports;
}));


