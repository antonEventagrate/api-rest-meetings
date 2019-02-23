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
    /// EndpointLocationSummary
    /// </summary>
    [DataContract]
    public partial class EndpointLocationSummary :  IEquatable<EndpointLocationSummary>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EndpointLocationSummary" /> class.
        /// </summary>
        /// <param name="countriesCount">Description of the size of the country endpoints dataset.</param>
        /// <param name="countries">countries.</param>
        public EndpointLocationSummary(List<CountriesCountRec> countriesCount = default(List<CountriesCountRec>), List<CountryEndpoint> countries = default(List<CountryEndpoint>))
        {
            this.CountriesCount = countriesCount;
            this.Countries = countries;
        }
        
        /// <summary>
        /// Description of the size of the country endpoints dataset
        /// </summary>
        /// <value>Description of the size of the country endpoints dataset</value>
        [DataMember(Name="countries_count", EmitDefaultValue=false)]
        public List<CountriesCountRec> CountriesCount { get; set; }

        /// <summary>
        /// Gets or Sets Countries
        /// </summary>
        [DataMember(Name="countries", EmitDefaultValue=false)]
        public List<CountryEndpoint> Countries { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EndpointLocationSummary {\n");
            sb.Append("  CountriesCount: ").Append(CountriesCount).Append("\n");
            sb.Append("  Countries: ").Append(Countries).Append("\n");
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
            return this.Equals(input as EndpointLocationSummary);
        }

        /// <summary>
        /// Returns true if EndpointLocationSummary instances are equal
        /// </summary>
        /// <param name="input">Instance of EndpointLocationSummary to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EndpointLocationSummary input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.CountriesCount == input.CountriesCount ||
                    this.CountriesCount != null &&
                    this.CountriesCount.SequenceEqual(input.CountriesCount)
                ) && 
                (
                    this.Countries == input.Countries ||
                    this.Countries != null &&
                    this.Countries.SequenceEqual(input.Countries)
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
                if (this.CountriesCount != null)
                    hashCode = hashCode * 59 + this.CountriesCount.GetHashCode();
                if (this.Countries != null)
                    hashCode = hashCode * 59 + this.Countries.GetHashCode();
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
