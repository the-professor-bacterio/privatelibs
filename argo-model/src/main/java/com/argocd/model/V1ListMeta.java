package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * ListMeta describes metadata that synthetic resources must have, including lists and various status objects. A resource may have only one of {ObjectMeta, ListMeta}.
 */
@Schema(description = "ListMeta describes metadata that synthetic resources must have, including lists and various status objects. A resource may have only one of {ObjectMeta, ListMeta}.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1ListMeta  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("continue")
  private String _continue = null;

  @JsonProperty("remainingItemCount")
  private String remainingItemCount = null;

  @JsonProperty("resourceVersion")
  private String resourceVersion = null;

  @JsonProperty("selfLink")
  private String selfLink = null;

  public V1ListMeta _continue(String _continue) {
    this._continue = _continue;
    return this;
  }

  /**
   * continue may be set if the user set a limit on the number of items returned, and indicates that the server has more data available. The value is opaque and may be used to issue another request to the endpoint that served this list to retrieve the next set of available objects. Continuing a consistent list may not be possible if the server configuration has changed or more than a few minutes have passed. The resourceVersion field returned when using this continue value will be identical to the value in the first response, unless you have received this token from an error message.
   * @return _continue
   **/
  @Schema(description = "continue may be set if the user set a limit on the number of items returned, and indicates that the server has more data available. The value is opaque and may be used to issue another request to the endpoint that served this list to retrieve the next set of available objects. Continuing a consistent list may not be possible if the server configuration has changed or more than a few minutes have passed. The resourceVersion field returned when using this continue value will be identical to the value in the first response, unless you have received this token from an error message.")
  
    public String getContinue() {
    return _continue;
  }

  public void setContinue(String _continue) {
    this._continue = _continue;
  }

  public V1ListMeta remainingItemCount(String remainingItemCount) {
    this.remainingItemCount = remainingItemCount;
    return this;
  }

  /**
   * Get remainingItemCount
   * @return remainingItemCount
   **/
  @Schema(description = "")
  
    public String getRemainingItemCount() {
    return remainingItemCount;
  }

  public void setRemainingItemCount(String remainingItemCount) {
    this.remainingItemCount = remainingItemCount;
  }

  public V1ListMeta resourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

  /**
   * Get resourceVersion
   * @return resourceVersion
   **/
  @Schema(description = "")
  
    public String getResourceVersion() {
    return resourceVersion;
  }

  public void setResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }

  public V1ListMeta selfLink(String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * Get selfLink
   * @return selfLink
   **/
  @Schema(description = "")
  
    public String getSelfLink() {
    return selfLink;
  }

  public void setSelfLink(String selfLink) {
    this.selfLink = selfLink;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ListMeta v1ListMeta = (V1ListMeta) o;
    return Objects.equals(this._continue, v1ListMeta._continue) &&
        Objects.equals(this.remainingItemCount, v1ListMeta.remainingItemCount) &&
        Objects.equals(this.resourceVersion, v1ListMeta.resourceVersion) &&
        Objects.equals(this.selfLink, v1ListMeta.selfLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_continue, remainingItemCount, resourceVersion, selfLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ListMeta {\n");
    
    sb.append("    _continue: ").append(toIndentedString(_continue)).append("\n");
    sb.append("    remainingItemCount: ").append(toIndentedString(remainingItemCount)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
    sb.append("    selfLink: ").append(toIndentedString(selfLink)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
