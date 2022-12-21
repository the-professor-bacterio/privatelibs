package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1HostResourceInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1HostResourceInfo  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("capacity")
  private String capacity = null;

  @JsonProperty("requestedByApp")
  private String requestedByApp = null;

  @JsonProperty("requestedByNeighbors")
  private String requestedByNeighbors = null;

  @JsonProperty("resourceName")
  private String resourceName = null;

  public V1alpha1HostResourceInfo capacity(String capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * Get capacity
   * @return capacity
   **/
  @Schema(description = "")
  
    public String getCapacity() {
    return capacity;
  }

  public void setCapacity(String capacity) {
    this.capacity = capacity;
  }

  public V1alpha1HostResourceInfo requestedByApp(String requestedByApp) {
    this.requestedByApp = requestedByApp;
    return this;
  }

  /**
   * Get requestedByApp
   * @return requestedByApp
   **/
  @Schema(description = "")
  
    public String getRequestedByApp() {
    return requestedByApp;
  }

  public void setRequestedByApp(String requestedByApp) {
    this.requestedByApp = requestedByApp;
  }

  public V1alpha1HostResourceInfo requestedByNeighbors(String requestedByNeighbors) {
    this.requestedByNeighbors = requestedByNeighbors;
    return this;
  }

  /**
   * Get requestedByNeighbors
   * @return requestedByNeighbors
   **/
  @Schema(description = "")
  
    public String getRequestedByNeighbors() {
    return requestedByNeighbors;
  }

  public void setRequestedByNeighbors(String requestedByNeighbors) {
    this.requestedByNeighbors = requestedByNeighbors;
  }

  public V1alpha1HostResourceInfo resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * Get resourceName
   * @return resourceName
   **/
  @Schema(description = "")
  
    public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1HostResourceInfo v1alpha1HostResourceInfo = (V1alpha1HostResourceInfo) o;
    return Objects.equals(this.capacity, v1alpha1HostResourceInfo.capacity) &&
        Objects.equals(this.requestedByApp, v1alpha1HostResourceInfo.requestedByApp) &&
        Objects.equals(this.requestedByNeighbors, v1alpha1HostResourceInfo.requestedByNeighbors) &&
        Objects.equals(this.resourceName, v1alpha1HostResourceInfo.resourceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacity, requestedByApp, requestedByNeighbors, resourceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1HostResourceInfo {\n");
    
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    requestedByApp: ").append(toIndentedString(requestedByApp)).append("\n");
    sb.append("    requestedByNeighbors: ").append(toIndentedString(requestedByNeighbors)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
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
