package dxcapimaven.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * GetApiClients400Response
 */

@JsonTypeName("get_api_clients_400_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T10:41:44.990513500+01:00[Europe/Madrid]")
public class GetApiClients400Response {

  @Valid
  private List<@Valid GetApiClients400ResponseMessageInner> message = new ArrayList<>();

  public GetApiClients400Response() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetApiClients400Response(List<@Valid GetApiClients400ResponseMessageInner> message) {
    this.message = message;
  }

  public GetApiClients400Response message(List<@Valid GetApiClients400ResponseMessageInner> message) {
    this.message = message;
    return this;
  }

  public GetApiClients400Response addMessageItem(GetApiClients400ResponseMessageInner messageItem) {
    if (this.message == null) {
      this.message = new ArrayList<>();
    }
    this.message.add(messageItem);
    return this;
  }

  /**
   * Get message
   * @return message
  */
  @NotNull @Valid 
  @Schema(name = "message", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public List<@Valid GetApiClients400ResponseMessageInner> getMessage() {
    return message;
  }

  public void setMessage(List<@Valid GetApiClients400ResponseMessageInner> message) {
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
    GetApiClients400Response getApiClients400Response = (GetApiClients400Response) o;
    return Objects.equals(this.message, getApiClients400Response.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetApiClients400Response {\n");
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

