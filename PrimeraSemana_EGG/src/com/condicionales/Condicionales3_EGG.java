package com.condicionales;

import java.util.Scanner;

public class Condicionales3_EGG {
	
	public static void main(String[] args) {
		//Crea un programa que pida al usuario dos n�meros y muestre el resultado de su divisi�n. Si el 
		//segundo n�mero es 0, debe mostrar un mensaje de error.
		
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Introduce el primer n�mero");
		numero1 = entrada.nextInt();
		System.out.println("Introduce el seundo n�mero");
		numero2 = entrada.nextInt();
		
		if (numero2 != 0) {
			System.out.println("el resultado de la divisi�n es: " + (numero1/numero2));
		}else {
			System.out.println("Error");
		}
		
		
	}

}
