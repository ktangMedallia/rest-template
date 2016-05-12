package com.medallia.resttemplate.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldRest {
 
	@GET
	public Response get() { 
		return Response.ok().build(); 
	}
 
}