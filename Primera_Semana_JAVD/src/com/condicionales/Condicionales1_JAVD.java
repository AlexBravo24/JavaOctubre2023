
//1.Realiza un programa que reciba dos n�meros por teclado e indique cu�l es mayor o si son iguales.

package com.condicionales;

import java.util.Scanner;

public class Condicionales1_JAVD {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Ingresa el primer n�mero: ");
		a=in.nextInt();
		
		System.out.println("Ingresa el segundo n�mero");
		b=in.nextInt();
		
		if(a==b) {
			System.out.println("Los n�meros son iguales");
		}
		else if(a>b) {
			System.out.println("El primer n�mero es mayor al segundo");
		}
		else {
			System.out.println("El segundo n�mero es mayor al primero");
		}
		

	}

}
