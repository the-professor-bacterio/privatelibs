package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1ClusterCacheInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ClusterCacheInfo  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("apisCount")
  private String apisCount = null;

  @JsonProperty("lastCacheSyncTime")
  private V1Time lastCacheSyncTime = null;

  @JsonProperty("resourcesCount")
  private String resourcesCount = null;

  public V1alpha1ClusterCacheInfo apisCount(String apisCount) {
    this.apisCount = apisCount;
    return this;
  }

  /**
   * Get apisCount
   * @return apisCount
   **/
  @Schema(description = "")
  
    public String getApisCount() {
    return apisCount;
  }

  public void setApisCount(String apisCount) {
    this.apisCount = apisCount;
  }

  public V1alpha1ClusterCacheInfo lastCacheSyncTime(V1Time lastCacheSyncTime) {
    this.lastCacheSyncTime = lastCacheSyncTime;
    return this;
  }

  /**
   * Get lastCacheSyncTime
   * @return lastCacheSyncTime
   **/
  @Schema(description = "")
  
    @Valid
    public V1Time getLastCacheSyncTime() {
    return lastCacheSyncTime;
  }

  public void setLastCacheSyncTime(V1Time lastCacheSyncTime) {
    this.lastCacheSyncTime = lastCacheSyncTime;
  }

  public V1alpha1ClusterCacheInfo resourcesCount(String resourcesCount) {
    this.resourcesCount = resourcesCount;
    return this;
  }

  /**
   * Get resourcesCount
   * @return resourcesCount
   **/
  @Schema(description = "")
  
    public String getResourcesCount() {
    return resourcesCount;
  }

  public void setResourcesCount(String resourcesCount) {
    this.resourcesCount = resourcesCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterCacheInfo v1alpha1ClusterCacheInfo = (V1alpha1ClusterCacheInfo) o;
    return Objects.equals(this.apisCount, v1alpha1ClusterCacheInfo.apisCount) &&
        Objects.equals(this.lastCacheSyncTime, v1alpha1ClusterCacheInfo.lastCacheSyncTime) &&
        Objects.equals(this.resourcesCount, v1alpha1ClusterCacheInfo.resourcesCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apisCount, lastCacheSyncTime, resourcesCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterCacheInfo {\n");
    
    sb.append("    apisCount: ").append(toIndentedString(apisCount)).append("\n");
    sb.append("    lastCacheSyncTime: ").append(toIndentedString(lastCacheSyncTime)).append("\n");
    sb.append("    resourcesCount: ").append(toIndentedString(resourcesCount)).append("\n");
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
