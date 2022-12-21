package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * ApplicationApplicationPatchRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class ApplicationApplicationPatchRequest  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("appNamespace")
  private String appNamespace = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("patch")
  private String patch = null;

  @JsonProperty("patchType")
  private String patchType = null;

  public ApplicationApplicationPatchRequest appNamespace(String appNamespace) {
    this.appNamespace = appNamespace;
    return this;
  }

  /**
   * Get appNamespace
   * @return appNamespace
   **/
  @Schema(description = "")
  
    public String getAppNamespace() {
    return appNamespace;
  }

  public void setAppNamespace(String appNamespace) {
    this.appNamespace = appNamespace;
  }

  public ApplicationApplicationPatchRequest name(String name) {
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

  public ApplicationApplicationPatchRequest patch(String patch) {
    this.patch = patch;
    return this;
  }

  /**
   * Get patch
   * @return patch
   **/
  @Schema(description = "")
  
    public String getPatch() {
    return patch;
  }

  public void setPatch(String patch) {
    this.patch = patch;
  }

  public ApplicationApplicationPatchRequest patchType(String patchType) {
    this.patchType = patchType;
    return this;
  }

  /**
   * Get patchType
   * @return patchType
   **/
  @Schema(description = "")
  
    public String getPatchType() {
    return patchType;
  }

  public void setPatchType(String patchType) {
    this.patchType = patchType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationApplicationPatchRequest applicationApplicationPatchRequest = (ApplicationApplicationPatchRequest) o;
    return Objects.equals(this.appNamespace, applicationApplicationPatchRequest.appNamespace) &&
        Objects.equals(this.name, applicationApplicationPatchRequest.name) &&
        Objects.equals(this.patch, applicationApplicationPatchRequest.patch) &&
        Objects.equals(this.patchType, applicationApplicationPatchRequest.patchType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appNamespace, name, patch, patchType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationApplicationPatchRequest {\n");
    
    sb.append("    appNamespace: ").append(toIndentedString(appNamespace)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
    sb.append("    patchType: ").append(toIndentedString(patchType)).append("\n");
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
