package com.condicionales;

import java.util.Scanner;

public class Condicionales5_RVV {

	public static void main(String[] args) {
		System.out.println("Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.");
		Scanner entrada= new Scanner(System.in);
		Scanner scanner= new Scanner(System.in);
		
		int nota;
		int edad;
		char sexo;
		
		System.out.println("Introduzca la nota");
		nota=entrada.nextInt();
		System.out.println("Introduzca la edad");
		edad=entrada.nextInt();
		System.out.println("Introduzca el sexo");
		sexo=scanner.next().charAt(0);
		
		if (nota>=5&& edad>=18) {
		 if (sexo=='f'){
			System.out.println("Aceptada");
		}else if(sexo=='m') {
			System.out.println("posible");
		}else {
			System.out.println("no aceptado");
		}
		}else {
			System.out.println("no aceptado");
		}
	
	}
}


