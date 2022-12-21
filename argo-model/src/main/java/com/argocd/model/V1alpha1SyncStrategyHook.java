package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * SyncStrategyHook will perform a sync using hooks annotations. If no hook annotation is specified falls back to &#x60;kubectl apply&#x60;.
 */
@Schema(description = "SyncStrategyHook will perform a sync using hooks annotations. If no hook annotation is specified falls back to `kubectl apply`.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1SyncStrategyHook  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("syncStrategyApply")
  private V1alpha1SyncStrategyApply syncStrategyApply = null;

  public V1alpha1SyncStrategyHook syncStrategyApply(V1alpha1SyncStrategyApply syncStrategyApply) {
    this.syncStrategyApply = syncStrategyApply;
    return this;
  }

  /**
   * Get syncStrategyApply
   * @return syncStrategyApply
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1SyncStrategyApply getSyncStrategyApply() {
    return syncStrategyApply;
  }

  public void setSyncStrategyApply(V1alpha1SyncStrategyApply syncStrategyApply) {
    this.syncStrategyApply = syncStrategyApply;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1SyncStrategyHook v1alpha1SyncStrategyHook = (V1alpha1SyncStrategyHook) o;
    return Objects.equals(this.syncStrategyApply, v1alpha1SyncStrategyHook.syncStrategyApply);
  }

  @Override
  public int hashCode() {
    return Objects.hash(syncStrategyApply);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1SyncStrategyHook {\n");
    
    sb.append("    syncStrategyApply: ").append(toIndentedString(syncStrategyApply)).append("\n");
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
