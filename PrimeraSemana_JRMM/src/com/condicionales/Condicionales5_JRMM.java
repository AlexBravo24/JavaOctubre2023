package com.condicionales;

public class Condicionales5_JRMM {

	public static void main(String[] args) {
		
		/* 5. Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes
		parámetros: edad, nota y sexo.
		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		* Otros casos -> NO ACEPTADA
		*/
		
		int nota = 5, edad = 18;
		char sexo='F';
		
		if(nota == 5 && edad == 18 && sexo == 'M') {
			System.out.println("Posible");
		}else if(nota == 5 && edad == 18 && sexo == 'F') {
			System.out.println("Aceptada");	
	}else {
		System.out.println("NO ACEPTADA");
	}

}
}
