package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * ApplicationsetApplicationSetResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class ApplicationsetApplicationSetResponse  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("applicationset")
  private V1alpha1ApplicationSet applicationset = null;

  @JsonProperty("project")
  private String project = null;

  public ApplicationsetApplicationSetResponse applicationset(V1alpha1ApplicationSet applicationset) {
    this.applicationset = applicationset;
    return this;
  }

  /**
   * Get applicationset
   * @return applicationset
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ApplicationSet getApplicationset() {
    return applicationset;
  }

  public void setApplicationset(V1alpha1ApplicationSet applicationset) {
    this.applicationset = applicationset;
  }

  public ApplicationsetApplicationSetResponse project(String project) {
    this.project = project;
    return this;
  }

  /**
   * Get project
   * @return project
   **/
  @Schema(description = "")
  
    public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationsetApplicationSetResponse applicationsetApplicationSetResponse = (ApplicationsetApplicationSetResponse) o;
    return Objects.equals(this.applicationset, applicationsetApplicationSetResponse.applicationset) &&
        Objects.equals(this.project, applicationsetApplicationSetResponse.project);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationset, project);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationsetApplicationSetResponse {\n");
    
    sb.append("    applicationset: ").append(toIndentedString(applicationset)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
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
