package org.dndiberia.models;

public class Raza {
	private int id_raza;
	private String nombre;
	private String descripcion;
	public Raza(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	public Raza(int id_raza, String nombre, String descripcion) {
		super();
		this.id_raza = id_raza;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	public int getId_raza() {
		return id_raza;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
}
