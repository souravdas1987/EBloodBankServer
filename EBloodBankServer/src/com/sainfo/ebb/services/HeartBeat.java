package com.sainfo.ebb.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/heartBeat")
public class HeartBeat
{

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String responseToHeartBeatPlainText()
	{
		return "Service is alive!!";
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	public String responseToHeartBeatXML()
	{
		return "<?xml version=\"1.0\"?>" + "<beat> Service is alive!!"
				+ "</beat>";
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String responseToHeartBeatJSON()
	{
		return "{\"beat\" : \"Service is alive!!\"}";
	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String responseToHeartBeatHTML()
	{
		return "<html> " + "<title>" + "Heart-Beat" + "</title>"
				+ "<body><h1>" + "Service is alive!!" + "</body></h1>" + "</html> ";
	}
}
