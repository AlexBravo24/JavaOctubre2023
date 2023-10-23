package com.condicionales;

import java.util.Scanner;

public abstract class Condicionales5_JJTJ {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo. 
		 * * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA * Otros casos -> NO ACEPTADA
		 * */
		Scanner entrada = new Scanner(System.in);
		int edad;
		int nota;
		char sexo;
		System.out.println("introduce la edad");
		edad=entrada.nextInt();
		System.out.println("introduce la nota");
		nota=entrada.nextInt();
		System.out.println("introduce el sexo ejemplo: M o m");
		sexo=entrada.next().charAt(0);
		
		if(nota>=5 && edad==18 && (sexo == 'M' || sexo == 'm')) {
			System.out.println("posible");
			
		}else if (nota>=5 && edad==18 && (sexo == 'F' || sexo == 'f')){
			System.out.println("aceptada");	
		}else {
			System.out.println("No aceptada");
		}

	}

}
