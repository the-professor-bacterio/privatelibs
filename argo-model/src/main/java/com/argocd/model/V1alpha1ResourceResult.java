package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1ResourceResult
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ResourceResult  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("group")
  private String group = null;

  @JsonProperty("hookPhase")
  private String hookPhase = null;

  @JsonProperty("hookType")
  private String hookType = null;

  @JsonProperty("kind")
  private String kind = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("namespace")
  private String namespace = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("syncPhase")
  private String syncPhase = null;

  @JsonProperty("version")
  private String version = null;

  public V1alpha1ResourceResult group(String group) {
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

  public V1alpha1ResourceResult hookPhase(String hookPhase) {
    this.hookPhase = hookPhase;
    return this;
  }

  /**
   * HookPhase contains the state of any operation associated with this resource OR hook This can also contain values for non-hook resources.
   * @return hookPhase
   **/
  @Schema(description = "HookPhase contains the state of any operation associated with this resource OR hook This can also contain values for non-hook resources.")
  
    public String getHookPhase() {
    return hookPhase;
  }

  public void setHookPhase(String hookPhase) {
    this.hookPhase = hookPhase;
  }

  public V1alpha1ResourceResult hookType(String hookType) {
    this.hookType = hookType;
    return this;
  }

  /**
   * Get hookType
   * @return hookType
   **/
  @Schema(description = "")
  
    public String getHookType() {
    return hookType;
  }

  public void setHookType(String hookType) {
    this.hookType = hookType;
  }

  public V1alpha1ResourceResult kind(String kind) {
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

  public V1alpha1ResourceResult message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   **/
  @Schema(description = "")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1alpha1ResourceResult name(String name) {
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

  public V1alpha1ResourceResult namespace(String namespace) {
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

  public V1alpha1ResourceResult status(String status) {
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

  public V1alpha1ResourceResult syncPhase(String syncPhase) {
    this.syncPhase = syncPhase;
    return this;
  }

  /**
   * Get syncPhase
   * @return syncPhase
   **/
  @Schema(description = "")
  
    public String getSyncPhase() {
    return syncPhase;
  }

  public void setSyncPhase(String syncPhase) {
    this.syncPhase = syncPhase;
  }

  public V1alpha1ResourceResult version(String version) {
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
    V1alpha1ResourceResult v1alpha1ResourceResult = (V1alpha1ResourceResult) o;
    return Objects.equals(this.group, v1alpha1ResourceResult.group) &&
        Objects.equals(this.hookPhase, v1alpha1ResourceResult.hookPhase) &&
        Objects.equals(this.hookType, v1alpha1ResourceResult.hookType) &&
        Objects.equals(this.kind, v1alpha1ResourceResult.kind) &&
        Objects.equals(this.message, v1alpha1ResourceResult.message) &&
        Objects.equals(this.name, v1alpha1ResourceResult.name) &&
        Objects.equals(this.namespace, v1alpha1ResourceResult.namespace) &&
        Objects.equals(this.status, v1alpha1ResourceResult.status) &&
        Objects.equals(this.syncPhase, v1alpha1ResourceResult.syncPhase) &&
        Objects.equals(this.version, v1alpha1ResourceResult.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, hookPhase, hookType, kind, message, name, namespace, status, syncPhase, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ResourceResult {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    hookPhase: ").append(toIndentedString(hookPhase)).append("\n");
    sb.append("    hookType: ").append(toIndentedString(hookType)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    syncPhase: ").append(toIndentedString(syncPhase)).append("\n");
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
