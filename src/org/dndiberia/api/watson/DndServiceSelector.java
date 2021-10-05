package org.dndiberia.api.watson;

import java.util.Map;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.dndiberia.models.ReturnApiJsonObject;
import org.dndiberia.utilities.Utilities;


public class DndServiceSelector {
	private static String ACTION_NOT_FOUND="Peticion no encontrada, por favor contacte con un administrador o soporte";
	@DefaultValue("-1") @QueryParam("action") int action;
	
	
	/**
	 * Metodo que recibe el Json de la peticion del asistente y dependiendo de la accion elegida realiza una accion u otra
	 * Acciones actuales
	 * 1-50 -> Peticiones generales
	 * 50-100 -> Peticiones de mantenimiento/testeo
	 		* 51 -> Mostrar parametros  
	 * 100-500 -> Peticiones a la BBDD
	 	* 100 - 110 -> Reservado	 
	 	* 111 - 130 -> Petiiones Hechizos
	 			* 111 -> Listar todos los hechizos
	 			* 112 -> Informacion sobre un hechizo concreto
	 			* 113 -> Listar los hechizos filtrados por escuela
	 			* 114 -> Listar los hechizos por clase
	 			* 115 -> Listar los hechizos por raza
	 			* 116 -> Listar los hechizos de un monstruo | WIP |
	 	* 131 - 150 -> Peticiones Razas
	 			* 131 -> Listar todas las razas
	 			* 132 -> Informacion sobre una raza concreta		
	 	* 151 - 170 -> Peticiones Clases
	 			* 151 -> Listar todas las clases
	 			* 152 -> Informacion sobre una clase concreta 
	 	* 171 - 190 -> Peticiones Monstruos
	 			* 171 -> Listar todos los monstruos
	 			* 172 -> Informacion sobre un monstruo concreto 	
	 	* 
	 	* 
	 * 500-600 -> Peticiones apis externas
	 */
	

	@POST
	@Path("/watson")
	@Produces(MediaType.APPLICATION_JSON)
	public String getRequestedJson(String json) {
		Utilities utilities = new Utilities();
		Map<String, Object> parametros = utilities.jsonToMapKV(json);
		System.out.println(json);
		String data;
		action=((Double)parametros.get("action")).intValue();
		switch(action) {
			case 51:
				data=getAllParameters(parametros);
				break;
			case 111:
				data=getAllSpells(parametros);
				break;
			case 112:
				data=getSpellByName(parametros);
				break;
			case 113:
				data=getSpellListByEscuela(parametros);
				break;
			case 114:
				data=getSpellListByClase(parametros);
				break;
			case 115:
				data=getSpellListByRaza(parametros);
				break;
			case 116:
				data=getSpellListByMonstruo(parametros);
				break;
			case 131:
				data=getAllRaces(parametros);
				break;
			case 132:
				data=getRazaByName(parametros);
				break;
			case 151:
				data=getAllClases(parametros);
				break;
			case 152:
				data=getClaseByName(parametros);
				break;
			case 171:
				data=getAllMonsters(parametros);
			case 172:
				data=getMonstruoByName(parametros);
			case -1:
			default:
				data=utilities.generateErrorData(ACTION_NOT_FOUND);
				break;
				
		}
		return data;
	}
	private String getMonstruoByName(Map<String, Object> parametros) {
		DndServices ds = new DndServices();
		return ds.getMonstruoByName((String)parametros.get("nombre"));
	}
	private String getAllMonsters(Map<String, Object> parametros) {
		DndServices ds = new DndServices();
		return ds.getAllMonsters();
	}
	private String getClaseByName(Map<String, Object> parametros) {
		DndServices ds = new DndServices();
		return ds.getClaseByName((String)parametros.get("nombre"));
	}
	private String getAllClases(Map<String, Object> parametros) {
		DndServices ds = new DndServices();
		return ds.getAllClases();
	}
	private String getRazaByName(Map<String, Object> parametros) {
		DndServices ds = new DndServices();
		return ds.getRazaByName((String)parametros.get("nombre"));
	}
	private String getAllRaces(Map<String, Object> parametros) {
		DndServices ds = new DndServices();
		return ds.getAllRaces();
	}
	private String getSpellListByMonstruo(Map<String, Object> parametros) {
		DndServices ds = new DndServices();
		return ds.getSpellsByMonstruo((String)parametros.get("nombre"));
	}
	private String getSpellListByRaza(Map<String, Object> parametros) {
		DndServices ds = new DndServices();
		return ds.getSpellsByRaza((String)parametros.get("nombre"));
	}
	private String getSpellListByClase(Map<String, Object> parametros) {
		DndServices ds = new DndServices();
		return ds.getSpellsByClase((String)parametros.get("nombre"));
	}
	private String getSpellListByEscuela(Map<String, Object> parametros) {
		DndServices ds = new DndServices();
		return ds.getSpellsByEscuela((String)parametros.get("nombre"));
	}
	private String getSpellByName(Map<String, Object> parametros) {
		DndServices ds = new DndServices();
		return ds.getSpellByName((String)parametros.get("nombre"));
	}
	private String getAllSpells(Map<String, Object> parametros) {
		DndServices ds = new DndServices();
		return ds.getAllSpells();
	}
	private String getAllParameters(Map<String, Object> map) {
		ReturnApiJsonObject rbo = new ReturnApiJsonObject(1);
		Utilities utilities = new Utilities();
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			rbo.addData(entry.getKey()+" || "+entry.getValue().toString());
		}
		
		return utilities.toJson(rbo);
	}
	
}
