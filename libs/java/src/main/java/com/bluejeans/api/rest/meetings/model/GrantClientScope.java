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
import com.bluejeans.api.rest.meetings.model.Partition;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GrantClientScope
 */

public class GrantClientScope {
  @SerializedName("enterprise")
  private Integer enterprise = null;

  @SerializedName("partitionName")
  private String partitionName = null;

  @SerializedName("partition")
  private Partition partition = null;

  public GrantClientScope enterprise(Integer enterprise) {
    this.enterprise = enterprise;
    return this;
  }

   /**
   * The ID of your enterprise.
   * @return enterprise
  **/
  @ApiModelProperty(value = "The ID of your enterprise.")
  public Integer getEnterprise() {
    return enterprise;
  }

  public void setEnterprise(Integer enterprise) {
    this.enterprise = enterprise;
  }

  public GrantClientScope partitionName(String partitionName) {
    this.partitionName = partitionName;
    return this;
  }

   /**
   * The name of the partition you are on.
   * @return partitionName
  **/
  @ApiModelProperty(value = "The name of the partition you are on.")
  public String getPartitionName() {
    return partitionName;
  }

  public void setPartitionName(String partitionName) {
    this.partitionName = partitionName;
  }

  public GrantClientScope partition(Partition partition) {
    this.partition = partition;
    return this;
  }

   /**
   * Get partition
   * @return partition
  **/
  @ApiModelProperty(value = "")
  public Partition getPartition() {
    return partition;
  }

  public void setPartition(Partition partition) {
    this.partition = partition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrantClientScope grantClientScope = (GrantClientScope) o;
    return Objects.equals(this.enterprise, grantClientScope.enterprise) &&
        Objects.equals(this.partitionName, grantClientScope.partitionName) &&
        Objects.equals(this.partition, grantClientScope.partition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enterprise, partitionName, partition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrantClientScope {\n");
    
    sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
    sb.append("    partitionName: ").append(toIndentedString(partitionName)).append("\n");
    sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
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

