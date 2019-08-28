package com.senati.mediateca;

public class Cintavideo extends Soporte{

	String actores;
	int duracion;
	
	//Constructores llenos
	public Cintavideo(int id, String titulo, String autor, float precio, String actores, int duracion) {
		super(id, titulo, autor, precio);
		this.actores = actores;
		this.duracion = duracion;
	}
	
	//Constructores vacios
	public Cintavideo() {
		super();
	}
	
	//Getters & Setters
	public String getActor() {
		return actores;
	}

	public void setActor(String actores) {
		this.actores = actores;
	}

	public float getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Cintavideo [actores=" + actores + ", duracion=" + duracion + ", id=" + id + ", titulo=" + titulo
				+ ", autor=" + autor + ", precio=" + precio + "]";
	}
	
	
}
