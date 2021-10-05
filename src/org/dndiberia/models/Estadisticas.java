package org.dndiberia.models;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class Estadisticas {
	private int fuerza;
	private int destreza;
	private int constitucion;
	private int inteligencia;
	private int sabiduria;
	private int carisma;
	
	//fuerza
	private int atletismo;
	//destreza
	private int acrobacias;
	private int juegoDeManos;
	private int sigilo;
	//inteligencia
	private int conocimientoArcano;
	private int historia;
	private int investigacion;
	private int naturaleza;
	//sabiduria
	private int medicina;
	private int percepcion;
	private int perspicacia;
	private int supervivencia;
	private int tratoConAnimales;
	//carisma
	private int enganio;
	private int intimidacion;
	private int persuasion;
	
	
	
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	public int getDestreza() {
		return destreza;
	}
	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}
	public int getConstitucion() {
		return constitucion;
	}
	public void setConstitucion(int constitucion) {
		this.constitucion = constitucion;
	}
	public int getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	public int getSabiduria() {
		return sabiduria;
	}
	public void setSabiduria(int sabiduria) {
		this.sabiduria = sabiduria;
	}
	public int getCarisma() {
		return carisma;
	}
	public void setCarisma(int carisma) {
		this.carisma = carisma;
	}
	
	
	/*
	 * Metodos de calculo
	 */
	public int calcularExtra(int stat, int proficiencia) {
		return (stat-10)/2+proficiencia;
	}
	
	public static Estadisticas estadisticaFromJson(String json) throws JsonSyntaxException{
		return new Gson().fromJson(json, Estadisticas.class);
	}
}
