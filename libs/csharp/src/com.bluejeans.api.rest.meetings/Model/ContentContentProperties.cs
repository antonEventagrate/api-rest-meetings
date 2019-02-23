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
    /// ContentContentProperties
    /// </summary>
    [DataContract]
    public partial class ContentContentProperties :  IEquatable<ContentContentProperties>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ContentContentProperties" /> class.
        /// </summary>
        /// <param name="duration">duration.</param>
        /// <param name="thumbnail">thumbnail.</param>
        /// <param name="thumbnailSprite">thumbnailSprite.</param>
        /// <param name="hdsUrl">hdsUrl.</param>
        /// <param name="thumbnailCount">thumbnailCount.</param>
        /// <param name="thumbnailWidth">thumbnailWidth.</param>
        /// <param name="thumbnailHeight">thumbnailHeight.</param>
        /// <param name="thumbnailInterval">thumbnailInterval.</param>
        /// <param name="hlsUrl">hlsUrl.</param>
        /// <param name="levels">levels.</param>
        public ContentContentProperties(long? duration = default(long?), string thumbnail = default(string), string thumbnailSprite = default(string), string hdsUrl = default(string), int? thumbnailCount = default(int?), int? thumbnailWidth = default(int?), int? thumbnailHeight = default(int?), int? thumbnailInterval = default(int?), string hlsUrl = default(string), List<ContentContentPropertiesLevels> levels = default(List<ContentContentPropertiesLevels>))
        {
            this.Duration = duration;
            this.Thumbnail = thumbnail;
            this.ThumbnailSprite = thumbnailSprite;
            this.HdsUrl = hdsUrl;
            this.ThumbnailCount = thumbnailCount;
            this.ThumbnailWidth = thumbnailWidth;
            this.ThumbnailHeight = thumbnailHeight;
            this.ThumbnailInterval = thumbnailInterval;
            this.HlsUrl = hlsUrl;
            this.Levels = levels;
        }
        
        /// <summary>
        /// Gets or Sets Duration
        /// </summary>
        [DataMember(Name="duration", EmitDefaultValue=false)]
        public long? Duration { get; set; }

        /// <summary>
        /// Gets or Sets Thumbnail
        /// </summary>
        [DataMember(Name="thumbnail", EmitDefaultValue=false)]
        public string Thumbnail { get; set; }

        /// <summary>
        /// Gets or Sets ThumbnailSprite
        /// </summary>
        [DataMember(Name="thumbnailSprite", EmitDefaultValue=false)]
        public string ThumbnailSprite { get; set; }

        /// <summary>
        /// Gets or Sets HdsUrl
        /// </summary>
        [DataMember(Name="hdsUrl", EmitDefaultValue=false)]
        public string HdsUrl { get; set; }

        /// <summary>
        /// Gets or Sets ThumbnailCount
        /// </summary>
        [DataMember(Name="thumbnailCount", EmitDefaultValue=false)]
        public int? ThumbnailCount { get; set; }

        /// <summary>
        /// Gets or Sets ThumbnailWidth
        /// </summary>
        [DataMember(Name="thumbnailWidth", EmitDefaultValue=false)]
        public int? ThumbnailWidth { get; set; }

        /// <summary>
        /// Gets or Sets ThumbnailHeight
        /// </summary>
        [DataMember(Name="thumbnailHeight", EmitDefaultValue=false)]
        public int? ThumbnailHeight { get; set; }

        /// <summary>
        /// Gets or Sets ThumbnailInterval
        /// </summary>
        [DataMember(Name="thumbnailInterval", EmitDefaultValue=false)]
        public int? ThumbnailInterval { get; set; }

        /// <summary>
        /// Gets or Sets HlsUrl
        /// </summary>
        [DataMember(Name="hlsUrl", EmitDefaultValue=false)]
        public string HlsUrl { get; set; }

        /// <summary>
        /// Gets or Sets Levels
        /// </summary>
        [DataMember(Name="levels", EmitDefaultValue=false)]
        public List<ContentContentPropertiesLevels> Levels { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ContentContentProperties {\n");
            sb.Append("  Duration: ").Append(Duration).Append("\n");
            sb.Append("  Thumbnail: ").Append(Thumbnail).Append("\n");
            sb.Append("  ThumbnailSprite: ").Append(ThumbnailSprite).Append("\n");
            sb.Append("  HdsUrl: ").Append(HdsUrl).Append("\n");
            sb.Append("  ThumbnailCount: ").Append(ThumbnailCount).Append("\n");
            sb.Append("  ThumbnailWidth: ").Append(ThumbnailWidth).Append("\n");
            sb.Append("  ThumbnailHeight: ").Append(ThumbnailHeight).Append("\n");
            sb.Append("  ThumbnailInterval: ").Append(ThumbnailInterval).Append("\n");
            sb.Append("  HlsUrl: ").Append(HlsUrl).Append("\n");
            sb.Append("  Levels: ").Append(Levels).Append("\n");
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
            return this.Equals(input as ContentContentProperties);
        }

        /// <summary>
        /// Returns true if ContentContentProperties instances are equal
        /// </summary>
        /// <param name="input">Instance of ContentContentProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ContentContentProperties input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Duration == input.Duration ||
                    (this.Duration != null &&
                    this.Duration.Equals(input.Duration))
                ) && 
                (
                    this.Thumbnail == input.Thumbnail ||
                    (this.Thumbnail != null &&
                    this.Thumbnail.Equals(input.Thumbnail))
                ) && 
                (
                    this.ThumbnailSprite == input.ThumbnailSprite ||
                    (this.ThumbnailSprite != null &&
                    this.ThumbnailSprite.Equals(input.ThumbnailSprite))
                ) && 
                (
                    this.HdsUrl == input.HdsUrl ||
                    (this.HdsUrl != null &&
                    this.HdsUrl.Equals(input.HdsUrl))
                ) && 
                (
                    this.ThumbnailCount == input.ThumbnailCount ||
                    (this.ThumbnailCount != null &&
                    this.ThumbnailCount.Equals(input.ThumbnailCount))
                ) && 
                (
                    this.ThumbnailWidth == input.ThumbnailWidth ||
                    (this.ThumbnailWidth != null &&
                    this.ThumbnailWidth.Equals(input.ThumbnailWidth))
                ) && 
                (
                    this.ThumbnailHeight == input.ThumbnailHeight ||
                    (this.ThumbnailHeight != null &&
                    this.ThumbnailHeight.Equals(input.ThumbnailHeight))
                ) && 
                (
                    this.ThumbnailInterval == input.ThumbnailInterval ||
                    (this.ThumbnailInterval != null &&
                    this.ThumbnailInterval.Equals(input.ThumbnailInterval))
                ) && 
                (
                    this.HlsUrl == input.HlsUrl ||
                    (this.HlsUrl != null &&
                    this.HlsUrl.Equals(input.HlsUrl))
                ) && 
                (
                    this.Levels == input.Levels ||
                    this.Levels != null &&
                    this.Levels.SequenceEqual(input.Levels)
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
                if (this.Duration != null)
                    hashCode = hashCode * 59 + this.Duration.GetHashCode();
                if (this.Thumbnail != null)
                    hashCode = hashCode * 59 + this.Thumbnail.GetHashCode();
                if (this.ThumbnailSprite != null)
                    hashCode = hashCode * 59 + this.ThumbnailSprite.GetHashCode();
                if (this.HdsUrl != null)
                    hashCode = hashCode * 59 + this.HdsUrl.GetHashCode();
                if (this.ThumbnailCount != null)
                    hashCode = hashCode * 59 + this.ThumbnailCount.GetHashCode();
                if (this.ThumbnailWidth != null)
                    hashCode = hashCode * 59 + this.ThumbnailWidth.GetHashCode();
                if (this.ThumbnailHeight != null)
                    hashCode = hashCode * 59 + this.ThumbnailHeight.GetHashCode();
                if (this.ThumbnailInterval != null)
                    hashCode = hashCode * 59 + this.ThumbnailInterval.GetHashCode();
                if (this.HlsUrl != null)
                    hashCode = hashCode * 59 + this.HlsUrl.GetHashCode();
                if (this.Levels != null)
                    hashCode = hashCode * 59 + this.Levels.GetHashCode();
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
