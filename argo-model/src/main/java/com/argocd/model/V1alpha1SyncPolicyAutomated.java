package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1SyncPolicyAutomated
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1SyncPolicyAutomated  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("allowEmpty")
  private Boolean allowEmpty = null;

  @JsonProperty("prune")
  private Boolean prune = null;

  @JsonProperty("selfHeal")
  private Boolean selfHeal = null;

  public V1alpha1SyncPolicyAutomated allowEmpty(Boolean allowEmpty) {
    this.allowEmpty = allowEmpty;
    return this;
  }

  /**
   * Get allowEmpty
   * @return allowEmpty
   **/
  @Schema(description = "")
  
    public Boolean isAllowEmpty() {
    return allowEmpty;
  }

  public void setAllowEmpty(Boolean allowEmpty) {
    this.allowEmpty = allowEmpty;
  }

  public V1alpha1SyncPolicyAutomated prune(Boolean prune) {
    this.prune = prune;
    return this;
  }

  /**
   * Get prune
   * @return prune
   **/
  @Schema(description = "")
  
    public Boolean isPrune() {
    return prune;
  }

  public void setPrune(Boolean prune) {
    this.prune = prune;
  }

  public V1alpha1SyncPolicyAutomated selfHeal(Boolean selfHeal) {
    this.selfHeal = selfHeal;
    return this;
  }

  /**
   * Get selfHeal
   * @return selfHeal
   **/
  @Schema(description = "")
  
    public Boolean isSelfHeal() {
    return selfHeal;
  }

  public void setSelfHeal(Boolean selfHeal) {
    this.selfHeal = selfHeal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1SyncPolicyAutomated v1alpha1SyncPolicyAutomated = (V1alpha1SyncPolicyAutomated) o;
    return Objects.equals(this.allowEmpty, v1alpha1SyncPolicyAutomated.allowEmpty) &&
        Objects.equals(this.prune, v1alpha1SyncPolicyAutomated.prune) &&
        Objects.equals(this.selfHeal, v1alpha1SyncPolicyAutomated.selfHeal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowEmpty, prune, selfHeal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1SyncPolicyAutomated {\n");
    
    sb.append("    allowEmpty: ").append(toIndentedString(allowEmpty)).append("\n");
    sb.append("    prune: ").append(toIndentedString(prune)).append("\n");
    sb.append("    selfHeal: ").append(toIndentedString(selfHeal)).append("\n");
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
