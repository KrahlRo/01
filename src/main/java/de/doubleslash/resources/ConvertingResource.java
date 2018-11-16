package de.doubleslash.resources;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.POST;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import de.doubleslash.models.Converting;
import de.doubleslash.logic.ConvertingLogicCombined;

@Path("converting")
public class ConvertingResource {
			
	@POST
	@Path("/{format1}")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	public Response convertingUniversal (@PathParam("format1") String formatOrigin, String input) {
		return Response.ok()
				.entity(new Converting(ConvertingLogicCombined.convertingCombined(formatOrigin, input)))
				.build();
	}
}