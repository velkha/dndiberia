package org.dndiberia.models;

public class Clase {
	private int id_clase;
	private String nombre;
	private String descripcion;
	
	
	
	public Clase(int id_clase, String nombre, String descripcion) {
		super();
		this.id_clase = id_clase;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	public Clase(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public int getId_clase() {
		return id_clase;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public String toString() {
		return "id_clase = "+id_clase+";nombre = "+nombre+";descripcion = "+descripcion;
	}
	
	
	
	
}
