package com.condicionales;

import java.util.Scanner;

public class Condicionales5_GVA {

	public static void main(String[] args) {
		
		// 5. Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
		// parámetros: edad, nota y sexo.
		// Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		// Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		// Otros casos -> NO ACEPTADA
		
		Scanner entrada = new Scanner(System.in);
		
		int edad;
		double nota;
		char sexo;
		
		System.out.println("Ingrese la edad");
		edad = entrada.nextInt();
		
		System.out.println("Ingrese la nota (0 a 10)");
		nota = entrada.nextDouble();
		
		System.out.println("Ingrese el sexo (M/F)");
		sexo = entrada.next().charAt(0);
		
		if (edad >= 18 && nota >= 5) {
			if (sexo == 'M') {
				System.out.println("POSIBLE");
		} else if (sexo == 'F') {
			System.out.println("ACEPTADA");
		} else {
			System.out.println("NO ACEPTADA");
			} 
		} else {
			System.out.println("NO ACEPTADA");
		}
		
		entrada.close();
	}

}
