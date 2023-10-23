package com.ciclos;

import java.util.Scanner;

public class Ciclos_JTJJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Programa Java que lea dos números y muestre los números pares entre ellos
		 * */
		
			Scanner entrada = new Scanner(System.in);

			int num1;
			int num2;
	     
			System.out.println("Ingresse el numero1");
			num1=entrada.nextInt();
			System.out.println("Ingresse el numero2");
			num2=entrada.nextInt();
			
			if(num1 < num2) {
				for(int i = num1; i<=num2; i++) {
					if((i%2) == 0) {
						System.out.println("Los numero pares entre amobos numeros son: " + i);
					}
				}
			}
	}

}
