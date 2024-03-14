package dxcapimaven.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.validation.Valid;

import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * GetApiClientClientId200Response
 */

@JsonTypeName("get_api_client_clientId_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T10:41:44.990513500+01:00[Europe/Madrid]")
public class GetApiClientClientId200Response {

  private Pagination pagination;

  private Client data;

  public GetApiClientClientId200Response pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

  /**
   * Get pagination
   * @return pagination
  */
  @Valid 
  @Schema(name = "pagination", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pagination")
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  public GetApiClientClientId200Response data(Client data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public Client getData() {
    return data;
  }

  public void setData(Client data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetApiClientClientId200Response getApiClientClientId200Response = (GetApiClientClientId200Response) o;
    return Objects.equals(this.pagination, getApiClientClientId200Response.pagination) &&
        Objects.equals(this.data, getApiClientClientId200Response.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetApiClientClientId200Response {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

