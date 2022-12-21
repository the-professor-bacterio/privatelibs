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
 * V1alpha1ApplicationTree
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ApplicationTree  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("hosts")
  @Valid
  private List<V1alpha1HostInfo> hosts = null;

  @JsonProperty("nodes")
  @Valid
  private List<V1alpha1ResourceNode> nodes = null;

  @JsonProperty("orphanedNodes")
  @Valid
  private List<V1alpha1ResourceNode> orphanedNodes = null;

  public V1alpha1ApplicationTree hosts(List<V1alpha1HostInfo> hosts) {
    this.hosts = hosts;
    return this;
  }

  public V1alpha1ApplicationTree addHostsItem(V1alpha1HostInfo hostsItem) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<>();
    }
    this.hosts.add(hostsItem);
    return this;
  }

  /**
   * Get hosts
   * @return hosts
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1HostInfo> getHosts() {
    return hosts;
  }

  public void setHosts(List<V1alpha1HostInfo> hosts) {
    this.hosts = hosts;
  }

  public V1alpha1ApplicationTree nodes(List<V1alpha1ResourceNode> nodes) {
    this.nodes = nodes;
    return this;
  }

  public V1alpha1ApplicationTree addNodesItem(V1alpha1ResourceNode nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

  /**
   * Nodes contains list of nodes which either directly managed by the application and children of directly managed nodes.
   * @return nodes
   **/
  @Schema(description = "Nodes contains list of nodes which either directly managed by the application and children of directly managed nodes.")
      @Valid
    public List<V1alpha1ResourceNode> getNodes() {
    return nodes;
  }

  public void setNodes(List<V1alpha1ResourceNode> nodes) {
    this.nodes = nodes;
  }

  public V1alpha1ApplicationTree orphanedNodes(List<V1alpha1ResourceNode> orphanedNodes) {
    this.orphanedNodes = orphanedNodes;
    return this;
  }

  public V1alpha1ApplicationTree addOrphanedNodesItem(V1alpha1ResourceNode orphanedNodesItem) {
    if (this.orphanedNodes == null) {
      this.orphanedNodes = new ArrayList<>();
    }
    this.orphanedNodes.add(orphanedNodesItem);
    return this;
  }

  /**
   * OrphanedNodes contains if or orphaned nodes: nodes which are not managed by the app but in the same namespace. List is populated only if orphaned resources enabled in app project.
   * @return orphanedNodes
   **/
  @Schema(description = "OrphanedNodes contains if or orphaned nodes: nodes which are not managed by the app but in the same namespace. List is populated only if orphaned resources enabled in app project.")
      @Valid
    public List<V1alpha1ResourceNode> getOrphanedNodes() {
    return orphanedNodes;
  }

  public void setOrphanedNodes(List<V1alpha1ResourceNode> orphanedNodes) {
    this.orphanedNodes = orphanedNodes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ApplicationTree v1alpha1ApplicationTree = (V1alpha1ApplicationTree) o;
    return Objects.equals(this.hosts, v1alpha1ApplicationTree.hosts) &&
        Objects.equals(this.nodes, v1alpha1ApplicationTree.nodes) &&
        Objects.equals(this.orphanedNodes, v1alpha1ApplicationTree.orphanedNodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hosts, nodes, orphanedNodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ApplicationTree {\n");
    
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    orphanedNodes: ").append(toIndentedString(orphanedNodes)).append("\n");
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
