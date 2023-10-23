package com.condicionales;

import java.util.Scanner;

public class Condicionales3_EGG {
	
	public static void main(String[] args) {
		//Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el 
		//segundo número es 0, debe mostrar un mensaje de error.
		
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Introduce el primer número");
		numero1 = entrada.nextInt();
		System.out.println("Introduce el seundo número");
		numero2 = entrada.nextInt();
		
		if (numero2 != 0) {
			System.out.println("el resultado de la división es: " + (numero1/numero2));
		}else {
			System.out.println("Error");
		}
		
		
	}

}
