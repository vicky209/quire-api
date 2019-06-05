package io.quire.api.resource;

import io.quire.api.model.externalteam.Partner;
import io.swagger.annotations.*;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/partner")
@Api(value = "external teams", description =
    "An external team (aka., a parnter).")
@Produces({"application/json"})
public class PartnerResource {
    @GET
    @Path("/{oid}")
    @ApiOperation(value = "Get an external team (aka., a partner).",
        notes = "returns the full external team record.",
        response = Partner.class)
    public Response getPartner(
        @ApiParam(value = "OID of external team that needs to be fetched.", required = true)
        @PathParam("oid") String oid) { return null; }

    @GET
    @Path("/list/{projectOid}")
    @ApiOperation(value = "Get all external teams of the given project by its OID.",
        notes = "Returns all external team records of the given project.",
        response = Partner.class)
    public Response getPartners(
        @ApiParam(value = "OID of the project to look for", required = true)
        @PathParam("projectOid") String projectOid) { return null; }

    @GET
    @Path("/list/id/{projectId}")
    @ApiOperation(value = "Get all external teams of the given project by its ID.",
        notes = "Returns all external team records of the given project.",
        response = Partner.class)
    public Response getPartners(
        @ApiParam(value = "ID of project to look for", required = true)
        @PathParam("projectId") String projectId) { return null; }

/* Not supported yet
    @DELETE
    @Path("/{oid}")
    @ApiOperation(value = "Delete an external team",
        notes = "A specific, existing external team can be deleted by making a DELETE request " +
                "on the URL for that external team.")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "ok",
            examples = @Example({@ExampleProperty(mediaType = "application/json", value =
                "{'Success': 'true'}")}))})
    public Response deletePartner(
        @ApiParam(value = "Oid of external team that needs to be deleted", required = true)
        @PathParam("oid") String oid) { return null; }
*/
}
