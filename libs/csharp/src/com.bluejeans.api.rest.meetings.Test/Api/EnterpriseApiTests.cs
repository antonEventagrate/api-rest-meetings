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
    ///  Class for testing EnterpriseApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class EnterpriseApiTests
    {
        private EnterpriseApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new EnterpriseApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of EnterpriseApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' EnterpriseApi
            //Assert.IsInstanceOfType(typeof(EnterpriseApi), instance, "instance is a EnterpriseApi");
        }

        
        /// <summary>
        /// Test ChangeEnterpriseTags
        /// </summary>
        [Test]
        public void ChangeEnterpriseTagsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? enterpriseId = null;
            //string action = null;
            //string tag = null;
            //var response = instance.ChangeEnterpriseTags(enterpriseId, action, tag);
            //Assert.IsInstanceOf<TagListComp> (response, "response is TagListComp");
        }
        
        /// <summary>
        /// Test CreateEnterpriseUser
        /// </summary>
        [Test]
        public void CreateEnterpriseUserTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? enterpriseId = null;
            //EnterpriseCreateUser enterpriseUser = null;
            //string billingCategory = null;
            //bool? forcePasswordChange = null;
            //bool? isAdmin = null;
            //var response = instance.CreateEnterpriseUser(enterpriseId, enterpriseUser, billingCategory, forcePasswordChange, isAdmin);
            //Assert.IsInstanceOf<UserId> (response, "response is UserId");
        }
        
        /// <summary>
        /// Test ExportUsers
        /// </summary>
        [Test]
        public void ExportUsersTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? enterpriseId = null;
            //instance.ExportUsers(enterpriseId);
            
        }
        
        /// <summary>
        /// Test GetEnterpriseTags
        /// </summary>
        [Test]
        public void GetEnterpriseTagsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? enterpriseId = null;
            //var response = instance.GetEnterpriseTags(enterpriseId);
            //Assert.IsInstanceOf<TagListComp> (response, "response is TagListComp");
        }
        
        /// <summary>
        /// Test RemoveUser
        /// </summary>
        [Test]
        public void RemoveUserTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? enterpriseId = null;
            //int? userId = null;
            //instance.RemoveUser(enterpriseId, userId);
            
        }
        
        /// <summary>
        /// Test SearchUsers
        /// </summary>
        [Test]
        public void SearchUsersTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? enterpriseId = null;
            //string fields = null;
            //string order = null;
            //string sortBy = null;
            //string textSearch = null;
            //string emailId = null;
            //int? pageSize = null;
            //int? pageNumber = null;
            //var response = instance.SearchUsers(enterpriseId, fields, order, sortBy, textSearch, emailId, pageSize, pageNumber);
            //Assert.IsInstanceOf<EnterpriseUserSearch> (response, "response is EnterpriseUserSearch");
        }
        
    }

}
