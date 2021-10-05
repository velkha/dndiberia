package org.dndiberia.models;

public class SubRaza extends Raza {
	
	private int id_superraza;
	public SubRaza(int id_raza, String nombre, String descripcion, int id_subraza) {
		super(id_raza, nombre, descripcion);
		this.setId_subraza(id_subraza);
	}
	public SubRaza(String nombre, String descripcion, int id_subraza) {
		super(nombre, descripcion);
		this.setId_subraza(id_subraza);
	}
	public int getId_subraza() {
		return id_superraza;
	}
	private void setId_subraza(int id_subraza) {
		this.id_superraza = id_subraza;
	}
	
}
