package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * ApplicationApplicationRollbackRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class ApplicationApplicationRollbackRequest  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("appNamespace")
  private String appNamespace = null;

  @JsonProperty("dryRun")
  private Boolean dryRun = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("prune")
  private Boolean prune = null;

  public ApplicationApplicationRollbackRequest appNamespace(String appNamespace) {
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

  public ApplicationApplicationRollbackRequest dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * Get dryRun
   * @return dryRun
   **/
  @Schema(description = "")
  
    public Boolean isDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  public ApplicationApplicationRollbackRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ApplicationApplicationRollbackRequest name(String name) {
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

  public ApplicationApplicationRollbackRequest prune(Boolean prune) {
    this.prune = prune;
    return this;
  }

  /**
   * Get prune
   * @return prune
   **/
  @Schema(description = "")
  
    public Boolean isPrune() {
    return prune;
  }

  public void setPrune(Boolean prune) {
    this.prune = prune;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationApplicationRollbackRequest applicationApplicationRollbackRequest = (ApplicationApplicationRollbackRequest) o;
    return Objects.equals(this.appNamespace, applicationApplicationRollbackRequest.appNamespace) &&
        Objects.equals(this.dryRun, applicationApplicationRollbackRequest.dryRun) &&
        Objects.equals(this.id, applicationApplicationRollbackRequest.id) &&
        Objects.equals(this.name, applicationApplicationRollbackRequest.name) &&
        Objects.equals(this.prune, applicationApplicationRollbackRequest.prune);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appNamespace, dryRun, id, name, prune);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationApplicationRollbackRequest {\n");
    
    sb.append("    appNamespace: ").append(toIndentedString(appNamespace)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prune: ").append(toIndentedString(prune)).append("\n");
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
