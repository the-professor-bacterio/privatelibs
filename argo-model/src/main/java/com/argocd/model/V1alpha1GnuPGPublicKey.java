package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1GnuPGPublicKey
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1GnuPGPublicKey  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("fingerprint")
  private String fingerprint = null;

  @JsonProperty("keyData")
  private String keyData = null;

  @JsonProperty("keyID")
  private String keyID = null;

  @JsonProperty("owner")
  private String owner = null;

  @JsonProperty("subType")
  private String subType = null;

  @JsonProperty("trust")
  private String trust = null;

  public V1alpha1GnuPGPublicKey fingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Get fingerprint
   * @return fingerprint
   **/
  @Schema(description = "")
  
    public String getFingerprint() {
    return fingerprint;
  }

  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }

  public V1alpha1GnuPGPublicKey keyData(String keyData) {
    this.keyData = keyData;
    return this;
  }

  /**
   * Get keyData
   * @return keyData
   **/
  @Schema(description = "")
  
    public String getKeyData() {
    return keyData;
  }

  public void setKeyData(String keyData) {
    this.keyData = keyData;
  }

  public V1alpha1GnuPGPublicKey keyID(String keyID) {
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

  public V1alpha1GnuPGPublicKey owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   **/
  @Schema(description = "")
  
    public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public V1alpha1GnuPGPublicKey subType(String subType) {
    this.subType = subType;
    return this;
  }

  /**
   * Get subType
   * @return subType
   **/
  @Schema(description = "")
  
    public String getSubType() {
    return subType;
  }

  public void setSubType(String subType) {
    this.subType = subType;
  }

  public V1alpha1GnuPGPublicKey trust(String trust) {
    this.trust = trust;
    return this;
  }

  /**
   * Get trust
   * @return trust
   **/
  @Schema(description = "")
  
    public String getTrust() {
    return trust;
  }

  public void setTrust(String trust) {
    this.trust = trust;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1GnuPGPublicKey v1alpha1GnuPGPublicKey = (V1alpha1GnuPGPublicKey) o;
    return Objects.equals(this.fingerprint, v1alpha1GnuPGPublicKey.fingerprint) &&
        Objects.equals(this.keyData, v1alpha1GnuPGPublicKey.keyData) &&
        Objects.equals(this.keyID, v1alpha1GnuPGPublicKey.keyID) &&
        Objects.equals(this.owner, v1alpha1GnuPGPublicKey.owner) &&
        Objects.equals(this.subType, v1alpha1GnuPGPublicKey.subType) &&
        Objects.equals(this.trust, v1alpha1GnuPGPublicKey.trust);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fingerprint, keyData, keyID, owner, subType, trust);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1GnuPGPublicKey {\n");
    
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    keyData: ").append(toIndentedString(keyData)).append("\n");
    sb.append("    keyID: ").append(toIndentedString(keyID)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    trust: ").append(toIndentedString(trust)).append("\n");
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
