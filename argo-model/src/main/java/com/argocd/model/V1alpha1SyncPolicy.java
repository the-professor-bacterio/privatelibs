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
 * V1alpha1SyncPolicy
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1SyncPolicy  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("automated")
  private V1alpha1SyncPolicyAutomated automated = null;

  @JsonProperty("retry")
  private V1alpha1RetryStrategy retry = null;

  @JsonProperty("syncOptions")
  @Valid
  private List<String> syncOptions = null;

  public V1alpha1SyncPolicy automated(V1alpha1SyncPolicyAutomated automated) {
    this.automated = automated;
    return this;
  }

  /**
   * Get automated
   * @return automated
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1SyncPolicyAutomated getAutomated() {
    return automated;
  }

  public void setAutomated(V1alpha1SyncPolicyAutomated automated) {
    this.automated = automated;
  }

  public V1alpha1SyncPolicy retry(V1alpha1RetryStrategy retry) {
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

  public V1alpha1SyncPolicy syncOptions(List<String> syncOptions) {
    this.syncOptions = syncOptions;
    return this;
  }

  public V1alpha1SyncPolicy addSyncOptionsItem(String syncOptionsItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1SyncPolicy v1alpha1SyncPolicy = (V1alpha1SyncPolicy) o;
    return Objects.equals(this.automated, v1alpha1SyncPolicy.automated) &&
        Objects.equals(this.retry, v1alpha1SyncPolicy.retry) &&
        Objects.equals(this.syncOptions, v1alpha1SyncPolicy.syncOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automated, retry, syncOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1SyncPolicy {\n");
    
    sb.append("    automated: ").append(toIndentedString(automated)).append("\n");
    sb.append("    retry: ").append(toIndentedString(retry)).append("\n");
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
