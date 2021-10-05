package org.dndiberia.ddbb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class GestorDDBB {
	
	private Connection conexion;
	@SuppressWarnings("unused")
	private Statement stmt;
	private PreparedStatement pstmt;
	private CachedRowSet crs;
	private Context envCtx;
	private static String pool = "DNDIBERIA_BD";
	
	
	public final void crearConexion(String sPool, boolean valor) throws SQLException, NamingException {
		envCtx = new InitialContext();
		DataSource ds = (javax.sql.DataSource) envCtx.lookup(sPool);
		conexion = ds.getConnection();
		conexion.setAutoCommit(valor);
	}
	public final void crearConexion(String sPool) throws SQLException, NamingException {
		crearConexion(sPool, true);
	}
	public final void crearConexion(boolean valor) throws SQLException, NamingException {
		crearConexion(pool, valor);
	}
	public final void crearConexion() throws SQLException, NamingException {
		crearConexion(pool, true);
	}
	public final void cerrarConexion() {
		try {
			if (conexion != null) {
				conexion.setAutoCommit(true);
				conexion.close();
				conexion = null;
			}
		} catch (Exception ep) {
			ep.printStackTrace();
		}
	}
	
	public void cerrarPreparedStatement() throws SQLException {
		if(pstmt!=null) {
			pstmt.close();
			pstmt=null;
		}
	}
	public void cerrarCachedRowSet() throws SQLException {
		if(crs!=null) {
			crs.close();
			crs=null;
		}
	}
	public CachedRowSet ejecutarQuery(String query, List<String> parametros) throws SQLException {
		ResultSet rs;
		pstmt= conexion.prepareStatement(query);
		for(int i=0; i<parametros.size(); i++) {
			pstmt.setString(i+1, parametros.get(i));
		}
		rs=pstmt.executeQuery();
		crs=createCachedRowSet(rs);
		return crs;
		
	}
	public CachedRowSet ejecutarQuery(String query) throws SQLException {
		ResultSet rs;
		pstmt= conexion.prepareStatement(query);
		rs=pstmt.executeQuery();
		crs=createCachedRowSet(rs);
		return crs;
		
	}
	private CachedRowSet createCachedRowSet(ResultSet rs) throws SQLException {
		CachedRowSet crs;
		RowSetFactory factory;
		factory=RowSetProvider.newFactory();
		crs = factory.createCachedRowSet();
		crs.populate(rs);
		if(rs!=null) {
			rs.close();
			rs=null;
		}
		return crs;
	}
	public int ejecutarUpdate(String query, List<Object> parametros) throws SQLException {
		int check;
		pstmt= conexion.prepareStatement(query);
		for(int i=0; i<parametros.size(); i++) {
			pstmt.setObject(i+1, parametros.get(i));
		}
		check=pstmt.executeUpdate();
		return check;
	}
	
	
	
}
