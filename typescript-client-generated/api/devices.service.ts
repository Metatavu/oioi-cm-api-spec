import { Device } from '../model/device';
import { ErrorResponse } from '../model/errorResponse';
import * as URI from "urijs";
import { ApiUtils } from "./api";

export class DevicesService {

  private rptToken: string;
  private token: string;
  private basePath: string;

  constructor(basePath: string, token: string) {
    this.token = token;
    this.basePath = basePath;
  }


  /**
   * Create device
   * @summary Create a device
   * @param body Payload
  */
  public async createDevice(body: Device,  retrying?: boolean):Promise<Device> {
    const uri = new URI(`${this.basePath}/devices`);
    const options = {
      method: "post",
      headers: {
        "Content-Type": "application/json",
        "Authorization": `Bearer ${this.rptToken ? this.rptToken : this.token}`
      },
      body: JSON.stringify(body)
    };

    const response = await fetch(uri.toString(), options);

    if (!retrying && response.status == 401) {
      const ticket = ApiUtils.getUMATicket(response);
      const authorization = response.headers.get("Authorization");
      const rptToken = await ApiUtils.getRPT(authorization, ticket);
      this.rptToken = rptToken ? rptToken["access_token"] : null;
      if (this.rptToken) {
        return this.createDevice(body,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }


  /**
   * Delete a device
   * @summary Delete device
   * @param deviceId device id
  */
  public async deleteDevice(deviceId: string,  retrying?: boolean):Promise<any> {
    const uri = new URI(`${this.basePath}/devices/${encodeURIComponent(String(deviceId))}`);
    const options = {
      method: "delete",
      headers: {
        "Content-Type": "application/json",
        "Authorization": `Bearer ${this.rptToken ? this.rptToken : this.token}`
      }
    };

    const response = await fetch(uri.toString(), options);

    if (!retrying && response.status == 401) {
      const ticket = ApiUtils.getUMATicket(response);
      const authorization = response.headers.get("Authorization");
      const rptToken = await ApiUtils.getRPT(authorization, ticket);
      this.rptToken = rptToken ? rptToken["access_token"] : null;
      if (this.rptToken) {
        return this.deleteDevice(deviceId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }


  /**
   * Finds a device
   * @summary Finds a device
   * @param deviceId device id
  */
  public async findDevice(deviceId: string,  retrying?: boolean):Promise<Device> {
    const uri = new URI(`${this.basePath}/devices/${encodeURIComponent(String(deviceId))}`);
    const options = {
      method: "get",
      headers: {
        "Content-Type": "application/json",
        "Authorization": `Bearer ${this.rptToken ? this.rptToken : this.token}`
      }
    };

    const response = await fetch(uri.toString(), options);

    if (!retrying && response.status == 401) {
      const ticket = ApiUtils.getUMATicket(response);
      const authorization = response.headers.get("Authorization");
      const rptToken = await ApiUtils.getRPT(authorization, ticket);
      this.rptToken = rptToken ? rptToken["access_token"] : null;
      if (this.rptToken) {
        return this.findDevice(deviceId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }


  /**
   * List devices
   * @summary List devices
  */
  public async listDevices( retrying?: boolean):Promise<Array<Device>> {
    const uri = new URI(`${this.basePath}/devices`);
    const options = {
      method: "get",
      headers: {
        "Content-Type": "application/json",
        "Authorization": `Bearer ${this.rptToken ? this.rptToken : this.token}`
      }
    };

    const response = await fetch(uri.toString(), options);

    if (!retrying && response.status == 401) {
      const ticket = ApiUtils.getUMATicket(response);
      const authorization = response.headers.get("Authorization");
      const rptToken = await ApiUtils.getRPT(authorization, ticket);
      this.rptToken = rptToken ? rptToken["access_token"] : null;
      if (this.rptToken) {
        return this.listDevices(true);
      }
    }

    return ApiUtils.handleResponse(response);
  }


  /**
   * Updates a device
   * @summary Updates device
   * @param body Payload
   * @param deviceId device id
  */
  public async updateDevice(body: Device, deviceId: string,  retrying?: boolean):Promise<Device> {
    const uri = new URI(`${this.basePath}/devices/${encodeURIComponent(String(deviceId))}`);
    const options = {
      method: "put",
      headers: {
        "Content-Type": "application/json",
        "Authorization": `Bearer ${this.rptToken ? this.rptToken : this.token}`
      },
      body: JSON.stringify(body)
    };

    const response = await fetch(uri.toString(), options);

    if (!retrying && response.status == 401) {
      const ticket = ApiUtils.getUMATicket(response);
      const authorization = response.headers.get("Authorization");
      const rptToken = await ApiUtils.getRPT(authorization, ticket);
      this.rptToken = rptToken ? rptToken["access_token"] : null;
      if (this.rptToken) {
        return this.updateDevice(body,deviceId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }

}