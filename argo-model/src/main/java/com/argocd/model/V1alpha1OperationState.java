package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1OperationState
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1OperationState  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("finishedAt")
  private V1Time finishedAt = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("operation")
  private V1alpha1Operation operation = null;

  @JsonProperty("phase")
  private String phase = null;

  @JsonProperty("retryCount")
  private String retryCount = null;

  @JsonProperty("startedAt")
  private V1Time startedAt = null;

  @JsonProperty("syncResult")
  private V1alpha1SyncOperationResult syncResult = null;

  public V1alpha1OperationState finishedAt(V1Time finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

  /**
   * Get finishedAt
   * @return finishedAt
   **/
  @Schema(description = "")
  
    @Valid
    public V1Time getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(V1Time finishedAt) {
    this.finishedAt = finishedAt;
  }

  public V1alpha1OperationState message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Message holds any pertinent messages when attempting to perform operation (typically errors).
   * @return message
   **/
  @Schema(description = "Message holds any pertinent messages when attempting to perform operation (typically errors).")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1alpha1OperationState operation(V1alpha1Operation operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1Operation getOperation() {
    return operation;
  }

  public void setOperation(V1alpha1Operation operation) {
    this.operation = operation;
  }

  public V1alpha1OperationState phase(String phase) {
    this.phase = phase;
    return this;
  }

  /**
   * Get phase
   * @return phase
   **/
  @Schema(description = "")
  
    public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public V1alpha1OperationState retryCount(String retryCount) {
    this.retryCount = retryCount;
    return this;
  }

  /**
   * Get retryCount
   * @return retryCount
   **/
  @Schema(description = "")
  
    public String getRetryCount() {
    return retryCount;
  }

  public void setRetryCount(String retryCount) {
    this.retryCount = retryCount;
  }

  public V1alpha1OperationState startedAt(V1Time startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Get startedAt
   * @return startedAt
   **/
  @Schema(description = "")
  
    @Valid
    public V1Time getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(V1Time startedAt) {
    this.startedAt = startedAt;
  }

  public V1alpha1OperationState syncResult(V1alpha1SyncOperationResult syncResult) {
    this.syncResult = syncResult;
    return this;
  }

  /**
   * Get syncResult
   * @return syncResult
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1SyncOperationResult getSyncResult() {
    return syncResult;
  }

  public void setSyncResult(V1alpha1SyncOperationResult syncResult) {
    this.syncResult = syncResult;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OperationState v1alpha1OperationState = (V1alpha1OperationState) o;
    return Objects.equals(this.finishedAt, v1alpha1OperationState.finishedAt) &&
        Objects.equals(this.message, v1alpha1OperationState.message) &&
        Objects.equals(this.operation, v1alpha1OperationState.operation) &&
        Objects.equals(this.phase, v1alpha1OperationState.phase) &&
        Objects.equals(this.retryCount, v1alpha1OperationState.retryCount) &&
        Objects.equals(this.startedAt, v1alpha1OperationState.startedAt) &&
        Objects.equals(this.syncResult, v1alpha1OperationState.syncResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finishedAt, message, operation, phase, retryCount, startedAt, syncResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OperationState {\n");
    
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    retryCount: ").append(toIndentedString(retryCount)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    syncResult: ").append(toIndentedString(syncResult)).append("\n");
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
