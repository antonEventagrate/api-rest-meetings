<?php
/**
 * MeetingAdvancedMeetingOptionsEditability
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
 * MeetingAdvancedMeetingOptionsEditability Class Doc Comment
 *
 * @category Class
 * @package  BlueJeansMeetingsRestApi
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class MeetingAdvancedMeetingOptionsEditability implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'Meeting_advancedMeetingOptions_editability';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'auto_record' => 'bool',
        'enforce_meeting_encryption' => 'bool',
        'video_best_fit' => 'bool',
        'enforce_meeting_encryption_allow_pstn' => 'bool',
        'disallow_chat' => 'bool',
        'mute_participants_on_entry' => 'bool',
        'moderator_less' => 'bool',
        'show_all_attendees_in_meeting_invite' => 'bool'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'auto_record' => null,
        'enforce_meeting_encryption' => null,
        'video_best_fit' => null,
        'enforce_meeting_encryption_allow_pstn' => null,
        'disallow_chat' => null,
        'mute_participants_on_entry' => null,
        'moderator_less' => null,
        'show_all_attendees_in_meeting_invite' => null
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
        'auto_record' => 'autoRecord',
        'enforce_meeting_encryption' => 'enforceMeetingEncryption',
        'video_best_fit' => 'videoBestFit',
        'enforce_meeting_encryption_allow_pstn' => 'enforceMeetingEncryptionAllowPSTN',
        'disallow_chat' => 'disallowChat',
        'mute_participants_on_entry' => 'muteParticipantsOnEntry',
        'moderator_less' => 'moderatorLess',
        'show_all_attendees_in_meeting_invite' => 'showAllAttendeesInMeetingInvite'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'auto_record' => 'setAutoRecord',
        'enforce_meeting_encryption' => 'setEnforceMeetingEncryption',
        'video_best_fit' => 'setVideoBestFit',
        'enforce_meeting_encryption_allow_pstn' => 'setEnforceMeetingEncryptionAllowPstn',
        'disallow_chat' => 'setDisallowChat',
        'mute_participants_on_entry' => 'setMuteParticipantsOnEntry',
        'moderator_less' => 'setModeratorLess',
        'show_all_attendees_in_meeting_invite' => 'setShowAllAttendeesInMeetingInvite'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'auto_record' => 'getAutoRecord',
        'enforce_meeting_encryption' => 'getEnforceMeetingEncryption',
        'video_best_fit' => 'getVideoBestFit',
        'enforce_meeting_encryption_allow_pstn' => 'getEnforceMeetingEncryptionAllowPstn',
        'disallow_chat' => 'getDisallowChat',
        'mute_participants_on_entry' => 'getMuteParticipantsOnEntry',
        'moderator_less' => 'getModeratorLess',
        'show_all_attendees_in_meeting_invite' => 'getShowAllAttendeesInMeetingInvite'
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
        $this->container['auto_record'] = isset($data['auto_record']) ? $data['auto_record'] : null;
        $this->container['enforce_meeting_encryption'] = isset($data['enforce_meeting_encryption']) ? $data['enforce_meeting_encryption'] : null;
        $this->container['video_best_fit'] = isset($data['video_best_fit']) ? $data['video_best_fit'] : null;
        $this->container['enforce_meeting_encryption_allow_pstn'] = isset($data['enforce_meeting_encryption_allow_pstn']) ? $data['enforce_meeting_encryption_allow_pstn'] : null;
        $this->container['disallow_chat'] = isset($data['disallow_chat']) ? $data['disallow_chat'] : null;
        $this->container['mute_participants_on_entry'] = isset($data['mute_participants_on_entry']) ? $data['mute_participants_on_entry'] : null;
        $this->container['moderator_less'] = isset($data['moderator_less']) ? $data['moderator_less'] : null;
        $this->container['show_all_attendees_in_meeting_invite'] = isset($data['show_all_attendees_in_meeting_invite']) ? $data['show_all_attendees_in_meeting_invite'] : null;
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
     * Gets auto_record
     *
     * @return bool
     */
    public function getAutoRecord()
    {
        return $this->container['auto_record'];
    }

    /**
     * Sets auto_record
     *
     * @param bool $auto_record auto_record
     *
     * @return $this
     */
    public function setAutoRecord($auto_record)
    {
        $this->container['auto_record'] = $auto_record;

        return $this;
    }

    /**
     * Gets enforce_meeting_encryption
     *
     * @return bool
     */
    public function getEnforceMeetingEncryption()
    {
        return $this->container['enforce_meeting_encryption'];
    }

    /**
     * Sets enforce_meeting_encryption
     *
     * @param bool $enforce_meeting_encryption enforce_meeting_encryption
     *
     * @return $this
     */
    public function setEnforceMeetingEncryption($enforce_meeting_encryption)
    {
        $this->container['enforce_meeting_encryption'] = $enforce_meeting_encryption;

        return $this;
    }

    /**
     * Gets video_best_fit
     *
     * @return bool
     */
    public function getVideoBestFit()
    {
        return $this->container['video_best_fit'];
    }

    /**
     * Sets video_best_fit
     *
     * @param bool $video_best_fit video_best_fit
     *
     * @return $this
     */
    public function setVideoBestFit($video_best_fit)
    {
        $this->container['video_best_fit'] = $video_best_fit;

        return $this;
    }

    /**
     * Gets enforce_meeting_encryption_allow_pstn
     *
     * @return bool
     */
    public function getEnforceMeetingEncryptionAllowPstn()
    {
        return $this->container['enforce_meeting_encryption_allow_pstn'];
    }

    /**
     * Sets enforce_meeting_encryption_allow_pstn
     *
     * @param bool $enforce_meeting_encryption_allow_pstn enforce_meeting_encryption_allow_pstn
     *
     * @return $this
     */
    public function setEnforceMeetingEncryptionAllowPstn($enforce_meeting_encryption_allow_pstn)
    {
        $this->container['enforce_meeting_encryption_allow_pstn'] = $enforce_meeting_encryption_allow_pstn;

        return $this;
    }

    /**
     * Gets disallow_chat
     *
     * @return bool
     */
    public function getDisallowChat()
    {
        return $this->container['disallow_chat'];
    }

    /**
     * Sets disallow_chat
     *
     * @param bool $disallow_chat disallow_chat
     *
     * @return $this
     */
    public function setDisallowChat($disallow_chat)
    {
        $this->container['disallow_chat'] = $disallow_chat;

        return $this;
    }

    /**
     * Gets mute_participants_on_entry
     *
     * @return bool
     */
    public function getMuteParticipantsOnEntry()
    {
        return $this->container['mute_participants_on_entry'];
    }

    /**
     * Sets mute_participants_on_entry
     *
     * @param bool $mute_participants_on_entry mute_participants_on_entry
     *
     * @return $this
     */
    public function setMuteParticipantsOnEntry($mute_participants_on_entry)
    {
        $this->container['mute_participants_on_entry'] = $mute_participants_on_entry;

        return $this;
    }

    /**
     * Gets moderator_less
     *
     * @return bool
     */
    public function getModeratorLess()
    {
        return $this->container['moderator_less'];
    }

    /**
     * Sets moderator_less
     *
     * @param bool $moderator_less moderator_less
     *
     * @return $this
     */
    public function setModeratorLess($moderator_less)
    {
        $this->container['moderator_less'] = $moderator_less;

        return $this;
    }

    /**
     * Gets show_all_attendees_in_meeting_invite
     *
     * @return bool
     */
    public function getShowAllAttendeesInMeetingInvite()
    {
        return $this->container['show_all_attendees_in_meeting_invite'];
    }

    /**
     * Sets show_all_attendees_in_meeting_invite
     *
     * @param bool $show_all_attendees_in_meeting_invite show_all_attendees_in_meeting_invite
     *
     * @return $this
     */
    public function setShowAllAttendeesInMeetingInvite($show_all_attendees_in_meeting_invite)
    {
        $this->container['show_all_attendees_in_meeting_invite'] = $show_all_attendees_in_meeting_invite;

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


