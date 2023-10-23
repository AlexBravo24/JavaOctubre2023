package com.condicionales;

import java.util.Scanner;

public class Condiciones5_ECGH {

	public static void main(String[] args) {
		// 5. Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: 
		//edad, nota y sexo. * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE *
		//*Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
		//* Otros casos -> NO ACEPTADA

	int edad;
	int nota;
	String sexo;
	
	Scanner entrada= new Scanner(System.in);
		
	System.out.println("Introduce edad");
	edad=entrada.nextInt();
	
	System.out.println("Introduce nota");
	nota=entrada.nextInt();
	
	System.out.println("Introduce sexo");
	sexo=entrada.next();
	
	if (nota>4 && edad>17 && sexo.equals("M")) {
		System.out.println("POSIBLE");
	}
	else if(nota>4 && edad>17 && sexo.equals("F")) {
		System.out.println("ACEPTADA");
	}
	else {
		System.out.println("NO ACEPTADA");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
