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
 * GetApiClients401ResponseMessageInner
 */

@JsonTypeName("get_api_clients_401_response_message_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T10:41:44.990513500+01:00[Europe/Madrid]")
public class GetApiClients401ResponseMessageInner {

  private String alias;

  private String message;

  private String type;

  @Valid
  private List<@Valid GetApiClients401ResponseMessageInnerParamsInner> params;

  public GetApiClients401ResponseMessageInner alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * Get alias
   * @return alias
  */
  
  @Schema(name = "alias", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alias")
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public GetApiClients401ResponseMessageInner message(String message) {
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

  public GetApiClients401ResponseMessageInner type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GetApiClients401ResponseMessageInner params(List<@Valid GetApiClients401ResponseMessageInnerParamsInner> params) {
    this.params = params;
    return this;
  }

  public GetApiClients401ResponseMessageInner addParamsItem(GetApiClients401ResponseMessageInnerParamsInner paramsItem) {
    if (this.params == null) {
      this.params = new ArrayList<>();
    }
    this.params.add(paramsItem);
    return this;
  }

  /**
   * Get params
   * @return params
  */
  @Valid 
  @Schema(name = "params", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("params")
  public List<@Valid GetApiClients401ResponseMessageInnerParamsInner> getParams() {
    return params;
  }

  public void setParams(List<@Valid GetApiClients401ResponseMessageInnerParamsInner> params) {
    this.params = params;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetApiClients401ResponseMessageInner getApiClients401ResponseMessageInner = (GetApiClients401ResponseMessageInner) o;
    return Objects.equals(this.alias, getApiClients401ResponseMessageInner.alias) &&
        Objects.equals(this.message, getApiClients401ResponseMessageInner.message) &&
        Objects.equals(this.type, getApiClients401ResponseMessageInner.type) &&
        Objects.equals(this.params, getApiClients401ResponseMessageInner.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, message, type, params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetApiClients401ResponseMessageInner {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

