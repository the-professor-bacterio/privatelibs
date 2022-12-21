package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * V1alpha1ClusterInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ClusterInfo  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("apiVersions")
  @Valid
  private List<String> apiVersions = null;

  @JsonProperty("applicationsCount")
  private String applicationsCount = null;

  @JsonProperty("cacheInfo")
  private V1alpha1ClusterCacheInfo cacheInfo = null;

  @JsonProperty("connectionState")
  private V1alpha1ConnectionState connectionState = null;

  @JsonProperty("serverVersion")
  private String serverVersion = null;

  public V1alpha1ClusterInfo apiVersions(List<String> apiVersions) {
    this.apiVersions = apiVersions;
    return this;
  }

  public V1alpha1ClusterInfo addApiVersionsItem(String apiVersionsItem) {
    if (this.apiVersions == null) {
      this.apiVersions = new ArrayList<>();
    }
    this.apiVersions.add(apiVersionsItem);
    return this;
  }

  /**
   * Get apiVersions
   * @return apiVersions
   **/
  @Schema(description = "")
  
    public List<String> getApiVersions() {
    return apiVersions;
  }

  public void setApiVersions(List<String> apiVersions) {
    this.apiVersions = apiVersions;
  }

  public V1alpha1ClusterInfo applicationsCount(String applicationsCount) {
    this.applicationsCount = applicationsCount;
    return this;
  }

  /**
   * Get applicationsCount
   * @return applicationsCount
   **/
  @Schema(description = "")
  
    public String getApplicationsCount() {
    return applicationsCount;
  }

  public void setApplicationsCount(String applicationsCount) {
    this.applicationsCount = applicationsCount;
  }

  public V1alpha1ClusterInfo cacheInfo(V1alpha1ClusterCacheInfo cacheInfo) {
    this.cacheInfo = cacheInfo;
    return this;
  }

  /**
   * Get cacheInfo
   * @return cacheInfo
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ClusterCacheInfo getCacheInfo() {
    return cacheInfo;
  }

  public void setCacheInfo(V1alpha1ClusterCacheInfo cacheInfo) {
    this.cacheInfo = cacheInfo;
  }

  public V1alpha1ClusterInfo connectionState(V1alpha1ConnectionState connectionState) {
    this.connectionState = connectionState;
    return this;
  }

  /**
   * Get connectionState
   * @return connectionState
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ConnectionState getConnectionState() {
    return connectionState;
  }

  public void setConnectionState(V1alpha1ConnectionState connectionState) {
    this.connectionState = connectionState;
  }

  public V1alpha1ClusterInfo serverVersion(String serverVersion) {
    this.serverVersion = serverVersion;
    return this;
  }

  /**
   * Get serverVersion
   * @return serverVersion
   **/
  @Schema(description = "")
  
    public String getServerVersion() {
    return serverVersion;
  }

  public void setServerVersion(String serverVersion) {
    this.serverVersion = serverVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterInfo v1alpha1ClusterInfo = (V1alpha1ClusterInfo) o;
    return Objects.equals(this.apiVersions, v1alpha1ClusterInfo.apiVersions) &&
        Objects.equals(this.applicationsCount, v1alpha1ClusterInfo.applicationsCount) &&
        Objects.equals(this.cacheInfo, v1alpha1ClusterInfo.cacheInfo) &&
        Objects.equals(this.connectionState, v1alpha1ClusterInfo.connectionState) &&
        Objects.equals(this.serverVersion, v1alpha1ClusterInfo.serverVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersions, applicationsCount, cacheInfo, connectionState, serverVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterInfo {\n");
    
    sb.append("    apiVersions: ").append(toIndentedString(apiVersions)).append("\n");
    sb.append("    applicationsCount: ").append(toIndentedString(applicationsCount)).append("\n");
    sb.append("    cacheInfo: ").append(toIndentedString(cacheInfo)).append("\n");
    sb.append("    connectionState: ").append(toIndentedString(connectionState)).append("\n");
    sb.append("    serverVersion: ").append(toIndentedString(serverVersion)).append("\n");
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
