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
 * ApplicationApplicationSyncRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class ApplicationApplicationSyncRequest  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("appNamespace")
  private String appNamespace = null;

  @JsonProperty("dryRun")
  private Boolean dryRun = null;

  @JsonProperty("infos")
  @Valid
  private List<V1alpha1Info> infos = null;

  @JsonProperty("manifests")
  @Valid
  private List<String> manifests = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("prune")
  private Boolean prune = null;

  @JsonProperty("resources")
  @Valid
  private List<V1alpha1SyncOperationResource> resources = null;

  @JsonProperty("retryStrategy")
  private V1alpha1RetryStrategy retryStrategy = null;

  @JsonProperty("revision")
  private String revision = null;

  @JsonProperty("strategy")
  private V1alpha1SyncStrategy strategy = null;

  @JsonProperty("syncOptions")
  private ApplicationSyncOptions syncOptions = null;

  public ApplicationApplicationSyncRequest appNamespace(String appNamespace) {
    this.appNamespace = appNamespace;
    return this;
  }

  /**
   * Get appNamespace
   * @return appNamespace
   **/
  @Schema(description = "")
  
    public String getAppNamespace() {
    return appNamespace;
  }

  public void setAppNamespace(String appNamespace) {
    this.appNamespace = appNamespace;
  }

  public ApplicationApplicationSyncRequest dryRun(Boolean dryRun) {
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

  public ApplicationApplicationSyncRequest infos(List<V1alpha1Info> infos) {
    this.infos = infos;
    return this;
  }

  public ApplicationApplicationSyncRequest addInfosItem(V1alpha1Info infosItem) {
    if (this.infos == null) {
      this.infos = new ArrayList<>();
    }
    this.infos.add(infosItem);
    return this;
  }

  /**
   * Get infos
   * @return infos
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1Info> getInfos() {
    return infos;
  }

  public void setInfos(List<V1alpha1Info> infos) {
    this.infos = infos;
  }

  public ApplicationApplicationSyncRequest manifests(List<String> manifests) {
    this.manifests = manifests;
    return this;
  }

  public ApplicationApplicationSyncRequest addManifestsItem(String manifestsItem) {
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

  public ApplicationApplicationSyncRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApplicationApplicationSyncRequest prune(Boolean prune) {
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

  public ApplicationApplicationSyncRequest resources(List<V1alpha1SyncOperationResource> resources) {
    this.resources = resources;
    return this;
  }

  public ApplicationApplicationSyncRequest addResourcesItem(V1alpha1SyncOperationResource resourcesItem) {
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

  public ApplicationApplicationSyncRequest retryStrategy(V1alpha1RetryStrategy retryStrategy) {
    this.retryStrategy = retryStrategy;
    return this;
  }

  /**
   * Get retryStrategy
   * @return retryStrategy
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1RetryStrategy getRetryStrategy() {
    return retryStrategy;
  }

  public void setRetryStrategy(V1alpha1RetryStrategy retryStrategy) {
    this.retryStrategy = retryStrategy;
  }

  public ApplicationApplicationSyncRequest revision(String revision) {
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

  public ApplicationApplicationSyncRequest strategy(V1alpha1SyncStrategy strategy) {
    this.strategy = strategy;
    return this;
  }

  /**
   * Get strategy
   * @return strategy
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1SyncStrategy getStrategy() {
    return strategy;
  }

  public void setStrategy(V1alpha1SyncStrategy strategy) {
    this.strategy = strategy;
  }

  public ApplicationApplicationSyncRequest syncOptions(ApplicationSyncOptions syncOptions) {
    this.syncOptions = syncOptions;
    return this;
  }

  /**
   * Get syncOptions
   * @return syncOptions
   **/
  @Schema(description = "")
  
    @Valid
    public ApplicationSyncOptions getSyncOptions() {
    return syncOptions;
  }

  public void setSyncOptions(ApplicationSyncOptions syncOptions) {
    this.syncOptions = syncOptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationApplicationSyncRequest applicationApplicationSyncRequest = (ApplicationApplicationSyncRequest) o;
    return Objects.equals(this.appNamespace, applicationApplicationSyncRequest.appNamespace) &&
        Objects.equals(this.dryRun, applicationApplicationSyncRequest.dryRun) &&
        Objects.equals(this.infos, applicationApplicationSyncRequest.infos) &&
        Objects.equals(this.manifests, applicationApplicationSyncRequest.manifests) &&
        Objects.equals(this.name, applicationApplicationSyncRequest.name) &&
        Objects.equals(this.prune, applicationApplicationSyncRequest.prune) &&
        Objects.equals(this.resources, applicationApplicationSyncRequest.resources) &&
        Objects.equals(this.retryStrategy, applicationApplicationSyncRequest.retryStrategy) &&
        Objects.equals(this.revision, applicationApplicationSyncRequest.revision) &&
        Objects.equals(this.strategy, applicationApplicationSyncRequest.strategy) &&
        Objects.equals(this.syncOptions, applicationApplicationSyncRequest.syncOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appNamespace, dryRun, infos, manifests, name, prune, resources, retryStrategy, revision, strategy, syncOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationApplicationSyncRequest {\n");
    
    sb.append("    appNamespace: ").append(toIndentedString(appNamespace)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    infos: ").append(toIndentedString(infos)).append("\n");
    sb.append("    manifests: ").append(toIndentedString(manifests)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prune: ").append(toIndentedString(prune)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    retryStrategy: ").append(toIndentedString(retryStrategy)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    syncOptions: ").append(toIndentedString(syncOptions)).append("\n");
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
