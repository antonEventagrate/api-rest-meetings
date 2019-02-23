<?php
/**
 * PayloadPairingCodeWebRTC
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
 * PayloadPairingCodeWebRTC Class Doc Comment
 *
 * @category Class
 * @package  BlueJeansMeetingsRestApi
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class PayloadPairingCodeWebRTC implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'PayloadPairingCodeWebRTC';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'endpoint_type' => 'string',
        'user_id' => 'int',
        'language_code' => 'string',
        'capabilities' => 'string[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'endpoint_type' => null,
        'user_id' => null,
        'language_code' => null,
        'capabilities' => null
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
        'endpoint_type' => 'endpointType',
        'user_id' => 'userId',
        'language_code' => 'languageCode',
        'capabilities' => 'capabilities'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'endpoint_type' => 'setEndpointType',
        'user_id' => 'setUserId',
        'language_code' => 'setLanguageCode',
        'capabilities' => 'setCapabilities'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'endpoint_type' => 'getEndpointType',
        'user_id' => 'getUserId',
        'language_code' => 'getLanguageCode',
        'capabilities' => 'getCapabilities'
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

    const ENDPOINT_TYPE_GENERIC = 'GENERIC';
    const ENDPOINT_TYPE_LYNC = 'LYNC';
    const ENDPOINT_TYPE_JABBER = 'JABBER';
    const ENDPOINT_TYPE_BLUE_JEANS_BROWSER_ENDPOINT = 'BlueJeansBrowserEndpoint';
    const ENDPOINT_TYPE_BLUE_JEANS_MOBILE_ENDPOINT = 'BlueJeansMobileEndpoint';
    const ENDPOINT_TYPE_WRANGLER_SKYPE_ENDPOINT = 'WranglerSkypeEndpoint';
    const ENDPOINT_TYPE_PSTN = 'PSTN';
    const ENDPOINT_TYPE_DCP_AUDIO_ONLY = 'DCPAudioOnly';
    const LANGUAGE_CODE_EN = 'en';
    const CAPABILITIES_AUDIO = 'AUDIO';
    const CAPABILITIES_VIDEO = 'VIDEO';
    const CAPABILITIES_CONTENT = 'CONTENT';
    

    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getEndpointTypeAllowableValues()
    {
        return [
            self::ENDPOINT_TYPE_GENERIC,
            self::ENDPOINT_TYPE_LYNC,
            self::ENDPOINT_TYPE_JABBER,
            self::ENDPOINT_TYPE_BLUE_JEANS_BROWSER_ENDPOINT,
            self::ENDPOINT_TYPE_BLUE_JEANS_MOBILE_ENDPOINT,
            self::ENDPOINT_TYPE_WRANGLER_SKYPE_ENDPOINT,
            self::ENDPOINT_TYPE_PSTN,
            self::ENDPOINT_TYPE_DCP_AUDIO_ONLY,
        ];
    }
    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getLanguageCodeAllowableValues()
    {
        return [
            self::LANGUAGE_CODE_EN,
        ];
    }
    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getCapabilitiesAllowableValues()
    {
        return [
            self::CAPABILITIES_AUDIO,
            self::CAPABILITIES_VIDEO,
            self::CAPABILITIES_CONTENT,
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
        $this->container['endpoint_type'] = isset($data['endpoint_type']) ? $data['endpoint_type'] : null;
        $this->container['user_id'] = isset($data['user_id']) ? $data['user_id'] : null;
        $this->container['language_code'] = isset($data['language_code']) ? $data['language_code'] : null;
        $this->container['capabilities'] = isset($data['capabilities']) ? $data['capabilities'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        $allowedValues = $this->getEndpointTypeAllowableValues();
        if (!is_null($this->container['endpoint_type']) && !in_array($this->container['endpoint_type'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'endpoint_type', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        $allowedValues = $this->getLanguageCodeAllowableValues();
        if (!is_null($this->container['language_code']) && !in_array($this->container['language_code'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'language_code', must be one of '%s'",
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
     * Gets endpoint_type
     *
     * @return string
     */
    public function getEndpointType()
    {
        return $this->container['endpoint_type'];
    }

    /**
     * Sets endpoint_type
     *
     * @param string $endpoint_type Type of physical device is pairing.
     *
     * @return $this
     */
    public function setEndpointType($endpoint_type)
    {
        $allowedValues = $this->getEndpointTypeAllowableValues();
        if (!is_null($endpoint_type) && !in_array($endpoint_type, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'endpoint_type', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['endpoint_type'] = $endpoint_type;

        return $this;
    }

    /**
     * Gets user_id
     *
     * @return int
     */
    public function getUserId()
    {
        return $this->container['user_id'];
    }

    /**
     * Sets user_id
     *
     * @param int $user_id user_id
     *
     * @return $this
     */
    public function setUserId($user_id)
    {
        $this->container['user_id'] = $user_id;

        return $this;
    }

    /**
     * Gets language_code
     *
     * @return string
     */
    public function getLanguageCode()
    {
        return $this->container['language_code'];
    }

    /**
     * Sets language_code
     *
     * @param string $language_code language_code
     *
     * @return $this
     */
    public function setLanguageCode($language_code)
    {
        $allowedValues = $this->getLanguageCodeAllowableValues();
        if (!is_null($language_code) && !in_array($language_code, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'language_code', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['language_code'] = $language_code;

        return $this;
    }

    /**
     * Gets capabilities
     *
     * @return string[]
     */
    public function getCapabilities()
    {
        return $this->container['capabilities'];
    }

    /**
     * Sets capabilities
     *
     * @param string[] $capabilities Reserved for future use. Pass just an empty array for now. No parameters are currently accepted.
     *
     * @return $this
     */
    public function setCapabilities($capabilities)
    {
        $allowedValues = $this->getCapabilitiesAllowableValues();
        if (!is_null($capabilities) && array_diff($capabilities, $allowedValues)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'capabilities', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['capabilities'] = $capabilities;

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


