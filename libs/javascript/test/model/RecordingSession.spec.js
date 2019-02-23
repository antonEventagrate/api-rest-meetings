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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.BlueJeansMeetingsRestApi);
  }
}(this, function(expect, BlueJeansMeetingsRestApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new BlueJeansMeetingsRestApi.RecordingSession();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('RecordingSession', function() {
    it('should create an instance of RecordingSession', function() {
      // uncomment below and update the code to test RecordingSession
      //var instance = new BlueJeansMeetingsRestApi.RecordingSession();
      //expect(instance).to.be.a(BlueJeansMeetingsRestApi.RecordingSession);
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new BlueJeansMeetingsRestApi.RecordingSession();
      //expect(instance).to.be();
    });

    it('should have the property contentStatus (base name: "contentStatus")', function() {
      // uncomment below and update the code to test the property contentStatus
      //var instance = new BlueJeansMeetingsRestApi.RecordingSession();
      //expect(instance).to.be();
    });

    it('should have the property recordingType (base name: "recordingType")', function() {
      // uncomment below and update the code to test the property recordingType
      //var instance = new BlueJeansMeetingsRestApi.RecordingSession();
      //expect(instance).to.be();
    });

    it('should have the property contentId (base name: "contentId")', function() {
      // uncomment below and update the code to test the property contentId
      //var instance = new BlueJeansMeetingsRestApi.RecordingSession();
      //expect(instance).to.be();
    });

    it('should have the property thumbnailUrl (base name: "thumbnailUrl")', function() {
      // uncomment below and update the code to test the property thumbnailUrl
      //var instance = new BlueJeansMeetingsRestApi.RecordingSession();
      //expect(instance).to.be();
    });

    it('should have the property startTimeOffset (base name: "startTimeOffset")', function() {
      // uncomment below and update the code to test the property startTimeOffset
      //var instance = new BlueJeansMeetingsRestApi.RecordingSession();
      //expect(instance).to.be();
    });

    it('should have the property endTimeOffset (base name: "endTimeOffset")', function() {
      // uncomment below and update the code to test the property endTimeOffset
      //var instance = new BlueJeansMeetingsRestApi.RecordingSession();
      //expect(instance).to.be();
    });

    it('should have the property duration (base name: "duration")', function() {
      // uncomment below and update the code to test the property duration
      //var instance = new BlueJeansMeetingsRestApi.RecordingSession();
      //expect(instance).to.be();
    });

    it('should have the property startedBy (base name: "startedBy")', function() {
      // uncomment below and update the code to test the property startedBy
      //var instance = new BlueJeansMeetingsRestApi.RecordingSession();
      //expect(instance).to.be();
    });

    it('should have the property stoppedBy (base name: "stoppedBy")', function() {
      // uncomment below and update the code to test the property stoppedBy
      //var instance = new BlueJeansMeetingsRestApi.RecordingSession();
      //expect(instance).to.be();
    });

  });

}));
