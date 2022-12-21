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
 * V1alpha1HostInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1HostInfo  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("resourcesInfo")
  @Valid
  private List<V1alpha1HostResourceInfo> resourcesInfo = null;

  @JsonProperty("systemInfo")
  private V1NodeSystemInfo systemInfo = null;

  public V1alpha1HostInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1alpha1HostInfo resourcesInfo(List<V1alpha1HostResourceInfo> resourcesInfo) {
    this.resourcesInfo = resourcesInfo;
    return this;
  }

  public V1alpha1HostInfo addResourcesInfoItem(V1alpha1HostResourceInfo resourcesInfoItem) {
    if (this.resourcesInfo == null) {
      this.resourcesInfo = new ArrayList<>();
    }
    this.resourcesInfo.add(resourcesInfoItem);
    return this;
  }

  /**
   * Get resourcesInfo
   * @return resourcesInfo
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1HostResourceInfo> getResourcesInfo() {
    return resourcesInfo;
  }

  public void setResourcesInfo(List<V1alpha1HostResourceInfo> resourcesInfo) {
    this.resourcesInfo = resourcesInfo;
  }

  public V1alpha1HostInfo systemInfo(V1NodeSystemInfo systemInfo) {
    this.systemInfo = systemInfo;
    return this;
  }

  /**
   * Get systemInfo
   * @return systemInfo
   **/
  @Schema(description = "")
  
    @Valid
    public V1NodeSystemInfo getSystemInfo() {
    return systemInfo;
  }

  public void setSystemInfo(V1NodeSystemInfo systemInfo) {
    this.systemInfo = systemInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1HostInfo v1alpha1HostInfo = (V1alpha1HostInfo) o;
    return Objects.equals(this.name, v1alpha1HostInfo.name) &&
        Objects.equals(this.resourcesInfo, v1alpha1HostInfo.resourcesInfo) &&
        Objects.equals(this.systemInfo, v1alpha1HostInfo.systemInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, resourcesInfo, systemInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1HostInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourcesInfo: ").append(toIndentedString(resourcesInfo)).append("\n");
    sb.append("    systemInfo: ").append(toIndentedString(systemInfo)).append("\n");
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
