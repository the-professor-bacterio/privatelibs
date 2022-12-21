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
 * V1alpha1SyncOperationResult
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1SyncOperationResult  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("resources")
  @Valid
  private List<V1alpha1ResourceResult> resources = null;

  @JsonProperty("revision")
  private String revision = null;

  @JsonProperty("source")
  private V1alpha1ApplicationSource source = null;

  public V1alpha1SyncOperationResult resources(List<V1alpha1ResourceResult> resources) {
    this.resources = resources;
    return this;
  }

  public V1alpha1SyncOperationResult addResourcesItem(V1alpha1ResourceResult resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

  /**
   * Get resources
   * @return resources
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1ResourceResult> getResources() {
    return resources;
  }

  public void setResources(List<V1alpha1ResourceResult> resources) {
    this.resources = resources;
  }

  public V1alpha1SyncOperationResult revision(String revision) {
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

  public V1alpha1SyncOperationResult source(V1alpha1ApplicationSource source) {
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
    V1alpha1SyncOperationResult v1alpha1SyncOperationResult = (V1alpha1SyncOperationResult) o;
    return Objects.equals(this.resources, v1alpha1SyncOperationResult.resources) &&
        Objects.equals(this.revision, v1alpha1SyncOperationResult.revision) &&
        Objects.equals(this.source, v1alpha1SyncOperationResult.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resources, revision, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1SyncOperationResult {\n");
    
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
