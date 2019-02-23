<?php
/**
 * RecordingApiTest
 * PHP version 5
 *
 * @category Class
 * @package  BlueJeansMeetingsRestApi
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * BlueJeans Meetings REST API
 *
 * ## Video That Works Where You Do. <p>This site provides developers access to APIs from BlueJean's Meetings meeting service.  From here you can see and try actual API calls to manage User Accounts, Meetings, and Recordings, pull Analytical Data and Current State information.</p>    <nosdk> <hr> <div> <div class=\"key\">     <a href=\"./basics.html\" target=\"_\"><img class=\"keyimg\" src=\"./img/bjnmeeting.png\"/></a> </div> <div class=\"keybox\"> Basic instructions about What is a BlueJeans Meeting, and Getting Started Using API's, are <a href=\"./basics.html\" target=\"_blank\">available here <i class=\"glyphicon glyphicon-new-window\"></i></a>. </div> </div> <hr> <alert>2/21/2019</alert> Change response of Change layout and Endpoint API's to 204<br/> 12/03/2018 Add API for setting user profile photograph.<br/> 10/17/2018 Updated API field definitions for time variables to be 64-bit .<br/> 7/23/2018 Corrected errors in API definition file.<br/> 7/10/2018 Deprecated some Command Center API's.  Exposed API's that Summarize usage.<br/> 7/06/2018 Added API for changing ownership of recordings.<br/> 6/28/2018 Restored Create Enterprise Account, added Enterprise and User Profile Tag API's.<br/> 6/01/2018 Clarified Access Token requirements for meeting endpoint API's.<br/> 5/21/2018 Corrected return model for meeting history call.<br/> </nosdk> <hr>
 *
 * OpenAPI spec version: 1.0.4402212019
 * Contact: glenn@bluejeans.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 2.4.0-SNAPSHOT
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Please update the test case below to test the endpoint.
 */

namespace BlueJeansMeetingsRestApi;

use \BlueJeansMeetingsRestApi\Configuration;
use \BlueJeansMeetingsRestApi\ApiException;
use \BlueJeansMeetingsRestApi\ObjectSerializer;

/**
 * RecordingApiTest Class Doc Comment
 *
 * @category Class
 * @package  BlueJeansMeetingsRestApi
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class RecordingApiTest extends \PHPUnit_Framework_TestCase
{

    /**
     * Setup before running any test cases
     */
    public static function setUpBeforeClass()
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp()
    {
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown()
    {
    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass()
    {
    }

    /**
     * Test case for createShareRecordings
     *
     * Enable Recording Sharing.
     *
     */
    public function testCreateShareRecordings()
    {
    }

    /**
     * Test case for deleteAllRecordingsByMeetingGuid
     *
     * Delete All Recordings for a Specified Meeting GUID.
     *
     */
    public function testDeleteAllRecordingsByMeetingGuid()
    {
    }

    /**
     * Test case for deleteRecordingChapter
     *
     * Delete a Specified Recording Chapter.
     *
     */
    public function testDeleteRecordingChapter()
    {
    }

    /**
     * Test case for deleteShareRecordings
     *
     * Delete Recording Sharing.
     *
     */
    public function testDeleteShareRecordings()
    {
    }

    /**
     * Test case for getMeetingRecordings
     *
     * Get All Recordings for a Specified Meeting ID.
     *
     */
    public function testGetMeetingRecordings()
    {
    }

    /**
     * Test case for getRecordingContent
     *
     * Get Recording Download Link.
     *
     */
    public function testGetRecordingContent()
    {
    }

    /**
     * Test case for getShareRecordings
     *
     * List Recording Sharing.
     *
     */
    public function testGetShareRecordings()
    {
    }

    /**
     * Test case for modifyShareRecordings
     *
     * Modify Recording Sharing.
     *
     */
    public function testModifyShareRecordings()
    {
    }

    /**
     * Test case for moveRecordingOwner
     *
     * Move Recording Ownership.
     *
     */
    public function testMoveRecordingOwner()
    {
    }

    /**
     * Test case for startRecording
     *
     * Start Recording.
     *
     */
    public function testStartRecording()
    {
    }

    /**
     * Test case for stopRecording
     *
     * Stop Recording.
     *
     */
    public function testStopRecording()
    {
    }
}
