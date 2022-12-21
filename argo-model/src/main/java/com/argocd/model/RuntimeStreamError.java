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
 * RuntimeStreamError
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class RuntimeStreamError  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("details")
  @Valid
  private List<ProtobufAny> details = null;

  @JsonProperty("grpc_code")
  private Integer grpcCode = null;

  @JsonProperty("http_code")
  private Integer httpCode = null;

  @JsonProperty("http_status")
  private String httpStatus = null;

  @JsonProperty("message")
  private String message = null;

  public RuntimeStreamError details(List<ProtobufAny> details) {
    this.details = details;
    return this;
  }

  public RuntimeStreamError addDetailsItem(ProtobufAny detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

  /**
   * Get details
   * @return details
   **/
  @Schema(description = "")
      @Valid
    public List<ProtobufAny> getDetails() {
    return details;
  }

  public void setDetails(List<ProtobufAny> details) {
    this.details = details;
  }

  public RuntimeStreamError grpcCode(Integer grpcCode) {
    this.grpcCode = grpcCode;
    return this;
  }

  /**
   * Get grpcCode
   * @return grpcCode
   **/
  @Schema(description = "")
  
    public Integer getGrpcCode() {
    return grpcCode;
  }

  public void setGrpcCode(Integer grpcCode) {
    this.grpcCode = grpcCode;
  }

  public RuntimeStreamError httpCode(Integer httpCode) {
    this.httpCode = httpCode;
    return this;
  }

  /**
   * Get httpCode
   * @return httpCode
   **/
  @Schema(description = "")
  
    public Integer getHttpCode() {
    return httpCode;
  }

  public void setHttpCode(Integer httpCode) {
    this.httpCode = httpCode;
  }

  public RuntimeStreamError httpStatus(String httpStatus) {
    this.httpStatus = httpStatus;
    return this;
  }

  /**
   * Get httpStatus
   * @return httpStatus
   **/
  @Schema(description = "")
  
    public String getHttpStatus() {
    return httpStatus;
  }

  public void setHttpStatus(String httpStatus) {
    this.httpStatus = httpStatus;
  }

  public RuntimeStreamError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   **/
  @Schema(description = "")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuntimeStreamError runtimeStreamError = (RuntimeStreamError) o;
    return Objects.equals(this.details, runtimeStreamError.details) &&
        Objects.equals(this.grpcCode, runtimeStreamError.grpcCode) &&
        Objects.equals(this.httpCode, runtimeStreamError.httpCode) &&
        Objects.equals(this.httpStatus, runtimeStreamError.httpStatus) &&
        Objects.equals(this.message, runtimeStreamError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, grpcCode, httpCode, httpStatus, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuntimeStreamError {\n");
    
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    grpcCode: ").append(toIndentedString(grpcCode)).append("\n");
    sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
    sb.append("    httpStatus: ").append(toIndentedString(httpStatus)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
