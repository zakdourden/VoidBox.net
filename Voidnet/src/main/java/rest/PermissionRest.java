package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path(PermissionRest.SERVICE_NAME)
public class PermissionRest {
	public final static String SERVICE_NAME = "permission";
	
	@GET
	public String getMessage() {
		return "Hello World!";
	}
}