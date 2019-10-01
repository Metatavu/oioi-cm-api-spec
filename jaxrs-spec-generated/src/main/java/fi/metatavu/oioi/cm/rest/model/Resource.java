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


public class Resource   {
  private @Valid UUID id = null;
  private @Valid UUID parentId = null;
  private @Valid UUID deviceApplicationId = null;
  private @Valid MediaType type = null;
  private @Valid String data = null;
  private @Valid ResourceStyle styles = null;
  private @Valid OffsetDateTime createdAt = null;
  private @Valid OffsetDateTime modifiedAt = null;

  /**
   * Device application id.
   **/
  public Resource id(UUID id) {
    this.id = id;
    return this;
  }

  
  //@ApiModelProperty(value = "Device application id.")
  @JsonProperty("id")

  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   * Parent resource id
   **/
  public Resource parentId(UUID parentId) {
    this.parentId = parentId;
    return this;
  }

  
  //@ApiModelProperty(value = "Parent resource id")
  @JsonProperty("parentId")

  public UUID getParentId() {
    return parentId;
  }
  public void setParentId(UUID parentId) {
    this.parentId = parentId;
  }

  /**
   * Device application id.
   **/
  public Resource deviceApplicationId(UUID deviceApplicationId) {
    this.deviceApplicationId = deviceApplicationId;
    return this;
  }

  
  //@ApiModelProperty(value = "Device application id.")
  @JsonProperty("deviceApplicationId")

  public UUID getDeviceApplicationId() {
    return deviceApplicationId;
  }
  public void setDeviceApplicationId(UUID deviceApplicationId) {
    this.deviceApplicationId = deviceApplicationId;
  }

  /**
   **/
  public Resource type(MediaType type) {
    this.type = type;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("type")

  public MediaType getType() {
    return type;
  }
  public void setType(MediaType type) {
    this.type = type;
  }

  /**
   * Resource data, either URL on images, videos, etc and text data on text resources
   **/
  public Resource data(String data) {
    this.data = data;
    return this;
  }

  
  //@ApiModelProperty(value = "Resource data, either URL on images, videos, etc and text data on text resources")
  @JsonProperty("data")

  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

  /**
   **/
  public Resource styles(ResourceStyle styles) {
    this.styles = styles;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("styles")

  public ResourceStyle getStyles() {
    return styles;
  }
  public void setStyles(ResourceStyle styles) {
    this.styles = styles;
  }

  /**
   * Creation time
   **/
  public Resource createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  //@ApiModelProperty(value = "Creation time")
  @JsonProperty("createdAt")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Last modification time
   **/
  public Resource modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  
  //@ApiModelProperty(value = "Last modification time")
  @JsonProperty("modifiedAt")

  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }
  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resource resource = (Resource) o;
    return Objects.equals(id, resource.id) &&
        Objects.equals(parentId, resource.parentId) &&
        Objects.equals(deviceApplicationId, resource.deviceApplicationId) &&
        Objects.equals(type, resource.type) &&
        Objects.equals(data, resource.data) &&
        Objects.equals(styles, resource.styles) &&
        Objects.equals(createdAt, resource.createdAt) &&
        Objects.equals(modifiedAt, resource.modifiedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, deviceApplicationId, type, data, styles, createdAt, modifiedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resource {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    deviceApplicationId: ").append(toIndentedString(deviceApplicationId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    styles: ").append(toIndentedString(styles)).append("\n");
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
