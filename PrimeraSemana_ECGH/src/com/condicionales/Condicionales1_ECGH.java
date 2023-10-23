package com.condicionales;

import java.util.Scanner;

public class Condicionales1_ECGH {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos números 
		//por teclado e indique cuál es mayor o si son iguales.

		Scanner entrada= new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("Ingresa el primer número");
		a=entrada.nextInt();
		System.out.println("Ingresa el segundo número");
		b=entrada.nextInt();
		
		if (a>b) {
			System.out.println("El primer número es mayor");
		}else if(b>a) {
			System.out.println("El segundo número es mayor");
		}else {
			System.out.println("Los números son iguales");
		}
		
		
		
	}

}
