package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * Utility struct for a reference to a secret key.
 */
@Schema(description = "Utility struct for a reference to a secret key.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1SecretRef  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("secretName")
  private String secretName = null;

  public V1alpha1SecretRef key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
   **/
  @Schema(description = "")
  
    public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public V1alpha1SecretRef secretName(String secretName) {
    this.secretName = secretName;
    return this;
  }

  /**
   * Get secretName
   * @return secretName
   **/
  @Schema(description = "")
  
    public String getSecretName() {
    return secretName;
  }

  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1SecretRef v1alpha1SecretRef = (V1alpha1SecretRef) o;
    return Objects.equals(this.key, v1alpha1SecretRef.key) &&
        Objects.equals(this.secretName, v1alpha1SecretRef.secretName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, secretName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1SecretRef {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
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
