package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1ResourceStatus
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ResourceStatus  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("group")
  private String group = null;

  @JsonProperty("health")
  private V1alpha1HealthStatus health = null;

  @JsonProperty("hook")
  private Boolean hook = null;

  @JsonProperty("kind")
  private String kind = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("namespace")
  private String namespace = null;

  @JsonProperty("requiresPruning")
  private Boolean requiresPruning = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("syncWave")
  private String syncWave = null;

  @JsonProperty("version")
  private String version = null;

  public V1alpha1ResourceStatus group(String group) {
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

  public V1alpha1ResourceStatus health(V1alpha1HealthStatus health) {
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

  public V1alpha1ResourceStatus hook(Boolean hook) {
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

  public V1alpha1ResourceStatus kind(String kind) {
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

  public V1alpha1ResourceStatus name(String name) {
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

  public V1alpha1ResourceStatus namespace(String namespace) {
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

  public V1alpha1ResourceStatus requiresPruning(Boolean requiresPruning) {
    this.requiresPruning = requiresPruning;
    return this;
  }

  /**
   * Get requiresPruning
   * @return requiresPruning
   **/
  @Schema(description = "")
  
    public Boolean isRequiresPruning() {
    return requiresPruning;
  }

  public void setRequiresPruning(Boolean requiresPruning) {
    this.requiresPruning = requiresPruning;
  }

  public V1alpha1ResourceStatus status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public V1alpha1ResourceStatus syncWave(String syncWave) {
    this.syncWave = syncWave;
    return this;
  }

  /**
   * Get syncWave
   * @return syncWave
   **/
  @Schema(description = "")
  
    public String getSyncWave() {
    return syncWave;
  }

  public void setSyncWave(String syncWave) {
    this.syncWave = syncWave;
  }

  public V1alpha1ResourceStatus version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @Schema(description = "")
  
    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ResourceStatus v1alpha1ResourceStatus = (V1alpha1ResourceStatus) o;
    return Objects.equals(this.group, v1alpha1ResourceStatus.group) &&
        Objects.equals(this.health, v1alpha1ResourceStatus.health) &&
        Objects.equals(this.hook, v1alpha1ResourceStatus.hook) &&
        Objects.equals(this.kind, v1alpha1ResourceStatus.kind) &&
        Objects.equals(this.name, v1alpha1ResourceStatus.name) &&
        Objects.equals(this.namespace, v1alpha1ResourceStatus.namespace) &&
        Objects.equals(this.requiresPruning, v1alpha1ResourceStatus.requiresPruning) &&
        Objects.equals(this.status, v1alpha1ResourceStatus.status) &&
        Objects.equals(this.syncWave, v1alpha1ResourceStatus.syncWave) &&
        Objects.equals(this.version, v1alpha1ResourceStatus.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, health, hook, kind, name, namespace, requiresPruning, status, syncWave, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ResourceStatus {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
    sb.append("    hook: ").append(toIndentedString(hook)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    requiresPruning: ").append(toIndentedString(requiresPruning)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    syncWave: ").append(toIndentedString(syncWave)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
