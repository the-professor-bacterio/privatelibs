package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.*;

/**
 * V1alpha1Cluster
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1Cluster  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("annotations")
  @Valid
  private Map<String, String> annotations = null;

  @JsonProperty("clusterResources")
  private Boolean clusterResources = null;

  @JsonProperty("config")
  private V1alpha1ClusterConfig config = null;

  @JsonProperty("connectionState")
  private V1alpha1ConnectionState connectionState = null;

  @JsonProperty("info")
  private V1alpha1ClusterInfo info = null;

  @JsonProperty("labels")
  @Valid
  private Map<String, String> labels = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("namespaces")
  @Valid
  private List<String> namespaces = null;

  @JsonProperty("project")
  private String project = null;

  @JsonProperty("refreshRequestedAt")
  private V1Time refreshRequestedAt = null;

  @JsonProperty("server")
  private String server = null;

  @JsonProperty("serverVersion")
  private String serverVersion = null;

  @JsonProperty("shard")
  private String shard = null;

  public V1alpha1Cluster annotations(Map<String, String> annotations) {
    this.annotations = annotations;
    return this;
  }

  public V1alpha1Cluster putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

  /**
   * Get annotations
   * @return annotations
   **/
  @Schema(description = "")
  
    public Map<String, String> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }

  public V1alpha1Cluster clusterResources(Boolean clusterResources) {
    this.clusterResources = clusterResources;
    return this;
  }

  /**
   * Indicates if cluster level resources should be managed. This setting is used only if cluster is connected in a namespaced mode.
   * @return clusterResources
   **/
  @Schema(description = "Indicates if cluster level resources should be managed. This setting is used only if cluster is connected in a namespaced mode.")
  
    public Boolean isClusterResources() {
    return clusterResources;
  }

  public void setClusterResources(Boolean clusterResources) {
    this.clusterResources = clusterResources;
  }

  public V1alpha1Cluster config(V1alpha1ClusterConfig config) {
    this.config = config;
    return this;
  }

  /**
   * Get config
   * @return config
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ClusterConfig getConfig() {
    return config;
  }

  public void setConfig(V1alpha1ClusterConfig config) {
    this.config = config;
  }

  public V1alpha1Cluster connectionState(V1alpha1ConnectionState connectionState) {
    this.connectionState = connectionState;
    return this;
  }

  /**
   * Get connectionState
   * @return connectionState
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ConnectionState getConnectionState() {
    return connectionState;
  }

  public void setConnectionState(V1alpha1ConnectionState connectionState) {
    this.connectionState = connectionState;
  }

  public V1alpha1Cluster info(V1alpha1ClusterInfo info) {
    this.info = info;
    return this;
  }

  /**
   * Get info
   * @return info
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ClusterInfo getInfo() {
    return info;
  }

  public void setInfo(V1alpha1ClusterInfo info) {
    this.info = info;
  }

  public V1alpha1Cluster labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public V1alpha1Cluster putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
   **/
  @Schema(description = "")
  
    public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public V1alpha1Cluster name(String name) {
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

  public V1alpha1Cluster namespaces(List<String> namespaces) {
    this.namespaces = namespaces;
    return this;
  }

  public V1alpha1Cluster addNamespacesItem(String namespacesItem) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList<>();
    }
    this.namespaces.add(namespacesItem);
    return this;
  }

  /**
   * Holds list of namespaces which are accessible in that cluster. Cluster level resources will be ignored if namespace list is not empty.
   * @return namespaces
   **/
  @Schema(description = "Holds list of namespaces which are accessible in that cluster. Cluster level resources will be ignored if namespace list is not empty.")
  
    public List<String> getNamespaces() {
    return namespaces;
  }

  public void setNamespaces(List<String> namespaces) {
    this.namespaces = namespaces;
  }

  public V1alpha1Cluster project(String project) {
    this.project = project;
    return this;
  }

  /**
   * Get project
   * @return project
   **/
  @Schema(description = "")
  
    public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public V1alpha1Cluster refreshRequestedAt(V1Time refreshRequestedAt) {
    this.refreshRequestedAt = refreshRequestedAt;
    return this;
  }

  /**
   * Get refreshRequestedAt
   * @return refreshRequestedAt
   **/
  @Schema(description = "")
  
    @Valid
    public V1Time getRefreshRequestedAt() {
    return refreshRequestedAt;
  }

  public void setRefreshRequestedAt(V1Time refreshRequestedAt) {
    this.refreshRequestedAt = refreshRequestedAt;
  }

  public V1alpha1Cluster server(String server) {
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

  public V1alpha1Cluster serverVersion(String serverVersion) {
    this.serverVersion = serverVersion;
    return this;
  }

  /**
   * Get serverVersion
   * @return serverVersion
   **/
  @Schema(description = "")
  
    public String getServerVersion() {
    return serverVersion;
  }

  public void setServerVersion(String serverVersion) {
    this.serverVersion = serverVersion;
  }

  public V1alpha1Cluster shard(String shard) {
    this.shard = shard;
    return this;
  }

  /**
   * Shard contains optional shard number. Calculated on the fly by the application controller if not specified.
   * @return shard
   **/
  @Schema(description = "Shard contains optional shard number. Calculated on the fly by the application controller if not specified.")
  
    public String getShard() {
    return shard;
  }

  public void setShard(String shard) {
    this.shard = shard;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1Cluster v1alpha1Cluster = (V1alpha1Cluster) o;
    return Objects.equals(this.annotations, v1alpha1Cluster.annotations) &&
        Objects.equals(this.clusterResources, v1alpha1Cluster.clusterResources) &&
        Objects.equals(this.config, v1alpha1Cluster.config) &&
        Objects.equals(this.connectionState, v1alpha1Cluster.connectionState) &&
        Objects.equals(this.info, v1alpha1Cluster.info) &&
        Objects.equals(this.labels, v1alpha1Cluster.labels) &&
        Objects.equals(this.name, v1alpha1Cluster.name) &&
        Objects.equals(this.namespaces, v1alpha1Cluster.namespaces) &&
        Objects.equals(this.project, v1alpha1Cluster.project) &&
        Objects.equals(this.refreshRequestedAt, v1alpha1Cluster.refreshRequestedAt) &&
        Objects.equals(this.server, v1alpha1Cluster.server) &&
        Objects.equals(this.serverVersion, v1alpha1Cluster.serverVersion) &&
        Objects.equals(this.shard, v1alpha1Cluster.shard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, clusterResources, config, connectionState, info, labels, name, namespaces, project, refreshRequestedAt, server, serverVersion, shard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1Cluster {\n");
    
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    clusterResources: ").append(toIndentedString(clusterResources)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    connectionState: ").append(toIndentedString(connectionState)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    refreshRequestedAt: ").append(toIndentedString(refreshRequestedAt)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    serverVersion: ").append(toIndentedString(serverVersion)).append("\n");
    sb.append("    shard: ").append(toIndentedString(shard)).append("\n");
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
