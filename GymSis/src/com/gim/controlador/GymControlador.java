package com.gim.controlador;

import com.gim.modelo.Aspirante;
import com.gim.modelo.Boxeador;
import com.gim.modelo.Entrenador;
import com.gim.modelo.Sistema;
import com.gim.vista.Test;

public final class GymControlador {

	public void gimnasio(String nombre, String apellido, int dni, double peso){

		Sistema sis1=new Sistema();
		if(nombre.equals("fin")!=true){
			sis1.inicializar();

			Aspirante num1=new Aspirante();
			num1.nombre=nombre;
			num1.apellido=apellido;
			num1.peso=peso;
			num1.dni=dni;

			Entrenador mosGal=new Entrenador();	
			mosGal.apellido="Dolce";
			mosGal.nombre="Nicolino";
			mosGal.categoria="Mosca y Gallo";

			Entrenador pluLig=new Entrenador();		
			pluLig.apellido="Maywheather";
			pluLig.nombre="Floyd";
			pluLig.categoria="Pluma y Ligero";

			Entrenador welMed=new Entrenador();		
			welMed.apellido="Ray Leonard";
			welMed.nombre="Sugar";
			welMed.categoria="Welter y Medio";

			Entrenador medPes=new Entrenador();		
			medPes.apellido="Ali";
			medPes.nombre="Muhammad";
			medPes.categoria="Medio pesado y Pesado";

			sis1.entrenadores[0]=mosGal;
			sis1.entrenadores[1]=pluLig;
			sis1.entrenadores[2]=welMed;
			sis1.entrenadores[3]=medPes;

			Boxeador numero1=num1.inscribirse(sis1);			
			if(numero1!=null){
				if(numero1.peso<48.988){
					mosGal.ponerDieta(numero1);
				}else if(numero1.peso>50.802&&numero1.peso<52.163){
					mosGal.ponerEntrenar(numero1);
				}else if(numero1.peso>53.525&&numero1.peso<55.338){
					mosGal.ponerEntrenar(numero1);
				}else if(numero1.peso>57.152&&numero1.peso<58.967){
					pluLig.ponerEntrenar(numero1);
				}else if(numero1.peso>61.237&&numero1.peso<63.503){
					pluLig.ponerEntrenar(numero1);
				}else if(numero1.peso>66.678&&numero1.peso<69.853){
					welMed.ponerEntrenar(numero1);
				}else if(numero1.peso>72.562&&numero1.peso<76.205){
					welMed.ponerEntrenar(numero1);
				}else if(numero1.peso>79.378&&numero1.peso<91){
					medPes.ponerEntrenar(numero1);
				}else{
					System.out.println("Tu peso esta dentro de los limites de tu categoria, no requeris dieta o entrenamiento");
				}

			}
			Test.empezar();
		}
		else{
			sis1.reporte();
			System.out.println("Hasta mañana");		
		}
	}
}
