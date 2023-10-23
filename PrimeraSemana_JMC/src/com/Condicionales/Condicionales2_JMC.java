package com.Condicionales;

import java.util.Scanner;

public class Condicionales2_JMC {

	public static void main(String[] args) {
		// Realiza un programa que pida un número por teclado y nos indique si es par o impar
	Scanner entrada2 = new Scanner(System.in);
	int numero,divisor=2;
	System.out.println("Ingresa un numero"); 
	numero = entrada2.nextInt();
		 
		 
		int residuo = numero%divisor;
		
		if(residuo==0) {
			System.out.println("el numero es par");
		}
		else {
			System.out.println("el numero es impar");
			
		}
		 
	}

}
