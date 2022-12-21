package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * RepositoryRepoAppDetailsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class RepositoryRepoAppDetailsResponse  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("directory")
  private RepositoryDirectoryAppSpec directory = null;

  @JsonProperty("helm")
  private RepositoryHelmAppSpec helm = null;

  @JsonProperty("kustomize")
  private RepositoryKustomizeAppSpec kustomize = null;

  @JsonProperty("type")
  private String type = null;

  public RepositoryRepoAppDetailsResponse directory(RepositoryDirectoryAppSpec directory) {
    this.directory = directory;
    return this;
  }

  /**
   * Get directory
   * @return directory
   **/
  @Schema(description = "")
  
    @Valid
    public RepositoryDirectoryAppSpec getDirectory() {
    return directory;
  }

  public void setDirectory(RepositoryDirectoryAppSpec directory) {
    this.directory = directory;
  }

  public RepositoryRepoAppDetailsResponse helm(RepositoryHelmAppSpec helm) {
    this.helm = helm;
    return this;
  }

  /**
   * Get helm
   * @return helm
   **/
  @Schema(description = "")
  
    @Valid
    public RepositoryHelmAppSpec getHelm() {
    return helm;
  }

  public void setHelm(RepositoryHelmAppSpec helm) {
    this.helm = helm;
  }

  public RepositoryRepoAppDetailsResponse kustomize(RepositoryKustomizeAppSpec kustomize) {
    this.kustomize = kustomize;
    return this;
  }

  /**
   * Get kustomize
   * @return kustomize
   **/
  @Schema(description = "")
  
    @Valid
    public RepositoryKustomizeAppSpec getKustomize() {
    return kustomize;
  }

  public void setKustomize(RepositoryKustomizeAppSpec kustomize) {
    this.kustomize = kustomize;
  }

  public RepositoryRepoAppDetailsResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(description = "")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryRepoAppDetailsResponse repositoryRepoAppDetailsResponse = (RepositoryRepoAppDetailsResponse) o;
    return Objects.equals(this.directory, repositoryRepoAppDetailsResponse.directory) &&
        Objects.equals(this.helm, repositoryRepoAppDetailsResponse.helm) &&
        Objects.equals(this.kustomize, repositoryRepoAppDetailsResponse.kustomize) &&
        Objects.equals(this.type, repositoryRepoAppDetailsResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directory, helm, kustomize, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryRepoAppDetailsResponse {\n");
    
    sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
    sb.append("    helm: ").append(toIndentedString(helm)).append("\n");
    sb.append("    kustomize: ").append(toIndentedString(kustomize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
