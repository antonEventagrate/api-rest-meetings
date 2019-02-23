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
import com.bluejeans.api.rest.meetings.model.AnalyticsEndpointDistributionV2DistributionNew;
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
 * AnalyticsEndpointDistributionV2
 */

public class AnalyticsEndpointDistributionV2 {
  @SerializedName("distribution_new")
  private List<AnalyticsEndpointDistributionV2DistributionNew> distributionNew = null;

  public AnalyticsEndpointDistributionV2 distributionNew(List<AnalyticsEndpointDistributionV2DistributionNew> distributionNew) {
    this.distributionNew = distributionNew;
    return this;
  }

  public AnalyticsEndpointDistributionV2 addDistributionNewItem(AnalyticsEndpointDistributionV2DistributionNew distributionNewItem) {
    if (this.distributionNew == null) {
      this.distributionNew = new ArrayList<AnalyticsEndpointDistributionV2DistributionNew>();
    }
    this.distributionNew.add(distributionNewItem);
    return this;
  }

   /**
   * Get distributionNew
   * @return distributionNew
  **/
  @ApiModelProperty(value = "")
  public List<AnalyticsEndpointDistributionV2DistributionNew> getDistributionNew() {
    return distributionNew;
  }

  public void setDistributionNew(List<AnalyticsEndpointDistributionV2DistributionNew> distributionNew) {
    this.distributionNew = distributionNew;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsEndpointDistributionV2 analyticsEndpointDistributionV2 = (AnalyticsEndpointDistributionV2) o;
    return Objects.equals(this.distributionNew, analyticsEndpointDistributionV2.distributionNew);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distributionNew);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsEndpointDistributionV2 {\n");
    
    sb.append("    distributionNew: ").append(toIndentedString(distributionNew)).append("\n");
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

