package edu.utn.controlador;

import java.util.Scanner;

import edu.utn.contenedor.Contexto;
import edu.utn.modelo.Animal;
import edu.utn.modelo.Veterinario;
import edu.utn.vista.Test;

public class VeterinariaCtrl {
	
	Scanner entrada=Contexto.creoScanner();
	static int i;
	static int contador;
	Veterinario[]veterinarios;
	static int limitePacientes=20;


	public void creoAnimal(String nombre, String tipo, String raza, int edad, String causa){

		if(veterinarios==null){
		
			veterinarios=Contexto.creoVeterinarios();
	
		}

		if(contador<limitePacientes){

			Animal a=Contexto.creoAnimal(nombre, tipo, raza, edad, causa);

			veterinarios[i].setPacientes(a);

			System.out.println("Tu veterinario es " + veterinarios[i].getNombre() + " " + veterinarios[i].getApellido());

			System.out.println("Espere un momento, el veterinario le dara su diagnostico y la receta");

			i++;

			contador++;

			if(i==5){
				i=0;

			}		

			System.out.println("==========================================================");

			Test.arranque();
		}else{

			System.err.println("Solo se atienden 20 animales por dia");

			Test.arranque();
		}
	}


	public void muestroPacientes(String nombre){



		Veterinario v=buscarVeterinario(nombre);

		if(v.getPacientes()[0]!=null){
			System.out.println("El dia de hoy tuviste los siguientes pacientes: ");

			for (int i = 0; i < v.getPacientes().length; i++) {

				if(v.getPacientes()[i]!=null){
					System.out.println((i+1) + ") " + v.getPacientes()[i].getNombre());		
				}
			}


			System.out.println("¿A que paciente desea cargarle el diagnostico y el medicamento?");

			int z=0;

			do{
				if(entrada.hasNextInt()){

					z=entrada.nextInt()-1;

					if(z<0||z>v.getPacientes().length){

						System.out.println("El paciente ingresado es invalido, ingresa una opcion correcta");
					}
				}
				else{

					System.out.println("Ingrese un dato adecuado");

					entrada=Contexto.creoScanner();
				}

			}while(z<0||z>v.getPacientes().length);

			setDiagnosticoReceta(v,z);

		}else{
			System.out.println("Aun no tienes pacientes cargados");
			Test.arranque();
		}

	}




	public Veterinario buscarVeterinario(String nombre){

		if(veterinarios==null){

			veterinarios=Contexto.creoVeterinarios();

		}

		try{
			for (int i = 0; i < veterinarios.length; i++) {

				if(veterinarios[i].getNombre().equalsIgnoreCase(nombre)){

					return veterinarios[i];
				}

			}

			return null;

		}catch(Exception e){

			System.out.println("Error");

			return null;
		}
	}

	private void setDiagnosticoReceta(Veterinario v, int z) {

		System.out.println("Ingrese el diagnostico: ");

		v.setCausas(z);

		System.out.println("Ingrese la receta: ");

		v.setMedicamentos(z);

		System.out.println("¿Desea cargar otro diagnostico y otro medicamento? \n 1) Si \n 2) no");

		int a=0;

		do{
			if(entrada.hasNextInt())
				a=entrada.nextInt();
			else {
				System.out.println("Ingrese una opcion valida");
				entrada=Contexto.creoScanner();
			}
		}while(a<0 || a>2);

		if(a==1)muestroPacientes(v.getNombre());

		else {
			System.out.println("Que tenga un buen dia " + v.getNombre());
			Test.arranque();
		}

	}


	public  void mostrarPacientes(){

		if(veterinarios==null){

			veterinarios=Contexto.creoVeterinarios();

		}

		for (int i = 0; i < veterinarios.length; i++) {

			int a=1;

			if(veterinarios[i].getPacientes()[0]==null){

				System.out.println("El veterinario " + veterinarios[i].getNombre() + " no atendio pacientes el dia de hoy.");

			}else{

				System.out.println("El veterinario " + veterinarios[i].getNombre() + " atendio a los siguientes animales: ");

			}
			for(int j = 0 ; j < veterinarios[i].getPacientes().length; j++){

				if(veterinarios[i].getPacientes()[j]!=null){

					System.out.println(a + ") El animal " + veterinarios[i].getPacientes()[j].getNombre() +
							" del tipo " + veterinarios[i].getPacientes()[j].getTipo() + " de la raza " + veterinarios[i].getPacientes()[j].getRaza() 
							+ ((veterinarios[i].getPacientes()[j].getCausasVet()!=null)?" fue diagnostico con " + veterinarios[i].getPacientes()[j].getCausasVet() + 
									" y le fue recetado " + veterinarios[i].getPacientes()[j].getMedicamentos() + ".":". Aun no fue cargado el diagnostico y la receta a este animal"));
					a++;
				}
			}

		}	
		System.out.println("Que tenga un buen dia");
	}

}

