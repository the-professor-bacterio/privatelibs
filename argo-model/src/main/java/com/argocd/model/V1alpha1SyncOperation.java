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
 * SyncOperation contains details about a sync operation.
 */
@Schema(description = "SyncOperation contains details about a sync operation.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1SyncOperation  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("dryRun")
  private Boolean dryRun = null;

  @JsonProperty("manifests")
  @Valid
  private List<String> manifests = null;

  @JsonProperty("prune")
  private Boolean prune = null;

  @JsonProperty("resources")
  @Valid
  private List<V1alpha1SyncOperationResource> resources = null;

  @JsonProperty("revision")
  private String revision = null;

  @JsonProperty("source")
  private V1alpha1ApplicationSource source = null;

  @JsonProperty("syncOptions")
  @Valid
  private List<String> syncOptions = null;

  @JsonProperty("syncStrategy")
  private V1alpha1SyncStrategy syncStrategy = null;

  public V1alpha1SyncOperation dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * Get dryRun
   * @return dryRun
   **/
  @Schema(description = "")
  
    public Boolean isDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  public V1alpha1SyncOperation manifests(List<String> manifests) {
    this.manifests = manifests;
    return this;
  }

  public V1alpha1SyncOperation addManifestsItem(String manifestsItem) {
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

  public V1alpha1SyncOperation prune(Boolean prune) {
    this.prune = prune;
    return this;
  }

  /**
   * Get prune
   * @return prune
   **/
  @Schema(description = "")
  
    public Boolean isPrune() {
    return prune;
  }

  public void setPrune(Boolean prune) {
    this.prune = prune;
  }

  public V1alpha1SyncOperation resources(List<V1alpha1SyncOperationResource> resources) {
    this.resources = resources;
    return this;
  }

  public V1alpha1SyncOperation addResourcesItem(V1alpha1SyncOperationResource resourcesItem) {
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
    public List<V1alpha1SyncOperationResource> getResources() {
    return resources;
  }

  public void setResources(List<V1alpha1SyncOperationResource> resources) {
    this.resources = resources;
  }

  public V1alpha1SyncOperation revision(String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * Revision is the revision (Git) or chart version (Helm) which to sync the application to If omitted, will use the revision specified in app spec.
   * @return revision
   **/
  @Schema(description = "Revision is the revision (Git) or chart version (Helm) which to sync the application to If omitted, will use the revision specified in app spec.")
  
    public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }

  public V1alpha1SyncOperation source(V1alpha1ApplicationSource source) {
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

  public V1alpha1SyncOperation syncOptions(List<String> syncOptions) {
    this.syncOptions = syncOptions;
    return this;
  }

  public V1alpha1SyncOperation addSyncOptionsItem(String syncOptionsItem) {
    if (this.syncOptions == null) {
      this.syncOptions = new ArrayList<>();
    }
    this.syncOptions.add(syncOptionsItem);
    return this;
  }

  /**
   * Get syncOptions
   * @return syncOptions
   **/
  @Schema(description = "")
  
    public List<String> getSyncOptions() {
    return syncOptions;
  }

  public void setSyncOptions(List<String> syncOptions) {
    this.syncOptions = syncOptions;
  }

  public V1alpha1SyncOperation syncStrategy(V1alpha1SyncStrategy syncStrategy) {
    this.syncStrategy = syncStrategy;
    return this;
  }

  /**
   * Get syncStrategy
   * @return syncStrategy
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1SyncStrategy getSyncStrategy() {
    return syncStrategy;
  }

  public void setSyncStrategy(V1alpha1SyncStrategy syncStrategy) {
    this.syncStrategy = syncStrategy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1SyncOperation v1alpha1SyncOperation = (V1alpha1SyncOperation) o;
    return Objects.equals(this.dryRun, v1alpha1SyncOperation.dryRun) &&
        Objects.equals(this.manifests, v1alpha1SyncOperation.manifests) &&
        Objects.equals(this.prune, v1alpha1SyncOperation.prune) &&
        Objects.equals(this.resources, v1alpha1SyncOperation.resources) &&
        Objects.equals(this.revision, v1alpha1SyncOperation.revision) &&
        Objects.equals(this.source, v1alpha1SyncOperation.source) &&
        Objects.equals(this.syncOptions, v1alpha1SyncOperation.syncOptions) &&
        Objects.equals(this.syncStrategy, v1alpha1SyncOperation.syncStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRun, manifests, prune, resources, revision, source, syncOptions, syncStrategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1SyncOperation {\n");
    
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    manifests: ").append(toIndentedString(manifests)).append("\n");
    sb.append("    prune: ").append(toIndentedString(prune)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    syncOptions: ").append(toIndentedString(syncOptions)).append("\n");
    sb.append("    syncStrategy: ").append(toIndentedString(syncStrategy)).append("\n");
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
