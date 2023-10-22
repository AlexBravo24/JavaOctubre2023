package com.condicionales;

import java.util.Scanner;

public class Condicionales5_EGG {

	public static void main(String[] args) {
		/*Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
		* parámetros: edad, nota y sexo.
		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		* Otros casos -> NO ACEPTADA
		*/
		Scanner entrada = new Scanner(System.in);
		
		int nota;
		int edad;
		char sexo;
		
		System.out.println("Nota:");
		nota = entrada.nextInt();
		System.out.println("Edad:");
		edad = entrada.nextInt();
		System.out.println("sexo:");
		sexo = entrada.next().charAt(0);
		
		if (nota >= 5 && edad >= 18) {
			if (sexo == 'M') {
				System.out.println("Posible");
			}else if (sexo == 'F'){
				System.out.println("Aceptada");
			}
		}else {
			System.out.println("No Aceptada");
		}
		
	}

}
