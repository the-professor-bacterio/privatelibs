package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * ProtobufAny
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class ProtobufAny  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("type_url")
  private String typeUrl = null;

  @JsonProperty("value")
  private byte[] value = null;

  public ProtobufAny typeUrl(String typeUrl) {
    this.typeUrl = typeUrl;
    return this;
  }

  /**
   * Get typeUrl
   * @return typeUrl
   **/
  @Schema(description = "")
  
    public String getTypeUrl() {
    return typeUrl;
  }

  public void setTypeUrl(String typeUrl) {
    this.typeUrl = typeUrl;
  }

  public ProtobufAny value(byte[] value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
    public byte[] getValue() {
    return value;
  }

  public void setValue(byte[] value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProtobufAny protobufAny = (ProtobufAny) o;
    return Objects.equals(this.typeUrl, protobufAny.typeUrl) &&
        Objects.equals(this.value, protobufAny.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeUrl, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProtobufAny {\n");
    
    sb.append("    typeUrl: ").append(toIndentedString(typeUrl)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
