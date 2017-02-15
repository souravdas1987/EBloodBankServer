package com.sainfo.ebb.services;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/services")
public class DaoServices
{

	@GET
	@Path("/infoByGroup/{group}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getInformationByBloodGroup(@PathParam("group") String bGroup)
	{
		if (bGroup.equals("a"))
			return "A";
		else
			return "B";
	}

	@POST
	@Path("/addDonor")
	@Produces(MediaType.APPLICATION_JSON)
	public Response addDonor(@FormParam("name") String pName,
			@FormParam("address") String address,
			@FormParam("mobile1") String mobile1,
			@FormParam("mobile2") String mobile2,
			@FormParam("bGroup") String bGroup)
	{
		return Response.status(200).entity("saved").build();
	}
}
