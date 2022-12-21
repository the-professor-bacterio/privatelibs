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
 * RepositoryManifestResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class RepositoryManifestResponse  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("manifests")
  @Valid
  private List<String> manifests = null;

  @JsonProperty("namespace")
  private String namespace = null;

  @JsonProperty("revision")
  private String revision = null;

  @JsonProperty("server")
  private String server = null;

  @JsonProperty("sourceType")
  private String sourceType = null;

  @JsonProperty("verifyResult")
  private String verifyResult = null;

  public RepositoryManifestResponse manifests(List<String> manifests) {
    this.manifests = manifests;
    return this;
  }

  public RepositoryManifestResponse addManifestsItem(String manifestsItem) {
    if (this.manifests == null) {
      this.manifests = new ArrayList<>();
    }
    this.manifests.add(manifestsItem);
    return this;
  }

  /**
   * Get manifests
   * @return manifests
   **/
  @Schema(description = "")
  
    public List<String> getManifests() {
    return manifests;
  }

  public void setManifests(List<String> manifests) {
    this.manifests = manifests;
  }

  public RepositoryManifestResponse namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Get namespace
   * @return namespace
   **/
  @Schema(description = "")
  
    public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public RepositoryManifestResponse revision(String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * Get revision
   * @return revision
   **/
  @Schema(description = "")
  
    public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }

  public RepositoryManifestResponse server(String server) {
    this.server = server;
    return this;
  }

  /**
   * Get server
   * @return server
   **/
  @Schema(description = "")
  
    public String getServer() {
    return server;
  }

  public void setServer(String server) {
    this.server = server;
  }

  public RepositoryManifestResponse sourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * Get sourceType
   * @return sourceType
   **/
  @Schema(description = "")
  
    public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }

  public RepositoryManifestResponse verifyResult(String verifyResult) {
    this.verifyResult = verifyResult;
    return this;
  }

  /**
   * Get verifyResult
   * @return verifyResult
   **/
  @Schema(description = "")
  
    public String getVerifyResult() {
    return verifyResult;
  }

  public void setVerifyResult(String verifyResult) {
    this.verifyResult = verifyResult;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryManifestResponse repositoryManifestResponse = (RepositoryManifestResponse) o;
    return Objects.equals(this.manifests, repositoryManifestResponse.manifests) &&
        Objects.equals(this.namespace, repositoryManifestResponse.namespace) &&
        Objects.equals(this.revision, repositoryManifestResponse.revision) &&
        Objects.equals(this.server, repositoryManifestResponse.server) &&
        Objects.equals(this.sourceType, repositoryManifestResponse.sourceType) &&
        Objects.equals(this.verifyResult, repositoryManifestResponse.verifyResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manifests, namespace, revision, server, sourceType, verifyResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryManifestResponse {\n");
    
    sb.append("    manifests: ").append(toIndentedString(manifests)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    verifyResult: ").append(toIndentedString(verifyResult)).append("\n");
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
