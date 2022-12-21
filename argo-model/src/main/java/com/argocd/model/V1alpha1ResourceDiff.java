package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1ResourceDiff
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ResourceDiff  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("diff")
  private String diff = null;

  @JsonProperty("group")
  private String group = null;

  @JsonProperty("hook")
  private Boolean hook = null;

  @JsonProperty("kind")
  private String kind = null;

  @JsonProperty("liveState")
  private String liveState = null;

  @JsonProperty("modified")
  private Boolean modified = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("namespace")
  private String namespace = null;

  @JsonProperty("normalizedLiveState")
  private String normalizedLiveState = null;

  @JsonProperty("predictedLiveState")
  private String predictedLiveState = null;

  @JsonProperty("resourceVersion")
  private String resourceVersion = null;

  @JsonProperty("targetState")
  private String targetState = null;

  public V1alpha1ResourceDiff diff(String diff) {
    this.diff = diff;
    return this;
  }

  /**
   * Get diff
   * @return diff
   **/
  @Schema(description = "")
  
    public String getDiff() {
    return diff;
  }

  public void setDiff(String diff) {
    this.diff = diff;
  }

  public V1alpha1ResourceDiff group(String group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
   **/
  @Schema(description = "")
  
    public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public V1alpha1ResourceDiff hook(Boolean hook) {
    this.hook = hook;
    return this;
  }

  /**
   * Get hook
   * @return hook
   **/
  @Schema(description = "")
  
    public Boolean isHook() {
    return hook;
  }

  public void setHook(Boolean hook) {
    this.hook = hook;
  }

  public V1alpha1ResourceDiff kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Get kind
   * @return kind
   **/
  @Schema(description = "")
  
    public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1alpha1ResourceDiff liveState(String liveState) {
    this.liveState = liveState;
    return this;
  }

  /**
   * Get liveState
   * @return liveState
   **/
  @Schema(description = "")
  
    public String getLiveState() {
    return liveState;
  }

  public void setLiveState(String liveState) {
    this.liveState = liveState;
  }

  public V1alpha1ResourceDiff modified(Boolean modified) {
    this.modified = modified;
    return this;
  }

  /**
   * Get modified
   * @return modified
   **/
  @Schema(description = "")
  
    public Boolean isModified() {
    return modified;
  }

  public void setModified(Boolean modified) {
    this.modified = modified;
  }

  public V1alpha1ResourceDiff name(String name) {
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

  public V1alpha1ResourceDiff namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Get namespace
   * @return namespace
   **/
  @Schema(description = "")
  
    public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public V1alpha1ResourceDiff normalizedLiveState(String normalizedLiveState) {
    this.normalizedLiveState = normalizedLiveState;
    return this;
  }

  /**
   * Get normalizedLiveState
   * @return normalizedLiveState
   **/
  @Schema(description = "")
  
    public String getNormalizedLiveState() {
    return normalizedLiveState;
  }

  public void setNormalizedLiveState(String normalizedLiveState) {
    this.normalizedLiveState = normalizedLiveState;
  }

  public V1alpha1ResourceDiff predictedLiveState(String predictedLiveState) {
    this.predictedLiveState = predictedLiveState;
    return this;
  }

  /**
   * Get predictedLiveState
   * @return predictedLiveState
   **/
  @Schema(description = "")
  
    public String getPredictedLiveState() {
    return predictedLiveState;
  }

  public void setPredictedLiveState(String predictedLiveState) {
    this.predictedLiveState = predictedLiveState;
  }

  public V1alpha1ResourceDiff resourceVersion(String resourceVersion) {
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

  public V1alpha1ResourceDiff targetState(String targetState) {
    this.targetState = targetState;
    return this;
  }

  /**
   * Get targetState
   * @return targetState
   **/
  @Schema(description = "")
  
    public String getTargetState() {
    return targetState;
  }

  public void setTargetState(String targetState) {
    this.targetState = targetState;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ResourceDiff v1alpha1ResourceDiff = (V1alpha1ResourceDiff) o;
    return Objects.equals(this.diff, v1alpha1ResourceDiff.diff) &&
        Objects.equals(this.group, v1alpha1ResourceDiff.group) &&
        Objects.equals(this.hook, v1alpha1ResourceDiff.hook) &&
        Objects.equals(this.kind, v1alpha1ResourceDiff.kind) &&
        Objects.equals(this.liveState, v1alpha1ResourceDiff.liveState) &&
        Objects.equals(this.modified, v1alpha1ResourceDiff.modified) &&
        Objects.equals(this.name, v1alpha1ResourceDiff.name) &&
        Objects.equals(this.namespace, v1alpha1ResourceDiff.namespace) &&
        Objects.equals(this.normalizedLiveState, v1alpha1ResourceDiff.normalizedLiveState) &&
        Objects.equals(this.predictedLiveState, v1alpha1ResourceDiff.predictedLiveState) &&
        Objects.equals(this.resourceVersion, v1alpha1ResourceDiff.resourceVersion) &&
        Objects.equals(this.targetState, v1alpha1ResourceDiff.targetState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diff, group, hook, kind, liveState, modified, name, namespace, normalizedLiveState, predictedLiveState, resourceVersion, targetState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ResourceDiff {\n");
    
    sb.append("    diff: ").append(toIndentedString(diff)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    hook: ").append(toIndentedString(hook)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    liveState: ").append(toIndentedString(liveState)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    normalizedLiveState: ").append(toIndentedString(normalizedLiveState)).append("\n");
    sb.append("    predictedLiveState: ").append(toIndentedString(predictedLiveState)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
    sb.append("    targetState: ").append(toIndentedString(targetState)).append("\n");
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
