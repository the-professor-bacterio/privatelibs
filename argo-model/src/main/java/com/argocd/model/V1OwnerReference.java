package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * V1OwnerReference
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1OwnerReference  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("apiVersion")
  private String apiVersion = null;

  @JsonProperty("blockOwnerDeletion")
  private Boolean blockOwnerDeletion = null;

  @JsonProperty("controller")
  private Boolean controller = null;

  @JsonProperty("kind")
  private String kind = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("uid")
  private String uid = null;

  public V1OwnerReference apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * API version of the referent.
   * @return apiVersion
   **/
  @Schema(description = "API version of the referent.")
  
    public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1OwnerReference blockOwnerDeletion(Boolean blockOwnerDeletion) {
    this.blockOwnerDeletion = blockOwnerDeletion;
    return this;
  }

  /**
   * Get blockOwnerDeletion
   * @return blockOwnerDeletion
   **/
  @Schema(description = "")
  
    public Boolean isBlockOwnerDeletion() {
    return blockOwnerDeletion;
  }

  public void setBlockOwnerDeletion(Boolean blockOwnerDeletion) {
    this.blockOwnerDeletion = blockOwnerDeletion;
  }

  public V1OwnerReference controller(Boolean controller) {
    this.controller = controller;
    return this;
  }

  /**
   * Get controller
   * @return controller
   **/
  @Schema(description = "")
  
    public Boolean isController() {
    return controller;
  }

  public void setController(Boolean controller) {
    this.controller = controller;
  }

  public V1OwnerReference kind(String kind) {
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

  public V1OwnerReference name(String name) {
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

  public V1OwnerReference uid(String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Get uid
   * @return uid
   **/
  @Schema(description = "")
  
    public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1OwnerReference v1OwnerReference = (V1OwnerReference) o;
    return Objects.equals(this.apiVersion, v1OwnerReference.apiVersion) &&
        Objects.equals(this.blockOwnerDeletion, v1OwnerReference.blockOwnerDeletion) &&
        Objects.equals(this.controller, v1OwnerReference.controller) &&
        Objects.equals(this.kind, v1OwnerReference.kind) &&
        Objects.equals(this.name, v1OwnerReference.name) &&
        Objects.equals(this.uid, v1OwnerReference.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, blockOwnerDeletion, controller, kind, name, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1OwnerReference {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    blockOwnerDeletion: ").append(toIndentedString(blockOwnerDeletion)).append("\n");
    sb.append("    controller: ").append(toIndentedString(controller)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
