package org.dndiberia.ddbb;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.naming.NamingException;
import javax.sql.rowset.CachedRowSet;

import org.dndiberia.ddbb.conversores.DataConversor;
import org.dndiberia.ddbb.conversores.DndModelsConversor;
import org.dndiberia.models.Clase;
import org.dndiberia.models.Dote;
import org.dndiberia.models.Hechizo;
import org.dndiberia.models.Objeto;
import org.dndiberia.models.Raza;
import org.dndiberia.models.SubClase;
import org.dndiberia.models.SubRaza;
import org.dndiberia.models.Monstruo;;

public class PeticionesDND {
	
	GestorDDBB gestorDDBB;
	DataConversor dataConversor;
	DndModelsConversor dndModelsConversor;
	public PeticionesDND() {
		gestorDDBB= new GestorDDBB();
		dataConversor=new DataConversor();
		dndModelsConversor = new DndModelsConversor();
	}
	public Clase getClaseByName(String nombre) throws SQLException, NamingException {
		String sql="select * from clase where nombre = ?";
		List<String> parametros = new ArrayList<String>();
		CachedRowSet crs;
		parametros.add(dataConversor.databaseStringConversor(nombre));
		gestorDDBB.crearConexion();
		crs=gestorDDBB.ejecutarQuery(sql, parametros);
		gestorDDBB.cerrarConexion();
		return dndModelsConversor.converCRSToDndClassArray(crs)[0];
	}
	
	public Raza getRazaByName(String nombre) throws SQLException, NamingException {
		String sql="select * from raza where nombre = ?";
		List<String> parametros = new ArrayList<String>();
		CachedRowSet crs;
		parametros.add(dataConversor.databaseStringConversor(nombre));
		gestorDDBB.crearConexion();
		crs=gestorDDBB.ejecutarQuery(sql, parametros);
		gestorDDBB.cerrarConexion();
		return dndModelsConversor.converCRSToDndRazaArray(crs)[0];
	}

	
	public Hechizo getHechizoByName(String nombre) throws SQLException, NamingException {
		String sql="select * from hechizos where nombre = ?";
		List<String> parametros = new ArrayList<String>();
		CachedRowSet crs;
		parametros.add(dataConversor.databaseStringConversor(nombre));
		gestorDDBB.crearConexion();
		crs=gestorDDBB.ejecutarQuery(sql, parametros);
		gestorDDBB.cerrarConexion();
		return dndModelsConversor.converCRSToDndHechizoArray(crs)[0];
	}
	
	public Objeto getObjetoByName(String nombre) throws SQLException, NamingException {
		String sql="select * from objetos where nombre = ?";
		List<String> parametros = new ArrayList<String>();
		CachedRowSet crs;
		parametros.add(dataConversor.databaseStringConversor(nombre));
		gestorDDBB.crearConexion();
		crs=gestorDDBB.ejecutarQuery(sql, parametros);
		gestorDDBB.cerrarConexion();
		return dndModelsConversor.converCRSToDndObjetoArray(crs)[0];
	}
	
	public SubClase getSubclaseByName(String nombre) throws SQLException, NamingException {
		String sql="select * from subclase where nombre = ?";
		List<String> parametros = new ArrayList<String>();
		CachedRowSet crs;
		parametros.add(dataConversor.databaseStringConversor(nombre));
		gestorDDBB.crearConexion();
		crs=gestorDDBB.ejecutarQuery(sql, parametros);
		gestorDDBB.cerrarConexion();
		return dndModelsConversor.converCRSToDndSubClaseArray(crs)[0];
	}
	
	public SubRaza getSubrazaByName(String nombre) throws SQLException, NamingException {
		String sql="select * from clase where nombre = ?";
		List<String> parametros = new ArrayList<String>();
		CachedRowSet crs;
		parametros.add(dataConversor.databaseStringConversor(nombre));
		gestorDDBB.crearConexion();
		crs=gestorDDBB.ejecutarQuery(sql, parametros);
		gestorDDBB.cerrarConexion();
		return dndModelsConversor.converCRSToDndSubRazaArray(crs)[0];
	}
	
	public Dote getDoteByName(String nombre) throws SQLException, NamingException {
		String sql="select * from dotes where nombre = ?";
		List<String> parametros = new ArrayList<String>();
		CachedRowSet crs;
		parametros.add(dataConversor.databaseStringConversor(nombre));
		gestorDDBB.crearConexion();       
		crs=gestorDDBB.ejecutarQuery(sql, parametros);
		gestorDDBB.cerrarConexion();
		return dndModelsConversor.converCRSToDndDoteArray(crs)[0];
	}
	
	public Monstruo getMonstruoByName(String nombre) throws SQLException, NamingException {
		String sql="select * from monstruos where nombre = ?";
		List<String> parametros = new ArrayList<String>();
		CachedRowSet crs;
		parametros.add(dataConversor.databaseStringConversor(nombre));
		gestorDDBB.crearConexion();
		crs=gestorDDBB.ejecutarQuery(sql, parametros);
		gestorDDBB.cerrarConexion();
		return dndModelsConversor.converCRSToDndMonstruoArray(crs)[0];
	}
	public CachedRowSet getDataWithFilters(String tableName, Map<String,String> filtros, String orderBy, String order) throws SQLException, NamingException {
		int i=0;
		CachedRowSet crs;
		List<String> parametros = new ArrayList<String>();
		StringBuilder baseSql= new StringBuilder("select * from ");
		baseSql.append(tableName);
		baseSql.append(" where");
		for (Map.Entry<String, String> entry : filtros.entrySet()) {
	        if(i>0) {
	        	baseSql.append(" and ");
	        }
	        baseSql.append(entry.getKey()+"= ? ");
	        parametros.add(entry.getValue());
	        i++;
	    }
		if(orderBy!=null&&order!=null) {
			baseSql.append("order by ");
			baseSql.append(orderBy);
			baseSql.append(" ");
			baseSql.append(order);
		}
		gestorDDBB.crearConexion();
		crs=gestorDDBB.ejecutarQuery(baseSql.toString(), parametros);
		gestorDDBB.cerrarConexion();
		return crs;
	}
	public CachedRowSet getDataWithFilters(String tableName, Map<String,String> filtros) throws SQLException, NamingException {
		return getDataWithFilters(tableName, filtros, null,null);
	}
}
