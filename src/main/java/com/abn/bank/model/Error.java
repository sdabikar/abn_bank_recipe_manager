package com.abn.bank.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Used when an API throws an Error, typically with a HTTP error response-code (3xx, 4xx, 5xx)
 */

@Schema(name = "Error", description = "Used when an API throws an Error, typically with a HTTP error response-code (3xx, 4xx, 5xx)")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-13T14:56:10.962717300+05:30[Asia/Calcutta]")
public class Error {

  @JsonProperty("code")
  private String code;

  @JsonProperty("reason")
  private String reason;

  @JsonProperty("message")
  private String message;

  @JsonProperty("status")
  private String status;

  @JsonProperty("referenceError")
  private URI referenceError;

  public Error code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Application relevant detail, defined in the API or a common list.
   * @return code
  */
  @NotNull 
  @Schema(name = "code", description = "Application relevant detail, defined in the API or a common list.", required = true)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Error reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Explanation of the reason for the error which can be shown to a client user.
   * @return reason
  */
  @NotNull 
  @Schema(name = "reason", description = "Explanation of the reason for the error which can be shown to a client user.", required = true)
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

  /**
   * More details and corrective actions related to the error which can be shown to a client user.
   * @return message
  */
  
  @Schema(name = "message", description = "More details and corrective actions related to the error which can be shown to a client user.", required = false)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Error status(String status) {
    this.status = status;
    return this;
  }

  /**
   * HTTP Error code extension
   * @return status
  */
  
  @Schema(name = "status", description = "HTTP Error code extension", required = false)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Error referenceError(URI referenceError) {
    this.referenceError = referenceError;
    return this;
  }

  /**
   * URI of documentation describing the error.
   * @return referenceError
  */
  @Valid 
  @Schema(name = "referenceError", description = "URI of documentation describing the error.", required = false)
  public URI getReferenceError() {
    return referenceError;
  }

  public void setReferenceError(URI referenceError) {
    this.referenceError = referenceError;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.code, error.code) &&
        Objects.equals(this.reason, error.reason) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.status, error.status) &&
        Objects.equals(this.referenceError, error.referenceError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, reason, message, status, referenceError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    referenceError: ").append(toIndentedString(referenceError)).append("\n");
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

