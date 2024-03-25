package dxcapimaven.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;


import javax.annotation.Generated;

/**
 * client
 */
@Entity
@Table(name = "client_table")
@Schema(name = "Client", description = "client")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T10:41:44.990513500+01:00[Europe/Madrid]")
public class Client {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer clientId;
  @Column(name = "first_name", nullable = false)
  private String name;
  @Column(name = "last_name", nullable = false)
  private String surname;
  @Column(name = "is_client", nullable = false)
  private Boolean isClient = false;

  @Column(name = "age", nullable = false)
  private Integer age;

  public Client() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Client(Integer clientId, String surname) {
    this.clientId = clientId;
    this.surname = surname;
  }

  public Client clientId(Integer clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Get clientId
   * minimum: 0
   * @return clientId
  */
  @Min(0) 
  @Schema(name = "clientId", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("clientId")
  public Integer getClientId() {
    return clientId;
  }

  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  public Client name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @Size(min = 1) 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Client surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Get surname
   * @return surname
  */
  @NotNull @Size(min = 1, max = 20) 
  @Schema(name = "surname", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("surname")
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public Client isClient(Boolean isClient) {
    this.isClient = isClient;
    return this;
  }

  /**
   * Get isClient
   * @return isClient
  */
  
  @Schema(name = "isClient", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isClient")
  public Boolean getIsClient() {
    return isClient;
  }

  public void setIsClient(Boolean isClient) {
    this.isClient = isClient;
  }

  public Client age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * minimum: 0
   * @return age
  */
  @Min(0) 
  @Schema(name = "age", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("age")
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Client client = (Client) o;
    return Objects.equals(this.clientId, client.clientId) &&
        Objects.equals(this.name, client.name) &&
        Objects.equals(this.surname, client.surname) &&
        Objects.equals(this.isClient, client.isClient) &&
        Objects.equals(this.age, client.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, name, surname, isClient, age);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Client {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    isClient: ").append(toIndentedString(isClient)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
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

