<?php
/**
 * PersonalMeetingRoomAdvancedMeetingOptions
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
 * PersonalMeetingRoomAdvancedMeetingOptions Class Doc Comment
 *
 * @category Class
 * @package  BlueJeansMeetingsRestApi
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class PersonalMeetingRoomAdvancedMeetingOptions implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'PersonalMeetingRoom_advancedMeetingOptions';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'video_best_fit' => 'bool',
        'publish_meeting' => 'bool',
        'encryption_type' => 'string',
        'moderator_less' => 'bool',
        'allow_stream' => 'bool',
        'auto_record' => 'bool',
        'disallow_chat' => 'bool',
        'mute_participants_on_entry' => 'bool',
        'show_all_attendees_in_meeting_invite' => 'bool',
        'editability' => '\BlueJeansMeetingsRestApi\Model\PersonalMeetingRoomAdvancedMeetingOptionsEditability'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'video_best_fit' => null,
        'publish_meeting' => null,
        'encryption_type' => null,
        'moderator_less' => null,
        'allow_stream' => null,
        'auto_record' => null,
        'disallow_chat' => null,
        'mute_participants_on_entry' => null,
        'show_all_attendees_in_meeting_invite' => null,
        'editability' => null
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
        'video_best_fit' => 'videoBestFit',
        'publish_meeting' => 'publishMeeting',
        'encryption_type' => 'encryptionType',
        'moderator_less' => 'moderatorLess',
        'allow_stream' => 'allowStream',
        'auto_record' => 'autoRecord',
        'disallow_chat' => 'disallowChat',
        'mute_participants_on_entry' => 'muteParticipantsOnEntry',
        'show_all_attendees_in_meeting_invite' => 'showAllAttendeesInMeetingInvite',
        'editability' => 'editability'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'video_best_fit' => 'setVideoBestFit',
        'publish_meeting' => 'setPublishMeeting',
        'encryption_type' => 'setEncryptionType',
        'moderator_less' => 'setModeratorLess',
        'allow_stream' => 'setAllowStream',
        'auto_record' => 'setAutoRecord',
        'disallow_chat' => 'setDisallowChat',
        'mute_participants_on_entry' => 'setMuteParticipantsOnEntry',
        'show_all_attendees_in_meeting_invite' => 'setShowAllAttendeesInMeetingInvite',
        'editability' => 'setEditability'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'video_best_fit' => 'getVideoBestFit',
        'publish_meeting' => 'getPublishMeeting',
        'encryption_type' => 'getEncryptionType',
        'moderator_less' => 'getModeratorLess',
        'allow_stream' => 'getAllowStream',
        'auto_record' => 'getAutoRecord',
        'disallow_chat' => 'getDisallowChat',
        'mute_participants_on_entry' => 'getMuteParticipantsOnEntry',
        'show_all_attendees_in_meeting_invite' => 'getShowAllAttendeesInMeetingInvite',
        'editability' => 'getEditability'
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

    const ENCRYPTION_TYPE_NO_ENCRYPTION = 'NO_ENCRYPTION';
    const ENCRYPTION_TYPE_ENCRYPTED_ONLY = 'ENCRYPTED_ONLY';
    const ENCRYPTION_TYPE_ENCRYPTED_OR_PSTN_ONLY = 'ENCRYPTED_OR_PSTN_ONLY';
    

    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getEncryptionTypeAllowableValues()
    {
        return [
            self::ENCRYPTION_TYPE_NO_ENCRYPTION,
            self::ENCRYPTION_TYPE_ENCRYPTED_ONLY,
            self::ENCRYPTION_TYPE_ENCRYPTED_OR_PSTN_ONLY,
        ];
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
        $this->container['video_best_fit'] = isset($data['video_best_fit']) ? $data['video_best_fit'] : null;
        $this->container['publish_meeting'] = isset($data['publish_meeting']) ? $data['publish_meeting'] : null;
        $this->container['encryption_type'] = isset($data['encryption_type']) ? $data['encryption_type'] : null;
        $this->container['moderator_less'] = isset($data['moderator_less']) ? $data['moderator_less'] : null;
        $this->container['allow_stream'] = isset($data['allow_stream']) ? $data['allow_stream'] : null;
        $this->container['auto_record'] = isset($data['auto_record']) ? $data['auto_record'] : null;
        $this->container['disallow_chat'] = isset($data['disallow_chat']) ? $data['disallow_chat'] : null;
        $this->container['mute_participants_on_entry'] = isset($data['mute_participants_on_entry']) ? $data['mute_participants_on_entry'] : null;
        $this->container['show_all_attendees_in_meeting_invite'] = isset($data['show_all_attendees_in_meeting_invite']) ? $data['show_all_attendees_in_meeting_invite'] : null;
        $this->container['editability'] = isset($data['editability']) ? $data['editability'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        $allowedValues = $this->getEncryptionTypeAllowableValues();
        if (!is_null($this->container['encryption_type']) && !in_array($this->container['encryption_type'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'encryption_type', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

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
     * @param bool $video_best_fit Same user ID as passed in path parameter.
     *
     * @return $this
     */
    public function setVideoBestFit($video_best_fit)
    {
        $this->container['video_best_fit'] = $video_best_fit;

        return $this;
    }

    /**
     * Gets publish_meeting
     *
     * @return bool
     */
    public function getPublishMeeting()
    {
        return $this->container['publish_meeting'];
    }

    /**
     * Sets publish_meeting
     *
     * @param bool $publish_meeting Same user ID as passed in path parameter.
     *
     * @return $this
     */
    public function setPublishMeeting($publish_meeting)
    {
        $this->container['publish_meeting'] = $publish_meeting;

        return $this;
    }

    /**
     * Gets encryption_type
     *
     * @return string
     */
    public function getEncryptionType()
    {
        return $this->container['encryption_type'];
    }

    /**
     * Sets encryption_type
     *
     * @param string $encryption_type How this meeting is to be encrypted.
     *
     * @return $this
     */
    public function setEncryptionType($encryption_type)
    {
        $allowedValues = $this->getEncryptionTypeAllowableValues();
        if (!is_null($encryption_type) && !in_array($encryption_type, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'encryption_type', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['encryption_type'] = $encryption_type;

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
     * @param bool $moderator_less If set require that a user enter's a moderator passcode to start meeting.
     *
     * @return $this
     */
    public function setModeratorLess($moderator_less)
    {
        $this->container['moderator_less'] = $moderator_less;

        return $this;
    }

    /**
     * Gets allow_stream
     *
     * @return bool
     */
    public function getAllowStream()
    {
        return $this->container['allow_stream'];
    }

    /**
     * Sets allow_stream
     *
     * @param bool $allow_stream Allow sending of streamed video
     *
     * @return $this
     */
    public function setAllowStream($allow_stream)
    {
        $this->container['allow_stream'] = $allow_stream;

        return $this;
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
     * @param bool $auto_record By default start recording anytime 2 or more join this room.
     *
     * @return $this
     */
    public function setAutoRecord($auto_record)
    {
        $this->container['auto_record'] = $auto_record;

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
     * @param bool $disallow_chat If set, disable the ability to send chat message within this meeting.
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
     * @param bool $mute_participants_on_entry If set, force each joining participant to be muted.
     *
     * @return $this
     */
    public function setMuteParticipantsOnEntry($mute_participants_on_entry)
    {
        $this->container['mute_participants_on_entry'] = $mute_participants_on_entry;

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
     * @param bool $show_all_attendees_in_meeting_invite When sending email invitations, include the exhaustive list of invited people.
     *
     * @return $this
     */
    public function setShowAllAttendeesInMeetingInvite($show_all_attendees_in_meeting_invite)
    {
        $this->container['show_all_attendees_in_meeting_invite'] = $show_all_attendees_in_meeting_invite;

        return $this;
    }

    /**
     * Gets editability
     *
     * @return \BlueJeansMeetingsRestApi\Model\PersonalMeetingRoomAdvancedMeetingOptionsEditability
     */
    public function getEditability()
    {
        return $this->container['editability'];
    }

    /**
     * Sets editability
     *
     * @param \BlueJeansMeetingsRestApi\Model\PersonalMeetingRoomAdvancedMeetingOptionsEditability $editability editability
     *
     * @return $this
     */
    public function setEditability($editability)
    {
        $this->container['editability'] = $editability;

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


