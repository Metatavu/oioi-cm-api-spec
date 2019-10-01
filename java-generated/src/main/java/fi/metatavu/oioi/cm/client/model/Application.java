/*
 * OiOi content management API
 * OiOi content management API spec
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package fi.metatavu.oioi.cm.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import fi.metatavu.oioi.cm.client.model.ApplicationStructure;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Application
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-09-30T18:12:54.816416+03:00[Europe/Helsinki]")public class Application {

  @JsonProperty("id")

  private UUID id = null;

  @JsonProperty("name")

  private String name = null;

  @JsonProperty("structure")

  private ApplicationStructure structure = null;

  @JsonProperty("createdAt")

  private OffsetDateTime createdAt = null;

  @JsonProperty("modifiedAt")

  private OffsetDateTime modifiedAt = null;
  /**
  * Device id.
  * @return id
  **/
  @Schema(description = "Device id.")
  public UUID getId() {
    return id;
  }
  public Application name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * Application name.
  * @return name
  **/
  @Schema(required = true, description = "Application name.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Application structure(ApplicationStructure structure) {
    this.structure = structure;
    return this;
  }

  

  /**
  * Get structure
  * @return structure
  **/
  @Schema(description = "")
  public ApplicationStructure getStructure() {
    return structure;
  }
  public void setStructure(ApplicationStructure structure) {
    this.structure = structure;
  }
  /**
  * Creation time
  * @return createdAt
  **/
  @Schema(description = "Creation time")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  /**
  * Last modification time
  * @return modifiedAt
  **/
  @Schema(description = "Last modification time")
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Application application = (Application) o;
    return Objects.equals(this.id, application.id) &&
        Objects.equals(this.name, application.name) &&
        Objects.equals(this.structure, application.structure) &&
        Objects.equals(this.createdAt, application.createdAt) &&
        Objects.equals(this.modifiedAt, application.modifiedAt);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, name, structure, createdAt, modifiedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Application {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    structure: ").append(toIndentedString(structure)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
