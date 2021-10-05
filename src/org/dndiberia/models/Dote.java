package org.dndiberia.models;

public class Dote {
	private int id_nombre;
	private String nombre;
	private String descripcion;
	public Dote(int id_nombre, String nombre, String descripcion) {
		super();
		this.id_nombre = id_nombre;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	public int getId_nombre() {
		return id_nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	
}
