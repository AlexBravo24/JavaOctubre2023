
// El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto
//debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de
//cobrar es la siguiente:
//* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
//* De 50 a 99 alumnos, el costo es de 70 euros.
//* De 30 a 49 alumnos, el costo es de 95 euros.
//* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de
//alumnos.
//Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe
//pagar cada alumno por el viaje

package com.condicionales;

import java.util.Scanner;

public class Condicionales7_JAVD {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Ingresa el numero de alumnos que van al viaje:");
		a=in.nextInt();
		
		if(a>=100) {
			System.out.println("Se pagan 65 euros por alumno.");
		}
		else if(a>=50 && a<=99) {
			System.out.println("Se pagan 70 euros por alumno.");
		}
		else if(a>=30 && a<=49) {
			System.out.println("Se pagan 95 euros por alumno.");
		}
		else {
			b=4000/a;
			System.out.println("Se pagan "+b+" euros por alumno.");
		}

	}

}
