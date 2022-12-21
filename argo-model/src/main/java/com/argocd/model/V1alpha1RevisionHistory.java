package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1RevisionHistory
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1RevisionHistory  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("deployStartedAt")
  private V1Time deployStartedAt = null;

  @JsonProperty("deployedAt")
  private V1Time deployedAt = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("revision")
  private String revision = null;

  @JsonProperty("source")
  private V1alpha1ApplicationSource source = null;

  public V1alpha1RevisionHistory deployStartedAt(V1Time deployStartedAt) {
    this.deployStartedAt = deployStartedAt;
    return this;
  }

  /**
   * Get deployStartedAt
   * @return deployStartedAt
   **/
  @Schema(description = "")
  
    @Valid
    public V1Time getDeployStartedAt() {
    return deployStartedAt;
  }

  public void setDeployStartedAt(V1Time deployStartedAt) {
    this.deployStartedAt = deployStartedAt;
  }

  public V1alpha1RevisionHistory deployedAt(V1Time deployedAt) {
    this.deployedAt = deployedAt;
    return this;
  }

  /**
   * Get deployedAt
   * @return deployedAt
   **/
  @Schema(description = "")
  
    @Valid
    public V1Time getDeployedAt() {
    return deployedAt;
  }

  public void setDeployedAt(V1Time deployedAt) {
    this.deployedAt = deployedAt;
  }

  public V1alpha1RevisionHistory id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public V1alpha1RevisionHistory revision(String revision) {
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

  public V1alpha1RevisionHistory source(V1alpha1ApplicationSource source) {
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
    V1alpha1RevisionHistory v1alpha1RevisionHistory = (V1alpha1RevisionHistory) o;
    return Objects.equals(this.deployStartedAt, v1alpha1RevisionHistory.deployStartedAt) &&
        Objects.equals(this.deployedAt, v1alpha1RevisionHistory.deployedAt) &&
        Objects.equals(this.id, v1alpha1RevisionHistory.id) &&
        Objects.equals(this.revision, v1alpha1RevisionHistory.revision) &&
        Objects.equals(this.source, v1alpha1RevisionHistory.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployStartedAt, deployedAt, id, revision, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RevisionHistory {\n");
    
    sb.append("    deployStartedAt: ").append(toIndentedString(deployStartedAt)).append("\n");
    sb.append("    deployedAt: ").append(toIndentedString(deployedAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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
