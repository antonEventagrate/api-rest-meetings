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

/**
 * CountriesCountRec
 */

public class CountriesCountRec {
  @SerializedName("country_count")
  private Integer countryCount = null;

  @SerializedName("city_count")
  private Integer cityCount = null;

  public CountriesCountRec countryCount(Integer countryCount) {
    this.countryCount = countryCount;
    return this;
  }

   /**
   * The number of country records contained in the report
   * @return countryCount
  **/
  @ApiModelProperty(value = "The number of country records contained in the report")
  public Integer getCountryCount() {
    return countryCount;
  }

  public void setCountryCount(Integer countryCount) {
    this.countryCount = countryCount;
  }

  public CountriesCountRec cityCount(Integer cityCount) {
    this.cityCount = cityCount;
    return this;
  }

   /**
   * The number of cities represented in the report
   * @return cityCount
  **/
  @ApiModelProperty(value = "The number of cities represented in the report")
  public Integer getCityCount() {
    return cityCount;
  }

  public void setCityCount(Integer cityCount) {
    this.cityCount = cityCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountriesCountRec countriesCountRec = (CountriesCountRec) o;
    return Objects.equals(this.countryCount, countriesCountRec.countryCount) &&
        Objects.equals(this.cityCount, countriesCountRec.cityCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCount, cityCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountriesCountRec {\n");
    
    sb.append("    countryCount: ").append(toIndentedString(countryCount)).append("\n");
    sb.append("    cityCount: ").append(toIndentedString(cityCount)).append("\n");
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

