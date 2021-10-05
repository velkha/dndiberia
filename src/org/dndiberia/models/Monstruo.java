package org.dndiberia.models;

public class Monstruo {
	private int id;
	private String nombre;
	private String descripcion;
	private String dados_de_golpe;
	private int ca;
	private String velocidad;
	private Estadisticas stats;
	private int dificultad;
	private String tamanio;
	private String hechizos;
	private String traits;
	public Monstruo(int id, String nombre, String descripcion, String dados_de_golpe, int ca, String velocidad,
			Estadisticas stats, int dificultad, String tamanio, String hechizos, String traits) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.dados_de_golpe = dados_de_golpe;
		this.ca = ca;
		this.velocidad = velocidad;
		this.stats = stats;
		this.dificultad = dificultad;
		this.tamanio = tamanio;
		this.hechizos = hechizos;
		this.traits = traits;
	}
	public Monstruo(String nombre, String descripcion, String dados_de_golpe, int ca, String velocidad, Estadisticas stats,
			int dificultad, String tamanio, String hechizos, String traits) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.dados_de_golpe = dados_de_golpe;
		this.ca = ca;
		this.velocidad = velocidad;
		this.stats = stats;
		this.dificultad = dificultad;
		this.tamanio = tamanio;
		this.hechizos = hechizos;
		this.traits = traits;
	}
	public Monstruo(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public String getDados_de_golpe() {
		return dados_de_golpe;
	}
	public int getCa() {
		return ca;
	}
	public String getVelocidad() {
		return velocidad;
	}
	public Estadisticas getStats() {
		return stats;
	}
	public int getDificultad() {
		return dificultad;
	}
	public String getTamanio() {
		return tamanio;
	}
	public String getHechizos() {
		return hechizos;
	}
	public String getTraits() {
		return traits;
	}
	
	
}
