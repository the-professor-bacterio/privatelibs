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
 * SCMProviderGeneratorFilter is a single repository filter. If multiple filter types are set on a single struct, they will be AND&#x27;d together. All filters must pass for a repo to be included.
 */
@Schema(description = "SCMProviderGeneratorFilter is a single repository filter. If multiple filter types are set on a single struct, they will be AND'd together. All filters must pass for a repo to be included.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1SCMProviderGeneratorFilter  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("branchMatch")
  private String branchMatch = null;

  @JsonProperty("labelMatch")
  private String labelMatch = null;

  @JsonProperty("pathsDoNotExist")
  @Valid
  private List<String> pathsDoNotExist = null;

  @JsonProperty("pathsExist")
  @Valid
  private List<String> pathsExist = null;

  @JsonProperty("repositoryMatch")
  private String repositoryMatch = null;

  public V1alpha1SCMProviderGeneratorFilter branchMatch(String branchMatch) {
    this.branchMatch = branchMatch;
    return this;
  }

  /**
   * A regex which must match the branch name.
   * @return branchMatch
   **/
  @Schema(description = "A regex which must match the branch name.")
  
    public String getBranchMatch() {
    return branchMatch;
  }

  public void setBranchMatch(String branchMatch) {
    this.branchMatch = branchMatch;
  }

  public V1alpha1SCMProviderGeneratorFilter labelMatch(String labelMatch) {
    this.labelMatch = labelMatch;
    return this;
  }

  /**
   * A regex which must match at least one label.
   * @return labelMatch
   **/
  @Schema(description = "A regex which must match at least one label.")
  
    public String getLabelMatch() {
    return labelMatch;
  }

  public void setLabelMatch(String labelMatch) {
    this.labelMatch = labelMatch;
  }

  public V1alpha1SCMProviderGeneratorFilter pathsDoNotExist(List<String> pathsDoNotExist) {
    this.pathsDoNotExist = pathsDoNotExist;
    return this;
  }

  public V1alpha1SCMProviderGeneratorFilter addPathsDoNotExistItem(String pathsDoNotExistItem) {
    if (this.pathsDoNotExist == null) {
      this.pathsDoNotExist = new ArrayList<>();
    }
    this.pathsDoNotExist.add(pathsDoNotExistItem);
    return this;
  }

  /**
   * An array of paths, all of which must not exist.
   * @return pathsDoNotExist
   **/
  @Schema(description = "An array of paths, all of which must not exist.")
  
    public List<String> getPathsDoNotExist() {
    return pathsDoNotExist;
  }

  public void setPathsDoNotExist(List<String> pathsDoNotExist) {
    this.pathsDoNotExist = pathsDoNotExist;
  }

  public V1alpha1SCMProviderGeneratorFilter pathsExist(List<String> pathsExist) {
    this.pathsExist = pathsExist;
    return this;
  }

  public V1alpha1SCMProviderGeneratorFilter addPathsExistItem(String pathsExistItem) {
    if (this.pathsExist == null) {
      this.pathsExist = new ArrayList<>();
    }
    this.pathsExist.add(pathsExistItem);
    return this;
  }

  /**
   * An array of paths, all of which must exist.
   * @return pathsExist
   **/
  @Schema(description = "An array of paths, all of which must exist.")
  
    public List<String> getPathsExist() {
    return pathsExist;
  }

  public void setPathsExist(List<String> pathsExist) {
    this.pathsExist = pathsExist;
  }

  public V1alpha1SCMProviderGeneratorFilter repositoryMatch(String repositoryMatch) {
    this.repositoryMatch = repositoryMatch;
    return this;
  }

  /**
   * A regex for repo names.
   * @return repositoryMatch
   **/
  @Schema(description = "A regex for repo names.")
  
    public String getRepositoryMatch() {
    return repositoryMatch;
  }

  public void setRepositoryMatch(String repositoryMatch) {
    this.repositoryMatch = repositoryMatch;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1SCMProviderGeneratorFilter v1alpha1SCMProviderGeneratorFilter = (V1alpha1SCMProviderGeneratorFilter) o;
    return Objects.equals(this.branchMatch, v1alpha1SCMProviderGeneratorFilter.branchMatch) &&
        Objects.equals(this.labelMatch, v1alpha1SCMProviderGeneratorFilter.labelMatch) &&
        Objects.equals(this.pathsDoNotExist, v1alpha1SCMProviderGeneratorFilter.pathsDoNotExist) &&
        Objects.equals(this.pathsExist, v1alpha1SCMProviderGeneratorFilter.pathsExist) &&
        Objects.equals(this.repositoryMatch, v1alpha1SCMProviderGeneratorFilter.repositoryMatch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchMatch, labelMatch, pathsDoNotExist, pathsExist, repositoryMatch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1SCMProviderGeneratorFilter {\n");
    
    sb.append("    branchMatch: ").append(toIndentedString(branchMatch)).append("\n");
    sb.append("    labelMatch: ").append(toIndentedString(labelMatch)).append("\n");
    sb.append("    pathsDoNotExist: ").append(toIndentedString(pathsDoNotExist)).append("\n");
    sb.append("    pathsExist: ").append(toIndentedString(pathsExist)).append("\n");
    sb.append("    repositoryMatch: ").append(toIndentedString(repositoryMatch)).append("\n");
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
