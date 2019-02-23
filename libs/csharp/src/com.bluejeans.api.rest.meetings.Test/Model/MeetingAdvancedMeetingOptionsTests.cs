/* 
 * BlueJeans Meetings REST API
 *
 *  ## Video That Works Where You Do. <p>This site provides developers access to APIs from BlueJean's Meetings meeting service.  From here you can see and try actual API calls to manage User Accounts, Meetings, and Recordings, pull Analytical Data and Current State information.</p>    <nosdk> <hr> <div> <div class=\"key\">     <a href=\"./basics.html\" target=\"_\"><img class=\"keyimg\" src=\"./img/bjnmeeting.png\"/></a> </div> <div class=\"keybox\"> Basic instructions about What is a BlueJeans Meeting, and Getting Started Using API's, are <a href=\"./basics.html\" target=\"_blank\">available here <i class=\"glyphicon glyphicon-new-window\"></i></a>. </div> </div> <hr> <alert>2/21/2019</alert> Change response of Change layout and Endpoint API's to 204<br/> 12/03/2018 Add API for setting user profile photograph.<br/> 10/17/2018 Updated API field definitions for time variables to be 64-bit .<br/> 7/23/2018 Corrected errors in API definition file.<br/> 7/10/2018 Deprecated some Command Center API's.  Exposed API's that Summarize usage.<br/> 7/06/2018 Added API for changing ownership of recordings.<br/> 6/28/2018 Restored Create Enterprise Account, added Enterprise and User Profile Tag API's.<br/> 6/01/2018 Clarified Access Token requirements for meeting endpoint API's.<br/> 5/21/2018 Corrected return model for meeting history call.<br/> </nosdk> <hr> 
 *
 * OpenAPI spec version: 1.0.4402212019
 * Contact: glenn@bluejeans.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */


using NUnit.Framework;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using com.bluejeans.api.rest.meetings.Api;
using com.bluejeans.api.rest.meetings.Model;
using com.bluejeans.api.rest.meetings.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace com.bluejeans.api.rest.meetings.Test
{
    /// <summary>
    ///  Class for testing MeetingAdvancedMeetingOptions
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class MeetingAdvancedMeetingOptionsTests
    {
        // TODO uncomment below to declare an instance variable for MeetingAdvancedMeetingOptions
        //private MeetingAdvancedMeetingOptions instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of MeetingAdvancedMeetingOptions
            //instance = new MeetingAdvancedMeetingOptions();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of MeetingAdvancedMeetingOptions
        /// </summary>
        [Test]
        public void MeetingAdvancedMeetingOptionsInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" MeetingAdvancedMeetingOptions
            //Assert.IsInstanceOfType<MeetingAdvancedMeetingOptions> (instance, "variable 'instance' is a MeetingAdvancedMeetingOptions");
        }


        /// <summary>
        /// Test the property 'VideoBestFit'
        /// </summary>
        [Test]
        public void VideoBestFitTest()
        {
            // TODO unit test for the property 'VideoBestFit'
        }
        /// <summary>
        /// Test the property 'PublishMeeting'
        /// </summary>
        [Test]
        public void PublishMeetingTest()
        {
            // TODO unit test for the property 'PublishMeeting'
        }
        /// <summary>
        /// Test the property 'EncryptionType'
        /// </summary>
        [Test]
        public void EncryptionTypeTest()
        {
            // TODO unit test for the property 'EncryptionType'
        }
        /// <summary>
        /// Test the property 'ModeratorLess'
        /// </summary>
        [Test]
        public void ModeratorLessTest()
        {
            // TODO unit test for the property 'ModeratorLess'
        }
        /// <summary>
        /// Test the property 'AllowStream'
        /// </summary>
        [Test]
        public void AllowStreamTest()
        {
            // TODO unit test for the property 'AllowStream'
        }
        /// <summary>
        /// Test the property 'AutoRecord'
        /// </summary>
        [Test]
        public void AutoRecordTest()
        {
            // TODO unit test for the property 'AutoRecord'
        }
        /// <summary>
        /// Test the property 'DisallowChat'
        /// </summary>
        [Test]
        public void DisallowChatTest()
        {
            // TODO unit test for the property 'DisallowChat'
        }
        /// <summary>
        /// Test the property 'MuteParticipantsOnEntry'
        /// </summary>
        [Test]
        public void MuteParticipantsOnEntryTest()
        {
            // TODO unit test for the property 'MuteParticipantsOnEntry'
        }
        /// <summary>
        /// Test the property 'ShowAllAttendeesInMeetingInvite'
        /// </summary>
        [Test]
        public void ShowAllAttendeesInMeetingInviteTest()
        {
            // TODO unit test for the property 'ShowAllAttendeesInMeetingInvite'
        }
        /// <summary>
        /// Test the property 'Editability'
        /// </summary>
        [Test]
        public void EditabilityTest()
        {
            // TODO unit test for the property 'Editability'
        }

    }

}
