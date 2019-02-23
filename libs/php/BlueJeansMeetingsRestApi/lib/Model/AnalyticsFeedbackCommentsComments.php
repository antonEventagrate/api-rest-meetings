<?php
/**
 * AnalyticsFeedbackCommentsComments
 *
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
 * Do not edit the class manually.
 */

namespace BlueJeansMeetingsRestApi\Model;

use \ArrayAccess;
use \BlueJeansMeetingsRestApi\ObjectSerializer;

/**
 * AnalyticsFeedbackCommentsComments Class Doc Comment
 *
 * @category Class
 * @package  BlueJeansMeetingsRestApi
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class AnalyticsFeedbackCommentsComments implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'AnalyticsFeedbackComments_comments';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'qualaroo_feedback' => 'string',
        'meeting_uuid' => 'string',
        'callguid' => 'string',
        'qualaroo_comments' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'qualaroo_feedback' => null,
        'meeting_uuid' => null,
        'callguid' => null,
        'qualaroo_comments' => null
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerFormats()
    {
        return self::$swaggerFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'qualaroo_feedback' => 'qualaroo_feedback',
        'meeting_uuid' => 'meeting_uuid',
        'callguid' => 'callguid',
        'qualaroo_comments' => 'qualaroo_comments'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'qualaroo_feedback' => 'setQualarooFeedback',
        'meeting_uuid' => 'setMeetingUuid',
        'callguid' => 'setCallguid',
        'qualaroo_comments' => 'setQualarooComments'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'qualaroo_feedback' => 'getQualarooFeedback',
        'meeting_uuid' => 'getMeetingUuid',
        'callguid' => 'getCallguid',
        'qualaroo_comments' => 'getQualarooComments'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$swaggerModelName;
    }

    

    

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['qualaroo_feedback'] = isset($data['qualaroo_feedback']) ? $data['qualaroo_feedback'] : null;
        $this->container['meeting_uuid'] = isset($data['meeting_uuid']) ? $data['meeting_uuid'] : null;
        $this->container['callguid'] = isset($data['callguid']) ? $data['callguid'] : null;
        $this->container['qualaroo_comments'] = isset($data['qualaroo_comments']) ? $data['qualaroo_comments'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets qualaroo_feedback
     *
     * @return string
     */
    public function getQualarooFeedback()
    {
        return $this->container['qualaroo_feedback'];
    }

    /**
     * Sets qualaroo_feedback
     *
     * @param string $qualaroo_feedback The comment rating left by the user.
     *
     * @return $this
     */
    public function setQualarooFeedback($qualaroo_feedback)
    {
        $this->container['qualaroo_feedback'] = $qualaroo_feedback;

        return $this;
    }

    /**
     * Gets meeting_uuid
     *
     * @return string
     */
    public function getMeetingUuid()
    {
        return $this->container['meeting_uuid'];
    }

    /**
     * Sets meeting_uuid
     *
     * @param string $meeting_uuid The UUID of the meeting.
     *
     * @return $this
     */
    public function setMeetingUuid($meeting_uuid)
    {
        $this->container['meeting_uuid'] = $meeting_uuid;

        return $this;
    }

    /**
     * Gets callguid
     *
     * @return string
     */
    public function getCallguid()
    {
        return $this->container['callguid'];
    }

    /**
     * Sets callguid
     *
     * @param string $callguid callguid
     *
     * @return $this
     */
    public function setCallguid($callguid)
    {
        $this->container['callguid'] = $callguid;

        return $this;
    }

    /**
     * Gets qualaroo_comments
     *
     * @return string
     */
    public function getQualarooComments()
    {
        return $this->container['qualaroo_comments'];
    }

    /**
     * Sets qualaroo_comments
     *
     * @param string $qualaroo_comments The comment left by the user.
     *
     * @return $this
     */
    public function setQualarooComments($qualaroo_comments)
    {
        $this->container['qualaroo_comments'] = $qualaroo_comments;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(
                ObjectSerializer::sanitizeForSerialization($this),
                JSON_PRETTY_PRINT
            );
        }

        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


