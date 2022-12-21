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
 * V1alpha1ResourceNode
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ResourceNode  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("createdAt")
  private V1Time createdAt = null;

  @JsonProperty("health")
  private V1alpha1HealthStatus health = null;

  @JsonProperty("images")
  @Valid
  private List<String> images = null;

  @JsonProperty("info")
  @Valid
  private List<V1alpha1InfoItem> info = null;

  @JsonProperty("networkingInfo")
  private V1alpha1ResourceNetworkingInfo networkingInfo = null;

  @JsonProperty("parentRefs")
  @Valid
  private List<V1alpha1ResourceRef> parentRefs = null;

  @JsonProperty("resourceRef")
  private V1alpha1ResourceRef resourceRef = null;

  @JsonProperty("resourceVersion")
  private String resourceVersion = null;

  public V1alpha1ResourceNode createdAt(V1Time createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   **/
  @Schema(description = "")
  
    @Valid
    public V1Time getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(V1Time createdAt) {
    this.createdAt = createdAt;
  }

  public V1alpha1ResourceNode health(V1alpha1HealthStatus health) {
    this.health = health;
    return this;
  }

  /**
   * Get health
   * @return health
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1HealthStatus getHealth() {
    return health;
  }

  public void setHealth(V1alpha1HealthStatus health) {
    this.health = health;
  }

  public V1alpha1ResourceNode images(List<String> images) {
    this.images = images;
    return this;
  }

  public V1alpha1ResourceNode addImagesItem(String imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Get images
   * @return images
   **/
  @Schema(description = "")
  
    public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }

  public V1alpha1ResourceNode info(List<V1alpha1InfoItem> info) {
    this.info = info;
    return this;
  }

  public V1alpha1ResourceNode addInfoItem(V1alpha1InfoItem infoItem) {
    if (this.info == null) {
      this.info = new ArrayList<>();
    }
    this.info.add(infoItem);
    return this;
  }

  /**
   * Get info
   * @return info
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1InfoItem> getInfo() {
    return info;
  }

  public void setInfo(List<V1alpha1InfoItem> info) {
    this.info = info;
  }

  public V1alpha1ResourceNode networkingInfo(V1alpha1ResourceNetworkingInfo networkingInfo) {
    this.networkingInfo = networkingInfo;
    return this;
  }

  /**
   * Get networkingInfo
   * @return networkingInfo
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ResourceNetworkingInfo getNetworkingInfo() {
    return networkingInfo;
  }

  public void setNetworkingInfo(V1alpha1ResourceNetworkingInfo networkingInfo) {
    this.networkingInfo = networkingInfo;
  }

  public V1alpha1ResourceNode parentRefs(List<V1alpha1ResourceRef> parentRefs) {
    this.parentRefs = parentRefs;
    return this;
  }

  public V1alpha1ResourceNode addParentRefsItem(V1alpha1ResourceRef parentRefsItem) {
    if (this.parentRefs == null) {
      this.parentRefs = new ArrayList<>();
    }
    this.parentRefs.add(parentRefsItem);
    return this;
  }

  /**
   * Get parentRefs
   * @return parentRefs
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1ResourceRef> getParentRefs() {
    return parentRefs;
  }

  public void setParentRefs(List<V1alpha1ResourceRef> parentRefs) {
    this.parentRefs = parentRefs;
  }

  public V1alpha1ResourceNode resourceRef(V1alpha1ResourceRef resourceRef) {
    this.resourceRef = resourceRef;
    return this;
  }

  /**
   * Get resourceRef
   * @return resourceRef
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ResourceRef getResourceRef() {
    return resourceRef;
  }

  public void setResourceRef(V1alpha1ResourceRef resourceRef) {
    this.resourceRef = resourceRef;
  }

  public V1alpha1ResourceNode resourceVersion(String resourceVersion) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ResourceNode v1alpha1ResourceNode = (V1alpha1ResourceNode) o;
    return Objects.equals(this.createdAt, v1alpha1ResourceNode.createdAt) &&
        Objects.equals(this.health, v1alpha1ResourceNode.health) &&
        Objects.equals(this.images, v1alpha1ResourceNode.images) &&
        Objects.equals(this.info, v1alpha1ResourceNode.info) &&
        Objects.equals(this.networkingInfo, v1alpha1ResourceNode.networkingInfo) &&
        Objects.equals(this.parentRefs, v1alpha1ResourceNode.parentRefs) &&
        Objects.equals(this.resourceRef, v1alpha1ResourceNode.resourceRef) &&
        Objects.equals(this.resourceVersion, v1alpha1ResourceNode.resourceVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, health, images, info, networkingInfo, parentRefs, resourceRef, resourceVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ResourceNode {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    networkingInfo: ").append(toIndentedString(networkingInfo)).append("\n");
    sb.append("    parentRefs: ").append(toIndentedString(parentRefs)).append("\n");
    sb.append("    resourceRef: ").append(toIndentedString(resourceRef)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
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
