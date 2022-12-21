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
 * V1alpha1ApplicationStatus
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ApplicationStatus  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("conditions")
  @Valid
  private List<V1alpha1ApplicationCondition> conditions = null;

  @JsonProperty("health")
  private V1alpha1HealthStatus health = null;

  @JsonProperty("history")
  @Valid
  private List<V1alpha1RevisionHistory> history = null;

  @JsonProperty("observedAt")
  private V1Time observedAt = null;

  @JsonProperty("operationState")
  private V1alpha1OperationState operationState = null;

  @JsonProperty("reconciledAt")
  private V1Time reconciledAt = null;

  @JsonProperty("resourceHealthSource")
  private String resourceHealthSource = null;

  @JsonProperty("resources")
  @Valid
  private List<V1alpha1ResourceStatus> resources = null;

  @JsonProperty("sourceType")
  private String sourceType = null;

  @JsonProperty("summary")
  private V1alpha1ApplicationSummary summary = null;

  @JsonProperty("sync")
  private V1alpha1SyncStatus sync = null;

  public V1alpha1ApplicationStatus conditions(List<V1alpha1ApplicationCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public V1alpha1ApplicationStatus addConditionsItem(V1alpha1ApplicationCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * Get conditions
   * @return conditions
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1ApplicationCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1alpha1ApplicationCondition> conditions) {
    this.conditions = conditions;
  }

  public V1alpha1ApplicationStatus health(V1alpha1HealthStatus health) {
    this.health = health;
    return this;
  }

  /**
   * Get health
   * @return health
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1HealthStatus getHealth() {
    return health;
  }

  public void setHealth(V1alpha1HealthStatus health) {
    this.health = health;
  }

  public V1alpha1ApplicationStatus history(List<V1alpha1RevisionHistory> history) {
    this.history = history;
    return this;
  }

  public V1alpha1ApplicationStatus addHistoryItem(V1alpha1RevisionHistory historyItem) {
    if (this.history == null) {
      this.history = new ArrayList<>();
    }
    this.history.add(historyItem);
    return this;
  }

  /**
   * Get history
   * @return history
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1RevisionHistory> getHistory() {
    return history;
  }

  public void setHistory(List<V1alpha1RevisionHistory> history) {
    this.history = history;
  }

  public V1alpha1ApplicationStatus observedAt(V1Time observedAt) {
    this.observedAt = observedAt;
    return this;
  }

  /**
   * Get observedAt
   * @return observedAt
   **/
  @Schema(description = "")
  
    @Valid
    public V1Time getObservedAt() {
    return observedAt;
  }

  public void setObservedAt(V1Time observedAt) {
    this.observedAt = observedAt;
  }

  public V1alpha1ApplicationStatus operationState(V1alpha1OperationState operationState) {
    this.operationState = operationState;
    return this;
  }

  /**
   * Get operationState
   * @return operationState
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1OperationState getOperationState() {
    return operationState;
  }

  public void setOperationState(V1alpha1OperationState operationState) {
    this.operationState = operationState;
  }

  public V1alpha1ApplicationStatus reconciledAt(V1Time reconciledAt) {
    this.reconciledAt = reconciledAt;
    return this;
  }

  /**
   * Get reconciledAt
   * @return reconciledAt
   **/
  @Schema(description = "")
  
    @Valid
    public V1Time getReconciledAt() {
    return reconciledAt;
  }

  public void setReconciledAt(V1Time reconciledAt) {
    this.reconciledAt = reconciledAt;
  }

  public V1alpha1ApplicationStatus resourceHealthSource(String resourceHealthSource) {
    this.resourceHealthSource = resourceHealthSource;
    return this;
  }

  /**
   * Get resourceHealthSource
   * @return resourceHealthSource
   **/
  @Schema(description = "")
  
    public String getResourceHealthSource() {
    return resourceHealthSource;
  }

  public void setResourceHealthSource(String resourceHealthSource) {
    this.resourceHealthSource = resourceHealthSource;
  }

  public V1alpha1ApplicationStatus resources(List<V1alpha1ResourceStatus> resources) {
    this.resources = resources;
    return this;
  }

  public V1alpha1ApplicationStatus addResourcesItem(V1alpha1ResourceStatus resourcesItem) {
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
    public List<V1alpha1ResourceStatus> getResources() {
    return resources;
  }

  public void setResources(List<V1alpha1ResourceStatus> resources) {
    this.resources = resources;
  }

  public V1alpha1ApplicationStatus sourceType(String sourceType) {
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

  public V1alpha1ApplicationStatus summary(V1alpha1ApplicationSummary summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ApplicationSummary getSummary() {
    return summary;
  }

  public void setSummary(V1alpha1ApplicationSummary summary) {
    this.summary = summary;
  }

  public V1alpha1ApplicationStatus sync(V1alpha1SyncStatus sync) {
    this.sync = sync;
    return this;
  }

  /**
   * Get sync
   * @return sync
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1SyncStatus getSync() {
    return sync;
  }

  public void setSync(V1alpha1SyncStatus sync) {
    this.sync = sync;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ApplicationStatus v1alpha1ApplicationStatus = (V1alpha1ApplicationStatus) o;
    return Objects.equals(this.conditions, v1alpha1ApplicationStatus.conditions) &&
        Objects.equals(this.health, v1alpha1ApplicationStatus.health) &&
        Objects.equals(this.history, v1alpha1ApplicationStatus.history) &&
        Objects.equals(this.observedAt, v1alpha1ApplicationStatus.observedAt) &&
        Objects.equals(this.operationState, v1alpha1ApplicationStatus.operationState) &&
        Objects.equals(this.reconciledAt, v1alpha1ApplicationStatus.reconciledAt) &&
        Objects.equals(this.resourceHealthSource, v1alpha1ApplicationStatus.resourceHealthSource) &&
        Objects.equals(this.resources, v1alpha1ApplicationStatus.resources) &&
        Objects.equals(this.sourceType, v1alpha1ApplicationStatus.sourceType) &&
        Objects.equals(this.summary, v1alpha1ApplicationStatus.summary) &&
        Objects.equals(this.sync, v1alpha1ApplicationStatus.sync);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, health, history, observedAt, operationState, reconciledAt, resourceHealthSource, resources, sourceType, summary, sync);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ApplicationStatus {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    observedAt: ").append(toIndentedString(observedAt)).append("\n");
    sb.append("    operationState: ").append(toIndentedString(operationState)).append("\n");
    sb.append("    reconciledAt: ").append(toIndentedString(reconciledAt)).append("\n");
    sb.append("    resourceHealthSource: ").append(toIndentedString(resourceHealthSource)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    sync: ").append(toIndentedString(sync)).append("\n");
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
