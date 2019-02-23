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
    /// EndpointsInner
    /// </summary>
    [DataContract]
    public partial class EndpointsInner :  IEquatable<EndpointsInner>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EndpointsInner" /> class.
        /// </summary>
        /// <param name="meetingid">meetingid.</param>
        /// <param name="name">name.</param>
        /// <param name="callQuality">callQuality.</param>
        /// <param name="leader">leader.</param>
        /// <param name="callguid">callguid.</param>
        /// <param name="endpoint">endpoint.</param>
        /// <param name="talkDetected">talkDetected.</param>
        /// <param name="secureCall">secureCall.</param>
        /// <param name="layout">layout.</param>
        /// <param name="subLayout">subLayout.</param>
        /// <param name="videoRecv">videoRecv.</param>
        /// <param name="videoRecvLocalMute">videoRecvLocalMute.</param>
        /// <param name="videoRecvRemoteMute">videoRecvRemoteMute.</param>
        /// <param name="audioRecv">audioRecv.</param>
        /// <param name="audioRecvLocalMute">audioRecvLocalMute.</param>
        /// <param name="audioRecvRemoteMute">audioRecvRemoteMute.</param>
        /// <param name="audioRecvCodec">audioRecvCodec.</param>
        /// <param name="audioSendCodec">audioSendCodec.</param>
        /// <param name="videoRecvCodec">videoRecvCodec.</param>
        /// <param name="videoRecvHeight">videoRecvHeight.</param>
        /// <param name="videoRecvWidth">videoRecvWidth.</param>
        /// <param name="videoSendCodec">videoSendCodec.</param>
        /// <param name="videoSendHeight">videoSendHeight.</param>
        /// <param name="videoSendWidth">videoSendWidth.</param>
        /// <param name="visibility">visibility.</param>
        /// <param name="chatEndpointGuid">chatEndpointGuid.</param>
        /// <param name="endpointGuid">endpointGuid.</param>
        /// <param name="rDCVersion">rDCVersion.</param>
        /// <param name="rDCControllerCapable">rDCControllerCapable.</param>
        /// <param name="rDCControlleeCapable">rDCControlleeCapable.</param>
        /// <param name="connections">connections.</param>
        public EndpointsInner(string meetingid = default(string), string name = default(string), string callQuality = default(string), string leader = default(string), string callguid = default(string), string endpoint = default(string), string talkDetected = default(string), string secureCall = default(string), string layout = default(string), string subLayout = default(string), string videoRecv = default(string), string videoRecvLocalMute = default(string), string videoRecvRemoteMute = default(string), string audioRecv = default(string), string audioRecvLocalMute = default(string), string audioRecvRemoteMute = default(string), string audioRecvCodec = default(string), string audioSendCodec = default(string), string videoRecvCodec = default(string), string videoRecvHeight = default(string), string videoRecvWidth = default(string), string videoSendCodec = default(string), string videoSendHeight = default(string), string videoSendWidth = default(string), string visibility = default(string), string chatEndpointGuid = default(string), string endpointGuid = default(string), string rDCVersion = default(string), string rDCControllerCapable = default(string), string rDCControlleeCapable = default(string), List<EndpointsInnerConnections> connections = default(List<EndpointsInnerConnections>))
        {
            this.Meetingid = meetingid;
            this.Name = name;
            this.CallQuality = callQuality;
            this.Leader = leader;
            this.Callguid = callguid;
            this.Endpoint = endpoint;
            this.TalkDetected = talkDetected;
            this.SecureCall = secureCall;
            this.Layout = layout;
            this.SubLayout = subLayout;
            this.VideoRecv = videoRecv;
            this.VideoRecvLocalMute = videoRecvLocalMute;
            this.VideoRecvRemoteMute = videoRecvRemoteMute;
            this.AudioRecv = audioRecv;
            this.AudioRecvLocalMute = audioRecvLocalMute;
            this.AudioRecvRemoteMute = audioRecvRemoteMute;
            this.AudioRecvCodec = audioRecvCodec;
            this.AudioSendCodec = audioSendCodec;
            this.VideoRecvCodec = videoRecvCodec;
            this.VideoRecvHeight = videoRecvHeight;
            this.VideoRecvWidth = videoRecvWidth;
            this.VideoSendCodec = videoSendCodec;
            this.VideoSendHeight = videoSendHeight;
            this.VideoSendWidth = videoSendWidth;
            this.Visibility = visibility;
            this.ChatEndpointGuid = chatEndpointGuid;
            this.EndpointGuid = endpointGuid;
            this.RDCVersion = rDCVersion;
            this.RDCControllerCapable = rDCControllerCapable;
            this.RDCControlleeCapable = rDCControlleeCapable;
            this.Connections = connections;
        }
        
        /// <summary>
        /// Gets or Sets Meetingid
        /// </summary>
        [DataMember(Name="meetingid", EmitDefaultValue=false)]
        public string Meetingid { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets CallQuality
        /// </summary>
        [DataMember(Name="CallQuality", EmitDefaultValue=false)]
        public string CallQuality { get; set; }

        /// <summary>
        /// Gets or Sets Leader
        /// </summary>
        [DataMember(Name="Leader", EmitDefaultValue=false)]
        public string Leader { get; set; }

        /// <summary>
        /// Gets or Sets Callguid
        /// </summary>
        [DataMember(Name="callguid", EmitDefaultValue=false)]
        public string Callguid { get; set; }

        /// <summary>
        /// Gets or Sets Endpoint
        /// </summary>
        [DataMember(Name="endpoint", EmitDefaultValue=false)]
        public string Endpoint { get; set; }

        /// <summary>
        /// Gets or Sets TalkDetected
        /// </summary>
        [DataMember(Name="TalkDetected", EmitDefaultValue=false)]
        public string TalkDetected { get; set; }

        /// <summary>
        /// Gets or Sets SecureCall
        /// </summary>
        [DataMember(Name="SecureCall", EmitDefaultValue=false)]
        public string SecureCall { get; set; }

        /// <summary>
        /// Gets or Sets Layout
        /// </summary>
        [DataMember(Name="Layout", EmitDefaultValue=false)]
        public string Layout { get; set; }

        /// <summary>
        /// Gets or Sets SubLayout
        /// </summary>
        [DataMember(Name="SubLayout", EmitDefaultValue=false)]
        public string SubLayout { get; set; }

        /// <summary>
        /// Gets or Sets VideoRecv
        /// </summary>
        [DataMember(Name="VideoRecv", EmitDefaultValue=false)]
        public string VideoRecv { get; set; }

        /// <summary>
        /// Gets or Sets VideoRecvLocalMute
        /// </summary>
        [DataMember(Name="VideoRecvLocalMute", EmitDefaultValue=false)]
        public string VideoRecvLocalMute { get; set; }

        /// <summary>
        /// Gets or Sets VideoRecvRemoteMute
        /// </summary>
        [DataMember(Name="VideoRecvRemoteMute", EmitDefaultValue=false)]
        public string VideoRecvRemoteMute { get; set; }

        /// <summary>
        /// Gets or Sets AudioRecv
        /// </summary>
        [DataMember(Name="AudioRecv", EmitDefaultValue=false)]
        public string AudioRecv { get; set; }

        /// <summary>
        /// Gets or Sets AudioRecvLocalMute
        /// </summary>
        [DataMember(Name="AudioRecvLocalMute", EmitDefaultValue=false)]
        public string AudioRecvLocalMute { get; set; }

        /// <summary>
        /// Gets or Sets AudioRecvRemoteMute
        /// </summary>
        [DataMember(Name="AudioRecvRemoteMute", EmitDefaultValue=false)]
        public string AudioRecvRemoteMute { get; set; }

        /// <summary>
        /// Gets or Sets AudioRecvCodec
        /// </summary>
        [DataMember(Name="AudioRecvCodec", EmitDefaultValue=false)]
        public string AudioRecvCodec { get; set; }

        /// <summary>
        /// Gets or Sets AudioSendCodec
        /// </summary>
        [DataMember(Name="AudioSendCodec", EmitDefaultValue=false)]
        public string AudioSendCodec { get; set; }

        /// <summary>
        /// Gets or Sets VideoRecvCodec
        /// </summary>
        [DataMember(Name="VideoRecvCodec", EmitDefaultValue=false)]
        public string VideoRecvCodec { get; set; }

        /// <summary>
        /// Gets or Sets VideoRecvHeight
        /// </summary>
        [DataMember(Name="VideoRecvHeight", EmitDefaultValue=false)]
        public string VideoRecvHeight { get; set; }

        /// <summary>
        /// Gets or Sets VideoRecvWidth
        /// </summary>
        [DataMember(Name="VideoRecvWidth", EmitDefaultValue=false)]
        public string VideoRecvWidth { get; set; }

        /// <summary>
        /// Gets or Sets VideoSendCodec
        /// </summary>
        [DataMember(Name="VideoSendCodec", EmitDefaultValue=false)]
        public string VideoSendCodec { get; set; }

        /// <summary>
        /// Gets or Sets VideoSendHeight
        /// </summary>
        [DataMember(Name="VideoSendHeight", EmitDefaultValue=false)]
        public string VideoSendHeight { get; set; }

        /// <summary>
        /// Gets or Sets VideoSendWidth
        /// </summary>
        [DataMember(Name="VideoSendWidth", EmitDefaultValue=false)]
        public string VideoSendWidth { get; set; }

        /// <summary>
        /// Gets or Sets Visibility
        /// </summary>
        [DataMember(Name="visibility", EmitDefaultValue=false)]
        public string Visibility { get; set; }

        /// <summary>
        /// Gets or Sets ChatEndpointGuid
        /// </summary>
        [DataMember(Name="chatEndpointGuid", EmitDefaultValue=false)]
        public string ChatEndpointGuid { get; set; }

        /// <summary>
        /// Gets or Sets EndpointGuid
        /// </summary>
        [DataMember(Name="endpointGuid", EmitDefaultValue=false)]
        public string EndpointGuid { get; set; }

        /// <summary>
        /// Gets or Sets RDCVersion
        /// </summary>
        [DataMember(Name="RDCVersion", EmitDefaultValue=false)]
        public string RDCVersion { get; set; }

        /// <summary>
        /// Gets or Sets RDCControllerCapable
        /// </summary>
        [DataMember(Name="RDCControllerCapable", EmitDefaultValue=false)]
        public string RDCControllerCapable { get; set; }

        /// <summary>
        /// Gets or Sets RDCControlleeCapable
        /// </summary>
        [DataMember(Name="RDCControlleeCapable", EmitDefaultValue=false)]
        public string RDCControlleeCapable { get; set; }

        /// <summary>
        /// Gets or Sets Connections
        /// </summary>
        [DataMember(Name="connections", EmitDefaultValue=false)]
        public List<EndpointsInnerConnections> Connections { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EndpointsInner {\n");
            sb.Append("  Meetingid: ").Append(Meetingid).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  CallQuality: ").Append(CallQuality).Append("\n");
            sb.Append("  Leader: ").Append(Leader).Append("\n");
            sb.Append("  Callguid: ").Append(Callguid).Append("\n");
            sb.Append("  Endpoint: ").Append(Endpoint).Append("\n");
            sb.Append("  TalkDetected: ").Append(TalkDetected).Append("\n");
            sb.Append("  SecureCall: ").Append(SecureCall).Append("\n");
            sb.Append("  Layout: ").Append(Layout).Append("\n");
            sb.Append("  SubLayout: ").Append(SubLayout).Append("\n");
            sb.Append("  VideoRecv: ").Append(VideoRecv).Append("\n");
            sb.Append("  VideoRecvLocalMute: ").Append(VideoRecvLocalMute).Append("\n");
            sb.Append("  VideoRecvRemoteMute: ").Append(VideoRecvRemoteMute).Append("\n");
            sb.Append("  AudioRecv: ").Append(AudioRecv).Append("\n");
            sb.Append("  AudioRecvLocalMute: ").Append(AudioRecvLocalMute).Append("\n");
            sb.Append("  AudioRecvRemoteMute: ").Append(AudioRecvRemoteMute).Append("\n");
            sb.Append("  AudioRecvCodec: ").Append(AudioRecvCodec).Append("\n");
            sb.Append("  AudioSendCodec: ").Append(AudioSendCodec).Append("\n");
            sb.Append("  VideoRecvCodec: ").Append(VideoRecvCodec).Append("\n");
            sb.Append("  VideoRecvHeight: ").Append(VideoRecvHeight).Append("\n");
            sb.Append("  VideoRecvWidth: ").Append(VideoRecvWidth).Append("\n");
            sb.Append("  VideoSendCodec: ").Append(VideoSendCodec).Append("\n");
            sb.Append("  VideoSendHeight: ").Append(VideoSendHeight).Append("\n");
            sb.Append("  VideoSendWidth: ").Append(VideoSendWidth).Append("\n");
            sb.Append("  Visibility: ").Append(Visibility).Append("\n");
            sb.Append("  ChatEndpointGuid: ").Append(ChatEndpointGuid).Append("\n");
            sb.Append("  EndpointGuid: ").Append(EndpointGuid).Append("\n");
            sb.Append("  RDCVersion: ").Append(RDCVersion).Append("\n");
            sb.Append("  RDCControllerCapable: ").Append(RDCControllerCapable).Append("\n");
            sb.Append("  RDCControlleeCapable: ").Append(RDCControlleeCapable).Append("\n");
            sb.Append("  Connections: ").Append(Connections).Append("\n");
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
            return this.Equals(input as EndpointsInner);
        }

        /// <summary>
        /// Returns true if EndpointsInner instances are equal
        /// </summary>
        /// <param name="input">Instance of EndpointsInner to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EndpointsInner input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Meetingid == input.Meetingid ||
                    (this.Meetingid != null &&
                    this.Meetingid.Equals(input.Meetingid))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.CallQuality == input.CallQuality ||
                    (this.CallQuality != null &&
                    this.CallQuality.Equals(input.CallQuality))
                ) && 
                (
                    this.Leader == input.Leader ||
                    (this.Leader != null &&
                    this.Leader.Equals(input.Leader))
                ) && 
                (
                    this.Callguid == input.Callguid ||
                    (this.Callguid != null &&
                    this.Callguid.Equals(input.Callguid))
                ) && 
                (
                    this.Endpoint == input.Endpoint ||
                    (this.Endpoint != null &&
                    this.Endpoint.Equals(input.Endpoint))
                ) && 
                (
                    this.TalkDetected == input.TalkDetected ||
                    (this.TalkDetected != null &&
                    this.TalkDetected.Equals(input.TalkDetected))
                ) && 
                (
                    this.SecureCall == input.SecureCall ||
                    (this.SecureCall != null &&
                    this.SecureCall.Equals(input.SecureCall))
                ) && 
                (
                    this.Layout == input.Layout ||
                    (this.Layout != null &&
                    this.Layout.Equals(input.Layout))
                ) && 
                (
                    this.SubLayout == input.SubLayout ||
                    (this.SubLayout != null &&
                    this.SubLayout.Equals(input.SubLayout))
                ) && 
                (
                    this.VideoRecv == input.VideoRecv ||
                    (this.VideoRecv != null &&
                    this.VideoRecv.Equals(input.VideoRecv))
                ) && 
                (
                    this.VideoRecvLocalMute == input.VideoRecvLocalMute ||
                    (this.VideoRecvLocalMute != null &&
                    this.VideoRecvLocalMute.Equals(input.VideoRecvLocalMute))
                ) && 
                (
                    this.VideoRecvRemoteMute == input.VideoRecvRemoteMute ||
                    (this.VideoRecvRemoteMute != null &&
                    this.VideoRecvRemoteMute.Equals(input.VideoRecvRemoteMute))
                ) && 
                (
                    this.AudioRecv == input.AudioRecv ||
                    (this.AudioRecv != null &&
                    this.AudioRecv.Equals(input.AudioRecv))
                ) && 
                (
                    this.AudioRecvLocalMute == input.AudioRecvLocalMute ||
                    (this.AudioRecvLocalMute != null &&
                    this.AudioRecvLocalMute.Equals(input.AudioRecvLocalMute))
                ) && 
                (
                    this.AudioRecvRemoteMute == input.AudioRecvRemoteMute ||
                    (this.AudioRecvRemoteMute != null &&
                    this.AudioRecvRemoteMute.Equals(input.AudioRecvRemoteMute))
                ) && 
                (
                    this.AudioRecvCodec == input.AudioRecvCodec ||
                    (this.AudioRecvCodec != null &&
                    this.AudioRecvCodec.Equals(input.AudioRecvCodec))
                ) && 
                (
                    this.AudioSendCodec == input.AudioSendCodec ||
                    (this.AudioSendCodec != null &&
                    this.AudioSendCodec.Equals(input.AudioSendCodec))
                ) && 
                (
                    this.VideoRecvCodec == input.VideoRecvCodec ||
                    (this.VideoRecvCodec != null &&
                    this.VideoRecvCodec.Equals(input.VideoRecvCodec))
                ) && 
                (
                    this.VideoRecvHeight == input.VideoRecvHeight ||
                    (this.VideoRecvHeight != null &&
                    this.VideoRecvHeight.Equals(input.VideoRecvHeight))
                ) && 
                (
                    this.VideoRecvWidth == input.VideoRecvWidth ||
                    (this.VideoRecvWidth != null &&
                    this.VideoRecvWidth.Equals(input.VideoRecvWidth))
                ) && 
                (
                    this.VideoSendCodec == input.VideoSendCodec ||
                    (this.VideoSendCodec != null &&
                    this.VideoSendCodec.Equals(input.VideoSendCodec))
                ) && 
                (
                    this.VideoSendHeight == input.VideoSendHeight ||
                    (this.VideoSendHeight != null &&
                    this.VideoSendHeight.Equals(input.VideoSendHeight))
                ) && 
                (
                    this.VideoSendWidth == input.VideoSendWidth ||
                    (this.VideoSendWidth != null &&
                    this.VideoSendWidth.Equals(input.VideoSendWidth))
                ) && 
                (
                    this.Visibility == input.Visibility ||
                    (this.Visibility != null &&
                    this.Visibility.Equals(input.Visibility))
                ) && 
                (
                    this.ChatEndpointGuid == input.ChatEndpointGuid ||
                    (this.ChatEndpointGuid != null &&
                    this.ChatEndpointGuid.Equals(input.ChatEndpointGuid))
                ) && 
                (
                    this.EndpointGuid == input.EndpointGuid ||
                    (this.EndpointGuid != null &&
                    this.EndpointGuid.Equals(input.EndpointGuid))
                ) && 
                (
                    this.RDCVersion == input.RDCVersion ||
                    (this.RDCVersion != null &&
                    this.RDCVersion.Equals(input.RDCVersion))
                ) && 
                (
                    this.RDCControllerCapable == input.RDCControllerCapable ||
                    (this.RDCControllerCapable != null &&
                    this.RDCControllerCapable.Equals(input.RDCControllerCapable))
                ) && 
                (
                    this.RDCControlleeCapable == input.RDCControlleeCapable ||
                    (this.RDCControlleeCapable != null &&
                    this.RDCControlleeCapable.Equals(input.RDCControlleeCapable))
                ) && 
                (
                    this.Connections == input.Connections ||
                    this.Connections != null &&
                    this.Connections.SequenceEqual(input.Connections)
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
                if (this.Meetingid != null)
                    hashCode = hashCode * 59 + this.Meetingid.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.CallQuality != null)
                    hashCode = hashCode * 59 + this.CallQuality.GetHashCode();
                if (this.Leader != null)
                    hashCode = hashCode * 59 + this.Leader.GetHashCode();
                if (this.Callguid != null)
                    hashCode = hashCode * 59 + this.Callguid.GetHashCode();
                if (this.Endpoint != null)
                    hashCode = hashCode * 59 + this.Endpoint.GetHashCode();
                if (this.TalkDetected != null)
                    hashCode = hashCode * 59 + this.TalkDetected.GetHashCode();
                if (this.SecureCall != null)
                    hashCode = hashCode * 59 + this.SecureCall.GetHashCode();
                if (this.Layout != null)
                    hashCode = hashCode * 59 + this.Layout.GetHashCode();
                if (this.SubLayout != null)
                    hashCode = hashCode * 59 + this.SubLayout.GetHashCode();
                if (this.VideoRecv != null)
                    hashCode = hashCode * 59 + this.VideoRecv.GetHashCode();
                if (this.VideoRecvLocalMute != null)
                    hashCode = hashCode * 59 + this.VideoRecvLocalMute.GetHashCode();
                if (this.VideoRecvRemoteMute != null)
                    hashCode = hashCode * 59 + this.VideoRecvRemoteMute.GetHashCode();
                if (this.AudioRecv != null)
                    hashCode = hashCode * 59 + this.AudioRecv.GetHashCode();
                if (this.AudioRecvLocalMute != null)
                    hashCode = hashCode * 59 + this.AudioRecvLocalMute.GetHashCode();
                if (this.AudioRecvRemoteMute != null)
                    hashCode = hashCode * 59 + this.AudioRecvRemoteMute.GetHashCode();
                if (this.AudioRecvCodec != null)
                    hashCode = hashCode * 59 + this.AudioRecvCodec.GetHashCode();
                if (this.AudioSendCodec != null)
                    hashCode = hashCode * 59 + this.AudioSendCodec.GetHashCode();
                if (this.VideoRecvCodec != null)
                    hashCode = hashCode * 59 + this.VideoRecvCodec.GetHashCode();
                if (this.VideoRecvHeight != null)
                    hashCode = hashCode * 59 + this.VideoRecvHeight.GetHashCode();
                if (this.VideoRecvWidth != null)
                    hashCode = hashCode * 59 + this.VideoRecvWidth.GetHashCode();
                if (this.VideoSendCodec != null)
                    hashCode = hashCode * 59 + this.VideoSendCodec.GetHashCode();
                if (this.VideoSendHeight != null)
                    hashCode = hashCode * 59 + this.VideoSendHeight.GetHashCode();
                if (this.VideoSendWidth != null)
                    hashCode = hashCode * 59 + this.VideoSendWidth.GetHashCode();
                if (this.Visibility != null)
                    hashCode = hashCode * 59 + this.Visibility.GetHashCode();
                if (this.ChatEndpointGuid != null)
                    hashCode = hashCode * 59 + this.ChatEndpointGuid.GetHashCode();
                if (this.EndpointGuid != null)
                    hashCode = hashCode * 59 + this.EndpointGuid.GetHashCode();
                if (this.RDCVersion != null)
                    hashCode = hashCode * 59 + this.RDCVersion.GetHashCode();
                if (this.RDCControllerCapable != null)
                    hashCode = hashCode * 59 + this.RDCControllerCapable.GetHashCode();
                if (this.RDCControlleeCapable != null)
                    hashCode = hashCode * 59 + this.RDCControlleeCapable.GetHashCode();
                if (this.Connections != null)
                    hashCode = hashCode * 59 + this.Connections.GetHashCode();
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
