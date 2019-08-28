package com.senati.mediateca;

public class Prestamo {

	int idprestamo;
	int idsocio;
	int idsoporte;
	int monto;
	int cantprestamos;
	
	//Constructor lleno
	public Prestamo(int idprestamo, int idsocio, int idsoporte, int monto, int cantprestamos) {
		super();
		this.idprestamo = idprestamo;
		this.idsocio = idsocio;
		this.idsoporte = idsoporte;
		this.monto = monto;
		this.cantprestamos = cantprestamos;
	}

	
	
	//Constructor vacio
	public Prestamo() {
		super();
	}


	//Getters & Setters

	public int getIdprestamo() {
		return idprestamo;
	}



	public void setIdprestamo(int idprestamo) {
		this.idprestamo = idprestamo;
	}



	public int getIdsocio() {
		return idsocio;
	}



	public void setIdsocio(int idsocio) {
		this.idsocio = idsocio;
	}



	public int getIdsoporte() {
		return idsoporte;
	}



	public void setIdsoporte(int idsoporte) {
		this.idsoporte = idsoporte;
	}



	public int getMonto() {
		return monto;
	}



	public void setMonto(int monto) {
		this.monto = monto;
	}



	public int getCantprestamos() {
		return cantprestamos;
	}



	public void setCantprestamos(int cantprestamos) {
		this.cantprestamos = cantprestamos;
	}		
}
