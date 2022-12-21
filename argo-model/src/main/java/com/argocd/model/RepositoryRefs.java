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
 * RepositoryRefs
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class RepositoryRefs  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("branches")
  @Valid
  private List<String> branches = null;

  @JsonProperty("tags")
  @Valid
  private List<String> tags = null;

  public RepositoryRefs branches(List<String> branches) {
    this.branches = branches;
    return this;
  }

  public RepositoryRefs addBranchesItem(String branchesItem) {
    if (this.branches == null) {
      this.branches = new ArrayList<>();
    }
    this.branches.add(branchesItem);
    return this;
  }

  /**
   * Get branches
   * @return branches
   **/
  @Schema(description = "")
  
    public List<String> getBranches() {
    return branches;
  }

  public void setBranches(List<String> branches) {
    this.branches = branches;
  }

  public RepositoryRefs tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public RepositoryRefs addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
   **/
  @Schema(description = "")
  
    public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryRefs repositoryRefs = (RepositoryRefs) o;
    return Objects.equals(this.branches, repositoryRefs.branches) &&
        Objects.equals(this.tags, repositoryRefs.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branches, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryRefs {\n");
    
    sb.append("    branches: ").append(toIndentedString(branches)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
