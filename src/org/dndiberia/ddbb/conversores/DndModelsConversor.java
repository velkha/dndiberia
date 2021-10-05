package org.dndiberia.ddbb.conversores;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.rowset.CachedRowSet;

import org.dndiberia.models.Clase;
import org.dndiberia.models.Dote;
import org.dndiberia.models.Estadisticas;
import org.dndiberia.models.Hechizo;
import org.dndiberia.models.Monstruo;
import org.dndiberia.models.Objeto;
import org.dndiberia.models.Raza;
import org.dndiberia.models.SubClase;
import org.dndiberia.models.SubRaza;
import org.dndiberia.utilities.Utilities;

import com.google.gson.JsonSyntaxException;


public class DndModelsConversor {
	public Clase[] converCRSToDndClassArray(CachedRowSet crs) throws SQLException {
		Clase dndClass=null;
		Clase[] array;
		ArrayList<Clase> listaClases= new ArrayList<Clase>();
		String nombre, descripcion;
		int id;
		while(crs.next()) {
				id=crs.getInt("id_clase");
				nombre=crs.getString("nombre");
				descripcion=crs.getString("descripcion");
				dndClass=new Clase(id, nombre, descripcion);
				listaClases.add(dndClass);
		}
		crs.beforeFirst();
		array = listaClases.toArray(new Clase[0]);
		return array;
	}
	public Dote[] converCRSToDndDoteArray(CachedRowSet crs) throws SQLException {
		Dote dote=null;
		Dote[] array;
		ArrayList<Dote> lista= new ArrayList<Dote>();
		String nombre, descripcion;
		int id;
		while(crs.next()) {
				id=crs.getInt("id_dote");
				nombre=crs.getString("nombre");
				descripcion=crs.getString("descripcion");
				dote=new Dote(id, nombre, descripcion);
				lista.add(dote);
		}
		crs.beforeFirst();
		array = lista.toArray(new Dote[0]);
		return array;
	}
	
	public Raza[] converCRSToDndRazaArray(CachedRowSet crs) throws SQLException {
		Raza dndClass=null;
		Raza[] array;
		ArrayList<Raza> lista= new ArrayList<Raza>();
		String nombre, descripcion;
		int id;
		while(crs.next()) {
				id=crs.getInt("id_raza");
				nombre=crs.getString("nombre");
				descripcion=crs.getString("descripcion");
				dndClass=new Raza(id, nombre, descripcion);
				lista.add(dndClass);
		}
		crs.beforeFirst();
		array = lista.toArray(new Raza[0]);
		return array;
	}
	
	public Hechizo[] converCRSToDndHechizoArray(CachedRowSet crs) throws SQLException {
		Hechizo hechizo=null;
		Hechizo[] array;
		ArrayList<Hechizo> listaClases= new ArrayList<Hechizo>();
		String nombre, descripcion, tiempo_lanzamiento, alcance, objetivo, tipo, ataque, ataque_superior, descripcion_superior, componentes;
		int id, nvl_hechizo, escuela;
		while(crs.next()) {
				id=crs.getInt("id_hechizo");
				nombre=crs.getString("nombre");
				descripcion=crs.getString("descripcion");
				tiempo_lanzamiento=crs.getString("tiempo_lanzamiento");
				alcance=crs.getString("alcance");
				objetivo=crs.getString("objetivo");
				tipo=crs.getString("tipo");
				ataque=crs.getString("ataque");
				ataque_superior=crs.getString("ataque_superior");
				descripcion_superior=crs.getString("descripcion_superior");
				componentes=crs.getString("componentes");
				nvl_hechizo=crs.getInt("nvl_hechizo");
				escuela=crs.getInt("escuela");
				hechizo=new Hechizo(id, nombre, descripcion, nvl_hechizo, escuela, tiempo_lanzamiento, alcance, objetivo, tipo, ataque, ataque_superior, descripcion_superior, componentes);
				listaClases.add(hechizo);
		}
		crs.beforeFirst();
		array = listaClases.toArray(new Hechizo[0]);
		return array;
	}
	
	public Objeto[] converCRSToDndObjetoArray(CachedRowSet crs) throws SQLException {
		Objeto objeto=null;
		Objeto[] array;
		ArrayList<Objeto> lista= new ArrayList<Objeto>();
		String nombre, descripcion;
		int id, peso;
		while(crs.next()) {
				id=crs.getInt("id_objeto");
				nombre=crs.getString("nombre");
				descripcion=crs.getString("descripcion");
				peso=crs.getInt("peso");
				objeto=new Objeto(id, nombre, descripcion, peso);
				lista.add(objeto);
		}
		crs.beforeFirst();
		array = lista.toArray(new Objeto[0]);
		return array;
	}
	
	public SubClase[] converCRSToDndSubClaseArray(CachedRowSet crs) throws SQLException {
		SubClase subClass=null;
		SubClase[] array;
		ArrayList<SubClase> lista= new ArrayList<SubClase>();
		String nombre, descripcion;
		int id, id_superclase;
		while(crs.next()) {
				id=crs.getInt("id_subclase");
				nombre=crs.getString("nombre");
				descripcion=crs.getString("descripcion");
				id_superclase=crs.getInt("id_superclase");
				subClass=new SubClase(id, nombre, descripcion, id_superclase);
				lista.add(subClass);
		}
		crs.beforeFirst();
		array = lista.toArray(new SubClase[0]);
		return array;
	}
	public SubRaza[] converCRSToDndSubRazaArray(CachedRowSet crs) throws SQLException {
		SubRaza dndClass=null;
		SubRaza[] array;
		ArrayList<SubRaza> lista= new ArrayList<SubRaza>();
		String nombre, descripcion;
		int id, id_superraza;
		while(crs.next()) {
				id=crs.getInt("id_subraza");
				nombre=crs.getString("nombre");
				descripcion=crs.getString("descripcion");
				id_superraza=crs.getInt("id_superraza");
				dndClass=new SubRaza(id, nombre, descripcion, id_superraza);
				lista.add(dndClass);
		}
		crs.beforeFirst();
		array = lista.toArray(new SubRaza[0]);
		return array;
	}
	public Monstruo[] converCRSToDndMonstruoArray(CachedRowSet crs) throws SQLException {
		Monstruo monstruo=null;
		Monstruo[] array;
		ArrayList<Monstruo> lista= new ArrayList<Monstruo>();
		Estadisticas stats;
		String nombre, descripcion, dados_de_golpe, velocidad, tamanio, hechizos, traits;
		int id, ca, dificultad;
		while(crs.next()) {
				id=crs.getInt("id_clase");
				nombre=crs.getString("nombre");
				descripcion=crs.getString("descripcion");
				dados_de_golpe=crs.getString("dados_de_golpe");
				velocidad=crs.getString("velocidad");
				try {
					stats = Estadisticas.estadisticaFromJson(crs.getString("stats"));
				}
				catch (JsonSyntaxException e) {
					stats=null;
				}
				
				tamanio=crs.getString("tamanio");
				hechizos=crs.getString("hechizos");
				traits=crs.getString("traits");
				ca=crs.getInt("ca");
				dificultad=crs.getInt("dificultad");
				monstruo=new Monstruo(id, nombre, descripcion, dados_de_golpe, ca, velocidad, stats, dificultad, tamanio, hechizos, traits);
				lista.add(monstruo);
		}
		crs.beforeFirst();
		array = lista.toArray(new Monstruo[0]);
		return array;
	}
	
}
