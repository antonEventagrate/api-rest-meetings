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


/**
 * MeetingAdvancedMeetingOptions
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-21T15:12:23.377-07:00")
public class MeetingAdvancedMeetingOptions   {
  @SerializedName("autoRecord")
  private Boolean autoRecord = null;

  @SerializedName("muteParticipantsOnEntry")
  private Boolean muteParticipantsOnEntry = null;

  /**
   * Gets or Sets encryptionType
   */
  public enum EncryptionTypeEnum {
    @SerializedName("NO_ENCRYPTION")
    NO_ENCRYPTION("NO_ENCRYPTION"),
    
    @SerializedName("ENCRYPTED_ONLY")
    ENCRYPTED_ONLY("ENCRYPTED_ONLY"),
    
    @SerializedName("ENCRYPTED_OR_PSTN_ONLY")
    ENCRYPTED_OR_PSTN_ONLY("ENCRYPTED_OR_PSTN_ONLY");

    private String value;

    EncryptionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("encryptionType")
  private EncryptionTypeEnum encryptionType = EncryptionTypeEnum.NO_ENCRYPTION;

  @SerializedName("moderatorLess")
  private Boolean moderatorLess = null;

  @SerializedName("videoBestFit")
  private Boolean videoBestFit = null;

  @SerializedName("disallowChat")
  private Boolean disallowChat = null;

  @SerializedName("publishMeeting")
  private Boolean publishMeeting = null;

  @SerializedName("showAllAttendeesInMeetingInvite")
  private Boolean showAllAttendeesInMeetingInvite = null;

  public MeetingAdvancedMeetingOptions autoRecord(Boolean autoRecord) {
    this.autoRecord = autoRecord;
    return this;
  }

   /**
   * Get autoRecord
   * @return autoRecord
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAutoRecord() {
    return autoRecord;
  }

  public void setAutoRecord(Boolean autoRecord) {
    this.autoRecord = autoRecord;
  }

  public MeetingAdvancedMeetingOptions muteParticipantsOnEntry(Boolean muteParticipantsOnEntry) {
    this.muteParticipantsOnEntry = muteParticipantsOnEntry;
    return this;
  }

   /**
   * Get muteParticipantsOnEntry
   * @return muteParticipantsOnEntry
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getMuteParticipantsOnEntry() {
    return muteParticipantsOnEntry;
  }

  public void setMuteParticipantsOnEntry(Boolean muteParticipantsOnEntry) {
    this.muteParticipantsOnEntry = muteParticipantsOnEntry;
  }

  public MeetingAdvancedMeetingOptions encryptionType(EncryptionTypeEnum encryptionType) {
    this.encryptionType = encryptionType;
    return this;
  }

   /**
   * Get encryptionType
   * @return encryptionType
  **/
  @ApiModelProperty(example = "null", value = "")
  public EncryptionTypeEnum getEncryptionType() {
    return encryptionType;
  }

  public void setEncryptionType(EncryptionTypeEnum encryptionType) {
    this.encryptionType = encryptionType;
  }

  public MeetingAdvancedMeetingOptions moderatorLess(Boolean moderatorLess) {
    this.moderatorLess = moderatorLess;
    return this;
  }

   /**
   * Get moderatorLess
   * @return moderatorLess
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getModeratorLess() {
    return moderatorLess;
  }

  public void setModeratorLess(Boolean moderatorLess) {
    this.moderatorLess = moderatorLess;
  }

  public MeetingAdvancedMeetingOptions videoBestFit(Boolean videoBestFit) {
    this.videoBestFit = videoBestFit;
    return this;
  }

   /**
   * Get videoBestFit
   * @return videoBestFit
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getVideoBestFit() {
    return videoBestFit;
  }

  public void setVideoBestFit(Boolean videoBestFit) {
    this.videoBestFit = videoBestFit;
  }

  public MeetingAdvancedMeetingOptions disallowChat(Boolean disallowChat) {
    this.disallowChat = disallowChat;
    return this;
  }

   /**
   * Get disallowChat
   * @return disallowChat
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getDisallowChat() {
    return disallowChat;
  }

  public void setDisallowChat(Boolean disallowChat) {
    this.disallowChat = disallowChat;
  }

  public MeetingAdvancedMeetingOptions publishMeeting(Boolean publishMeeting) {
    this.publishMeeting = publishMeeting;
    return this;
  }

   /**
   * Get publishMeeting
   * @return publishMeeting
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPublishMeeting() {
    return publishMeeting;
  }

  public void setPublishMeeting(Boolean publishMeeting) {
    this.publishMeeting = publishMeeting;
  }

  public MeetingAdvancedMeetingOptions showAllAttendeesInMeetingInvite(Boolean showAllAttendeesInMeetingInvite) {
    this.showAllAttendeesInMeetingInvite = showAllAttendeesInMeetingInvite;
    return this;
  }

   /**
   * Get showAllAttendeesInMeetingInvite
   * @return showAllAttendeesInMeetingInvite
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getShowAllAttendeesInMeetingInvite() {
    return showAllAttendeesInMeetingInvite;
  }

  public void setShowAllAttendeesInMeetingInvite(Boolean showAllAttendeesInMeetingInvite) {
    this.showAllAttendeesInMeetingInvite = showAllAttendeesInMeetingInvite;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeetingAdvancedMeetingOptions meetingAdvancedMeetingOptions = (MeetingAdvancedMeetingOptions) o;
    return Objects.equals(this.autoRecord, meetingAdvancedMeetingOptions.autoRecord) &&
        Objects.equals(this.muteParticipantsOnEntry, meetingAdvancedMeetingOptions.muteParticipantsOnEntry) &&
        Objects.equals(this.encryptionType, meetingAdvancedMeetingOptions.encryptionType) &&
        Objects.equals(this.moderatorLess, meetingAdvancedMeetingOptions.moderatorLess) &&
        Objects.equals(this.videoBestFit, meetingAdvancedMeetingOptions.videoBestFit) &&
        Objects.equals(this.disallowChat, meetingAdvancedMeetingOptions.disallowChat) &&
        Objects.equals(this.publishMeeting, meetingAdvancedMeetingOptions.publishMeeting) &&
        Objects.equals(this.showAllAttendeesInMeetingInvite, meetingAdvancedMeetingOptions.showAllAttendeesInMeetingInvite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRecord, muteParticipantsOnEntry, encryptionType, moderatorLess, videoBestFit, disallowChat, publishMeeting, showAllAttendeesInMeetingInvite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeetingAdvancedMeetingOptions {\n");
    
    sb.append("    autoRecord: ").append(toIndentedString(autoRecord)).append("\n");
    sb.append("    muteParticipantsOnEntry: ").append(toIndentedString(muteParticipantsOnEntry)).append("\n");
    sb.append("    encryptionType: ").append(toIndentedString(encryptionType)).append("\n");
    sb.append("    moderatorLess: ").append(toIndentedString(moderatorLess)).append("\n");
    sb.append("    videoBestFit: ").append(toIndentedString(videoBestFit)).append("\n");
    sb.append("    disallowChat: ").append(toIndentedString(disallowChat)).append("\n");
    sb.append("    publishMeeting: ").append(toIndentedString(publishMeeting)).append("\n");
    sb.append("    showAllAttendeesInMeetingInvite: ").append(toIndentedString(showAllAttendeesInMeetingInvite)).append("\n");
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

