package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * ProjectCreateRequest defines project creation parameters.
 */
@Schema(description = "ProjectCreateRequest defines project creation parameters.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class ProjectProjectCreateRequest  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("project")
  private V1alpha1AppProject project = null;

  @JsonProperty("upsert")
  private Boolean upsert = null;

  public ProjectProjectCreateRequest project(V1alpha1AppProject project) {
    this.project = project;
    return this;
  }

  /**
   * Get project
   * @return project
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1AppProject getProject() {
    return project;
  }

  public void setProject(V1alpha1AppProject project) {
    this.project = project;
  }

  public ProjectProjectCreateRequest upsert(Boolean upsert) {
    this.upsert = upsert;
    return this;
  }

  /**
   * Get upsert
   * @return upsert
   **/
  @Schema(description = "")
  
    public Boolean isUpsert() {
    return upsert;
  }

  public void setUpsert(Boolean upsert) {
    this.upsert = upsert;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectProjectCreateRequest projectProjectCreateRequest = (ProjectProjectCreateRequest) o;
    return Objects.equals(this.project, projectProjectCreateRequest.project) &&
        Objects.equals(this.upsert, projectProjectCreateRequest.upsert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, upsert);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectProjectCreateRequest {\n");
    
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    upsert: ").append(toIndentedString(upsert)).append("\n");
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
