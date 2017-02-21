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
import io.swagger.client.model.EndpointsInnerConnections;
import java.util.ArrayList;
import java.util.List;


/**
 * EndpointsInner
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-21T15:12:23.377-07:00")
public class EndpointsInner   {
  @SerializedName("meetingid")
  private String meetingid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("CallQuality")
  private String callQuality = null;

  @SerializedName("Leader")
  private String leader = null;

  @SerializedName("callguid")
  private String callguid = null;

  @SerializedName("endpoint")
  private String endpoint = null;

  @SerializedName("TalkDetected")
  private String talkDetected = null;

  @SerializedName("SecureCall")
  private String secureCall = null;

  @SerializedName("Layout")
  private String layout = null;

  @SerializedName("SubLayout")
  private String subLayout = null;

  @SerializedName("VideoRecv")
  private String videoRecv = null;

  @SerializedName("VideoRecvLocalMute")
  private String videoRecvLocalMute = null;

  @SerializedName("VideoRecvRemoteMute")
  private String videoRecvRemoteMute = null;

  @SerializedName("AudioRecv")
  private String audioRecv = null;

  @SerializedName("AudioRecvLocalMute")
  private String audioRecvLocalMute = null;

  @SerializedName("AudioRecvRemoteMute")
  private String audioRecvRemoteMute = null;

  @SerializedName("AudioRecvCodec")
  private String audioRecvCodec = null;

  @SerializedName("AudioSendCodec")
  private String audioSendCodec = null;

  @SerializedName("VideoRecvCodec")
  private String videoRecvCodec = null;

  @SerializedName("VideoRecvHeight")
  private String videoRecvHeight = null;

  @SerializedName("VideoRecvWidth")
  private String videoRecvWidth = null;

  @SerializedName("VideoSendCodec")
  private String videoSendCodec = null;

  @SerializedName("VideoSendHeight")
  private String videoSendHeight = null;

  @SerializedName("VideoSendWidth")
  private String videoSendWidth = null;

  @SerializedName("visibility")
  private String visibility = null;

  @SerializedName("chatEndpointGuid")
  private String chatEndpointGuid = null;

  @SerializedName("endpointGuid")
  private String endpointGuid = null;

  @SerializedName("RDCVersion")
  private String rDCVersion = null;

  @SerializedName("RDCControllerCapable")
  private String rDCControllerCapable = null;

  @SerializedName("RDCControlleeCapable")
  private String rDCControlleeCapable = null;

  @SerializedName("connections")
  private List<EndpointsInnerConnections> connections = new ArrayList<EndpointsInnerConnections>();

  public EndpointsInner meetingid(String meetingid) {
    this.meetingid = meetingid;
    return this;
  }

   /**
   * Get meetingid
   * @return meetingid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMeetingid() {
    return meetingid;
  }

  public void setMeetingid(String meetingid) {
    this.meetingid = meetingid;
  }

  public EndpointsInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EndpointsInner callQuality(String callQuality) {
    this.callQuality = callQuality;
    return this;
  }

   /**
   * Get callQuality
   * @return callQuality
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCallQuality() {
    return callQuality;
  }

  public void setCallQuality(String callQuality) {
    this.callQuality = callQuality;
  }

  public EndpointsInner leader(String leader) {
    this.leader = leader;
    return this;
  }

   /**
   * Get leader
   * @return leader
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLeader() {
    return leader;
  }

  public void setLeader(String leader) {
    this.leader = leader;
  }

  public EndpointsInner callguid(String callguid) {
    this.callguid = callguid;
    return this;
  }

   /**
   * Get callguid
   * @return callguid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCallguid() {
    return callguid;
  }

  public void setCallguid(String callguid) {
    this.callguid = callguid;
  }

  public EndpointsInner endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Get endpoint
   * @return endpoint
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public EndpointsInner talkDetected(String talkDetected) {
    this.talkDetected = talkDetected;
    return this;
  }

   /**
   * Get talkDetected
   * @return talkDetected
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTalkDetected() {
    return talkDetected;
  }

  public void setTalkDetected(String talkDetected) {
    this.talkDetected = talkDetected;
  }

  public EndpointsInner secureCall(String secureCall) {
    this.secureCall = secureCall;
    return this;
  }

   /**
   * Get secureCall
   * @return secureCall
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSecureCall() {
    return secureCall;
  }

  public void setSecureCall(String secureCall) {
    this.secureCall = secureCall;
  }

  public EndpointsInner layout(String layout) {
    this.layout = layout;
    return this;
  }

   /**
   * Get layout
   * @return layout
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLayout() {
    return layout;
  }

  public void setLayout(String layout) {
    this.layout = layout;
  }

  public EndpointsInner subLayout(String subLayout) {
    this.subLayout = subLayout;
    return this;
  }

   /**
   * Get subLayout
   * @return subLayout
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSubLayout() {
    return subLayout;
  }

  public void setSubLayout(String subLayout) {
    this.subLayout = subLayout;
  }

  public EndpointsInner videoRecv(String videoRecv) {
    this.videoRecv = videoRecv;
    return this;
  }

   /**
   * Get videoRecv
   * @return videoRecv
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getVideoRecv() {
    return videoRecv;
  }

  public void setVideoRecv(String videoRecv) {
    this.videoRecv = videoRecv;
  }

  public EndpointsInner videoRecvLocalMute(String videoRecvLocalMute) {
    this.videoRecvLocalMute = videoRecvLocalMute;
    return this;
  }

   /**
   * Get videoRecvLocalMute
   * @return videoRecvLocalMute
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getVideoRecvLocalMute() {
    return videoRecvLocalMute;
  }

  public void setVideoRecvLocalMute(String videoRecvLocalMute) {
    this.videoRecvLocalMute = videoRecvLocalMute;
  }

  public EndpointsInner videoRecvRemoteMute(String videoRecvRemoteMute) {
    this.videoRecvRemoteMute = videoRecvRemoteMute;
    return this;
  }

   /**
   * Get videoRecvRemoteMute
   * @return videoRecvRemoteMute
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getVideoRecvRemoteMute() {
    return videoRecvRemoteMute;
  }

  public void setVideoRecvRemoteMute(String videoRecvRemoteMute) {
    this.videoRecvRemoteMute = videoRecvRemoteMute;
  }

  public EndpointsInner audioRecv(String audioRecv) {
    this.audioRecv = audioRecv;
    return this;
  }

   /**
   * Get audioRecv
   * @return audioRecv
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAudioRecv() {
    return audioRecv;
  }

  public void setAudioRecv(String audioRecv) {
    this.audioRecv = audioRecv;
  }

  public EndpointsInner audioRecvLocalMute(String audioRecvLocalMute) {
    this.audioRecvLocalMute = audioRecvLocalMute;
    return this;
  }

   /**
   * Get audioRecvLocalMute
   * @return audioRecvLocalMute
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAudioRecvLocalMute() {
    return audioRecvLocalMute;
  }

  public void setAudioRecvLocalMute(String audioRecvLocalMute) {
    this.audioRecvLocalMute = audioRecvLocalMute;
  }

  public EndpointsInner audioRecvRemoteMute(String audioRecvRemoteMute) {
    this.audioRecvRemoteMute = audioRecvRemoteMute;
    return this;
  }

   /**
   * Get audioRecvRemoteMute
   * @return audioRecvRemoteMute
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAudioRecvRemoteMute() {
    return audioRecvRemoteMute;
  }

  public void setAudioRecvRemoteMute(String audioRecvRemoteMute) {
    this.audioRecvRemoteMute = audioRecvRemoteMute;
  }

  public EndpointsInner audioRecvCodec(String audioRecvCodec) {
    this.audioRecvCodec = audioRecvCodec;
    return this;
  }

   /**
   * Get audioRecvCodec
   * @return audioRecvCodec
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAudioRecvCodec() {
    return audioRecvCodec;
  }

  public void setAudioRecvCodec(String audioRecvCodec) {
    this.audioRecvCodec = audioRecvCodec;
  }

  public EndpointsInner audioSendCodec(String audioSendCodec) {
    this.audioSendCodec = audioSendCodec;
    return this;
  }

   /**
   * Get audioSendCodec
   * @return audioSendCodec
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAudioSendCodec() {
    return audioSendCodec;
  }

  public void setAudioSendCodec(String audioSendCodec) {
    this.audioSendCodec = audioSendCodec;
  }

  public EndpointsInner videoRecvCodec(String videoRecvCodec) {
    this.videoRecvCodec = videoRecvCodec;
    return this;
  }

   /**
   * Get videoRecvCodec
   * @return videoRecvCodec
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getVideoRecvCodec() {
    return videoRecvCodec;
  }

  public void setVideoRecvCodec(String videoRecvCodec) {
    this.videoRecvCodec = videoRecvCodec;
  }

  public EndpointsInner videoRecvHeight(String videoRecvHeight) {
    this.videoRecvHeight = videoRecvHeight;
    return this;
  }

   /**
   * Get videoRecvHeight
   * @return videoRecvHeight
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getVideoRecvHeight() {
    return videoRecvHeight;
  }

  public void setVideoRecvHeight(String videoRecvHeight) {
    this.videoRecvHeight = videoRecvHeight;
  }

  public EndpointsInner videoRecvWidth(String videoRecvWidth) {
    this.videoRecvWidth = videoRecvWidth;
    return this;
  }

   /**
   * Get videoRecvWidth
   * @return videoRecvWidth
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getVideoRecvWidth() {
    return videoRecvWidth;
  }

  public void setVideoRecvWidth(String videoRecvWidth) {
    this.videoRecvWidth = videoRecvWidth;
  }

  public EndpointsInner videoSendCodec(String videoSendCodec) {
    this.videoSendCodec = videoSendCodec;
    return this;
  }

   /**
   * Get videoSendCodec
   * @return videoSendCodec
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getVideoSendCodec() {
    return videoSendCodec;
  }

  public void setVideoSendCodec(String videoSendCodec) {
    this.videoSendCodec = videoSendCodec;
  }

  public EndpointsInner videoSendHeight(String videoSendHeight) {
    this.videoSendHeight = videoSendHeight;
    return this;
  }

   /**
   * Get videoSendHeight
   * @return videoSendHeight
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getVideoSendHeight() {
    return videoSendHeight;
  }

  public void setVideoSendHeight(String videoSendHeight) {
    this.videoSendHeight = videoSendHeight;
  }

  public EndpointsInner videoSendWidth(String videoSendWidth) {
    this.videoSendWidth = videoSendWidth;
    return this;
  }

   /**
   * Get videoSendWidth
   * @return videoSendWidth
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getVideoSendWidth() {
    return videoSendWidth;
  }

  public void setVideoSendWidth(String videoSendWidth) {
    this.videoSendWidth = videoSendWidth;
  }

  public EndpointsInner visibility(String visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

  public EndpointsInner chatEndpointGuid(String chatEndpointGuid) {
    this.chatEndpointGuid = chatEndpointGuid;
    return this;
  }

   /**
   * Get chatEndpointGuid
   * @return chatEndpointGuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getChatEndpointGuid() {
    return chatEndpointGuid;
  }

  public void setChatEndpointGuid(String chatEndpointGuid) {
    this.chatEndpointGuid = chatEndpointGuid;
  }

  public EndpointsInner endpointGuid(String endpointGuid) {
    this.endpointGuid = endpointGuid;
    return this;
  }

   /**
   * Get endpointGuid
   * @return endpointGuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEndpointGuid() {
    return endpointGuid;
  }

  public void setEndpointGuid(String endpointGuid) {
    this.endpointGuid = endpointGuid;
  }

  public EndpointsInner rDCVersion(String rDCVersion) {
    this.rDCVersion = rDCVersion;
    return this;
  }

   /**
   * Get rDCVersion
   * @return rDCVersion
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRDCVersion() {
    return rDCVersion;
  }

  public void setRDCVersion(String rDCVersion) {
    this.rDCVersion = rDCVersion;
  }

  public EndpointsInner rDCControllerCapable(String rDCControllerCapable) {
    this.rDCControllerCapable = rDCControllerCapable;
    return this;
  }

   /**
   * Get rDCControllerCapable
   * @return rDCControllerCapable
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRDCControllerCapable() {
    return rDCControllerCapable;
  }

  public void setRDCControllerCapable(String rDCControllerCapable) {
    this.rDCControllerCapable = rDCControllerCapable;
  }

  public EndpointsInner rDCControlleeCapable(String rDCControlleeCapable) {
    this.rDCControlleeCapable = rDCControlleeCapable;
    return this;
  }

   /**
   * Get rDCControlleeCapable
   * @return rDCControlleeCapable
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRDCControlleeCapable() {
    return rDCControlleeCapable;
  }

  public void setRDCControlleeCapable(String rDCControlleeCapable) {
    this.rDCControlleeCapable = rDCControlleeCapable;
  }

  public EndpointsInner connections(List<EndpointsInnerConnections> connections) {
    this.connections = connections;
    return this;
  }

  public EndpointsInner addConnectionsItem(EndpointsInnerConnections connectionsItem) {
    this.connections.add(connectionsItem);
    return this;
  }

   /**
   * Get connections
   * @return connections
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<EndpointsInnerConnections> getConnections() {
    return connections;
  }

  public void setConnections(List<EndpointsInnerConnections> connections) {
    this.connections = connections;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointsInner endpointsInner = (EndpointsInner) o;
    return Objects.equals(this.meetingid, endpointsInner.meetingid) &&
        Objects.equals(this.name, endpointsInner.name) &&
        Objects.equals(this.callQuality, endpointsInner.callQuality) &&
        Objects.equals(this.leader, endpointsInner.leader) &&
        Objects.equals(this.callguid, endpointsInner.callguid) &&
        Objects.equals(this.endpoint, endpointsInner.endpoint) &&
        Objects.equals(this.talkDetected, endpointsInner.talkDetected) &&
        Objects.equals(this.secureCall, endpointsInner.secureCall) &&
        Objects.equals(this.layout, endpointsInner.layout) &&
        Objects.equals(this.subLayout, endpointsInner.subLayout) &&
        Objects.equals(this.videoRecv, endpointsInner.videoRecv) &&
        Objects.equals(this.videoRecvLocalMute, endpointsInner.videoRecvLocalMute) &&
        Objects.equals(this.videoRecvRemoteMute, endpointsInner.videoRecvRemoteMute) &&
        Objects.equals(this.audioRecv, endpointsInner.audioRecv) &&
        Objects.equals(this.audioRecvLocalMute, endpointsInner.audioRecvLocalMute) &&
        Objects.equals(this.audioRecvRemoteMute, endpointsInner.audioRecvRemoteMute) &&
        Objects.equals(this.audioRecvCodec, endpointsInner.audioRecvCodec) &&
        Objects.equals(this.audioSendCodec, endpointsInner.audioSendCodec) &&
        Objects.equals(this.videoRecvCodec, endpointsInner.videoRecvCodec) &&
        Objects.equals(this.videoRecvHeight, endpointsInner.videoRecvHeight) &&
        Objects.equals(this.videoRecvWidth, endpointsInner.videoRecvWidth) &&
        Objects.equals(this.videoSendCodec, endpointsInner.videoSendCodec) &&
        Objects.equals(this.videoSendHeight, endpointsInner.videoSendHeight) &&
        Objects.equals(this.videoSendWidth, endpointsInner.videoSendWidth) &&
        Objects.equals(this.visibility, endpointsInner.visibility) &&
        Objects.equals(this.chatEndpointGuid, endpointsInner.chatEndpointGuid) &&
        Objects.equals(this.endpointGuid, endpointsInner.endpointGuid) &&
        Objects.equals(this.rDCVersion, endpointsInner.rDCVersion) &&
        Objects.equals(this.rDCControllerCapable, endpointsInner.rDCControllerCapable) &&
        Objects.equals(this.rDCControlleeCapable, endpointsInner.rDCControlleeCapable) &&
        Objects.equals(this.connections, endpointsInner.connections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meetingid, name, callQuality, leader, callguid, endpoint, talkDetected, secureCall, layout, subLayout, videoRecv, videoRecvLocalMute, videoRecvRemoteMute, audioRecv, audioRecvLocalMute, audioRecvRemoteMute, audioRecvCodec, audioSendCodec, videoRecvCodec, videoRecvHeight, videoRecvWidth, videoSendCodec, videoSendHeight, videoSendWidth, visibility, chatEndpointGuid, endpointGuid, rDCVersion, rDCControllerCapable, rDCControlleeCapable, connections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointsInner {\n");
    
    sb.append("    meetingid: ").append(toIndentedString(meetingid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    callQuality: ").append(toIndentedString(callQuality)).append("\n");
    sb.append("    leader: ").append(toIndentedString(leader)).append("\n");
    sb.append("    callguid: ").append(toIndentedString(callguid)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    talkDetected: ").append(toIndentedString(talkDetected)).append("\n");
    sb.append("    secureCall: ").append(toIndentedString(secureCall)).append("\n");
    sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
    sb.append("    subLayout: ").append(toIndentedString(subLayout)).append("\n");
    sb.append("    videoRecv: ").append(toIndentedString(videoRecv)).append("\n");
    sb.append("    videoRecvLocalMute: ").append(toIndentedString(videoRecvLocalMute)).append("\n");
    sb.append("    videoRecvRemoteMute: ").append(toIndentedString(videoRecvRemoteMute)).append("\n");
    sb.append("    audioRecv: ").append(toIndentedString(audioRecv)).append("\n");
    sb.append("    audioRecvLocalMute: ").append(toIndentedString(audioRecvLocalMute)).append("\n");
    sb.append("    audioRecvRemoteMute: ").append(toIndentedString(audioRecvRemoteMute)).append("\n");
    sb.append("    audioRecvCodec: ").append(toIndentedString(audioRecvCodec)).append("\n");
    sb.append("    audioSendCodec: ").append(toIndentedString(audioSendCodec)).append("\n");
    sb.append("    videoRecvCodec: ").append(toIndentedString(videoRecvCodec)).append("\n");
    sb.append("    videoRecvHeight: ").append(toIndentedString(videoRecvHeight)).append("\n");
    sb.append("    videoRecvWidth: ").append(toIndentedString(videoRecvWidth)).append("\n");
    sb.append("    videoSendCodec: ").append(toIndentedString(videoSendCodec)).append("\n");
    sb.append("    videoSendHeight: ").append(toIndentedString(videoSendHeight)).append("\n");
    sb.append("    videoSendWidth: ").append(toIndentedString(videoSendWidth)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    chatEndpointGuid: ").append(toIndentedString(chatEndpointGuid)).append("\n");
    sb.append("    endpointGuid: ").append(toIndentedString(endpointGuid)).append("\n");
    sb.append("    rDCVersion: ").append(toIndentedString(rDCVersion)).append("\n");
    sb.append("    rDCControllerCapable: ").append(toIndentedString(rDCControllerCapable)).append("\n");
    sb.append("    rDCControlleeCapable: ").append(toIndentedString(rDCControlleeCapable)).append("\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
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

