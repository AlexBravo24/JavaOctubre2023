package com.condicionales;

import java.util.Scanner;

public class Condicionales7_ELP {

	public static void main(String[] args) {
	
		
//		7. El director de una escuela est� organizando un viaje de estudios y requiere determinar cu�nto 
//		debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio. La forma de 
//		cobrar es la siguiente:
//		* Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
//		* De 50 a 99 alumnos, el costo es de 70 euros.
//		* De 30 a 49 alumnos, el costo es de 95 euros.
//		* Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de 
//		alumnos.
//		Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe 
//		pagar cada alumno por el viaje	
		
		Scanner leer = new Scanner(System.in);
		
		  int numero_alumnos;
		    System.out.print("N�mero de alumnos: ");
		    numero_alumnos = leer.nextInt();
		    
		    //Costo x alumno es de 65 euros
		    if (numero_alumnos >= 100) {
		      System.out.println("El costo es de: " + numero_alumnos*65 +" euros"+" (65 euros por alumno)");
		    } else if (numero_alumnos <100 && numero_alumnos >= 50) {
		      System.out.println("El costo es de: " + numero_alumnos*70 +" euros"+ " (70 euros por alumno)");
		    } else if (numero_alumnos < 50 && numero_alumnos >= 30) {
		      System.out.println("El costo es de " + numero_alumnos*95 +" euros"+" (95 euros por alumno)");
		    } else {
		      System.out.println("renta del autob�s es de 4000 euros y cada alumno pagara " + (4000/numero_alumnos) + " euros.");
		    } 
		  }
		}

	
