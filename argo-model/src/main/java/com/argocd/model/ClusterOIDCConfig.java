package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.*;

/**
 * ClusterOIDCConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class ClusterOIDCConfig  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cliClientID")
  private String cliClientID = null;

  @JsonProperty("clientID")
  private String clientID = null;

  @JsonProperty("idTokenClaims")
  @Valid
  private Map<String, OidcClaim> idTokenClaims = null;

  @JsonProperty("issuer")
  private String issuer = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("scopes")
  @Valid
  private List<String> scopes = null;

  public ClusterOIDCConfig cliClientID(String cliClientID) {
    this.cliClientID = cliClientID;
    return this;
  }

  /**
   * Get cliClientID
   * @return cliClientID
   **/
  @Schema(description = "")
  
    public String getCliClientID() {
    return cliClientID;
  }

  public void setCliClientID(String cliClientID) {
    this.cliClientID = cliClientID;
  }

  public ClusterOIDCConfig clientID(String clientID) {
    this.clientID = clientID;
    return this;
  }

  /**
   * Get clientID
   * @return clientID
   **/
  @Schema(description = "")
  
    public String getClientID() {
    return clientID;
  }

  public void setClientID(String clientID) {
    this.clientID = clientID;
  }

  public ClusterOIDCConfig idTokenClaims(Map<String, OidcClaim> idTokenClaims) {
    this.idTokenClaims = idTokenClaims;
    return this;
  }

  public ClusterOIDCConfig putIdTokenClaimsItem(String key, OidcClaim idTokenClaimsItem) {
    if (this.idTokenClaims == null) {
      this.idTokenClaims = new HashMap<>();
    }
    this.idTokenClaims.put(key, idTokenClaimsItem);
    return this;
  }

  /**
   * Get idTokenClaims
   * @return idTokenClaims
   **/
  @Schema(description = "")
      @Valid
    public Map<String, OidcClaim> getIdTokenClaims() {
    return idTokenClaims;
  }

  public void setIdTokenClaims(Map<String, OidcClaim> idTokenClaims) {
    this.idTokenClaims = idTokenClaims;
  }

  public ClusterOIDCConfig issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Get issuer
   * @return issuer
   **/
  @Schema(description = "")
  
    public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public ClusterOIDCConfig name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ClusterOIDCConfig scopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public ClusterOIDCConfig addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

  /**
   * Get scopes
   * @return scopes
   **/
  @Schema(description = "")
  
    public List<String> getScopes() {
    return scopes;
  }

  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterOIDCConfig clusterOIDCConfig = (ClusterOIDCConfig) o;
    return Objects.equals(this.cliClientID, clusterOIDCConfig.cliClientID) &&
        Objects.equals(this.clientID, clusterOIDCConfig.clientID) &&
        Objects.equals(this.idTokenClaims, clusterOIDCConfig.idTokenClaims) &&
        Objects.equals(this.issuer, clusterOIDCConfig.issuer) &&
        Objects.equals(this.name, clusterOIDCConfig.name) &&
        Objects.equals(this.scopes, clusterOIDCConfig.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cliClientID, clientID, idTokenClaims, issuer, name, scopes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterOIDCConfig {\n");
    
    sb.append("    cliClientID: ").append(toIndentedString(cliClientID)).append("\n");
    sb.append("    clientID: ").append(toIndentedString(clientID)).append("\n");
    sb.append("    idTokenClaims: ").append(toIndentedString(idTokenClaims)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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
