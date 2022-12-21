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
 * V1alpha1AppProjectSpec
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1AppProjectSpec  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("clusterResourceBlacklist")
  @Valid
  private List<V1GroupKind> clusterResourceBlacklist = null;

  @JsonProperty("clusterResourceWhitelist")
  @Valid
  private List<V1GroupKind> clusterResourceWhitelist = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("destinations")
  @Valid
  private List<V1alpha1ApplicationDestination> destinations = null;

  @JsonProperty("namespaceResourceBlacklist")
  @Valid
  private List<V1GroupKind> namespaceResourceBlacklist = null;

  @JsonProperty("namespaceResourceWhitelist")
  @Valid
  private List<V1GroupKind> namespaceResourceWhitelist = null;

  @JsonProperty("orphanedResources")
  private V1alpha1OrphanedResourcesMonitorSettings orphanedResources = null;

  @JsonProperty("permitOnlyProjectScopedClusters")
  private Boolean permitOnlyProjectScopedClusters = null;

  @JsonProperty("roles")
  @Valid
  private List<V1alpha1ProjectRole> roles = null;

  @JsonProperty("signatureKeys")
  @Valid
  private List<V1alpha1SignatureKey> signatureKeys = null;

  @JsonProperty("sourceNamespaces")
  @Valid
  private List<String> sourceNamespaces = null;

  @JsonProperty("sourceRepos")
  @Valid
  private List<String> sourceRepos = null;

  @JsonProperty("syncWindows")
  @Valid
  private List<V1alpha1SyncWindow> syncWindows = null;

  public V1alpha1AppProjectSpec clusterResourceBlacklist(List<V1GroupKind> clusterResourceBlacklist) {
    this.clusterResourceBlacklist = clusterResourceBlacklist;
    return this;
  }

  public V1alpha1AppProjectSpec addClusterResourceBlacklistItem(V1GroupKind clusterResourceBlacklistItem) {
    if (this.clusterResourceBlacklist == null) {
      this.clusterResourceBlacklist = new ArrayList<>();
    }
    this.clusterResourceBlacklist.add(clusterResourceBlacklistItem);
    return this;
  }

  /**
   * Get clusterResourceBlacklist
   * @return clusterResourceBlacklist
   **/
  @Schema(description = "")
      @Valid
    public List<V1GroupKind> getClusterResourceBlacklist() {
    return clusterResourceBlacklist;
  }

  public void setClusterResourceBlacklist(List<V1GroupKind> clusterResourceBlacklist) {
    this.clusterResourceBlacklist = clusterResourceBlacklist;
  }

  public V1alpha1AppProjectSpec clusterResourceWhitelist(List<V1GroupKind> clusterResourceWhitelist) {
    this.clusterResourceWhitelist = clusterResourceWhitelist;
    return this;
  }

  public V1alpha1AppProjectSpec addClusterResourceWhitelistItem(V1GroupKind clusterResourceWhitelistItem) {
    if (this.clusterResourceWhitelist == null) {
      this.clusterResourceWhitelist = new ArrayList<>();
    }
    this.clusterResourceWhitelist.add(clusterResourceWhitelistItem);
    return this;
  }

  /**
   * Get clusterResourceWhitelist
   * @return clusterResourceWhitelist
   **/
  @Schema(description = "")
      @Valid
    public List<V1GroupKind> getClusterResourceWhitelist() {
    return clusterResourceWhitelist;
  }

  public void setClusterResourceWhitelist(List<V1GroupKind> clusterResourceWhitelist) {
    this.clusterResourceWhitelist = clusterResourceWhitelist;
  }

  public V1alpha1AppProjectSpec description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @Schema(description = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public V1alpha1AppProjectSpec destinations(List<V1alpha1ApplicationDestination> destinations) {
    this.destinations = destinations;
    return this;
  }

  public V1alpha1AppProjectSpec addDestinationsItem(V1alpha1ApplicationDestination destinationsItem) {
    if (this.destinations == null) {
      this.destinations = new ArrayList<>();
    }
    this.destinations.add(destinationsItem);
    return this;
  }

  /**
   * Get destinations
   * @return destinations
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1ApplicationDestination> getDestinations() {
    return destinations;
  }

  public void setDestinations(List<V1alpha1ApplicationDestination> destinations) {
    this.destinations = destinations;
  }

  public V1alpha1AppProjectSpec namespaceResourceBlacklist(List<V1GroupKind> namespaceResourceBlacklist) {
    this.namespaceResourceBlacklist = namespaceResourceBlacklist;
    return this;
  }

  public V1alpha1AppProjectSpec addNamespaceResourceBlacklistItem(V1GroupKind namespaceResourceBlacklistItem) {
    if (this.namespaceResourceBlacklist == null) {
      this.namespaceResourceBlacklist = new ArrayList<>();
    }
    this.namespaceResourceBlacklist.add(namespaceResourceBlacklistItem);
    return this;
  }

  /**
   * Get namespaceResourceBlacklist
   * @return namespaceResourceBlacklist
   **/
  @Schema(description = "")
      @Valid
    public List<V1GroupKind> getNamespaceResourceBlacklist() {
    return namespaceResourceBlacklist;
  }

  public void setNamespaceResourceBlacklist(List<V1GroupKind> namespaceResourceBlacklist) {
    this.namespaceResourceBlacklist = namespaceResourceBlacklist;
  }

  public V1alpha1AppProjectSpec namespaceResourceWhitelist(List<V1GroupKind> namespaceResourceWhitelist) {
    this.namespaceResourceWhitelist = namespaceResourceWhitelist;
    return this;
  }

  public V1alpha1AppProjectSpec addNamespaceResourceWhitelistItem(V1GroupKind namespaceResourceWhitelistItem) {
    if (this.namespaceResourceWhitelist == null) {
      this.namespaceResourceWhitelist = new ArrayList<>();
    }
    this.namespaceResourceWhitelist.add(namespaceResourceWhitelistItem);
    return this;
  }

  /**
   * Get namespaceResourceWhitelist
   * @return namespaceResourceWhitelist
   **/
  @Schema(description = "")
      @Valid
    public List<V1GroupKind> getNamespaceResourceWhitelist() {
    return namespaceResourceWhitelist;
  }

  public void setNamespaceResourceWhitelist(List<V1GroupKind> namespaceResourceWhitelist) {
    this.namespaceResourceWhitelist = namespaceResourceWhitelist;
  }

  public V1alpha1AppProjectSpec orphanedResources(V1alpha1OrphanedResourcesMonitorSettings orphanedResources) {
    this.orphanedResources = orphanedResources;
    return this;
  }

  /**
   * Get orphanedResources
   * @return orphanedResources
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1OrphanedResourcesMonitorSettings getOrphanedResources() {
    return orphanedResources;
  }

  public void setOrphanedResources(V1alpha1OrphanedResourcesMonitorSettings orphanedResources) {
    this.orphanedResources = orphanedResources;
  }

  public V1alpha1AppProjectSpec permitOnlyProjectScopedClusters(Boolean permitOnlyProjectScopedClusters) {
    this.permitOnlyProjectScopedClusters = permitOnlyProjectScopedClusters;
    return this;
  }

  /**
   * Get permitOnlyProjectScopedClusters
   * @return permitOnlyProjectScopedClusters
   **/
  @Schema(description = "")
  
    public Boolean isPermitOnlyProjectScopedClusters() {
    return permitOnlyProjectScopedClusters;
  }

  public void setPermitOnlyProjectScopedClusters(Boolean permitOnlyProjectScopedClusters) {
    this.permitOnlyProjectScopedClusters = permitOnlyProjectScopedClusters;
  }

  public V1alpha1AppProjectSpec roles(List<V1alpha1ProjectRole> roles) {
    this.roles = roles;
    return this;
  }

  public V1alpha1AppProjectSpec addRolesItem(V1alpha1ProjectRole rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Get roles
   * @return roles
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1ProjectRole> getRoles() {
    return roles;
  }

  public void setRoles(List<V1alpha1ProjectRole> roles) {
    this.roles = roles;
  }

  public V1alpha1AppProjectSpec signatureKeys(List<V1alpha1SignatureKey> signatureKeys) {
    this.signatureKeys = signatureKeys;
    return this;
  }

  public V1alpha1AppProjectSpec addSignatureKeysItem(V1alpha1SignatureKey signatureKeysItem) {
    if (this.signatureKeys == null) {
      this.signatureKeys = new ArrayList<>();
    }
    this.signatureKeys.add(signatureKeysItem);
    return this;
  }

  /**
   * Get signatureKeys
   * @return signatureKeys
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1SignatureKey> getSignatureKeys() {
    return signatureKeys;
  }

  public void setSignatureKeys(List<V1alpha1SignatureKey> signatureKeys) {
    this.signatureKeys = signatureKeys;
  }

  public V1alpha1AppProjectSpec sourceNamespaces(List<String> sourceNamespaces) {
    this.sourceNamespaces = sourceNamespaces;
    return this;
  }

  public V1alpha1AppProjectSpec addSourceNamespacesItem(String sourceNamespacesItem) {
    if (this.sourceNamespaces == null) {
      this.sourceNamespaces = new ArrayList<>();
    }
    this.sourceNamespaces.add(sourceNamespacesItem);
    return this;
  }

  /**
   * Get sourceNamespaces
   * @return sourceNamespaces
   **/
  @Schema(description = "")
  
    public List<String> getSourceNamespaces() {
    return sourceNamespaces;
  }

  public void setSourceNamespaces(List<String> sourceNamespaces) {
    this.sourceNamespaces = sourceNamespaces;
  }

  public V1alpha1AppProjectSpec sourceRepos(List<String> sourceRepos) {
    this.sourceRepos = sourceRepos;
    return this;
  }

  public V1alpha1AppProjectSpec addSourceReposItem(String sourceReposItem) {
    if (this.sourceRepos == null) {
      this.sourceRepos = new ArrayList<>();
    }
    this.sourceRepos.add(sourceReposItem);
    return this;
  }

  /**
   * Get sourceRepos
   * @return sourceRepos
   **/
  @Schema(description = "")
  
    public List<String> getSourceRepos() {
    return sourceRepos;
  }

  public void setSourceRepos(List<String> sourceRepos) {
    this.sourceRepos = sourceRepos;
  }

  public V1alpha1AppProjectSpec syncWindows(List<V1alpha1SyncWindow> syncWindows) {
    this.syncWindows = syncWindows;
    return this;
  }

  public V1alpha1AppProjectSpec addSyncWindowsItem(V1alpha1SyncWindow syncWindowsItem) {
    if (this.syncWindows == null) {
      this.syncWindows = new ArrayList<>();
    }
    this.syncWindows.add(syncWindowsItem);
    return this;
  }

  /**
   * Get syncWindows
   * @return syncWindows
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1SyncWindow> getSyncWindows() {
    return syncWindows;
  }

  public void setSyncWindows(List<V1alpha1SyncWindow> syncWindows) {
    this.syncWindows = syncWindows;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1AppProjectSpec v1alpha1AppProjectSpec = (V1alpha1AppProjectSpec) o;
    return Objects.equals(this.clusterResourceBlacklist, v1alpha1AppProjectSpec.clusterResourceBlacklist) &&
        Objects.equals(this.clusterResourceWhitelist, v1alpha1AppProjectSpec.clusterResourceWhitelist) &&
        Objects.equals(this.description, v1alpha1AppProjectSpec.description) &&
        Objects.equals(this.destinations, v1alpha1AppProjectSpec.destinations) &&
        Objects.equals(this.namespaceResourceBlacklist, v1alpha1AppProjectSpec.namespaceResourceBlacklist) &&
        Objects.equals(this.namespaceResourceWhitelist, v1alpha1AppProjectSpec.namespaceResourceWhitelist) &&
        Objects.equals(this.orphanedResources, v1alpha1AppProjectSpec.orphanedResources) &&
        Objects.equals(this.permitOnlyProjectScopedClusters, v1alpha1AppProjectSpec.permitOnlyProjectScopedClusters) &&
        Objects.equals(this.roles, v1alpha1AppProjectSpec.roles) &&
        Objects.equals(this.signatureKeys, v1alpha1AppProjectSpec.signatureKeys) &&
        Objects.equals(this.sourceNamespaces, v1alpha1AppProjectSpec.sourceNamespaces) &&
        Objects.equals(this.sourceRepos, v1alpha1AppProjectSpec.sourceRepos) &&
        Objects.equals(this.syncWindows, v1alpha1AppProjectSpec.syncWindows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterResourceBlacklist, clusterResourceWhitelist, description, destinations, namespaceResourceBlacklist, namespaceResourceWhitelist, orphanedResources, permitOnlyProjectScopedClusters, roles, signatureKeys, sourceNamespaces, sourceRepos, syncWindows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1AppProjectSpec {\n");
    
    sb.append("    clusterResourceBlacklist: ").append(toIndentedString(clusterResourceBlacklist)).append("\n");
    sb.append("    clusterResourceWhitelist: ").append(toIndentedString(clusterResourceWhitelist)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    destinations: ").append(toIndentedString(destinations)).append("\n");
    sb.append("    namespaceResourceBlacklist: ").append(toIndentedString(namespaceResourceBlacklist)).append("\n");
    sb.append("    namespaceResourceWhitelist: ").append(toIndentedString(namespaceResourceWhitelist)).append("\n");
    sb.append("    orphanedResources: ").append(toIndentedString(orphanedResources)).append("\n");
    sb.append("    permitOnlyProjectScopedClusters: ").append(toIndentedString(permitOnlyProjectScopedClusters)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    signatureKeys: ").append(toIndentedString(signatureKeys)).append("\n");
    sb.append("    sourceNamespaces: ").append(toIndentedString(sourceNamespaces)).append("\n");
    sb.append("    sourceRepos: ").append(toIndentedString(sourceRepos)).append("\n");
    sb.append("    syncWindows: ").append(toIndentedString(syncWindows)).append("\n");
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
