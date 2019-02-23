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
    /// AnalyticsFeedbackCommentsComments
    /// </summary>
    [DataContract]
    public partial class AnalyticsFeedbackCommentsComments :  IEquatable<AnalyticsFeedbackCommentsComments>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AnalyticsFeedbackCommentsComments" /> class.
        /// </summary>
        /// <param name="qualarooFeedback">The comment rating left by the user..</param>
        /// <param name="meetingUuid">The UUID of the meeting..</param>
        /// <param name="callguid">callguid.</param>
        /// <param name="qualarooComments">The comment left by the user..</param>
        public AnalyticsFeedbackCommentsComments(string qualarooFeedback = default(string), string meetingUuid = default(string), string callguid = default(string), string qualarooComments = default(string))
        {
            this.QualarooFeedback = qualarooFeedback;
            this.MeetingUuid = meetingUuid;
            this.Callguid = callguid;
            this.QualarooComments = qualarooComments;
        }
        
        /// <summary>
        /// The comment rating left by the user.
        /// </summary>
        /// <value>The comment rating left by the user.</value>
        [DataMember(Name="qualaroo_feedback", EmitDefaultValue=false)]
        public string QualarooFeedback { get; set; }

        /// <summary>
        /// The UUID of the meeting.
        /// </summary>
        /// <value>The UUID of the meeting.</value>
        [DataMember(Name="meeting_uuid", EmitDefaultValue=false)]
        public string MeetingUuid { get; set; }

        /// <summary>
        /// Gets or Sets Callguid
        /// </summary>
        [DataMember(Name="callguid", EmitDefaultValue=false)]
        public string Callguid { get; set; }

        /// <summary>
        /// The comment left by the user.
        /// </summary>
        /// <value>The comment left by the user.</value>
        [DataMember(Name="qualaroo_comments", EmitDefaultValue=false)]
        public string QualarooComments { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AnalyticsFeedbackCommentsComments {\n");
            sb.Append("  QualarooFeedback: ").Append(QualarooFeedback).Append("\n");
            sb.Append("  MeetingUuid: ").Append(MeetingUuid).Append("\n");
            sb.Append("  Callguid: ").Append(Callguid).Append("\n");
            sb.Append("  QualarooComments: ").Append(QualarooComments).Append("\n");
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
            return this.Equals(input as AnalyticsFeedbackCommentsComments);
        }

        /// <summary>
        /// Returns true if AnalyticsFeedbackCommentsComments instances are equal
        /// </summary>
        /// <param name="input">Instance of AnalyticsFeedbackCommentsComments to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AnalyticsFeedbackCommentsComments input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.QualarooFeedback == input.QualarooFeedback ||
                    (this.QualarooFeedback != null &&
                    this.QualarooFeedback.Equals(input.QualarooFeedback))
                ) && 
                (
                    this.MeetingUuid == input.MeetingUuid ||
                    (this.MeetingUuid != null &&
                    this.MeetingUuid.Equals(input.MeetingUuid))
                ) && 
                (
                    this.Callguid == input.Callguid ||
                    (this.Callguid != null &&
                    this.Callguid.Equals(input.Callguid))
                ) && 
                (
                    this.QualarooComments == input.QualarooComments ||
                    (this.QualarooComments != null &&
                    this.QualarooComments.Equals(input.QualarooComments))
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
                if (this.QualarooFeedback != null)
                    hashCode = hashCode * 59 + this.QualarooFeedback.GetHashCode();
                if (this.MeetingUuid != null)
                    hashCode = hashCode * 59 + this.MeetingUuid.GetHashCode();
                if (this.Callguid != null)
                    hashCode = hashCode * 59 + this.Callguid.GetHashCode();
                if (this.QualarooComments != null)
                    hashCode = hashCode * 59 + this.QualarooComments.GetHashCode();
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
