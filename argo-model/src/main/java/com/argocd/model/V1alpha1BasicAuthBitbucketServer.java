package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * BasicAuthBitbucketServer defines the username/(password or personal access token) for Basic auth.
 */
@Schema(description = "BasicAuthBitbucketServer defines the username/(password or personal access token) for Basic auth.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1BasicAuthBitbucketServer  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("passwordRef")
  private V1alpha1SecretRef passwordRef = null;

  @JsonProperty("username")
  private String username = null;

  public V1alpha1BasicAuthBitbucketServer passwordRef(V1alpha1SecretRef passwordRef) {
    this.passwordRef = passwordRef;
    return this;
  }

  /**
   * Get passwordRef
   * @return passwordRef
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1SecretRef getPasswordRef() {
    return passwordRef;
  }

  public void setPasswordRef(V1alpha1SecretRef passwordRef) {
    this.passwordRef = passwordRef;
  }

  public V1alpha1BasicAuthBitbucketServer username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   **/
  @Schema(description = "")
  
    public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1BasicAuthBitbucketServer v1alpha1BasicAuthBitbucketServer = (V1alpha1BasicAuthBitbucketServer) o;
    return Objects.equals(this.passwordRef, v1alpha1BasicAuthBitbucketServer.passwordRef) &&
        Objects.equals(this.username, v1alpha1BasicAuthBitbucketServer.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passwordRef, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1BasicAuthBitbucketServer {\n");
    
    sb.append("    passwordRef: ").append(toIndentedString(passwordRef)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
