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
    /// MeetingRecurrencePattern
    /// </summary>
    [DataContract]
    public partial class MeetingRecurrencePattern :  IEquatable<MeetingRecurrencePattern>, IValidatableObject
    {
        /// <summary>
        /// Defines RecurrenceType
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum RecurrenceTypeEnum
        {
            
            /// <summary>
            /// Enum DAILY for value: DAILY
            /// </summary>
            [EnumMember(Value = "DAILY")]
            DAILY = 1,
            
            /// <summary>
            /// Enum WEEKLY for value: WEEKLY
            /// </summary>
            [EnumMember(Value = "WEEKLY")]
            WEEKLY = 2,
            
            /// <summary>
            /// Enum MONTHLY for value: MONTHLY
            /// </summary>
            [EnumMember(Value = "MONTHLY")]
            MONTHLY = 3
        }

        /// <summary>
        /// Gets or Sets RecurrenceType
        /// </summary>
        [DataMember(Name="recurrenceType", EmitDefaultValue=false)]
        public RecurrenceTypeEnum? RecurrenceType { get; set; }
        /// <summary>
        /// the numerical week in the month for reoccuring meetings.
        /// </summary>
        /// <value>the numerical week in the month for reoccuring meetings.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum WeekOfMonthEnum
        {
            
            /// <summary>
            /// Enum NONE for value: NONE
            /// </summary>
            [EnumMember(Value = "NONE")]
            NONE = 1,
            
            /// <summary>
            /// Enum FIRST for value: FIRST
            /// </summary>
            [EnumMember(Value = "FIRST")]
            FIRST = 2,
            
            /// <summary>
            /// Enum SECOND for value: SECOND
            /// </summary>
            [EnumMember(Value = "SECOND")]
            SECOND = 3,
            
            /// <summary>
            /// Enum THIRD for value: THIRD
            /// </summary>
            [EnumMember(Value = "THIRD")]
            THIRD = 4,
            
            /// <summary>
            /// Enum FOURTH for value: FOURTH
            /// </summary>
            [EnumMember(Value = "FOURTH")]
            FOURTH = 5,
            
            /// <summary>
            /// Enum LAST for value: LAST
            /// </summary>
            [EnumMember(Value = "LAST")]
            LAST = 6
        }

        /// <summary>
        /// the numerical week in the month for reoccuring meetings.
        /// </summary>
        /// <value>the numerical week in the month for reoccuring meetings.</value>
        [DataMember(Name="weekOfMonth", EmitDefaultValue=false)]
        public WeekOfMonthEnum? WeekOfMonth { get; set; }
        /// <summary>
        /// the month in the year for reoccurring meetings.
        /// </summary>
        /// <value>the month in the year for reoccurring meetings.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum MonthOfYearEnum
        {
            
            /// <summary>
            /// Enum NONE for value: NONE
            /// </summary>
            [EnumMember(Value = "NONE")]
            NONE = 1,
            
            /// <summary>
            /// Enum JANUARY for value: JANUARY
            /// </summary>
            [EnumMember(Value = "JANUARY")]
            JANUARY = 2,
            
            /// <summary>
            /// Enum FEBRUARY for value: FEBRUARY
            /// </summary>
            [EnumMember(Value = "FEBRUARY")]
            FEBRUARY = 3,
            
            /// <summary>
            /// Enum MARCH for value: MARCH
            /// </summary>
            [EnumMember(Value = "MARCH")]
            MARCH = 4,
            
            /// <summary>
            /// Enum APRIL for value: APRIL
            /// </summary>
            [EnumMember(Value = "APRIL")]
            APRIL = 5,
            
            /// <summary>
            /// Enum MAY for value: MAY
            /// </summary>
            [EnumMember(Value = "MAY")]
            MAY = 6,
            
            /// <summary>
            /// Enum JUNE for value: JUNE
            /// </summary>
            [EnumMember(Value = "JUNE")]
            JUNE = 7,
            
            /// <summary>
            /// Enum JULY for value: JULY
            /// </summary>
            [EnumMember(Value = "JULY")]
            JULY = 8,
            
            /// <summary>
            /// Enum AUGUST for value: AUGUST
            /// </summary>
            [EnumMember(Value = "AUGUST")]
            AUGUST = 9,
            
            /// <summary>
            /// Enum SEPTEMBER for value: SEPTEMBER
            /// </summary>
            [EnumMember(Value = "SEPTEMBER")]
            SEPTEMBER = 10,
            
            /// <summary>
            /// Enum OCTOBER for value: OCTOBER
            /// </summary>
            [EnumMember(Value = "OCTOBER")]
            OCTOBER = 11,
            
            /// <summary>
            /// Enum NOVEMBER for value: NOVEMBER
            /// </summary>
            [EnumMember(Value = "NOVEMBER")]
            NOVEMBER = 12,
            
            /// <summary>
            /// Enum DECEMBER for value: DECEMBER
            /// </summary>
            [EnumMember(Value = "DECEMBER")]
            DECEMBER = 13
        }

        /// <summary>
        /// the month in the year for reoccurring meetings.
        /// </summary>
        /// <value>the month in the year for reoccurring meetings.</value>
        [DataMember(Name="monthOfYear", EmitDefaultValue=false)]
        public MonthOfYearEnum? MonthOfYear { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="MeetingRecurrencePattern" /> class.
        /// </summary>
        /// <param name="recurrenceType">recurrenceType.</param>
        /// <param name="endDate">This is the epoch-based ending-time (in milliseconds) for the recurrence chain of meetings..</param>
        /// <param name="recurrenceCount">The number of reoccurring meetings.</param>
        /// <param name="frequency">the interval of reoccurring meetings..</param>
        /// <param name="daysOfWeekMask">bit mask for selecting which days of the week.  Sunday:1, Monday:2, Tuesday:4, Wednesday:8, Thursday:16, Friday:32, and Saturday:64.</param>
        /// <param name="dayOfMonth">the numerical day in the month for monthly reoccurring meetings..</param>
        /// <param name="weekOfMonth">the numerical week in the month for reoccuring meetings. (default to WeekOfMonthEnum.NONE).</param>
        /// <param name="monthOfYear">the month in the year for reoccurring meetings. (default to MonthOfYearEnum.NONE).</param>
        public MeetingRecurrencePattern(RecurrenceTypeEnum? recurrenceType = default(RecurrenceTypeEnum?), long? endDate = default(long?), int? recurrenceCount = default(int?), int? frequency = default(int?), int? daysOfWeekMask = default(int?), int? dayOfMonth = default(int?), WeekOfMonthEnum? weekOfMonth = WeekOfMonthEnum.NONE, MonthOfYearEnum? monthOfYear = MonthOfYearEnum.NONE)
        {
            this.RecurrenceType = recurrenceType;
            this.EndDate = endDate;
            this.RecurrenceCount = recurrenceCount;
            this.Frequency = frequency;
            this.DaysOfWeekMask = daysOfWeekMask;
            this.DayOfMonth = dayOfMonth;
            // use default value if no "weekOfMonth" provided
            if (weekOfMonth == null)
            {
                this.WeekOfMonth = WeekOfMonthEnum.NONE;
            }
            else
            {
                this.WeekOfMonth = weekOfMonth;
            }
            // use default value if no "monthOfYear" provided
            if (monthOfYear == null)
            {
                this.MonthOfYear = MonthOfYearEnum.NONE;
            }
            else
            {
                this.MonthOfYear = monthOfYear;
            }
        }
        

        /// <summary>
        /// This is the epoch-based ending-time (in milliseconds) for the recurrence chain of meetings.
        /// </summary>
        /// <value>This is the epoch-based ending-time (in milliseconds) for the recurrence chain of meetings.</value>
        [DataMember(Name="endDate", EmitDefaultValue=false)]
        public long? EndDate { get; set; }

        /// <summary>
        /// The number of reoccurring meetings
        /// </summary>
        /// <value>The number of reoccurring meetings</value>
        [DataMember(Name="recurrenceCount", EmitDefaultValue=false)]
        public int? RecurrenceCount { get; set; }

        /// <summary>
        /// the interval of reoccurring meetings.
        /// </summary>
        /// <value>the interval of reoccurring meetings.</value>
        [DataMember(Name="frequency", EmitDefaultValue=false)]
        public int? Frequency { get; set; }

        /// <summary>
        /// bit mask for selecting which days of the week.  Sunday:1, Monday:2, Tuesday:4, Wednesday:8, Thursday:16, Friday:32, and Saturday:64
        /// </summary>
        /// <value>bit mask for selecting which days of the week.  Sunday:1, Monday:2, Tuesday:4, Wednesday:8, Thursday:16, Friday:32, and Saturday:64</value>
        [DataMember(Name="daysOfWeekMask", EmitDefaultValue=false)]
        public int? DaysOfWeekMask { get; set; }

        /// <summary>
        /// the numerical day in the month for monthly reoccurring meetings.
        /// </summary>
        /// <value>the numerical day in the month for monthly reoccurring meetings.</value>
        [DataMember(Name="dayOfMonth", EmitDefaultValue=false)]
        public int? DayOfMonth { get; set; }



        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MeetingRecurrencePattern {\n");
            sb.Append("  RecurrenceType: ").Append(RecurrenceType).Append("\n");
            sb.Append("  EndDate: ").Append(EndDate).Append("\n");
            sb.Append("  RecurrenceCount: ").Append(RecurrenceCount).Append("\n");
            sb.Append("  Frequency: ").Append(Frequency).Append("\n");
            sb.Append("  DaysOfWeekMask: ").Append(DaysOfWeekMask).Append("\n");
            sb.Append("  DayOfMonth: ").Append(DayOfMonth).Append("\n");
            sb.Append("  WeekOfMonth: ").Append(WeekOfMonth).Append("\n");
            sb.Append("  MonthOfYear: ").Append(MonthOfYear).Append("\n");
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
            return this.Equals(input as MeetingRecurrencePattern);
        }

        /// <summary>
        /// Returns true if MeetingRecurrencePattern instances are equal
        /// </summary>
        /// <param name="input">Instance of MeetingRecurrencePattern to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MeetingRecurrencePattern input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.RecurrenceType == input.RecurrenceType ||
                    (this.RecurrenceType != null &&
                    this.RecurrenceType.Equals(input.RecurrenceType))
                ) && 
                (
                    this.EndDate == input.EndDate ||
                    (this.EndDate != null &&
                    this.EndDate.Equals(input.EndDate))
                ) && 
                (
                    this.RecurrenceCount == input.RecurrenceCount ||
                    (this.RecurrenceCount != null &&
                    this.RecurrenceCount.Equals(input.RecurrenceCount))
                ) && 
                (
                    this.Frequency == input.Frequency ||
                    (this.Frequency != null &&
                    this.Frequency.Equals(input.Frequency))
                ) && 
                (
                    this.DaysOfWeekMask == input.DaysOfWeekMask ||
                    (this.DaysOfWeekMask != null &&
                    this.DaysOfWeekMask.Equals(input.DaysOfWeekMask))
                ) && 
                (
                    this.DayOfMonth == input.DayOfMonth ||
                    (this.DayOfMonth != null &&
                    this.DayOfMonth.Equals(input.DayOfMonth))
                ) && 
                (
                    this.WeekOfMonth == input.WeekOfMonth ||
                    (this.WeekOfMonth != null &&
                    this.WeekOfMonth.Equals(input.WeekOfMonth))
                ) && 
                (
                    this.MonthOfYear == input.MonthOfYear ||
                    (this.MonthOfYear != null &&
                    this.MonthOfYear.Equals(input.MonthOfYear))
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
                if (this.RecurrenceType != null)
                    hashCode = hashCode * 59 + this.RecurrenceType.GetHashCode();
                if (this.EndDate != null)
                    hashCode = hashCode * 59 + this.EndDate.GetHashCode();
                if (this.RecurrenceCount != null)
                    hashCode = hashCode * 59 + this.RecurrenceCount.GetHashCode();
                if (this.Frequency != null)
                    hashCode = hashCode * 59 + this.Frequency.GetHashCode();
                if (this.DaysOfWeekMask != null)
                    hashCode = hashCode * 59 + this.DaysOfWeekMask.GetHashCode();
                if (this.DayOfMonth != null)
                    hashCode = hashCode * 59 + this.DayOfMonth.GetHashCode();
                if (this.WeekOfMonth != null)
                    hashCode = hashCode * 59 + this.WeekOfMonth.GetHashCode();
                if (this.MonthOfYear != null)
                    hashCode = hashCode * 59 + this.MonthOfYear.GetHashCode();
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
