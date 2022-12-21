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
 * V1alpha1SyncWindow
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1SyncWindow  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("applications")
  @Valid
  private List<String> applications = null;

  @JsonProperty("clusters")
  @Valid
  private List<String> clusters = null;

  @JsonProperty("duration")
  private String duration = null;

  @JsonProperty("kind")
  private String kind = null;

  @JsonProperty("manualSync")
  private Boolean manualSync = null;

  @JsonProperty("namespaces")
  @Valid
  private List<String> namespaces = null;

  @JsonProperty("schedule")
  private String schedule = null;

  @JsonProperty("timeZone")
  private String timeZone = null;

  public V1alpha1SyncWindow applications(List<String> applications) {
    this.applications = applications;
    return this;
  }

  public V1alpha1SyncWindow addApplicationsItem(String applicationsItem) {
    if (this.applications == null) {
      this.applications = new ArrayList<>();
    }
    this.applications.add(applicationsItem);
    return this;
  }

  /**
   * Get applications
   * @return applications
   **/
  @Schema(description = "")
  
    public List<String> getApplications() {
    return applications;
  }

  public void setApplications(List<String> applications) {
    this.applications = applications;
  }

  public V1alpha1SyncWindow clusters(List<String> clusters) {
    this.clusters = clusters;
    return this;
  }

  public V1alpha1SyncWindow addClustersItem(String clustersItem) {
    if (this.clusters == null) {
      this.clusters = new ArrayList<>();
    }
    this.clusters.add(clustersItem);
    return this;
  }

  /**
   * Get clusters
   * @return clusters
   **/
  @Schema(description = "")
  
    public List<String> getClusters() {
    return clusters;
  }

  public void setClusters(List<String> clusters) {
    this.clusters = clusters;
  }

  public V1alpha1SyncWindow duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
   **/
  @Schema(description = "")
  
    public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public V1alpha1SyncWindow kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Get kind
   * @return kind
   **/
  @Schema(description = "")
  
    public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1alpha1SyncWindow manualSync(Boolean manualSync) {
    this.manualSync = manualSync;
    return this;
  }

  /**
   * Get manualSync
   * @return manualSync
   **/
  @Schema(description = "")
  
    public Boolean isManualSync() {
    return manualSync;
  }

  public void setManualSync(Boolean manualSync) {
    this.manualSync = manualSync;
  }

  public V1alpha1SyncWindow namespaces(List<String> namespaces) {
    this.namespaces = namespaces;
    return this;
  }

  public V1alpha1SyncWindow addNamespacesItem(String namespacesItem) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList<>();
    }
    this.namespaces.add(namespacesItem);
    return this;
  }

  /**
   * Get namespaces
   * @return namespaces
   **/
  @Schema(description = "")
  
    public List<String> getNamespaces() {
    return namespaces;
  }

  public void setNamespaces(List<String> namespaces) {
    this.namespaces = namespaces;
  }

  public V1alpha1SyncWindow schedule(String schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Get schedule
   * @return schedule
   **/
  @Schema(description = "")
  
    public String getSchedule() {
    return schedule;
  }

  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }

  public V1alpha1SyncWindow timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Get timeZone
   * @return timeZone
   **/
  @Schema(description = "")
  
    public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1SyncWindow v1alpha1SyncWindow = (V1alpha1SyncWindow) o;
    return Objects.equals(this.applications, v1alpha1SyncWindow.applications) &&
        Objects.equals(this.clusters, v1alpha1SyncWindow.clusters) &&
        Objects.equals(this.duration, v1alpha1SyncWindow.duration) &&
        Objects.equals(this.kind, v1alpha1SyncWindow.kind) &&
        Objects.equals(this.manualSync, v1alpha1SyncWindow.manualSync) &&
        Objects.equals(this.namespaces, v1alpha1SyncWindow.namespaces) &&
        Objects.equals(this.schedule, v1alpha1SyncWindow.schedule) &&
        Objects.equals(this.timeZone, v1alpha1SyncWindow.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applications, clusters, duration, kind, manualSync, namespaces, schedule, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1SyncWindow {\n");
    
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    manualSync: ").append(toIndentedString(manualSync)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
