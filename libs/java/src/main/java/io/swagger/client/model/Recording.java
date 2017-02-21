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
import io.swagger.client.model.RecordingRecordingChapters;
import java.util.ArrayList;
import java.util.List;


/**
 * Recording
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-21T15:12:23.377-07:00")
public class Recording   {
  @SerializedName("recordingEntityId")
  private Integer recordingEntityId = null;

  @SerializedName("recordingEntityGuid")
  private String recordingEntityGuid = null;

  @SerializedName("recordingName")
  private String recordingName = null;

  @SerializedName("meetingGuid")
  private String meetingGuid = null;

  @SerializedName("chapterCount")
  private Integer chapterCount = null;

  @SerializedName("totalSize")
  private Integer totalSize = null;

  @SerializedName("totalDuration")
  private Integer totalDuration = null;

  @SerializedName("lastRecordingDate")
  private Integer lastRecordingDate = null;

  @SerializedName("aggregatedStatus")
  private String aggregatedStatus = null;

  @SerializedName("recordingThumbnail")
  private String recordingThumbnail = null;

  @SerializedName("created")
  private Integer created = null;

  @SerializedName("aggregatedViewCount")
  private Integer aggregatedViewCount = null;

  @SerializedName("isPremiumRecording")
  private Boolean isPremiumRecording = null;

  @SerializedName("showPremiumRecordingTag")
  private Boolean showPremiumRecordingTag = null;

  @SerializedName("recordingChapters")
  private List<RecordingRecordingChapters> recordingChapters = new ArrayList<RecordingRecordingChapters>();

  public Recording recordingEntityId(Integer recordingEntityId) {
    this.recordingEntityId = recordingEntityId;
    return this;
  }

   /**
   * Get recordingEntityId
   * @return recordingEntityId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getRecordingEntityId() {
    return recordingEntityId;
  }

  public void setRecordingEntityId(Integer recordingEntityId) {
    this.recordingEntityId = recordingEntityId;
  }

  public Recording recordingEntityGuid(String recordingEntityGuid) {
    this.recordingEntityGuid = recordingEntityGuid;
    return this;
  }

   /**
   * Get recordingEntityGuid
   * @return recordingEntityGuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRecordingEntityGuid() {
    return recordingEntityGuid;
  }

  public void setRecordingEntityGuid(String recordingEntityGuid) {
    this.recordingEntityGuid = recordingEntityGuid;
  }

  public Recording recordingName(String recordingName) {
    this.recordingName = recordingName;
    return this;
  }

   /**
   * Get recordingName
   * @return recordingName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRecordingName() {
    return recordingName;
  }

  public void setRecordingName(String recordingName) {
    this.recordingName = recordingName;
  }

  public Recording meetingGuid(String meetingGuid) {
    this.meetingGuid = meetingGuid;
    return this;
  }

   /**
   * Get meetingGuid
   * @return meetingGuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMeetingGuid() {
    return meetingGuid;
  }

  public void setMeetingGuid(String meetingGuid) {
    this.meetingGuid = meetingGuid;
  }

  public Recording chapterCount(Integer chapterCount) {
    this.chapterCount = chapterCount;
    return this;
  }

   /**
   * Get chapterCount
   * @return chapterCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getChapterCount() {
    return chapterCount;
  }

  public void setChapterCount(Integer chapterCount) {
    this.chapterCount = chapterCount;
  }

  public Recording totalSize(Integer totalSize) {
    this.totalSize = totalSize;
    return this;
  }

   /**
   * Get totalSize
   * @return totalSize
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotalSize() {
    return totalSize;
  }

  public void setTotalSize(Integer totalSize) {
    this.totalSize = totalSize;
  }

  public Recording totalDuration(Integer totalDuration) {
    this.totalDuration = totalDuration;
    return this;
  }

   /**
   * Get totalDuration
   * @return totalDuration
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotalDuration() {
    return totalDuration;
  }

  public void setTotalDuration(Integer totalDuration) {
    this.totalDuration = totalDuration;
  }

  public Recording lastRecordingDate(Integer lastRecordingDate) {
    this.lastRecordingDate = lastRecordingDate;
    return this;
  }

   /**
   * Get lastRecordingDate
   * @return lastRecordingDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getLastRecordingDate() {
    return lastRecordingDate;
  }

  public void setLastRecordingDate(Integer lastRecordingDate) {
    this.lastRecordingDate = lastRecordingDate;
  }

  public Recording aggregatedStatus(String aggregatedStatus) {
    this.aggregatedStatus = aggregatedStatus;
    return this;
  }

   /**
   * Get aggregatedStatus
   * @return aggregatedStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAggregatedStatus() {
    return aggregatedStatus;
  }

  public void setAggregatedStatus(String aggregatedStatus) {
    this.aggregatedStatus = aggregatedStatus;
  }

  public Recording recordingThumbnail(String recordingThumbnail) {
    this.recordingThumbnail = recordingThumbnail;
    return this;
  }

   /**
   * Get recordingThumbnail
   * @return recordingThumbnail
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRecordingThumbnail() {
    return recordingThumbnail;
  }

  public void setRecordingThumbnail(String recordingThumbnail) {
    this.recordingThumbnail = recordingThumbnail;
  }

  public Recording created(Integer created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getCreated() {
    return created;
  }

  public void setCreated(Integer created) {
    this.created = created;
  }

  public Recording aggregatedViewCount(Integer aggregatedViewCount) {
    this.aggregatedViewCount = aggregatedViewCount;
    return this;
  }

   /**
   * Get aggregatedViewCount
   * @return aggregatedViewCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getAggregatedViewCount() {
    return aggregatedViewCount;
  }

  public void setAggregatedViewCount(Integer aggregatedViewCount) {
    this.aggregatedViewCount = aggregatedViewCount;
  }

  public Recording isPremiumRecording(Boolean isPremiumRecording) {
    this.isPremiumRecording = isPremiumRecording;
    return this;
  }

   /**
   * Get isPremiumRecording
   * @return isPremiumRecording
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsPremiumRecording() {
    return isPremiumRecording;
  }

  public void setIsPremiumRecording(Boolean isPremiumRecording) {
    this.isPremiumRecording = isPremiumRecording;
  }

  public Recording showPremiumRecordingTag(Boolean showPremiumRecordingTag) {
    this.showPremiumRecordingTag = showPremiumRecordingTag;
    return this;
  }

   /**
   * Get showPremiumRecordingTag
   * @return showPremiumRecordingTag
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getShowPremiumRecordingTag() {
    return showPremiumRecordingTag;
  }

  public void setShowPremiumRecordingTag(Boolean showPremiumRecordingTag) {
    this.showPremiumRecordingTag = showPremiumRecordingTag;
  }

  public Recording recordingChapters(List<RecordingRecordingChapters> recordingChapters) {
    this.recordingChapters = recordingChapters;
    return this;
  }

  public Recording addRecordingChaptersItem(RecordingRecordingChapters recordingChaptersItem) {
    this.recordingChapters.add(recordingChaptersItem);
    return this;
  }

   /**
   * Get recordingChapters
   * @return recordingChapters
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<RecordingRecordingChapters> getRecordingChapters() {
    return recordingChapters;
  }

  public void setRecordingChapters(List<RecordingRecordingChapters> recordingChapters) {
    this.recordingChapters = recordingChapters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recording recording = (Recording) o;
    return Objects.equals(this.recordingEntityId, recording.recordingEntityId) &&
        Objects.equals(this.recordingEntityGuid, recording.recordingEntityGuid) &&
        Objects.equals(this.recordingName, recording.recordingName) &&
        Objects.equals(this.meetingGuid, recording.meetingGuid) &&
        Objects.equals(this.chapterCount, recording.chapterCount) &&
        Objects.equals(this.totalSize, recording.totalSize) &&
        Objects.equals(this.totalDuration, recording.totalDuration) &&
        Objects.equals(this.lastRecordingDate, recording.lastRecordingDate) &&
        Objects.equals(this.aggregatedStatus, recording.aggregatedStatus) &&
        Objects.equals(this.recordingThumbnail, recording.recordingThumbnail) &&
        Objects.equals(this.created, recording.created) &&
        Objects.equals(this.aggregatedViewCount, recording.aggregatedViewCount) &&
        Objects.equals(this.isPremiumRecording, recording.isPremiumRecording) &&
        Objects.equals(this.showPremiumRecordingTag, recording.showPremiumRecordingTag) &&
        Objects.equals(this.recordingChapters, recording.recordingChapters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordingEntityId, recordingEntityGuid, recordingName, meetingGuid, chapterCount, totalSize, totalDuration, lastRecordingDate, aggregatedStatus, recordingThumbnail, created, aggregatedViewCount, isPremiumRecording, showPremiumRecordingTag, recordingChapters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recording {\n");
    
    sb.append("    recordingEntityId: ").append(toIndentedString(recordingEntityId)).append("\n");
    sb.append("    recordingEntityGuid: ").append(toIndentedString(recordingEntityGuid)).append("\n");
    sb.append("    recordingName: ").append(toIndentedString(recordingName)).append("\n");
    sb.append("    meetingGuid: ").append(toIndentedString(meetingGuid)).append("\n");
    sb.append("    chapterCount: ").append(toIndentedString(chapterCount)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
    sb.append("    totalDuration: ").append(toIndentedString(totalDuration)).append("\n");
    sb.append("    lastRecordingDate: ").append(toIndentedString(lastRecordingDate)).append("\n");
    sb.append("    aggregatedStatus: ").append(toIndentedString(aggregatedStatus)).append("\n");
    sb.append("    recordingThumbnail: ").append(toIndentedString(recordingThumbnail)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    aggregatedViewCount: ").append(toIndentedString(aggregatedViewCount)).append("\n");
    sb.append("    isPremiumRecording: ").append(toIndentedString(isPremiumRecording)).append("\n");
    sb.append("    showPremiumRecordingTag: ").append(toIndentedString(showPremiumRecordingTag)).append("\n");
    sb.append("    recordingChapters: ").append(toIndentedString(recordingChapters)).append("\n");
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

