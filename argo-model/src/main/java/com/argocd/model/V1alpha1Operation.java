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
 * V1alpha1Operation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1Operation  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("info")
  @Valid
  private List<V1alpha1Info> info = null;

  @JsonProperty("initiatedBy")
  private V1alpha1OperationInitiator initiatedBy = null;

  @JsonProperty("retry")
  private V1alpha1RetryStrategy retry = null;

  @JsonProperty("sync")
  private V1alpha1SyncOperation sync = null;

  public V1alpha1Operation info(List<V1alpha1Info> info) {
    this.info = info;
    return this;
  }

  public V1alpha1Operation addInfoItem(V1alpha1Info infoItem) {
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

  public V1alpha1Operation initiatedBy(V1alpha1OperationInitiator initiatedBy) {
    this.initiatedBy = initiatedBy;
    return this;
  }

  /**
   * Get initiatedBy
   * @return initiatedBy
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1OperationInitiator getInitiatedBy() {
    return initiatedBy;
  }

  public void setInitiatedBy(V1alpha1OperationInitiator initiatedBy) {
    this.initiatedBy = initiatedBy;
  }

  public V1alpha1Operation retry(V1alpha1RetryStrategy retry) {
    this.retry = retry;
    return this;
  }

  /**
   * Get retry
   * @return retry
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1RetryStrategy getRetry() {
    return retry;
  }

  public void setRetry(V1alpha1RetryStrategy retry) {
    this.retry = retry;
  }

  public V1alpha1Operation sync(V1alpha1SyncOperation sync) {
    this.sync = sync;
    return this;
  }

  /**
   * Get sync
   * @return sync
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1SyncOperation getSync() {
    return sync;
  }

  public void setSync(V1alpha1SyncOperation sync) {
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
    V1alpha1Operation v1alpha1Operation = (V1alpha1Operation) o;
    return Objects.equals(this.info, v1alpha1Operation.info) &&
        Objects.equals(this.initiatedBy, v1alpha1Operation.initiatedBy) &&
        Objects.equals(this.retry, v1alpha1Operation.retry) &&
        Objects.equals(this.sync, v1alpha1Operation.sync);
  }

  @Override
  public int hashCode() {
    return Objects.hash(info, initiatedBy, retry, sync);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1Operation {\n");
    
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    initiatedBy: ").append(toIndentedString(initiatedBy)).append("\n");
    sb.append("    retry: ").append(toIndentedString(retry)).append("\n");
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
