package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * ProjectProjectUpdateRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class ProjectProjectUpdateRequest  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("project")
  private V1alpha1AppProject project = null;

  public ProjectProjectUpdateRequest project(V1alpha1AppProject project) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectProjectUpdateRequest projectProjectUpdateRequest = (ProjectProjectUpdateRequest) o;
    return Objects.equals(this.project, projectProjectUpdateRequest.project);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectProjectUpdateRequest {\n");
    
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
