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
 * GpgkeyGnuPGPublicKeyCreateResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class GpgkeyGnuPGPublicKeyCreateResponse  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("created")
  private V1alpha1GnuPGPublicKeyList created = null;

  @JsonProperty("skipped")
  @Valid
  private List<String> skipped = null;

  public GpgkeyGnuPGPublicKeyCreateResponse created(V1alpha1GnuPGPublicKeyList created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1GnuPGPublicKeyList getCreated() {
    return created;
  }

  public void setCreated(V1alpha1GnuPGPublicKeyList created) {
    this.created = created;
  }

  public GpgkeyGnuPGPublicKeyCreateResponse skipped(List<String> skipped) {
    this.skipped = skipped;
    return this;
  }

  public GpgkeyGnuPGPublicKeyCreateResponse addSkippedItem(String skippedItem) {
    if (this.skipped == null) {
      this.skipped = new ArrayList<>();
    }
    this.skipped.add(skippedItem);
    return this;
  }

  /**
   * Get skipped
   * @return skipped
   **/
  @Schema(description = "")
  
    public List<String> getSkipped() {
    return skipped;
  }

  public void setSkipped(List<String> skipped) {
    this.skipped = skipped;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GpgkeyGnuPGPublicKeyCreateResponse gpgkeyGnuPGPublicKeyCreateResponse = (GpgkeyGnuPGPublicKeyCreateResponse) o;
    return Objects.equals(this.created, gpgkeyGnuPGPublicKeyCreateResponse.created) &&
        Objects.equals(this.skipped, gpgkeyGnuPGPublicKeyCreateResponse.skipped);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, skipped);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GpgkeyGnuPGPublicKeyCreateResponse {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    skipped: ").append(toIndentedString(skipped)).append("\n");
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
