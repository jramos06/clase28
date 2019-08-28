package com.senati.mediateca;

public class Libro extends Soporte{
	
	//Para heredar atributos de una clase superior
	//extends Suoerclase
	
	int nropagina;
	int nroisbn;
	
	//Constructores llenos
	public Libro(int id, String titulo, String autor, float precio, int nropagina, int nroisbn) {
	super(id, titulo, autor, precio);
	this.nropagina = nropagina;
	this.nroisbn = nroisbn;
	}
	
	//Constructores vacios
	public Libro() {
		super();
	}

	//Getters and Setters
	public int getNropagina() {
		return nropagina;
	}

	public void setNropagina(int nropagina) {
		this.nropagina = nropagina;
	}

	public int getNroisbn() {
		return nroisbn;
	}

	public void setNroisbn(int nroisbn) {
		this.nroisbn = nroisbn;
	}

	//tosring
	@Override
	public String toString() {
		return "Libro [nropagina=" + nropagina + ", nroisbn=" + nroisbn + ", id=" + id + ", titulo=" + titulo
				+ ", autor=" + autor + ", precio=" + precio + "]";
	}
	
	
}
