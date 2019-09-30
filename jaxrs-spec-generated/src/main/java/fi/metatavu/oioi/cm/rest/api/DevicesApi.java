package fi.metatavu.oioi.cm.rest.api;

import java.util.UUID;
import fi.metatavu.oioi.cm.rest.model.*;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.io.File;

import java.time.OffsetDateTime;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/devices")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2019-09-30T10:37:19.486+03:00[Europe/Helsinki]")
public interface DevicesApi {

    @POST
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Create a device", description = "Create device", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "Devices" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Created device", content = @Content(schema = @Schema(implementation = Device.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response createDevice(@Valid Device body);
    @DELETE
    @Path("/{deviceId}")
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Delete device", description = "Delete a device", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "Devices" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Successful removal"),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response deleteDevice( @PathParam("deviceId")

 @Parameter(description = "device id") UUID deviceId
);
    @GET
    @Path("/{deviceId}")
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Finds a device", description = "Finds a device", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "Devices" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Found device", content = @Content(schema = @Schema(implementation = Device.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response findDevice( @PathParam("deviceId")

 @Parameter(description = "device id") UUID deviceId
);
    @GET
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "List devices", description = "List devices", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "Devices" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Devices", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Device.class)))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response listDevices();
    @PUT
    @Path("/{deviceId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Updates device", description = "Updates a device", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "Devices" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Updated device", content = @Content(schema = @Schema(implementation = Device.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response updateDevice(@Valid Device body, @PathParam("deviceId")

 @Parameter(description = "device id") UUID deviceId
);}
