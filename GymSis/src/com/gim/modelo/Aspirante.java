package com.gim.modelo;

public class Aspirante {

	public String nombre;
	public String apellido;
	public int dni;
	public double peso;

	public Boxeador inscribirse(Sistema sis){

		return sis.fichado(this);

	}
}
