package com.condicionales;

import java.util.Scanner;

public class Condicionales7_ECGH {

	public static void main(String[] args) {
		// 7. El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto debe cobrar
//		a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente:
//			* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros. 
//			* De 50 a 99 alumnos, el costo es de 70 euros. 
//			* De 30 a 49 alumnos, el costo es de 95 euros. 
//			* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
//			Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.

		int n;
		int costo;
		int alumno=0;
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce número de alumnos");
		n=entrada.nextInt();
		
		if(n>=100) {
			alumno=65;
			costo=n*alumno;
		}else if(n>49&&n<100) {
			alumno=70;
			costo=n*alumno;
		}else if(n>29&&n<50) {
			costo=n*95;
		}else {
			costo=4000;
			alumno=costo/n;
		}
		System.out.println("El costo del viaje es:"+costo);
		System.out.println("El costo del viaje por alumno es:"+alumno);
		
		
		
		
		
	}

}
