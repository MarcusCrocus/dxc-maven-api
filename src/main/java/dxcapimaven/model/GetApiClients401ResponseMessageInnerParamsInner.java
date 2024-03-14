package dxcapimaven.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * GetApiClients401ResponseMessageInnerParamsInner
 */

@JsonTypeName("get_api_clients_401_response_message_inner_params_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T10:41:44.990513500+01:00[Europe/Madrid]")
public class GetApiClients401ResponseMessageInnerParamsInner {

  private String name;

  private String message;

  public GetApiClients401ResponseMessageInnerParamsInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetApiClients401ResponseMessageInnerParamsInner message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  
  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    GetApiClients401ResponseMessageInnerParamsInner getApiClients401ResponseMessageInnerParamsInner = (GetApiClients401ResponseMessageInnerParamsInner) o;
    return Objects.equals(this.name, getApiClients401ResponseMessageInnerParamsInner.name) &&
        Objects.equals(this.message, getApiClients401ResponseMessageInnerParamsInner.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetApiClients401ResponseMessageInnerParamsInner {\n");
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

