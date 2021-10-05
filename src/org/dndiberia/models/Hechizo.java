package org.dndiberia.models;

import org.dndiberia.utilities.DndUtility;

import com.google.gson.annotations.SerializedName;

public class Hechizo {
	
	@SerializedName("id_hechizo")
	private int idHechizo;
	private String nombre;
	private String descripcion;
	
	@SerializedName("nvl_hechizo")
	private int nvlHechizo;
	private int escuela;
	
	@SerializedName("tiempo_lanzamiento")
	private String tiempoLanzamiento;
	private String alcance;
	private String objetivo;
	private String tipo;
	private String ataque;
	
	@SerializedName("ataque_superior")
	private String ataqueSuperior;
	
	@SerializedName("descripcion_superior")
	private String descripcionSuperior;
	private String componentes;
	public Hechizo(int id_hechizo, String nombre, String descripcion, int nvlHechizo, int escuela,
			String tiempoLanzamiento, String alcance, String objetivo, String tipo, String ataque, String ataqueSuperior,
			String descripcionSuperior, String componentes) {
		super();
		this.idHechizo = id_hechizo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.nvlHechizo = nvlHechizo;
		this.escuela = escuela;
		this.tiempoLanzamiento = tiempoLanzamiento;
		this.alcance = alcance;
		this.objetivo = objetivo;
		this.tipo = tipo;
		this.ataque = ataque;
		this.ataqueSuperior = ataqueSuperior;
		this.descripcionSuperior = descripcionSuperior;
		this.componentes = componentes;
	}
	public Hechizo(int id_hechizo, String nombre, String descripcion, int nvlHechizo, int escuela,
			String tiempoLanzamiento, String alcance, String objetivo, String tipo, String descripcionSuperior,
			String componentes) {
		super();
		this.idHechizo = id_hechizo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.nvlHechizo = nvlHechizo;
		this.escuela = escuela;
		this.tiempoLanzamiento = tiempoLanzamiento;
		this.alcance = alcance;
		this.objetivo = objetivo;
		this.tipo = tipo;
		this.ataque = "0";
		this.ataqueSuperior = "0";
		this.descripcionSuperior = descripcionSuperior;
		this.componentes = componentes;
	}
	public int getIdHechizo() {
		return idHechizo;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public int getNvlHechizo() {
		return nvlHechizo;
	}
	public int getEscuela() {
		return escuela;
	}
	public String getTiempoLanzamiento() {
		return tiempoLanzamiento;
	}
	public String getAlcance() {
		return alcance;
	}
	public String getObjetivo() {
		return objetivo;
	}
	public String getTipo() {
		return tipo;
	}
	public String getAtaqueSuperior() {
		return ataqueSuperior;
	}
	public String getDescripcionSuperior() {
		return descripcionSuperior;
	}
	public String getComponentes() {
		return componentes;
	}
	
	public int getDamage(String damage) {
		int resultado;
		if(ataque!=null)
		try{
			resultado=Integer.valueOf(damage);
		}
		catch(NumberFormatException nfe) {
			resultado=this.rollDmg(damage);
		}
		else {
			resultado=0;
		}
		return resultado;
	}
	
	private int rollDmg(String dices) {
		DndUtility dndUtility= new DndUtility();
		return dndUtility.rollDice(dices);
	}
	
	public int getDamageByLevel(int spellLvl) {
		int resultado=0;
		while(spellLvl>this.nvlHechizo&&ataqueSuperior!=null) {
			resultado+=this.getDamage(ataqueSuperior);
			spellLvl--;
		}
		if(ataque!=null) {
			resultado+=this.getDamage(ataque);
		}
		return resultado;
	}
	
	
}
