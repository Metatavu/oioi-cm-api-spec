package fi.metatavu.oioi.cm.client;

import fi.metatavu.oioi.cm.ApiClient;
import java.time.OffsetDateTime;
import fi.metatavu.oioi.cm.EncodingUtils;

import fi.metatavu.oioi.cm.client.model.Device;
import fi.metatavu.oioi.cm.client.model.ErrorResponse;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-09-30T10:39:48.030+03:00[Europe/Helsinki]")public interface DevicesApi extends ApiClient.Api {

  /**
   * Create a device
   * Create device
   * @param body Payload (required)
   * @return Device
   */
  @RequestLine("POST /devices")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  Device createDevice(Device body);
  /**
   * Delete device
   * Delete a device
   * @param deviceId device id (required)
   */
  @RequestLine("DELETE /devices/{deviceId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  void deleteDevice(@Param("deviceId") UUID deviceId);
  /**
   * Finds a device
   * Finds a device
   * @param deviceId device id (required)
   * @return Device
   */
  @RequestLine("GET /devices/{deviceId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  Device findDevice(@Param("deviceId") UUID deviceId);
  /**
   * List devices
   * List devices
   * @return List&lt;Device&gt;
   */
  @RequestLine("GET /devices")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  List<Device> listDevices();
  /**
   * Updates device
   * Updates a device
   * @param body Payload (required)
   * @param deviceId device id (required)
   * @return Device
   */
  @RequestLine("PUT /devices/{deviceId}")
  @Headers({
      "Content-Type: application/json;charset&#x3D;utf-8",
      "Accept: application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8,application/json;charset&#x3D;utf-8",
  })
  Device updateDevice(Device body, @Param("deviceId") UUID deviceId);
}
