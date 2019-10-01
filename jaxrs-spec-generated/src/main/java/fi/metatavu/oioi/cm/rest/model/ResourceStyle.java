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


public class ResourceStyle   {
  private @Valid String backgroundColor = null;
  private @Valid String foregroundColor = null;

  /**
   **/
  public ResourceStyle backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("backgroundColor")

  public String getBackgroundColor() {
    return backgroundColor;
  }
  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  /**
   **/
  public ResourceStyle foregroundColor(String foregroundColor) {
    this.foregroundColor = foregroundColor;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("foregroundColor")

  public String getForegroundColor() {
    return foregroundColor;
  }
  public void setForegroundColor(String foregroundColor) {
    this.foregroundColor = foregroundColor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceStyle resourceStyle = (ResourceStyle) o;
    return Objects.equals(backgroundColor, resourceStyle.backgroundColor) &&
        Objects.equals(foregroundColor, resourceStyle.foregroundColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundColor, foregroundColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceStyle {\n");
    
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    foregroundColor: ").append(toIndentedString(foregroundColor)).append("\n");
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
