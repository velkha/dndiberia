package org.dndiberia.api.watson;
import java.sql.SQLException;

import javax.naming.NamingException;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.dndiberia.ddbb.PeticionesDND;
import org.dndiberia.models.Hechizo;
import org.dndiberia.utilities.Tests;
import org.dndiberia.utilities.Utilities;

@Path("/dnd")
@Produces(MediaType.APPLICATION_JSON) 
public class DndServices {
	
	private static final String ERROR_SQL="ha habido un problema con la conexion, intentalo de nuevo mas tarde. si el problema persiste por favor contacta a un administrador o soporte";
	
	@POST
	@Path("/spelldamage")
	@Produces(MediaType.TEXT_PLAIN)
	public int getSpellDmg(@FormParam("nombre") String nombre, @FormParam("nvl") int nvl) {
		int returnValue=0;
		Hechizo hechizo;
		System.out.println(nombre+" - "+nvl);
		/*gethechizo from ddbb - wic*/
		hechizo = Tests.generateTestHechizo();
		
		returnValue=hechizo.getDamageByLevel(nvl);
		return returnValue;
	}
	
	@POST
	@Path("/clase")
	@Produces(MediaType.APPLICATION_JSON)
	public String getClaseByName(@FormParam("nombre") String nombre) {
		PeticionesDND pdb= new PeticionesDND();
		String returnData="";
		/*try {
			returnData = Utilities.toJson(pdb.getClaseByName(nombre));
		} catch (SQLException | NamingException e) {
			e.printStackTrace();
			returnData = Utilities.generateErrorData(ERROR_SQL);
		}
		*/
		return returnData;
	}

	public String getMonstruoByName(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAllMonsters() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAllClases() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getRazaByName(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAllRaces() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSpellsByMonstruo(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSpellsByRaza(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSpellsByClase(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSpellsByEscuela(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSpellByName(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAllSpells() {
		// TODO Auto-generated method stub
		return null;
	}
}
