package edu.utn.modelo;

public class Animal {

	private String nombre;
	private String tipo;
	private String raza;
	private int edad;
	private String causaAtencion;
	private String causasVet;

	public Animal(String nomb, String tip, String raz, int eda, String causa){

		nombre=nomb;
		tipo=tip;
		raza=raz;
		edad=eda;
		causaAtencion=causa;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getCausasVet() {
		return causasVet;
	}

	public void setCausasVet(String causasVet) {
		this.causasVet = causasVet;
	}

	public String getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(String medicamentos) {
		this.medicamentos = medicamentos;
	}

	private String medicamentos;

}
