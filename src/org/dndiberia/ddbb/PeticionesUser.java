package org.dndiberia.ddbb;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.naming.NamingException;
import javax.sql.rowset.CachedRowSet;

import org.apache.log4j.Logger;


public class PeticionesUser {
	
	private static final Logger LOG = Logger.getLogger(PeticionesUser.class);
	private GestorDDBB gestorBD;
	public PeticionesUser() {
		gestorBD=new GestorDDBB();
	}
	/**
	 * Testeo de conexion a la BBDD
	 * @return
	 * @throws SQLException
	 * @throws NamingException
	*/
	public String testConn() throws SQLException, NamingException {
		String sql="SELECT 1 as datatoget FROM dndiberia_config";
		CachedRowSet crs;
		gestorBD.crearConexion();
		crs=gestorBD.ejecutarQuery(sql);
		gestorBD.cerrarConexion();
		return getDataToGetFromCRS(crs);
	}
	
	public boolean isUserRegistrado(String username) throws NamingException, SQLException {
		boolean check=false;
		List<String> params = new ArrayList<String>();
		CachedRowSet crs=null;
		params.add(username);
		String sql="select role as datatoget from users where username = ? and activo = '1'";
		try {
			gestorBD.crearConexion();
			crs = gestorBD.ejecutarQuery(sql, params);
			check = crs!=null&&crs.first();
		} catch (SQLException e) {
			LOG.warn("Excepcion durante la comprobacion de permisos de usuario", e);
		}
		finally { 
			gestorBD.cerrarConexion();
		}
		return check;
	}
	
	
	public void registrarUsuario() {
		
	}

	/**
	 * Pasa los datos de las peticiones que retornan varios campos a una lista de objetos
	 * @param crs
	 * @return
	 * @throws SQLException
	 */
	/*private List<EstadisticaCounter> crsToListEstadisticaCounter(CachedRowSet crs) throws SQLException {
		List<EstadisticaCounter> lista = new ArrayList<EstadisticaCounter>();
		String name;
		String counter;
		while(crs.next()) {
			name=crs.getString("name");
			counter=crs.getString("counter");
			lista.add(new EstadisticaCounter(name, counter));
		}
		crs.beforeFirst();
		return lista;
	}*/

	/**
	 * @param crs
	 * @return
	 * @throws SQLException 
	 */
	private String getDataToGetFromCRS(CachedRowSet crs) throws SQLException {
		String str;
		crs.next();
		str=crs.getString("datatoget");
		return str;
	}
	
	
}
