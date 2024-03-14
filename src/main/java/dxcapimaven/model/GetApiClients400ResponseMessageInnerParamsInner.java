package dxcapimaven.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * GetApiClients400ResponseMessageInnerParamsInner
 */

@JsonTypeName("get_api_clients_400_response_message_inner_params_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T10:41:44.990513500+01:00[Europe/Madrid]")
public class GetApiClients400ResponseMessageInnerParamsInner {

  private String name;

  private String message;

  public GetApiClients400ResponseMessageInnerParamsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetApiClients400ResponseMessageInnerParamsInner(String name, String message) {
    this.name = name;
    this.message = message;
  }

  public GetApiClients400ResponseMessageInnerParamsInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "username", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetApiClients400ResponseMessageInnerParamsInner message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  @NotNull 
  @Schema(name = "message", example = "Must be a positive integer", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
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
    GetApiClients400ResponseMessageInnerParamsInner getApiClients400ResponseMessageInnerParamsInner = (GetApiClients400ResponseMessageInnerParamsInner) o;
    return Objects.equals(this.name, getApiClients400ResponseMessageInnerParamsInner.name) &&
        Objects.equals(this.message, getApiClients400ResponseMessageInnerParamsInner.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetApiClients400ResponseMessageInnerParamsInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

