/**
 * BlueJeans onVideo REST API
 *  Video That Works Where You Do. This site provides developers access to APIs from BlueJean's onVideo meeting service.  From here you will be able to make actual API calls to manage User Accounts, Meetings, and Recordings.  Also, you can pull analytical data and current state information. With these APIs you should be able to quickly integrate **BlueJeans** video administration into your applications.   ## Getting Started Before you start using BlueJeans' APIs, you must first have a BlueJeans account enabled for API Access.  Contact [BlueJeans Support](mailto:Support@BlueJeans.com) for assistance.  <br /><br />Once you have an account, you may start writing application code to authenticate and make API calls.  *Alternatively*, you can use this developer site to test the BlueJeans' APIs and develop a level of familiarity before you write production code.  <br /> ### To Make API Calls from This Site If you want to use this developer site to try various BlueJeans' APIs, here are the steps required to authenticate and enable your Developer Session to place API calls. 1. Choose Method for Authenticating      * Click on the desired Authentication method from below.      * Click on the **Try It Out** button. 1. Make Authentication request      * Follow APIs instructions and input the API parameters.      * Click on the blue **Execute** button.      * If successful, the API returns with JSON data containing a field called **access_token**.  Copy/save this value. 1. Authorize BlueJeans Developer Session.      * Click on the green **Authorize button**.       * The site will show you a pop-up window for authorization.      * Enter your access token in the field named **api_key**      * Click on the **Authorize** button  Your current BlueJeans developer session is now authenticated and ready to place API calls.  The web site will automatically include your access token on any API calls you make. ## About onVideo Authentication All API transactions (excluding Authentication) require an access token per **OAuth standards**.  BlueJeans provides multiple methods for obtaining an access token.  Additionally there are diffferent scopes of token access. ### Grant Types Bluejeans provides 4 different methods for users to Authenticate.  Successful authentication allows BlueJeans to grant an access token to perform API operations. * Password Credentials Grant – Authenticate with a username and password and receive an access token with user level permission. Known as two-legged OAuth. * Meeting Credentials Grant – Authenticate with a meeting ID and meeting passcode and receive an access token with meeting level permission. Known as two-legged OAuth. * Client Credentials Grant –  Authenticate with a client ID and client secret and receive an access token with enterprise level permission. Known as two-legged OAuth. * Authorization Code Grant – Authentication for your developer's application occurs through a redirection to a BlueJeans authentication page. The application receives an authorization code to be submitted, along with other tokens, to receive an access token. Known as three-legged OAuth. For more information please refer to the [OAuth specification](https://oauth.net/). ### Access & Permissions BlueJeans defines 3 levels of API access into the system.  When an access token is granted, it carries one of these 3 levels.  The scope of system functionality depends upon the token's access level. * Meeting-level – Scope of APIs is limited to individual meetings. * User-level – Scope depends on the requested permissions. * App-level – provisioned either by BlueJeans personnel, or the BlueJeans Enterprise Admin, an app, is issued a client key and secret key. These tokens then are used by the BlueJeans Authentication API to receive the token. The token's scope provides access to the entire enterprise and all of its users. All endpoints in this document that require **Enterprise Admin** access will be marked as such. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: brandon@bluejeans.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
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
    if (!root.BlueJeansOnVideoRestApi) {
      root.BlueJeansOnVideoRestApi = {};
    }
    root.BlueJeansOnVideoRestApi.AnalyticsEndpointDistributionDistribution = factory(root.BlueJeansOnVideoRestApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The AnalyticsEndpointDistributionDistribution model module.
   * @module model/AnalyticsEndpointDistributionDistribution
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>AnalyticsEndpointDistributionDistribution</code>.
   * @alias module:model/AnalyticsEndpointDistributionDistribution
   * @class
   */
  var exports = function() {
    var _this = this;

















  };

  /**
   * Constructs a <code>AnalyticsEndpointDistributionDistribution</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AnalyticsEndpointDistributionDistribution} obj Optional instance to populate.
   * @return {module:model/AnalyticsEndpointDistributionDistribution} The populated <code>AnalyticsEndpointDistributionDistribution</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('Google')) {
        obj['Google'] = ApiClient.convertToType(data['Google'], 'Number');
      }
      if (data.hasOwnProperty('Telepresence')) {
        obj['Telepresence'] = ApiClient.convertToType(data['Telepresence'], 'Number');
      }
      if (data.hasOwnProperty('Lync')) {
        obj['Lync'] = ApiClient.convertToType(data['Lync'], 'Number');
      }
      if (data.hasOwnProperty('iOS')) {
        obj['iOS'] = ApiClient.convertToType(data['iOS'], 'Number');
      }
      if (data.hasOwnProperty('H323')) {
        obj['H323'] = ApiClient.convertToType(data['H323'], 'Number');
      }
      if (data.hasOwnProperty('InterCall')) {
        obj['InterCall'] = ApiClient.convertToType(data['InterCall'], 'Number');
      }
      if (data.hasOwnProperty('Jabber')) {
        obj['Jabber'] = ApiClient.convertToType(data['Jabber'], 'Number');
      }
      if (data.hasOwnProperty('Android')) {
        obj['Android'] = ApiClient.convertToType(data['Android'], 'Number');
      }
      if (data.hasOwnProperty('Skype')) {
        obj['Skype'] = ApiClient.convertToType(data['Skype'], 'Number');
      }
      if (data.hasOwnProperty('ISDN')) {
        obj['ISDN'] = ApiClient.convertToType(data['ISDN'], 'Number');
      }
      if (data.hasOwnProperty('PSTN')) {
        obj['PSTN'] = ApiClient.convertToType(data['PSTN'], 'Number');
      }
      if (data.hasOwnProperty('Level3')) {
        obj['Level3'] = ApiClient.convertToType(data['Level3'], 'Number');
      }
      if (data.hasOwnProperty('SIP')) {
        obj['SIP'] = ApiClient.convertToType(data['SIP'], 'Number');
      }
      if (data.hasOwnProperty('BlueJeansApp')) {
        obj['BlueJeansApp'] = ApiClient.convertToType(data['BlueJeansApp'], 'Number');
      }
      if (data.hasOwnProperty('Browser')) {
        obj['Browser'] = ApiClient.convertToType(data['Browser'], 'Number');
      }
      if (data.hasOwnProperty('WebRTC')) {
        obj['WebRTC'] = ApiClient.convertToType(data['WebRTC'], 'Number');
      }
    }
    return obj;
  }

  /**
   * @member {Number} Google
   */
  exports.prototype['Google'] = undefined;
  /**
   * @member {Number} Telepresence
   */
  exports.prototype['Telepresence'] = undefined;
  /**
   * @member {Number} Lync
   */
  exports.prototype['Lync'] = undefined;
  /**
   * @member {Number} iOS
   */
  exports.prototype['iOS'] = undefined;
  /**
   * @member {Number} H323
   */
  exports.prototype['H323'] = undefined;
  /**
   * @member {Number} InterCall
   */
  exports.prototype['InterCall'] = undefined;
  /**
   * @member {Number} Jabber
   */
  exports.prototype['Jabber'] = undefined;
  /**
   * @member {Number} Android
   */
  exports.prototype['Android'] = undefined;
  /**
   * @member {Number} Skype
   */
  exports.prototype['Skype'] = undefined;
  /**
   * @member {Number} ISDN
   */
  exports.prototype['ISDN'] = undefined;
  /**
   * @member {Number} PSTN
   */
  exports.prototype['PSTN'] = undefined;
  /**
   * @member {Number} Level3
   */
  exports.prototype['Level3'] = undefined;
  /**
   * @member {Number} SIP
   */
  exports.prototype['SIP'] = undefined;
  /**
   * @member {Number} BlueJeansApp
   */
  exports.prototype['BlueJeansApp'] = undefined;
  /**
   * @member {Number} Browser
   */
  exports.prototype['Browser'] = undefined;
  /**
   * @member {Number} WebRTC
   */
  exports.prototype['WebRTC'] = undefined;



  return exports;
}));

