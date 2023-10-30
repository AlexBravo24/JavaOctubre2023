package com.condicionales;

import java.util.Scanner;

public class Condicionales7_JRMM {

	public static void main(String[] args) {
		
		/* 7. El director de una escuela est� organizando un viaje de estudios
		 *y requiere determinar cu�nto debe cobrar a cada alumno y cu�nto debe pagar
		 * a la compa��a de viajes por el servicio. La forma de cobrar es la siguiente:
		 * Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
		 * De 50 a 99 alumnos, el costo es de 70 euros.
		 * De 30 a 49 alumnos, el costo es de 95 euros.
		 * Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros,
		 * sin importar el n�mero de alumnos.
		 * Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses
		 * y lo que debe pagar cada alumno por el viaje.
		 */
		
		Scanner entrada = new Scanner (System.in);
		
		int alumnos, pago, total;
		
		System.out.println("Ingrese la cantidad de alumnos que viajaran: ");
		alumnos = entrada.nextInt();
		
		if(alumnos >= 100) {
			pago = 65;
			total = pago * alumnos;
			System.out.println("Cada alumno pagar�: "+pago+" Euros");
			System.out.println("El pago total del viaje ser� de: " + total + " Euros");
		}else if(alumnos >= 50 && alumnos <= 99) {
			pago = 70;
			total = pago * alumnos;
			System.out.println("Cada alumno pagar�: "+pago+" Euros");
			System.out.println("El pago total del viaje ser� de: "+ total + " Euros");
		}else if(alumnos >= 30 && alumnos <= 49) {
			pago = 95;
			total = pago * alumnos;
			System.out.println("Cada alumno pagar�: "+pago+" Euros");
			System.out.println("El pago total del viaje ser� de: "+total+" Euros");
		}
		else if(alumnos < 30) {
			
			total = 4000;
			pago = total / alumnos;
			System.out.println("Cada alumno pagar�: "+pago+" Euros");
			System.out.println("El pago total del viaje ser� de: "+total+" Euros");
		}

	}

}