package com.Ciclos;

import java.util.Scanner;

public class Ciclos9_JMC {

	public static void main(String[] args) {
	// Programa Java que lea dos números y muestre los números pares entre ellos 

		Scanner entrada = new Scanner(System.in);
		int contador=0,numero1,numero2;
		
		System.out.println("Ingresa el numero menor" );
		numero1 = entrada.nextInt();
		
		System.out.println("Ingresa el numero mayor" );
		numero2 = entrada.nextInt();
		
		
		while(numero1<=numero2) {
			
			if(numero1%2==0) {
				System.out.println(numero1);
				}
			numero1++;
		}
		
	}

}
