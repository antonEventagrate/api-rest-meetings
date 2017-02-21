/**
 * BlueJeans onVideo REST API
 * _Video That Works Where You Do, from the world's leader in cloud video communication._ # Authentication Each API request that is sent to BlueJeans requires an access token, which is obtained through the BlueJeans Authentication API. There are several methods (grant types) for obtaining an access token, which follow the OAuth2.0 specification. ## Grant Types * Authorization Code Grant – This grant type is used in an authentication flow commonly referred to as \"three-legged OAuth\". The user authenticates via a BlueJeans page, which provides an authorization code. This code, along with a few other elements, can be used to obtain an access code. * Password Credentials Grant – This grant type is used in a two-legged OAuth flow. Username and password are sent to retrieve an access code. * Client Credentials Grant – This grant type is used in a two-legged OAuth flow.  ## Access & Permissions The access level that is associated with each access token is referred to as the scope. There are three basic levels of access that BlueJeans allows, which affect the level of scope.  Three access levels exist within the Blue Jeans service today. * Meeting-level – Authentication takes place using a meeting ID and passcode, and the scope is limited to APIs that relate to the individual meeting. * User-level – Authentication either takes place via three-legged OAuth, or else a direct authorization token request containing a username or password. Access level depends on the requested scope permissions. * App-level – An application is provisioned either by BlueJeans personnel, or within the BlueJeans Enterprise Admin interface. When provisioning an app, a client key and secret are provided, which is then used to obtain an access token, via the BlueJeans Authentication API. The scope that is associated with the token will provide access to an entire enterprise and all of its users.  All endpoints in this document that require Enterprise Admin access will be marked as such. ## Testing In order to make effective use of this page, you will first use one of the authentication methods to obtain an access token. Once the token is given, use the Authenticate button up in the header to store the token. Each BlueJeans API called after that will use the access token provided. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: brandon@bluejeans.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.MeetingAdvancedMeetingOptions;


/**
 * Meeting
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-21T16:38:02.878-07:00")
public class Meeting   {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("title")
  private String title = "My Test Meeting";

  @SerializedName("description")
  private String description = null;

  @SerializedName("start")
  private Integer start = null;

  @SerializedName("end")
  private Integer end = null;

  @SerializedName("timezone")
  private String timezone = "America/New_York";

  @SerializedName("numericMeetingId")
  private String numericMeetingId = null;

  @SerializedName("attendeePasscode")
  private String attendeePasscode = null;

  @SerializedName("endPointVersion")
  private String endPointVersion = "2.10";

  @SerializedName("endPointType")
  private String endPointType = "WEB_APP";

  @SerializedName("advancedMeetingOptions")
  private MeetingAdvancedMeetingOptions advancedMeetingOptions = null;

   /**
   * Unique identifier for meeting.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Unique identifier for meeting.")
  public Integer getId() {
    return id;
  }

  public Meeting title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Meeting description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Meeting start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * A [UNIX Timestamp](https://currentmillis.com/) in milliseconds
   * @return start
  **/
  @ApiModelProperty(example = "null", required = true, value = "A [UNIX Timestamp](https://currentmillis.com/) in milliseconds")
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public Meeting end(Integer end) {
    this.end = end;
    return this;
  }

   /**
   * A [UNIX Timestamp](https://currentmillis.com/) in milliseconds
   * @return end
  **/
  @ApiModelProperty(example = "null", required = true, value = "A [UNIX Timestamp](https://currentmillis.com/) in milliseconds")
  public Integer getEnd() {
    return end;
  }

  public void setEnd(Integer end) {
    this.end = end;
  }

  public Meeting timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

   /**
   * Get numericMeetingId
   * @return numericMeetingId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNumericMeetingId() {
    return numericMeetingId;
  }

   /**
   * Get attendeePasscode
   * @return attendeePasscode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAttendeePasscode() {
    return attendeePasscode;
  }

  public Meeting endPointVersion(String endPointVersion) {
    this.endPointVersion = endPointVersion;
    return this;
  }

   /**
   * Get endPointVersion
   * @return endPointVersion
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getEndPointVersion() {
    return endPointVersion;
  }

  public void setEndPointVersion(String endPointVersion) {
    this.endPointVersion = endPointVersion;
  }

  public Meeting endPointType(String endPointType) {
    this.endPointType = endPointType;
    return this;
  }

   /**
   * Get endPointType
   * @return endPointType
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getEndPointType() {
    return endPointType;
  }

  public void setEndPointType(String endPointType) {
    this.endPointType = endPointType;
  }

  public Meeting advancedMeetingOptions(MeetingAdvancedMeetingOptions advancedMeetingOptions) {
    this.advancedMeetingOptions = advancedMeetingOptions;
    return this;
  }

   /**
   * Get advancedMeetingOptions
   * @return advancedMeetingOptions
  **/
  @ApiModelProperty(example = "null", value = "")
  public MeetingAdvancedMeetingOptions getAdvancedMeetingOptions() {
    return advancedMeetingOptions;
  }

  public void setAdvancedMeetingOptions(MeetingAdvancedMeetingOptions advancedMeetingOptions) {
    this.advancedMeetingOptions = advancedMeetingOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Meeting meeting = (Meeting) o;
    return Objects.equals(this.id, meeting.id) &&
        Objects.equals(this.title, meeting.title) &&
        Objects.equals(this.description, meeting.description) &&
        Objects.equals(this.start, meeting.start) &&
        Objects.equals(this.end, meeting.end) &&
        Objects.equals(this.timezone, meeting.timezone) &&
        Objects.equals(this.numericMeetingId, meeting.numericMeetingId) &&
        Objects.equals(this.attendeePasscode, meeting.attendeePasscode) &&
        Objects.equals(this.endPointVersion, meeting.endPointVersion) &&
        Objects.equals(this.endPointType, meeting.endPointType) &&
        Objects.equals(this.advancedMeetingOptions, meeting.advancedMeetingOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, start, end, timezone, numericMeetingId, attendeePasscode, endPointVersion, endPointType, advancedMeetingOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Meeting {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    numericMeetingId: ").append(toIndentedString(numericMeetingId)).append("\n");
    sb.append("    attendeePasscode: ").append(toIndentedString(attendeePasscode)).append("\n");
    sb.append("    endPointVersion: ").append(toIndentedString(endPointVersion)).append("\n");
    sb.append("    endPointType: ").append(toIndentedString(endPointType)).append("\n");
    sb.append("    advancedMeetingOptions: ").append(toIndentedString(advancedMeetingOptions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

