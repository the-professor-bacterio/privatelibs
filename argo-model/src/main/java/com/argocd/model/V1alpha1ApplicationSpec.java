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
 * ApplicationSpec represents desired application state. Contains link to repository with application definition and additional parameters link definition revision.
 */
@Schema(description = "ApplicationSpec represents desired application state. Contains link to repository with application definition and additional parameters link definition revision.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ApplicationSpec  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("destination")
  private V1alpha1ApplicationDestination destination = null;

  @JsonProperty("ignoreDifferences")
  @Valid
  private List<V1alpha1ResourceIgnoreDifferences> ignoreDifferences = null;

  @JsonProperty("info")
  @Valid
  private List<V1alpha1Info> info = null;

  @JsonProperty("project")
  private String project = null;

  @JsonProperty("revisionHistoryLimit")
  private String revisionHistoryLimit = null;

  @JsonProperty("source")
  private V1alpha1ApplicationSource source = null;

  @JsonProperty("syncPolicy")
  private V1alpha1SyncPolicy syncPolicy = null;

  public V1alpha1ApplicationSpec destination(V1alpha1ApplicationDestination destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Get destination
   * @return destination
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ApplicationDestination getDestination() {
    return destination;
  }

  public void setDestination(V1alpha1ApplicationDestination destination) {
    this.destination = destination;
  }

  public V1alpha1ApplicationSpec ignoreDifferences(List<V1alpha1ResourceIgnoreDifferences> ignoreDifferences) {
    this.ignoreDifferences = ignoreDifferences;
    return this;
  }

  public V1alpha1ApplicationSpec addIgnoreDifferencesItem(V1alpha1ResourceIgnoreDifferences ignoreDifferencesItem) {
    if (this.ignoreDifferences == null) {
      this.ignoreDifferences = new ArrayList<>();
    }
    this.ignoreDifferences.add(ignoreDifferencesItem);
    return this;
  }

  /**
   * Get ignoreDifferences
   * @return ignoreDifferences
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1ResourceIgnoreDifferences> getIgnoreDifferences() {
    return ignoreDifferences;
  }

  public void setIgnoreDifferences(List<V1alpha1ResourceIgnoreDifferences> ignoreDifferences) {
    this.ignoreDifferences = ignoreDifferences;
  }

  public V1alpha1ApplicationSpec info(List<V1alpha1Info> info) {
    this.info = info;
    return this;
  }

  public V1alpha1ApplicationSpec addInfoItem(V1alpha1Info infoItem) {
    if (this.info == null) {
      this.info = new ArrayList<>();
    }
    this.info.add(infoItem);
    return this;
  }

  /**
   * Get info
   * @return info
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1Info> getInfo() {
    return info;
  }

  public void setInfo(List<V1alpha1Info> info) {
    this.info = info;
  }

  public V1alpha1ApplicationSpec project(String project) {
    this.project = project;
    return this;
  }

  /**
   * Project is a reference to the project this application belongs to. The empty string means that application belongs to the 'default' project.
   * @return project
   **/
  @Schema(description = "Project is a reference to the project this application belongs to. The empty string means that application belongs to the 'default' project.")
  
    public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public V1alpha1ApplicationSpec revisionHistoryLimit(String revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
    return this;
  }

  /**
   * RevisionHistoryLimit limits the number of items kept in the application's revision history, which is used for informational purposes as well as for rollbacks to previous versions. This should only be changed in exceptional circumstances. Setting to zero will store no history. This will reduce storage used. Increasing will increase the space used to store the history, so we do not recommend increasing it. Default is 10.
   * @return revisionHistoryLimit
   **/
  @Schema(description = "RevisionHistoryLimit limits the number of items kept in the application's revision history, which is used for informational purposes as well as for rollbacks to previous versions. This should only be changed in exceptional circumstances. Setting to zero will store no history. This will reduce storage used. Increasing will increase the space used to store the history, so we do not recommend increasing it. Default is 10.")
  
    public String getRevisionHistoryLimit() {
    return revisionHistoryLimit;
  }

  public void setRevisionHistoryLimit(String revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
  }

  public V1alpha1ApplicationSpec source(V1alpha1ApplicationSource source) {
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

  public V1alpha1ApplicationSpec syncPolicy(V1alpha1SyncPolicy syncPolicy) {
    this.syncPolicy = syncPolicy;
    return this;
  }

  /**
   * Get syncPolicy
   * @return syncPolicy
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1SyncPolicy getSyncPolicy() {
    return syncPolicy;
  }

  public void setSyncPolicy(V1alpha1SyncPolicy syncPolicy) {
    this.syncPolicy = syncPolicy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ApplicationSpec v1alpha1ApplicationSpec = (V1alpha1ApplicationSpec) o;
    return Objects.equals(this.destination, v1alpha1ApplicationSpec.destination) &&
        Objects.equals(this.ignoreDifferences, v1alpha1ApplicationSpec.ignoreDifferences) &&
        Objects.equals(this.info, v1alpha1ApplicationSpec.info) &&
        Objects.equals(this.project, v1alpha1ApplicationSpec.project) &&
        Objects.equals(this.revisionHistoryLimit, v1alpha1ApplicationSpec.revisionHistoryLimit) &&
        Objects.equals(this.source, v1alpha1ApplicationSpec.source) &&
        Objects.equals(this.syncPolicy, v1alpha1ApplicationSpec.syncPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, ignoreDifferences, info, project, revisionHistoryLimit, source, syncPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ApplicationSpec {\n");
    
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    ignoreDifferences: ").append(toIndentedString(ignoreDifferences)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    revisionHistoryLimit: ").append(toIndentedString(revisionHistoryLimit)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    syncPolicy: ").append(toIndentedString(syncPolicy)).append("\n");
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
