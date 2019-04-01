
package com.navalgund.myJerseySrv;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("hello") //Path tells Jersey what URL subtree this class responds to

public class myClass {
	@GET //GET tells Jersey to call this method to service a GET HTTP request on the class’s URL
	@Produces(MediaType.TEXT_HTML) //Produces says what HTTP media type this method returns. 
	public String sayHtmlHello() {
	return "Hello from Jerseyyyy! this updated from github ";
	}

}
