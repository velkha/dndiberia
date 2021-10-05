package org.dndiberia.models;

public class Objeto {
	private int id_objeto;
	private String nombre;
	private String descripcion;
	private int peso;
	public Objeto(int id_objeto, String nombre, String descripcion, int peso) {
		super();
		this.id_objeto = id_objeto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.peso = peso;
	}
	public Objeto(String nombre, String descripcion, int peso) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.peso = peso;
	}
	public int getId_objeto() {
		return id_objeto;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public int getPeso() {
		return peso;
	}
	
	
}

