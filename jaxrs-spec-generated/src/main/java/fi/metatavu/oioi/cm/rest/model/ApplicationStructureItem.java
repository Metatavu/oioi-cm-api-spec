package fi.metatavu.oioi.cm.rest.model;

import java.util.UUID;
import java.util.List;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import fi.metatavu.oioi.cm.rest.model.*;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.media.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;


public class ApplicationStructureItem   {
  private @Valid String path = null;
  private @Valid List<MediaType> allowedTypes = new ArrayList<>();

  /**
   **/
  public ApplicationStructureItem path(String path) {
    this.path = path;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("path")
  @NotNull

  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }

  /**
   **/
  public ApplicationStructureItem allowedTypes(List<MediaType> allowedTypes) {
    this.allowedTypes = allowedTypes;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("allowedTypes")
  @NotNull

  public List<MediaType> getAllowedTypes() {
    return allowedTypes;
  }
  public void setAllowedTypes(List<MediaType> allowedTypes) {
    this.allowedTypes = allowedTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationStructureItem applicationStructureItem = (ApplicationStructureItem) o;
    return Objects.equals(path, applicationStructureItem.path) &&
        Objects.equals(allowedTypes, applicationStructureItem.allowedTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, allowedTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationStructureItem {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    allowedTypes: ").append(toIndentedString(allowedTypes)).append("\n");
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
