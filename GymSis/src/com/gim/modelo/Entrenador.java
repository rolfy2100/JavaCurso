package com.gim.modelo;

public class Entrenador {

	public String nombre;
	public String apellido;
	public String categoria;
	public Boxeador boxeador []=new Boxeador[5];

	public void ponerDieta(Boxeador numero1){	
		double subirPeso=48.988-numero1.peso;
		System.out.println("El entrenador " + this.nombre + " dice que tenes que subir " + subirPeso + "kg.");
		numero1.dieta();
	}

	public void ponerEntrenar(Boxeador numero1){
		double bajarPeso;

		switch(numero1.categoria){
		case "Mosca":
			bajarPeso=numero1.peso-50.802;
			System.out.println("El entrenador " + this.nombre + " dice que tenes que bajar " + bajarPeso + "kg.");
			numero1.entrenar();
			break;
		case "Gallo":
			bajarPeso=numero1.peso-53.525;
			System.out.println("El entrenador " + this.nombre + " dice que tenes que bajar " + bajarPeso + "kg.");
			numero1.entrenar();
			break;
		case "Pluma":
			bajarPeso=numero1.peso-57.152 ;
			System.out.println("El entrenador " + this.nombre + " dice que tenes que bajar " + bajarPeso + "kg.");
			numero1.entrenar();
			break;
		case "Ligero":
			bajarPeso=numero1.peso-61.237;
			System.out.println("El entrenador " + this.nombre + " dice que tenes que bajar " + bajarPeso + "kg.");
			numero1.entrenar();
			break;
		case "Welter":
			bajarPeso=numero1.peso-66.678 ;
			System.out.println("El entrenador " + this.nombre + " dice que tenes que bajar " + bajarPeso + "kg.");
			numero1.entrenar();
			break;
		case "Mediano":
			bajarPeso=numero1.peso-72.562;
			System.out.println("El entrenador " + this.nombre + " dice que tenes que bajar " + bajarPeso + "kg.");
			numero1.entrenar();
			break;
		case "Medio pesado":
			bajarPeso=numero1.peso-79.378;
			System.out.println("El entrenador " + this.nombre + " dice que tenes que bajar " + bajarPeso + "kg.");
			numero1.entrenar();
			break;
		}

	}
}
