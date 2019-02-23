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
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = com.bluejeans.api.rest.meetings.Client.SwaggerDateConverter;

namespace com.bluejeans.api.rest.meetings.Model
{
    /// <summary>
    /// PayloadPairingCodeWebRTC
    /// </summary>
    [DataContract]
    public partial class PayloadPairingCodeWebRTC :  IEquatable<PayloadPairingCodeWebRTC>, IValidatableObject
    {
        /// <summary>
        /// Type of physical device is pairing.
        /// </summary>
        /// <value>Type of physical device is pairing.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum EndpointTypeEnum
        {
            
            /// <summary>
            /// Enum GENERIC for value: GENERIC
            /// </summary>
            [EnumMember(Value = "GENERIC")]
            GENERIC = 1,
            
            /// <summary>
            /// Enum LYNC for value: LYNC
            /// </summary>
            [EnumMember(Value = "LYNC")]
            LYNC = 2,
            
            /// <summary>
            /// Enum JABBER for value: JABBER
            /// </summary>
            [EnumMember(Value = "JABBER")]
            JABBER = 3,
            
            /// <summary>
            /// Enum BlueJeansBrowserEndpoint for value: BlueJeansBrowserEndpoint
            /// </summary>
            [EnumMember(Value = "BlueJeansBrowserEndpoint")]
            BlueJeansBrowserEndpoint = 4,
            
            /// <summary>
            /// Enum BlueJeansMobileEndpoint for value: BlueJeansMobileEndpoint
            /// </summary>
            [EnumMember(Value = "BlueJeansMobileEndpoint")]
            BlueJeansMobileEndpoint = 5,
            
            /// <summary>
            /// Enum WranglerSkypeEndpoint for value: WranglerSkypeEndpoint
            /// </summary>
            [EnumMember(Value = "WranglerSkypeEndpoint")]
            WranglerSkypeEndpoint = 6,
            
            /// <summary>
            /// Enum PSTN for value: PSTN
            /// </summary>
            [EnumMember(Value = "PSTN")]
            PSTN = 7,
            
            /// <summary>
            /// Enum DCPAudioOnly for value: DCPAudioOnly
            /// </summary>
            [EnumMember(Value = "DCPAudioOnly")]
            DCPAudioOnly = 8
        }

        /// <summary>
        /// Type of physical device is pairing.
        /// </summary>
        /// <value>Type of physical device is pairing.</value>
        [DataMember(Name="endpointType", EmitDefaultValue=false)]
        public EndpointTypeEnum? EndpointType { get; set; }
        /// <summary>
        /// Defines LanguageCode
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum LanguageCodeEnum
        {
            
            /// <summary>
            /// Enum En for value: en
            /// </summary>
            [EnumMember(Value = "en")]
            En = 1
        }

        /// <summary>
        /// Gets or Sets LanguageCode
        /// </summary>
        [DataMember(Name="languageCode", EmitDefaultValue=false)]
        public LanguageCodeEnum? LanguageCode { get; set; }
        /// <summary>
        /// Defines Capabilities
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum CapabilitiesEnum
        {
            
            /// <summary>
            /// Enum AUDIO for value: AUDIO
            /// </summary>
            [EnumMember(Value = "AUDIO")]
            AUDIO = 1,
            
            /// <summary>
            /// Enum VIDEO for value: VIDEO
            /// </summary>
            [EnumMember(Value = "VIDEO")]
            VIDEO = 2,
            
            /// <summary>
            /// Enum CONTENT for value: CONTENT
            /// </summary>
            [EnumMember(Value = "CONTENT")]
            CONTENT = 3
        }


        /// <summary>
        /// Reserved for future use. Pass just an empty array for now. No parameters are currently accepted.
        /// </summary>
        /// <value>Reserved for future use. Pass just an empty array for now. No parameters are currently accepted.</value>
        [DataMember(Name="capabilities", EmitDefaultValue=false)]
        public List<CapabilitiesEnum> Capabilities { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="PayloadPairingCodeWebRTC" /> class.
        /// </summary>
        /// <param name="endpointType">Type of physical device is pairing..</param>
        /// <param name="userId">userId.</param>
        /// <param name="languageCode">languageCode.</param>
        /// <param name="capabilities">Reserved for future use. Pass just an empty array for now. No parameters are currently accepted..</param>
        public PayloadPairingCodeWebRTC(EndpointTypeEnum? endpointType = default(EndpointTypeEnum?), int? userId = default(int?), LanguageCodeEnum? languageCode = default(LanguageCodeEnum?), List<CapabilitiesEnum> capabilities = default(List<CapabilitiesEnum>))
        {
            this.EndpointType = endpointType;
            this.UserId = userId;
            this.LanguageCode = languageCode;
            this.Capabilities = capabilities;
        }
        

        /// <summary>
        /// Gets or Sets UserId
        /// </summary>
        [DataMember(Name="userId", EmitDefaultValue=false)]
        public int? UserId { get; set; }



        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PayloadPairingCodeWebRTC {\n");
            sb.Append("  EndpointType: ").Append(EndpointType).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("  LanguageCode: ").Append(LanguageCode).Append("\n");
            sb.Append("  Capabilities: ").Append(Capabilities).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as PayloadPairingCodeWebRTC);
        }

        /// <summary>
        /// Returns true if PayloadPairingCodeWebRTC instances are equal
        /// </summary>
        /// <param name="input">Instance of PayloadPairingCodeWebRTC to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PayloadPairingCodeWebRTC input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.EndpointType == input.EndpointType ||
                    (this.EndpointType != null &&
                    this.EndpointType.Equals(input.EndpointType))
                ) && 
                (
                    this.UserId == input.UserId ||
                    (this.UserId != null &&
                    this.UserId.Equals(input.UserId))
                ) && 
                (
                    this.LanguageCode == input.LanguageCode ||
                    (this.LanguageCode != null &&
                    this.LanguageCode.Equals(input.LanguageCode))
                ) && 
                (
                    this.Capabilities == input.Capabilities ||
                    this.Capabilities != null &&
                    this.Capabilities.SequenceEqual(input.Capabilities)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.EndpointType != null)
                    hashCode = hashCode * 59 + this.EndpointType.GetHashCode();
                if (this.UserId != null)
                    hashCode = hashCode * 59 + this.UserId.GetHashCode();
                if (this.LanguageCode != null)
                    hashCode = hashCode * 59 + this.LanguageCode.GetHashCode();
                if (this.Capabilities != null)
                    hashCode = hashCode * 59 + this.Capabilities.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
