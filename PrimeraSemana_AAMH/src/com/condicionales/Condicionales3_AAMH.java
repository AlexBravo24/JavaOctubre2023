package com.condicionales;

import java.util.Scanner;

public class Condicionales3_AAMH {

	public static void main(String[] args) {
		//3.Crea un programa que pida al usuario dos n�meros
		//y muestre el resultado de su divisi�n. Si el segundo n�mero es 0, 
		//debe mostrar un mensaje de error.

		Scanner scanner = new Scanner (System.in);
		
		int numerador;
		int denominador;
		
		System.out.println("Divisi�n entre dos n�meros:");
		System.out.println("Primer n�mero");
		numerador = scanner.nextInt();
		System.out.println("Segundo n�mero");
		denominador = scanner.nextInt();
		System.out.println("Resultado");
		if (denominador !=0) {
			System.out.println((double)numerador/(double)denominador);
		}else {
		System.out.println("ERROR");
			
		}
	}

}
