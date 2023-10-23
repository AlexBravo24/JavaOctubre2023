
//1.Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.

package com.condicionales;

import java.util.Scanner;

public class Condicionales1_JAVD {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Ingresa el primer número: ");
		a=in.nextInt();
		
		System.out.println("Ingresa el segundo número");
		b=in.nextInt();
		
		if(a==b) {
			System.out.println("Los números son iguales");
		}
		else if(a>b) {
			System.out.println("El primer número es mayor al segundo");
		}
		else {
			System.out.println("El segundo número es mayor al primero");
		}
		

	}

}
