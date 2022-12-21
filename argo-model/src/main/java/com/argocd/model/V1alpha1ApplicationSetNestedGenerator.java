package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * ApplicationSetNestedGenerator represents a generator nested within a combination-type generator (MatrixGenerator or MergeGenerator).
 */
@Schema(description = "ApplicationSetNestedGenerator represents a generator nested within a combination-type generator (MatrixGenerator or MergeGenerator).")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ApplicationSetNestedGenerator  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("clusterDecisionResource")
  private V1alpha1DuckTypeGenerator clusterDecisionResource = null;

  @JsonProperty("clusters")
  private V1alpha1ClusterGenerator clusters = null;

  @JsonProperty("git")
  private V1alpha1GitGenerator git = null;

  @JsonProperty("list")
  private V1alpha1ListGenerator list = null;

  @JsonProperty("matrix")
  private V1JSON matrix = null;

  @JsonProperty("merge")
  private V1JSON merge = null;

  @JsonProperty("pullRequest")
  private V1alpha1PullRequestGenerator pullRequest = null;

  @JsonProperty("scmProvider")
  private V1alpha1SCMProviderGenerator scmProvider = null;

  @JsonProperty("selector")
  private V1LabelSelector selector = null;

  public V1alpha1ApplicationSetNestedGenerator clusterDecisionResource(V1alpha1DuckTypeGenerator clusterDecisionResource) {
    this.clusterDecisionResource = clusterDecisionResource;
    return this;
  }

  /**
   * Get clusterDecisionResource
   * @return clusterDecisionResource
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1DuckTypeGenerator getClusterDecisionResource() {
    return clusterDecisionResource;
  }

  public void setClusterDecisionResource(V1alpha1DuckTypeGenerator clusterDecisionResource) {
    this.clusterDecisionResource = clusterDecisionResource;
  }

  public V1alpha1ApplicationSetNestedGenerator clusters(V1alpha1ClusterGenerator clusters) {
    this.clusters = clusters;
    return this;
  }

  /**
   * Get clusters
   * @return clusters
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ClusterGenerator getClusters() {
    return clusters;
  }

  public void setClusters(V1alpha1ClusterGenerator clusters) {
    this.clusters = clusters;
  }

  public V1alpha1ApplicationSetNestedGenerator git(V1alpha1GitGenerator git) {
    this.git = git;
    return this;
  }

  /**
   * Get git
   * @return git
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1GitGenerator getGit() {
    return git;
  }

  public void setGit(V1alpha1GitGenerator git) {
    this.git = git;
  }

  public V1alpha1ApplicationSetNestedGenerator list(V1alpha1ListGenerator list) {
    this.list = list;
    return this;
  }

  /**
   * Get list
   * @return list
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ListGenerator getList() {
    return list;
  }

  public void setList(V1alpha1ListGenerator list) {
    this.list = list;
  }

  public V1alpha1ApplicationSetNestedGenerator matrix(V1JSON matrix) {
    this.matrix = matrix;
    return this;
  }

  /**
   * Get matrix
   * @return matrix
   **/
  @Schema(description = "")
  
    @Valid
    public V1JSON getMatrix() {
    return matrix;
  }

  public void setMatrix(V1JSON matrix) {
    this.matrix = matrix;
  }

  public V1alpha1ApplicationSetNestedGenerator merge(V1JSON merge) {
    this.merge = merge;
    return this;
  }

  /**
   * Get merge
   * @return merge
   **/
  @Schema(description = "")
  
    @Valid
    public V1JSON getMerge() {
    return merge;
  }

  public void setMerge(V1JSON merge) {
    this.merge = merge;
  }

  public V1alpha1ApplicationSetNestedGenerator pullRequest(V1alpha1PullRequestGenerator pullRequest) {
    this.pullRequest = pullRequest;
    return this;
  }

  /**
   * Get pullRequest
   * @return pullRequest
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1PullRequestGenerator getPullRequest() {
    return pullRequest;
  }

  public void setPullRequest(V1alpha1PullRequestGenerator pullRequest) {
    this.pullRequest = pullRequest;
  }

  public V1alpha1ApplicationSetNestedGenerator scmProvider(V1alpha1SCMProviderGenerator scmProvider) {
    this.scmProvider = scmProvider;
    return this;
  }

  /**
   * Get scmProvider
   * @return scmProvider
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1SCMProviderGenerator getScmProvider() {
    return scmProvider;
  }

  public void setScmProvider(V1alpha1SCMProviderGenerator scmProvider) {
    this.scmProvider = scmProvider;
  }

  public V1alpha1ApplicationSetNestedGenerator selector(V1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

  /**
   * Get selector
   * @return selector
   **/
  @Schema(description = "")
  
    @Valid
    public V1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(V1LabelSelector selector) {
    this.selector = selector;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ApplicationSetNestedGenerator v1alpha1ApplicationSetNestedGenerator = (V1alpha1ApplicationSetNestedGenerator) o;
    return Objects.equals(this.clusterDecisionResource, v1alpha1ApplicationSetNestedGenerator.clusterDecisionResource) &&
        Objects.equals(this.clusters, v1alpha1ApplicationSetNestedGenerator.clusters) &&
        Objects.equals(this.git, v1alpha1ApplicationSetNestedGenerator.git) &&
        Objects.equals(this.list, v1alpha1ApplicationSetNestedGenerator.list) &&
        Objects.equals(this.matrix, v1alpha1ApplicationSetNestedGenerator.matrix) &&
        Objects.equals(this.merge, v1alpha1ApplicationSetNestedGenerator.merge) &&
        Objects.equals(this.pullRequest, v1alpha1ApplicationSetNestedGenerator.pullRequest) &&
        Objects.equals(this.scmProvider, v1alpha1ApplicationSetNestedGenerator.scmProvider) &&
        Objects.equals(this.selector, v1alpha1ApplicationSetNestedGenerator.selector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterDecisionResource, clusters, git, list, matrix, merge, pullRequest, scmProvider, selector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ApplicationSetNestedGenerator {\n");
    
    sb.append("    clusterDecisionResource: ").append(toIndentedString(clusterDecisionResource)).append("\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    matrix: ").append(toIndentedString(matrix)).append("\n");
    sb.append("    merge: ").append(toIndentedString(merge)).append("\n");
    sb.append("    pullRequest: ").append(toIndentedString(pullRequest)).append("\n");
    sb.append("    scmProvider: ").append(toIndentedString(scmProvider)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
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
