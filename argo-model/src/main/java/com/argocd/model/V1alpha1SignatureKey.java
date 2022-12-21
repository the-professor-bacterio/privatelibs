package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1SignatureKey
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1SignatureKey  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("keyID")
  private String keyID = null;

  public V1alpha1SignatureKey keyID(String keyID) {
    this.keyID = keyID;
    return this;
  }

  /**
   * Get keyID
   * @return keyID
   **/
  @Schema(description = "")
  
    public String getKeyID() {
    return keyID;
  }

  public void setKeyID(String keyID) {
    this.keyID = keyID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1SignatureKey v1alpha1SignatureKey = (V1alpha1SignatureKey) o;
    return Objects.equals(this.keyID, v1alpha1SignatureKey.keyID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1SignatureKey {\n");
    
    sb.append("    keyID: ").append(toIndentedString(keyID)).append("\n");
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
