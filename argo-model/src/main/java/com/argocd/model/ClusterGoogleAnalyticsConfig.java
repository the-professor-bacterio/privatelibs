package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * ClusterGoogleAnalyticsConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class ClusterGoogleAnalyticsConfig  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("anonymizeUsers")
  private Boolean anonymizeUsers = null;

  @JsonProperty("trackingID")
  private String trackingID = null;

  public ClusterGoogleAnalyticsConfig anonymizeUsers(Boolean anonymizeUsers) {
    this.anonymizeUsers = anonymizeUsers;
    return this;
  }

  /**
   * Get anonymizeUsers
   * @return anonymizeUsers
   **/
  @Schema(description = "")
  
    public Boolean isAnonymizeUsers() {
    return anonymizeUsers;
  }

  public void setAnonymizeUsers(Boolean anonymizeUsers) {
    this.anonymizeUsers = anonymizeUsers;
  }

  public ClusterGoogleAnalyticsConfig trackingID(String trackingID) {
    this.trackingID = trackingID;
    return this;
  }

  /**
   * Get trackingID
   * @return trackingID
   **/
  @Schema(description = "")
  
    public String getTrackingID() {
    return trackingID;
  }

  public void setTrackingID(String trackingID) {
    this.trackingID = trackingID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterGoogleAnalyticsConfig clusterGoogleAnalyticsConfig = (ClusterGoogleAnalyticsConfig) o;
    return Objects.equals(this.anonymizeUsers, clusterGoogleAnalyticsConfig.anonymizeUsers) &&
        Objects.equals(this.trackingID, clusterGoogleAnalyticsConfig.trackingID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anonymizeUsers, trackingID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterGoogleAnalyticsConfig {\n");
    
    sb.append("    anonymizeUsers: ").append(toIndentedString(anonymizeUsers)).append("\n");
    sb.append("    trackingID: ").append(toIndentedString(trackingID)).append("\n");
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
