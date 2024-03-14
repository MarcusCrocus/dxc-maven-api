package dxcapimaven.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;

import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * GetApiClients404Response
 */

@JsonTypeName("get_api_clients_404_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T10:41:44.990513500+01:00[Europe/Madrid]")
public class GetApiClients404Response {

  @Valid
  private List<@Valid GetApiClients401ResponseMessageInner> message;

  public GetApiClients404Response message(List<@Valid GetApiClients401ResponseMessageInner> message) {
    this.message = message;
    return this;
  }

  public GetApiClients404Response addMessageItem(GetApiClients401ResponseMessageInner messageItem) {
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
  @Valid 
  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public List<@Valid GetApiClients401ResponseMessageInner> getMessage() {
    return message;
  }

  public void setMessage(List<@Valid GetApiClients401ResponseMessageInner> message) {
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
    GetApiClients404Response getApiClients404Response = (GetApiClients404Response) o;
    return Objects.equals(this.message, getApiClients404Response.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetApiClients404Response {\n");
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

