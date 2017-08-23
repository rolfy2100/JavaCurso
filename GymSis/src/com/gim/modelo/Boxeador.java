package com.gim.modelo;

public class Boxeador {

	public String nombre;
	public String apellido;
	public int dni;
	public double peso;
	public String categoria;
	public String entrenador;

	public void entrenar(){

		System.out.println("El boxeador " + this.nombre + "ya esta realizando los ejercicios pertinentes para bajar de peso y entrar en los limites de su categoria.");
	}

	public void dieta() {

		System.out.println("El boxeador " + this.nombre + " ya esta haciendo la dieta correspondiente para subir de peso y entrar en los limites de su categoria.");
	}


}
