package com.condicionales;

import java.util.Scanner;

public class Codicionales5_MPHC {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int nota;
		int edad;
		String sexo;
		
		System.out.println("Ingrese nota");
		nota=entrada.nextInt();
		System.out.println("Ingrese edad");
		edad=entrada.nextInt();
		System.out.println("Ingrese Sexo");
		entrada.nextLine();
		sexo=entrada.nextLine();
		
		
		if (nota==5 && edad==18 && sexo.contains("M")) {
			System.out.println("Estado de solicitud: Posible");
			
		}else if(nota==5 && edad==18 && sexo.contains("F")) {
			System.out.println("Estado de solicitud: Aceptada");
			
		}else {
			System.out.println("Estado de solicitud: No aceptada");
		}
		
		
		
		
		

	}

}
