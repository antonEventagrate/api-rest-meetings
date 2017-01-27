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
import io.swagger.client.model.ContentContentProperties;


/**
 * Content
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-27T15:40:39.680-07:00")
public class Content   {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("contentType")
  private String contentType = null;

  @SerializedName("contentDescription")
  private String contentDescription = null;

  @SerializedName("contentUrl")
  private String contentUrl = null;

  @SerializedName("userId")
  private Integer userId = null;

  @SerializedName("contentLocation")
  private String contentLocation = null;

  @SerializedName("created")
  private Integer created = null;

  @SerializedName("modified")
  private Integer modified = null;

  @SerializedName("contentStatus")
  private String contentStatus = null;

  @SerializedName("contentName")
  private String contentName = null;

  @SerializedName("contentCategory")
  private String contentCategory = null;

  @SerializedName("contentSize")
  private Integer contentSize = null;

  @SerializedName("contentDuration")
  private Integer contentDuration = null;

  @SerializedName("contentProperties")
  private ContentContentProperties contentProperties = null;

  public Content id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Content contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public Content contentDescription(String contentDescription) {
    this.contentDescription = contentDescription;
    return this;
  }

   /**
   * Get contentDescription
   * @return contentDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContentDescription() {
    return contentDescription;
  }

  public void setContentDescription(String contentDescription) {
    this.contentDescription = contentDescription;
  }

  public Content contentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
    return this;
  }

   /**
   * Get contentUrl
   * @return contentUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContentUrl() {
    return contentUrl;
  }

  public void setContentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
  }

  public Content userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Content contentLocation(String contentLocation) {
    this.contentLocation = contentLocation;
    return this;
  }

   /**
   * Get contentLocation
   * @return contentLocation
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContentLocation() {
    return contentLocation;
  }

  public void setContentLocation(String contentLocation) {
    this.contentLocation = contentLocation;
  }

  public Content created(Integer created) {
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

  public Content modified(Integer modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Get modified
   * @return modified
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getModified() {
    return modified;
  }

  public void setModified(Integer modified) {
    this.modified = modified;
  }

  public Content contentStatus(String contentStatus) {
    this.contentStatus = contentStatus;
    return this;
  }

   /**
   * Get contentStatus
   * @return contentStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContentStatus() {
    return contentStatus;
  }

  public void setContentStatus(String contentStatus) {
    this.contentStatus = contentStatus;
  }

  public Content contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

   /**
   * Get contentName
   * @return contentName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContentName() {
    return contentName;
  }

  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  public Content contentCategory(String contentCategory) {
    this.contentCategory = contentCategory;
    return this;
  }

   /**
   * Get contentCategory
   * @return contentCategory
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContentCategory() {
    return contentCategory;
  }

  public void setContentCategory(String contentCategory) {
    this.contentCategory = contentCategory;
  }

  public Content contentSize(Integer contentSize) {
    this.contentSize = contentSize;
    return this;
  }

   /**
   * Get contentSize
   * @return contentSize
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getContentSize() {
    return contentSize;
  }

  public void setContentSize(Integer contentSize) {
    this.contentSize = contentSize;
  }

  public Content contentDuration(Integer contentDuration) {
    this.contentDuration = contentDuration;
    return this;
  }

   /**
   * Get contentDuration
   * @return contentDuration
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getContentDuration() {
    return contentDuration;
  }

  public void setContentDuration(Integer contentDuration) {
    this.contentDuration = contentDuration;
  }

  public Content contentProperties(ContentContentProperties contentProperties) {
    this.contentProperties = contentProperties;
    return this;
  }

   /**
   * Get contentProperties
   * @return contentProperties
  **/
  @ApiModelProperty(example = "null", value = "")
  public ContentContentProperties getContentProperties() {
    return contentProperties;
  }

  public void setContentProperties(ContentContentProperties contentProperties) {
    this.contentProperties = contentProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Content content = (Content) o;
    return Objects.equals(this.id, content.id) &&
        Objects.equals(this.contentType, content.contentType) &&
        Objects.equals(this.contentDescription, content.contentDescription) &&
        Objects.equals(this.contentUrl, content.contentUrl) &&
        Objects.equals(this.userId, content.userId) &&
        Objects.equals(this.contentLocation, content.contentLocation) &&
        Objects.equals(this.created, content.created) &&
        Objects.equals(this.modified, content.modified) &&
        Objects.equals(this.contentStatus, content.contentStatus) &&
        Objects.equals(this.contentName, content.contentName) &&
        Objects.equals(this.contentCategory, content.contentCategory) &&
        Objects.equals(this.contentSize, content.contentSize) &&
        Objects.equals(this.contentDuration, content.contentDuration) &&
        Objects.equals(this.contentProperties, content.contentProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contentType, contentDescription, contentUrl, userId, contentLocation, created, modified, contentStatus, contentName, contentCategory, contentSize, contentDuration, contentProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Content {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    contentDescription: ").append(toIndentedString(contentDescription)).append("\n");
    sb.append("    contentUrl: ").append(toIndentedString(contentUrl)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    contentLocation: ").append(toIndentedString(contentLocation)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    contentStatus: ").append(toIndentedString(contentStatus)).append("\n");
    sb.append("    contentName: ").append(toIndentedString(contentName)).append("\n");
    sb.append("    contentCategory: ").append(toIndentedString(contentCategory)).append("\n");
    sb.append("    contentSize: ").append(toIndentedString(contentSize)).append("\n");
    sb.append("    contentDuration: ").append(toIndentedString(contentDuration)).append("\n");
    sb.append("    contentProperties: ").append(toIndentedString(contentProperties)).append("\n");
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
