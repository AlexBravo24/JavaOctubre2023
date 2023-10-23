package com.condicionales;

import java.util.Scanner;

public class Condicionales7_GVA {

	public static void main(String[] args) {
		
		//7. El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto 
		//debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de 
		//cobrar es la siguiente:
		//Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
		//- De 50 a 99 alumnos, el costo es de 70 euros.
		//- De 30 a 49 alumnos, el costo es de 95 euros.
		//- Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
		//Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe 
		//pagar cada alumno por el viaje.
		
		Scanner entrada = new Scanner(System.in);
		int alumnos;
		
		System.out.println("Ingrese el número de alumnos");
		alumnos = entrada.nextInt();
		
		double rentaAutobus;
		double costoAlumn;
		
		if (alumnos >= 100) {
			costoAlumn = 65.0;
			rentaAutobus = alumnos * costoAlumn;
		} else if (alumnos >= 50) {
			costoAlumn = 70.0;
			rentaAutobus = alumnos * costoAlumn;
		} else if (alumnos >= 30) {
			costoAlumn = 95.0;
			rentaAutobus = alumnos * costoAlumn;
		} else {
			costoAlumn = 0; //No se cobra por alumno
			rentaAutobus = 4000.0;
		}
		
		System.out.println("El costo por alumno es: " + costoAlumn);
		System.out.println("El costo total de la renta del autobus es: " + rentaAutobus);
		
		entrada.close();
	}

}
