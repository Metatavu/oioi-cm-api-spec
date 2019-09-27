export * from './devices.service';
import { DevicesService } from './devices.service';

export class ApiUtils {
  /**
   * Handles response from API
   * 
   * @param response response object
   */
  public static handleResponse(response: Response): any {
    switch (response.status) {
      case 204:
        return {};
      default:
        return response.json();
    }
  }

  /**
   * Returns UMA ticket from www-authenticate header or null if not found
   * 
   * @param response response from api call
   * 
   * @returns uma ticket or null
   */
  public static getUMATicket(response: Response): any {
    const wwwAuthenticateHeader = response.headers ? response.headers.get("www-authenticate") : null;
    if (!wwwAuthenticateHeader) {
      return null;
    }

    const result: any = {};

    if (wwwAuthenticateHeader.indexOf("UMA ") !== 0) {
      return null;
    }

    const headerComponents = wwwAuthenticateHeader.substring(4).split(",");
    headerComponents.forEach((component) => {
      const eq = component.indexOf("=");
      const name = component.substring(0, eq);
      const value = component.substring(eq + 2, component.length - 1);
      result[name] = value;
    });

    return result;
  }

  /**
   * Returns RPT token using authorization and ticket
   * 
   * @param authorization authorization
   * @param ticket ticket
   * @returns RPT token
   **/
  public static getRPT = async (authorization: string, ticket: any) => {
    const url = `${ticket.as_uri}/protocol/openid-connect/token`;
    const body = new URLSearchParams();
    body.append("grant_type", "urn:ietf:params:oauth:grant-type:uma-ticket");
    body.append("ticket", ticket.ticket);
    body.append("submit_request", "false");

    const headers = {
      "Authorization": authorization,
      "Content-Type": "application/x-www-form-urlencoded"
    };

    return await (await fetch(url, {
      body: body,
      headers: headers
    })).json();
  }
}

export default new class Api {

  private apiUrl = "http://localhost";

  /**
   * Configures api endpoint
   *
   */
  public configure(baseUrl: string) {
    this.apiUrl = baseUrl;
  }

  
  public getDevicesService(token: string): DevicesService {
    return new DevicesService(this.apiUrl, token);
  }
  
}
