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


public class DeviceApplication   {
  private @Valid UUID id = null;
  private @Valid UUID deviceId = null;
  private @Valid UUID applicationId = null;
  private @Valid OffsetDateTime createdAt = null;
  private @Valid OffsetDateTime modifiedAt = null;

  /**
   * Device application id.
   **/
  public DeviceApplication id(UUID id) {
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
   * Device id.
   **/
  public DeviceApplication deviceId(UUID deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "Device id.")
  @JsonProperty("deviceId")
  @NotNull

  public UUID getDeviceId() {
    return deviceId;
  }
  public void setDeviceId(UUID deviceId) {
    this.deviceId = deviceId;
  }

  /**
   * Application id.
   **/
  public DeviceApplication applicationId(UUID applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "Application id.")
  @JsonProperty("applicationId")
  @NotNull

  public UUID getApplicationId() {
    return applicationId;
  }
  public void setApplicationId(UUID applicationId) {
    this.applicationId = applicationId;
  }

  /**
   * Creation time
   **/
  public DeviceApplication createdAt(OffsetDateTime createdAt) {
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
  public DeviceApplication modifiedAt(OffsetDateTime modifiedAt) {
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
    DeviceApplication deviceApplication = (DeviceApplication) o;
    return Objects.equals(id, deviceApplication.id) &&
        Objects.equals(deviceId, deviceApplication.deviceId) &&
        Objects.equals(applicationId, deviceApplication.applicationId) &&
        Objects.equals(createdAt, deviceApplication.createdAt) &&
        Objects.equals(modifiedAt, deviceApplication.modifiedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, deviceId, applicationId, createdAt, modifiedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceApplication {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
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
