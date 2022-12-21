package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1JWTToken
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1JWTToken  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("exp")
  private String exp = null;

  @JsonProperty("iat")
  private String iat = null;

  @JsonProperty("id")
  private String id = null;

  public V1alpha1JWTToken exp(String exp) {
    this.exp = exp;
    return this;
  }

  /**
   * Get exp
   * @return exp
   **/
  @Schema(description = "")
  
    public String getExp() {
    return exp;
  }

  public void setExp(String exp) {
    this.exp = exp;
  }

  public V1alpha1JWTToken iat(String iat) {
    this.iat = iat;
    return this;
  }

  /**
   * Get iat
   * @return iat
   **/
  @Schema(description = "")
  
    public String getIat() {
    return iat;
  }

  public void setIat(String iat) {
    this.iat = iat;
  }

  public V1alpha1JWTToken id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1JWTToken v1alpha1JWTToken = (V1alpha1JWTToken) o;
    return Objects.equals(this.exp, v1alpha1JWTToken.exp) &&
        Objects.equals(this.iat, v1alpha1JWTToken.iat) &&
        Objects.equals(this.id, v1alpha1JWTToken.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exp, iat, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1JWTToken {\n");
    
    sb.append("    exp: ").append(toIndentedString(exp)).append("\n");
    sb.append("    iat: ").append(toIndentedString(iat)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
