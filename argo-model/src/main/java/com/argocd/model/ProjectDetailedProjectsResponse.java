package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ProjectDetailedProjectsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class ProjectDetailedProjectsResponse  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("clusters")
  @Valid
  private List<V1alpha1Cluster> clusters = null;

  @JsonProperty("globalProjects")
  @Valid
  private List<V1alpha1AppProject> globalProjects = null;

  @JsonProperty("project")
  private V1alpha1AppProject project = null;

  @JsonProperty("repositories")
  @Valid
  private List<V1alpha1Repository> repositories = null;

  public ProjectDetailedProjectsResponse clusters(List<V1alpha1Cluster> clusters) {
    this.clusters = clusters;
    return this;
  }

  public ProjectDetailedProjectsResponse addClustersItem(V1alpha1Cluster clustersItem) {
    if (this.clusters == null) {
      this.clusters = new ArrayList<>();
    }
    this.clusters.add(clustersItem);
    return this;
  }

  /**
   * Get clusters
   * @return clusters
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1Cluster> getClusters() {
    return clusters;
  }

  public void setClusters(List<V1alpha1Cluster> clusters) {
    this.clusters = clusters;
  }

  public ProjectDetailedProjectsResponse globalProjects(List<V1alpha1AppProject> globalProjects) {
    this.globalProjects = globalProjects;
    return this;
  }

  public ProjectDetailedProjectsResponse addGlobalProjectsItem(V1alpha1AppProject globalProjectsItem) {
    if (this.globalProjects == null) {
      this.globalProjects = new ArrayList<>();
    }
    this.globalProjects.add(globalProjectsItem);
    return this;
  }

  /**
   * Get globalProjects
   * @return globalProjects
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1AppProject> getGlobalProjects() {
    return globalProjects;
  }

  public void setGlobalProjects(List<V1alpha1AppProject> globalProjects) {
    this.globalProjects = globalProjects;
  }

  public ProjectDetailedProjectsResponse project(V1alpha1AppProject project) {
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

  public ProjectDetailedProjectsResponse repositories(List<V1alpha1Repository> repositories) {
    this.repositories = repositories;
    return this;
  }

  public ProjectDetailedProjectsResponse addRepositoriesItem(V1alpha1Repository repositoriesItem) {
    if (this.repositories == null) {
      this.repositories = new ArrayList<>();
    }
    this.repositories.add(repositoriesItem);
    return this;
  }

  /**
   * Get repositories
   * @return repositories
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1Repository> getRepositories() {
    return repositories;
  }

  public void setRepositories(List<V1alpha1Repository> repositories) {
    this.repositories = repositories;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectDetailedProjectsResponse projectDetailedProjectsResponse = (ProjectDetailedProjectsResponse) o;
    return Objects.equals(this.clusters, projectDetailedProjectsResponse.clusters) &&
        Objects.equals(this.globalProjects, projectDetailedProjectsResponse.globalProjects) &&
        Objects.equals(this.project, projectDetailedProjectsResponse.project) &&
        Objects.equals(this.repositories, projectDetailedProjectsResponse.repositories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusters, globalProjects, project, repositories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectDetailedProjectsResponse {\n");
    
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
    sb.append("    globalProjects: ").append(toIndentedString(globalProjects)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
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
