package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * PullRequestGeneratorFilter is a single pull request filter. If multiple filter types are set on a single struct, they will be AND&#x27;d together. All filters must pass for a pull request to be included.
 */
@Schema(description = "PullRequestGeneratorFilter is a single pull request filter. If multiple filter types are set on a single struct, they will be AND'd together. All filters must pass for a pull request to be included.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1PullRequestGeneratorFilter  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("branchMatch")
  private String branchMatch = null;

  public V1alpha1PullRequestGeneratorFilter branchMatch(String branchMatch) {
    this.branchMatch = branchMatch;
    return this;
  }

  /**
   * Get branchMatch
   * @return branchMatch
   **/
  @Schema(description = "")
  
    public String getBranchMatch() {
    return branchMatch;
  }

  public void setBranchMatch(String branchMatch) {
    this.branchMatch = branchMatch;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1PullRequestGeneratorFilter v1alpha1PullRequestGeneratorFilter = (V1alpha1PullRequestGeneratorFilter) o;
    return Objects.equals(this.branchMatch, v1alpha1PullRequestGeneratorFilter.branchMatch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchMatch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PullRequestGeneratorFilter {\n");
    
    sb.append("    branchMatch: ").append(toIndentedString(branchMatch)).append("\n");
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
