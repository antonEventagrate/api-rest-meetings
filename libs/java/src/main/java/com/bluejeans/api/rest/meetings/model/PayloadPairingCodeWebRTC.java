/*
 * BlueJeans Meetings REST API
 *  ## Video That Works Where You Do. <p>This site provides developers access to APIs from BlueJean's Meetings meeting service.  From here you can see and try actual API calls to manage User Accounts, Meetings, and Recordings, pull Analytical Data and Current State information.</p>    <nosdk> <hr> <div> <div class=\"key\">     <a href=\"./basics.html\" target=\"_\"><img class=\"keyimg\" src=\"./img/bjnmeeting.png\"/></a> </div> <div class=\"keybox\"> Basic instructions about What is a BlueJeans Meeting, and Getting Started Using API's, are <a href=\"./basics.html\" target=\"_blank\">available here <i class=\"glyphicon glyphicon-new-window\"></i></a>. </div> </div> <hr> <alert>2/21/2019</alert> Change response of Change layout and Endpoint API's to 204<br/> 12/03/2018 Add API for setting user profile photograph.<br/> 10/17/2018 Updated API field definitions for time variables to be 64-bit .<br/> 7/23/2018 Corrected errors in API definition file.<br/> 7/10/2018 Deprecated some Command Center API's.  Exposed API's that Summarize usage.<br/> 7/06/2018 Added API for changing ownership of recordings.<br/> 6/28/2018 Restored Create Enterprise Account, added Enterprise and User Profile Tag API's.<br/> 6/01/2018 Clarified Access Token requirements for meeting endpoint API's.<br/> 5/21/2018 Corrected return model for meeting history call.<br/> </nosdk> <hr> 
 *
 * OpenAPI spec version: 1.0.4402212019
 * Contact: glenn@bluejeans.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.bluejeans.api.rest.meetings.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PayloadPairingCodeWebRTC
 */

public class PayloadPairingCodeWebRTC {
  /**
   * Type of physical device is pairing.
   */
  @JsonAdapter(EndpointTypeEnum.Adapter.class)
  public enum EndpointTypeEnum {
    GENERIC("GENERIC"),
    
    LYNC("LYNC"),
    
    JABBER("JABBER"),
    
    BLUEJEANSBROWSERENDPOINT("BlueJeansBrowserEndpoint"),
    
    BLUEJEANSMOBILEENDPOINT("BlueJeansMobileEndpoint"),
    
    WRANGLERSKYPEENDPOINT("WranglerSkypeEndpoint"),
    
    PSTN("PSTN"),
    
    DCPAUDIOONLY("DCPAudioOnly");

    private String value;

    EndpointTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EndpointTypeEnum fromValue(String text) {
      for (EndpointTypeEnum b : EndpointTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EndpointTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EndpointTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EndpointTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EndpointTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("endpointType")
  private EndpointTypeEnum endpointType = null;

  @SerializedName("userId")
  private Integer userId = null;

  /**
   * Gets or Sets languageCode
   */
  @JsonAdapter(LanguageCodeEnum.Adapter.class)
  public enum LanguageCodeEnum {
    EN("en");

    private String value;

    LanguageCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LanguageCodeEnum fromValue(String text) {
      for (LanguageCodeEnum b : LanguageCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LanguageCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LanguageCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LanguageCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LanguageCodeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("languageCode")
  private LanguageCodeEnum languageCode = null;

  /**
   * Gets or Sets capabilities
   */
  @JsonAdapter(CapabilitiesEnum.Adapter.class)
  public enum CapabilitiesEnum {
    AUDIO("AUDIO"),
    
    VIDEO("VIDEO"),
    
    CONTENT("CONTENT");

    private String value;

    CapabilitiesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CapabilitiesEnum fromValue(String text) {
      for (CapabilitiesEnum b : CapabilitiesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CapabilitiesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CapabilitiesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CapabilitiesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CapabilitiesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("capabilities")
  private List<CapabilitiesEnum> capabilities = null;

  public PayloadPairingCodeWebRTC endpointType(EndpointTypeEnum endpointType) {
    this.endpointType = endpointType;
    return this;
  }

   /**
   * Type of physical device is pairing.
   * @return endpointType
  **/
  @ApiModelProperty(value = "Type of physical device is pairing.")
  public EndpointTypeEnum getEndpointType() {
    return endpointType;
  }

  public void setEndpointType(EndpointTypeEnum endpointType) {
    this.endpointType = endpointType;
  }

  public PayloadPairingCodeWebRTC userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public PayloadPairingCodeWebRTC languageCode(LanguageCodeEnum languageCode) {
    this.languageCode = languageCode;
    return this;
  }

   /**
   * Get languageCode
   * @return languageCode
  **/
  @ApiModelProperty(value = "")
  public LanguageCodeEnum getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(LanguageCodeEnum languageCode) {
    this.languageCode = languageCode;
  }

  public PayloadPairingCodeWebRTC capabilities(List<CapabilitiesEnum> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public PayloadPairingCodeWebRTC addCapabilitiesItem(CapabilitiesEnum capabilitiesItem) {
    if (this.capabilities == null) {
      this.capabilities = new ArrayList<CapabilitiesEnum>();
    }
    this.capabilities.add(capabilitiesItem);
    return this;
  }

   /**
   * Reserved for future use. Pass just an empty array for now. No parameters are currently accepted.
   * @return capabilities
  **/
  @ApiModelProperty(value = "Reserved for future use. Pass just an empty array for now. No parameters are currently accepted.")
  public List<CapabilitiesEnum> getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(List<CapabilitiesEnum> capabilities) {
    this.capabilities = capabilities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadPairingCodeWebRTC payloadPairingCodeWebRTC = (PayloadPairingCodeWebRTC) o;
    return Objects.equals(this.endpointType, payloadPairingCodeWebRTC.endpointType) &&
        Objects.equals(this.userId, payloadPairingCodeWebRTC.userId) &&
        Objects.equals(this.languageCode, payloadPairingCodeWebRTC.languageCode) &&
        Objects.equals(this.capabilities, payloadPairingCodeWebRTC.capabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointType, userId, languageCode, capabilities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadPairingCodeWebRTC {\n");
    
    sb.append("    endpointType: ").append(toIndentedString(endpointType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
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

