package edu.utn.modelo;

import java.util.Scanner;

import edu.utn.contenedor.Contexto;

public class Veterinario {
	static Scanner entrada=Contexto.creoScanner();
	private String nombre;
	private String apellido;
	private int dni;
	private String licencia;
	private Animal[]pacientes;
	private int contador;

	public Veterinario(String nom, String ape, int documento, String lic){

		nombre=nom;
		apellido=ape;
		dni=documento;
		licencia=lic;
		pacientes=new Animal[5];
		contador=0;
	}

	public Animal[] getPacientes() {
		return pacientes;
	}


	public void setPacientes(Animal a) {

		if(contador<20){
			pacientes[contador] = a;
			contador++;
		}

	}


	public String getNombre() {
		return nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public int getDni() {
		return dni;
	}


	public String getLicencia() {
		return licencia;
	}

	public void setMedicamentos(int i){

		String medicamentos=entrada.nextLine();

		medicamentos=medicamentos.toLowerCase();

		pacientes[i].setMedicamentos(medicamentos);

	}

	public void setCausas(int i){

		String causas=entrada.nextLine();

		causas=causas.toLowerCase();

		pacientes[i].setCausasVet(causas);
	}
}
