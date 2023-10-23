package com.Condicionales;

import java.util.Scanner;

public class Condicionales5_JMC {

	public static void main(String[] args) {
//	    5. Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
//		parámetros: edad, nota y sexo.
//		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
//		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
//		* Otros casos -> NO ACEPTADA	
		Scanner entrada5 = new Scanner(System.in);
		int edad,nota;
		char sexo;
		
		System.out.println("Ingresa tu edad"); 
		edad = entrada5.nextInt();
		
		System.out.println("Ingresa tu nota"); 
		nota = entrada5.nextInt();
		
		System.out.println("Ingresa tu sexo,(F)femnenino o (M)Masculino"); 
		sexo = entrada5.next().charAt(0);
		
		if(edad==18&&nota==5&& sexo=='F') {
			System.out.println("Aceptada");	
		}
		else if (edad==18&&nota==5&& sexo=='M') {
			System.out.println("Posible");
			
		}
		else {
		}
	}

}
