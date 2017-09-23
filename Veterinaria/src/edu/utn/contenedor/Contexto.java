package edu.utn.contenedor;

import java.util.Scanner;

import edu.utn.modelo.Animal;
import edu.utn.modelo.Veterinario;

public final class Contexto {

	public static Animal creoAnimal(String nombre, String tipo, String raza, int edad, String causa){

		return new Animal(nombre, tipo, raza, edad, causa);
	}

	public static Veterinario[] creoVeterinarios(){

		Veterinario[]veterinarios=new Veterinario[5];

		veterinarios[0]=new Veterinario("Juan","Perez",123123,"licencia");

		veterinarios[1]=new Veterinario("Pablo","Lazo",123123,"licencia");

		veterinarios[2]=new Veterinario("Luis","Zotare",123123,"licencia");

		veterinarios[3]=new Veterinario("Gabriel","Montenegro",123123,"licencia");

		veterinarios[4]=new Veterinario("Dante","Panella",123123,"licencia");

		return veterinarios;
	}

	public static Scanner creoScanner() {
		return new Scanner(System.in);
	}


}
