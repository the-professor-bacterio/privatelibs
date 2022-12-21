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
 * ClusterDexConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class ClusterDexConfig  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("connectors")
  @Valid
  private List<ClusterConnector> connectors = null;

  public ClusterDexConfig connectors(List<ClusterConnector> connectors) {
    this.connectors = connectors;
    return this;
  }

  public ClusterDexConfig addConnectorsItem(ClusterConnector connectorsItem) {
    if (this.connectors == null) {
      this.connectors = new ArrayList<>();
    }
    this.connectors.add(connectorsItem);
    return this;
  }

  /**
   * Get connectors
   * @return connectors
   **/
  @Schema(description = "")
      @Valid
    public List<ClusterConnector> getConnectors() {
    return connectors;
  }

  public void setConnectors(List<ClusterConnector> connectors) {
    this.connectors = connectors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterDexConfig clusterDexConfig = (ClusterDexConfig) o;
    return Objects.equals(this.connectors, clusterDexConfig.connectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterDexConfig {\n");
    
    sb.append("    connectors: ").append(toIndentedString(connectors)).append("\n");
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
