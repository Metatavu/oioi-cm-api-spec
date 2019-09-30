package fi.metatavu.oioi.cm.client;

import fi.metatavu.oioi.cm.ApiClient;
import fi.metatavu.oioi.cm.client.model.Device;
import fi.metatavu.oioi.cm.client.model.ErrorResponse;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DevicesApi
 */
public class DevicesApiTest {

    private DevicesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(DevicesApi.class);
    }

    /**
     * Create a device
     *
     * Create device
     */
    @Test
    public void createDeviceTest() {
        Device body = null;
        // Device response = api.createDevice(body);

        // TODO: test validations
    }

    /**
     * Delete device
     *
     * Delete a device
     */
    @Test
    public void deleteDeviceTest() {
        UUID deviceId = null;
        // api.deleteDevice(deviceId);

        // TODO: test validations
    }

    /**
     * Finds a device
     *
     * Finds a device
     */
    @Test
    public void findDeviceTest() {
        UUID deviceId = null;
        // Device response = api.findDevice(deviceId);

        // TODO: test validations
    }

    /**
     * List devices
     *
     * List devices
     */
    @Test
    public void listDevicesTest() {
        // List<Device> response = api.listDevices();

        // TODO: test validations
    }

    /**
     * Updates device
     *
     * Updates a device
     */
    @Test
    public void updateDeviceTest() {
        Device body = null;
        UUID deviceId = null;
        // Device response = api.updateDevice(body, deviceId);

        // TODO: test validations
    }

}
