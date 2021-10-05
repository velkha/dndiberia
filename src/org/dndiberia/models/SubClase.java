package org.dndiberia.models;

public class SubClase extends Clase {
	
	private int id_superclase;
	
	public SubClase(int id_clase, String nombre, String descripcion, int id_superclase) {
		super(id_clase, nombre, descripcion);
		this.setId_superclase(id_superclase);
	}
	public SubClase(String nombre, String descripcion, int id_superclase) {
		super(nombre, descripcion);
		this.setId_superclase(id_superclase);
	}
	public int getId_superclase() {
		return id_superclase;
	}
	private void setId_superclase(int id_superclase) {
		this.id_superclase = id_superclase;
	}
	
	

}
