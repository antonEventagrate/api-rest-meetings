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
    /// MeetingHistorySharing
    /// </summary>
    [DataContract]
    public partial class MeetingHistorySharing :  IEquatable<MeetingHistorySharing>, IValidatableObject
    {
        /// <summary>
        /// Defines RecepientType
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum RecepientTypeEnum
        {
            
            /// <summary>
            /// Enum ENTERPRISE for value: ENTERPRISE
            /// </summary>
            [EnumMember(Value = "ENTERPRISE")]
            ENTERPRISE = 1,
            
            /// <summary>
            /// Enum PUBLIC for value: PUBLIC
            /// </summary>
            [EnumMember(Value = "PUBLIC")]
            PUBLIC = 2
        }

        /// <summary>
        /// Gets or Sets RecepientType
        /// </summary>
        [DataMember(Name="recepientType", EmitDefaultValue=false)]
        public RecepientTypeEnum? RecepientType { get; set; }
        /// <summary>
        /// Defines Status
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum StatusEnum
        {
            
            /// <summary>
            /// Enum ACTIVE for value: ACTIVE
            /// </summary>
            [EnumMember(Value = "ACTIVE")]
            ACTIVE = 1
        }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name="status", EmitDefaultValue=false)]
        public StatusEnum? Status { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="MeetingHistorySharing" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="meetingGuid">meetingGuid.</param>
        /// <param name="ownerId">Numeric user ID for the meeting owner..</param>
        /// <param name="sharingUrl">sharingUrl.</param>
        /// <param name="recepientType">recepientType.</param>
        /// <param name="properties">properties.</param>
        /// <param name="status">status.</param>
        /// <param name="downloadable">downloadable.</param>
        /// <param name="passcode">passcode.</param>
        /// <param name="validity">validity.</param>
        /// <param name="created">A [UNIX Timestamp](https://currentmillis.com/) in milliseconds.</param>
        /// <param name="lastmodified">A [UNIX Timestamp](https://currentmillis.com/) in milliseconds.</param>
        public MeetingHistorySharing(int? id = default(int?), string meetingGuid = default(string), int? ownerId = default(int?), string sharingUrl = default(string), RecepientTypeEnum? recepientType = default(RecepientTypeEnum?), string properties = default(string), StatusEnum? status = default(StatusEnum?), bool? downloadable = default(bool?), string passcode = default(string), string validity = default(string), long? created = default(long?), long? lastmodified = default(long?))
        {
            this.Id = id;
            this.MeetingGuid = meetingGuid;
            this.OwnerId = ownerId;
            this.SharingUrl = sharingUrl;
            this.RecepientType = recepientType;
            this.Properties = properties;
            this.Status = status;
            this.Downloadable = downloadable;
            this.Passcode = passcode;
            this.Validity = validity;
            this.Created = created;
            this.Lastmodified = lastmodified;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public int? Id { get; set; }

        /// <summary>
        /// Gets or Sets MeetingGuid
        /// </summary>
        [DataMember(Name="meetingGuid", EmitDefaultValue=false)]
        public string MeetingGuid { get; set; }

        /// <summary>
        /// Numeric user ID for the meeting owner.
        /// </summary>
        /// <value>Numeric user ID for the meeting owner.</value>
        [DataMember(Name="ownerId", EmitDefaultValue=false)]
        public int? OwnerId { get; set; }

        /// <summary>
        /// Gets or Sets SharingUrl
        /// </summary>
        [DataMember(Name="sharingUrl", EmitDefaultValue=false)]
        public string SharingUrl { get; set; }


        /// <summary>
        /// Gets or Sets Properties
        /// </summary>
        [DataMember(Name="properties", EmitDefaultValue=false)]
        public string Properties { get; set; }


        /// <summary>
        /// Gets or Sets Downloadable
        /// </summary>
        [DataMember(Name="downloadable", EmitDefaultValue=false)]
        public bool? Downloadable { get; set; }

        /// <summary>
        /// Gets or Sets Passcode
        /// </summary>
        [DataMember(Name="passcode", EmitDefaultValue=false)]
        public string Passcode { get; set; }

        /// <summary>
        /// Gets or Sets Validity
        /// </summary>
        [DataMember(Name="validity", EmitDefaultValue=false)]
        public string Validity { get; set; }

        /// <summary>
        /// A [UNIX Timestamp](https://currentmillis.com/) in milliseconds
        /// </summary>
        /// <value>A [UNIX Timestamp](https://currentmillis.com/) in milliseconds</value>
        [DataMember(Name="created", EmitDefaultValue=false)]
        public long? Created { get; set; }

        /// <summary>
        /// A [UNIX Timestamp](https://currentmillis.com/) in milliseconds
        /// </summary>
        /// <value>A [UNIX Timestamp](https://currentmillis.com/) in milliseconds</value>
        [DataMember(Name="lastmodified", EmitDefaultValue=false)]
        public long? Lastmodified { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MeetingHistorySharing {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  MeetingGuid: ").Append(MeetingGuid).Append("\n");
            sb.Append("  OwnerId: ").Append(OwnerId).Append("\n");
            sb.Append("  SharingUrl: ").Append(SharingUrl).Append("\n");
            sb.Append("  RecepientType: ").Append(RecepientType).Append("\n");
            sb.Append("  Properties: ").Append(Properties).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  Downloadable: ").Append(Downloadable).Append("\n");
            sb.Append("  Passcode: ").Append(Passcode).Append("\n");
            sb.Append("  Validity: ").Append(Validity).Append("\n");
            sb.Append("  Created: ").Append(Created).Append("\n");
            sb.Append("  Lastmodified: ").Append(Lastmodified).Append("\n");
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
            return this.Equals(input as MeetingHistorySharing);
        }

        /// <summary>
        /// Returns true if MeetingHistorySharing instances are equal
        /// </summary>
        /// <param name="input">Instance of MeetingHistorySharing to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MeetingHistorySharing input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.MeetingGuid == input.MeetingGuid ||
                    (this.MeetingGuid != null &&
                    this.MeetingGuid.Equals(input.MeetingGuid))
                ) && 
                (
                    this.OwnerId == input.OwnerId ||
                    (this.OwnerId != null &&
                    this.OwnerId.Equals(input.OwnerId))
                ) && 
                (
                    this.SharingUrl == input.SharingUrl ||
                    (this.SharingUrl != null &&
                    this.SharingUrl.Equals(input.SharingUrl))
                ) && 
                (
                    this.RecepientType == input.RecepientType ||
                    (this.RecepientType != null &&
                    this.RecepientType.Equals(input.RecepientType))
                ) && 
                (
                    this.Properties == input.Properties ||
                    (this.Properties != null &&
                    this.Properties.Equals(input.Properties))
                ) && 
                (
                    this.Status == input.Status ||
                    (this.Status != null &&
                    this.Status.Equals(input.Status))
                ) && 
                (
                    this.Downloadable == input.Downloadable ||
                    (this.Downloadable != null &&
                    this.Downloadable.Equals(input.Downloadable))
                ) && 
                (
                    this.Passcode == input.Passcode ||
                    (this.Passcode != null &&
                    this.Passcode.Equals(input.Passcode))
                ) && 
                (
                    this.Validity == input.Validity ||
                    (this.Validity != null &&
                    this.Validity.Equals(input.Validity))
                ) && 
                (
                    this.Created == input.Created ||
                    (this.Created != null &&
                    this.Created.Equals(input.Created))
                ) && 
                (
                    this.Lastmodified == input.Lastmodified ||
                    (this.Lastmodified != null &&
                    this.Lastmodified.Equals(input.Lastmodified))
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
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.MeetingGuid != null)
                    hashCode = hashCode * 59 + this.MeetingGuid.GetHashCode();
                if (this.OwnerId != null)
                    hashCode = hashCode * 59 + this.OwnerId.GetHashCode();
                if (this.SharingUrl != null)
                    hashCode = hashCode * 59 + this.SharingUrl.GetHashCode();
                if (this.RecepientType != null)
                    hashCode = hashCode * 59 + this.RecepientType.GetHashCode();
                if (this.Properties != null)
                    hashCode = hashCode * 59 + this.Properties.GetHashCode();
                if (this.Status != null)
                    hashCode = hashCode * 59 + this.Status.GetHashCode();
                if (this.Downloadable != null)
                    hashCode = hashCode * 59 + this.Downloadable.GetHashCode();
                if (this.Passcode != null)
                    hashCode = hashCode * 59 + this.Passcode.GetHashCode();
                if (this.Validity != null)
                    hashCode = hashCode * 59 + this.Validity.GetHashCode();
                if (this.Created != null)
                    hashCode = hashCode * 59 + this.Created.GetHashCode();
                if (this.Lastmodified != null)
                    hashCode = hashCode * 59 + this.Lastmodified.GetHashCode();
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
