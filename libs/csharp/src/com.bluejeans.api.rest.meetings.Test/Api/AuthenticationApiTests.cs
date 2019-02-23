/* 
 * BlueJeans Meetings REST API
 *
 *  ## Video That Works Where You Do. <p>This site provides developers access to APIs from BlueJean's Meetings meeting service.  From here you can see and try actual API calls to manage User Accounts, Meetings, and Recordings, pull Analytical Data and Current State information.</p>    <nosdk> <hr> <div> <div class=\"key\">     <a href=\"./basics.html\" target=\"_\"><img class=\"keyimg\" src=\"./img/bjnmeeting.png\"/></a> </div> <div class=\"keybox\"> Basic instructions about What is a BlueJeans Meeting, and Getting Started Using API's, are <a href=\"./basics.html\" target=\"_blank\">available here <i class=\"glyphicon glyphicon-new-window\"></i></a>. </div> </div> <hr> <alert>2/21/2019</alert> Change response of Change layout and Endpoint API's to 204<br/> 12/03/2018 Add API for setting user profile photograph.<br/> 10/17/2018 Updated API field definitions for time variables to be 64-bit .<br/> 7/23/2018 Corrected errors in API definition file.<br/> 7/10/2018 Deprecated some Command Center API's.  Exposed API's that Summarize usage.<br/> 7/06/2018 Added API for changing ownership of recordings.<br/> 6/28/2018 Restored Create Enterprise Account, added Enterprise and User Profile Tag API's.<br/> 6/01/2018 Clarified Access Token requirements for meeting endpoint API's.<br/> 5/21/2018 Corrected return model for meeting history call.<br/> </nosdk> <hr> 
 *
 * OpenAPI spec version: 1.0.4402212019
 * Contact: glenn@bluejeans.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using com.bluejeans.api.rest.meetings.Client;
using com.bluejeans.api.rest.meetings.Api;
using com.bluejeans.api.rest.meetings.Model;

namespace com.bluejeans.api.rest.meetings.Test
{
    /// <summary>
    ///  Class for testing AuthenticationApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class AuthenticationApiTests
    {
        private AuthenticationApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new AuthenticationApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of AuthenticationApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' AuthenticationApi
            //Assert.IsInstanceOfType(typeof(AuthenticationApi), instance, "instance is a AuthenticationApi");
        }

        
        /// <summary>
        /// Test GetAuthorizationCode
        /// </summary>
        [Test]
        public void GetAuthorizationCodeTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string clientId = null;
            //string redirectUri = null;
            //string state = null;
            //string scope = null;
            //string responseType = null;
            //string appName = null;
            //string appLogoUrl = null;
            //instance.GetAuthorizationCode(clientId, redirectUri, state, scope, responseType, appName, appLogoUrl);
            
        }
        
        /// <summary>
        /// Test GetTokenByClient
        /// </summary>
        [Test]
        public void GetTokenByClientTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GrantRequestClient grantRequestClient = null;
            //var response = instance.GetTokenByClient(grantRequestClient);
            //Assert.IsInstanceOf<GrantClient> (response, "response is GrantClient");
        }
        
        /// <summary>
        /// Test GetTokenByCode
        /// </summary>
        [Test]
        public void GetTokenByCodeTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GrantRequestCode grantRequestCode = null;
            //var response = instance.GetTokenByCode(grantRequestCode);
            //Assert.IsInstanceOf<GrantCode> (response, "response is GrantCode");
        }
        
        /// <summary>
        /// Test GetTokenByMeeting
        /// </summary>
        [Test]
        public void GetTokenByMeetingTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GrantRequestMeeting grantRequestMeeting = null;
            //var response = instance.GetTokenByMeeting(grantRequestMeeting);
            //Assert.IsInstanceOf<GrantMeeting> (response, "response is GrantMeeting");
        }
        
        /// <summary>
        /// Test GetTokenByPassword
        /// </summary>
        [Test]
        public void GetTokenByPasswordTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GrantRequestPassword grantRequestPassword = null;
            //var response = instance.GetTokenByPassword(grantRequestPassword);
            //Assert.IsInstanceOf<GrantPassword> (response, "response is GrantPassword");
        }
        
        /// <summary>
        /// Test GetTokenByRefresh
        /// </summary>
        [Test]
        public void GetTokenByRefreshTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GrantRequestRefresh grantRequestRefresh = null;
            //var response = instance.GetTokenByRefresh(grantRequestRefresh);
            //Assert.IsInstanceOf<GrantRefresh> (response, "response is GrantRefresh");
        }
        
        /// <summary>
        /// Test GetTokenInfo
        /// </summary>
        [Test]
        public void GetTokenInfoTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accessToken = null;
            //var response = instance.GetTokenInfo(accessToken);
            //Assert.IsInstanceOf<InlineResponse200> (response, "response is InlineResponse200");
        }
        
        /// <summary>
        /// Test RevokeAccessToken
        /// </summary>
        [Test]
        public void RevokeAccessTokenTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GrantRequestRevoke grantRequestRevoke = null;
            //string accessToken = null;
            //instance.RevokeAccessToken(grantRequestRevoke, accessToken);
            
        }
        
    }

}
