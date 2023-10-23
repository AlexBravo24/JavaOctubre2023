package com.condicionales;

import java.util.Scanner;

public class Condicionales3_AARR {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese 2 numeros para operación de divición");
		
		int numero1, numero2;
		float resultado;
		
		System.out.println("ingrese el dividendo");
			numero1 = entrada.nextInt();
			
		System.out.println("ingrese el divisor");
			numero2 = entrada.nextInt();
			
		if(numero2 == 0) {
			System.out.println("ERROR");
			return;
		}else 
			resultado = numero1/numero2;
			System.out.println("el resultado es " + resultado);
	}

}
