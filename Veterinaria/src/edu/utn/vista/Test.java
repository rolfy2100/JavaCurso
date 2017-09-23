package edu.utn.vista;

import java.util.Scanner;

import edu.utn.contenedor.Contexto;
import edu.utn.controlador.VeterinariaCtrl;

public final class Test {

	static VeterinariaCtrl controlador=new VeterinariaCtrl();

	static Scanner entrada=Contexto.creoScanner();


	public static void main(String[] args) {

		arranque();

	}

	public static void arranque(){

		System.out.println("Es usted un: \n 1) Administrador \n 2) Veterinario");

		int opcion=0;

		if(entrada.hasNextInt()){

			opcion=entrada.nextInt();

			if(opcion<=0 || opcion>2){

				System.out.println("Elija una opcion valida");

				arranque();
			}
		}
		else{
			System.out.println("Ingrese un dato valido");

			entrada=Contexto.creoScanner();

			arranque();
		}

		entrada.nextLine();

		int opcionTipo=0;

		if(opcion==1){
			System.out.println("Ingrese el nombre del animal");

			String nombre=entrada.nextLine();

			if(!nombre.equalsIgnoreCase("fin"))
			{
				System.out.println("Ingrese el tipo de animal: \n 1) Perro \n 2) Gato \n 3) Conejo");

				String tipo="";	

				do{

					if(entrada.hasNextInt()){

						opcionTipo=entrada.nextInt();

					}else{
						System.err.println("Solamente se atienden perros, gatos y conejos.");

						System.out.println("Ingrese el tipo de animal: \n 1) Perro \n 2) Gato \n 3) Conejo");

						arranque();
					}
				}while(opcionTipo<0 || opcionTipo>3);

				if(opcionTipo==1) tipo="perro"; else if(opcionTipo==2)tipo="gato"; else tipo="conejo";

				entrada.nextLine();

				System.out.println("Ingrese la raza");

				String raza=entrada.nextLine();

				int edad=0;

				System.out.println("Ingrese la edad");

				do{
					if(entrada.hasNextInt()){

						edad=entrada.nextInt();

					}else {

						System.out.println("El dato ingresado es invalido, vuelva a ingresar la edad");

						entrada=Contexto.creoScanner();

					}
				}while(edad==0);

				System.out.println("Ingrese la causa de la visita al veterinario:");

				entrada.nextLine();

				String causa=entrada.nextLine();

				//Paso a minuscula los datos ingresados por consola

				raza=raza.toLowerCase();

				causa=causa.toLowerCase();

				String mayuscula=""+nombre.charAt(0);

				nombre=nombre.toLowerCase();

				//Paso a mayuscula la primera letra del nombre del animal

				nombre=nombre.substring(1,nombre.length());

				nombre=mayuscula.toUpperCase() + nombre;

				controlador.creoAnimal(nombre, tipo, raza, edad, causa);

			}else{

				controlador.mostrarPacientes();

			}
		}else{

			System.out.println("Seleccione su nombre y apellido: \n 1) Juan Perez \n 2) Pablo Lazo \n 3) Luis Zotare \n 4) Gabriel Montenegro \n 5) Dante Panella" );
			do{
				if(entrada.hasNextInt())
					opcionTipo=entrada.nextInt();
				else{
					System.out.println("El dato ingresado es invalido, vuelva a ingresar la opcion");
					System.out.println("Seleccione su nombre y apellido: \n 1) Juan Perez \n 2) Pablo Lazo \n 3) Luis Zotare \n 4) Gabriel Montenegro \n 5) Dante Panella" );
					entrada=Contexto.creoScanner();
				}
			}while(opcionTipo==0);

			switch (opcionTipo) {
			case 1:
				controlador.muestroPacientes("Juan");
				break;
			case 2:
				controlador.muestroPacientes("Pablo");
				break;
			case 3:
				controlador.muestroPacientes("Luis");
				break;
			case 4:
				controlador.muestroPacientes("Gabriel");
				break;
			case 5:
				controlador.muestroPacientes("Dante");
				break;
			}
		}


	}
}
