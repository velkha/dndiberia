package org.dndiberia.api.security;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.dndiberia.models.Hechizo;
import org.dndiberia.utilities.Tests;

@Path("/sec")
@Produces(MediaType.APPLICATION_JSON) 
public class SecurityServices {
	
	@POST
	@Path("/login")
	@Produces(MediaType.TEXT_PLAIN)
	public int getSpellDmg(@FormParam("nombre") String nombre, @FormParam("nvl") int nvl) {
		return 0;
	}
	
}
