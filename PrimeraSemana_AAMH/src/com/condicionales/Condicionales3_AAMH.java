package com.condicionales;

import java.util.Scanner;

public class Condicionales3_AAMH {

	public static void main(String[] args) {
		//3.Crea un programa que pida al usuario dos números
		//y muestre el resultado de su división. Si el segundo número es 0, 
		//debe mostrar un mensaje de error.

		Scanner scanner = new Scanner (System.in);
		
		int numerador;
		int denominador;
		
		System.out.println("División entre dos números:");
		System.out.println("Primer número");
		numerador = scanner.nextInt();
		System.out.println("Segundo número");
		denominador = scanner.nextInt();
		System.out.println("Resultado");
		if (denominador !=0) {
			System.out.println((double)numerador/(double)denominador);
		}else {
		System.out.println("ERROR");
			
		}
	}

}
