package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1SyncStrategy
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1SyncStrategy  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("apply")
  private V1alpha1SyncStrategyApply apply = null;

  @JsonProperty("hook")
  private V1alpha1SyncStrategyHook hook = null;

  public V1alpha1SyncStrategy apply(V1alpha1SyncStrategyApply apply) {
    this.apply = apply;
    return this;
  }

  /**
   * Get apply
   * @return apply
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1SyncStrategyApply getApply() {
    return apply;
  }

  public void setApply(V1alpha1SyncStrategyApply apply) {
    this.apply = apply;
  }

  public V1alpha1SyncStrategy hook(V1alpha1SyncStrategyHook hook) {
    this.hook = hook;
    return this;
  }

  /**
   * Get hook
   * @return hook
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1SyncStrategyHook getHook() {
    return hook;
  }

  public void setHook(V1alpha1SyncStrategyHook hook) {
    this.hook = hook;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1SyncStrategy v1alpha1SyncStrategy = (V1alpha1SyncStrategy) o;
    return Objects.equals(this.apply, v1alpha1SyncStrategy.apply) &&
        Objects.equals(this.hook, v1alpha1SyncStrategy.hook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apply, hook);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1SyncStrategy {\n");
    
    sb.append("    apply: ").append(toIndentedString(apply)).append("\n");
    sb.append("    hook: ").append(toIndentedString(hook)).append("\n");
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
