package org.dndiberia.api.dnd;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/dnd")
@Produces(MediaType.APPLICATION_JSON) 
public class DndServices {
	@POST
	@Path("/monstruos")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAllMonstruos() {
		return null;
	}
	@POST
	@Path("/monstruo")
	@Produces(MediaType.TEXT_PLAIN)
	public String getMonstruo() {
		return null;
	}
	
	@POST
	@Path("/historias")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAllHistorias() {
		return null;
	}
	@POST
	@Path("/historia")
	@Produces(MediaType.TEXT_PLAIN)
	public String getHistoria() {
		return null;
	}
	
	@POST
	@Path("/personajes")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAllPersonajes() {
		return null;
	}
	@POST
	@Path("/personaje")
	@Produces(MediaType.TEXT_PLAIN)
	public String getPersonaje() {
		return null;
	}
	
	@POST
	@Path("/hechizos")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAllHechizos() {
		return null;
	}
	@POST
	@Path("/hechizo")
	@Produces(MediaType.TEXT_PLAIN)
	public String getHechizo() {
		return null;
	}
	
	@POST
	@Path("/objetos")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAllObjetos() {
		return null;
	}
	@POST
	@Path("/objeto")
	@Produces(MediaType.TEXT_PLAIN)
	public String getObjeto() {
		return null;
	}
	
	@POST
	@Path("/dotes")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAllDotes() {
		return null;
	}
	@POST
	@Path("/dote")
	@Produces(MediaType.TEXT_PLAIN)
	public String getDote() {
		return null;
	}
	
	@POST
	@Path("/mundos")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAllMundos() {
		return null;
	}
	@POST
	@Path("/mundo")
	@Produces(MediaType.TEXT_PLAIN)
	public String getMundo() {
		return null;
	}
	
	@POST
	@Path("/patreon")
	@Produces(MediaType.TEXT_PLAIN)
	public String getPatreon() {
		return null;
	}
	
	@POST
	@Path("/tutorial")
	@Produces(MediaType.TEXT_PLAIN)
	public String getTutorial() {
		return null;
	}
	
	@POST
	@Path("/perfil")
	@Produces(MediaType.TEXT_PLAIN)
	public String getPerfilUsuario() {
		return null;
	}
	
	
	
}
