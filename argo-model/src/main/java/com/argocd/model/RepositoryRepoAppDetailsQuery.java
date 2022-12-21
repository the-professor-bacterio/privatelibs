package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * RepositoryRepoAppDetailsQuery
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class RepositoryRepoAppDetailsQuery  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("appName")
  private String appName = null;

  @JsonProperty("appProject")
  private String appProject = null;

  @JsonProperty("source")
  private V1alpha1ApplicationSource source = null;

  public RepositoryRepoAppDetailsQuery appName(String appName) {
    this.appName = appName;
    return this;
  }

  /**
   * Get appName
   * @return appName
   **/
  @Schema(description = "")
  
    public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public RepositoryRepoAppDetailsQuery appProject(String appProject) {
    this.appProject = appProject;
    return this;
  }

  /**
   * Get appProject
   * @return appProject
   **/
  @Schema(description = "")
  
    public String getAppProject() {
    return appProject;
  }

  public void setAppProject(String appProject) {
    this.appProject = appProject;
  }

  public RepositoryRepoAppDetailsQuery source(V1alpha1ApplicationSource source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ApplicationSource getSource() {
    return source;
  }

  public void setSource(V1alpha1ApplicationSource source) {
    this.source = source;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryRepoAppDetailsQuery repositoryRepoAppDetailsQuery = (RepositoryRepoAppDetailsQuery) o;
    return Objects.equals(this.appName, repositoryRepoAppDetailsQuery.appName) &&
        Objects.equals(this.appProject, repositoryRepoAppDetailsQuery.appProject) &&
        Objects.equals(this.source, repositoryRepoAppDetailsQuery.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, appProject, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryRepoAppDetailsQuery {\n");
    
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appProject: ").append(toIndentedString(appProject)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
