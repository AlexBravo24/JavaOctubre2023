package com.condicionales;

import java.util.Scanner;

public class Condicionales1_ECGH {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos n�meros 
		//por teclado e indique cu�l es mayor o si son iguales.

		Scanner entrada= new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("Ingresa el primer n�mero");
		a=entrada.nextInt();
		System.out.println("Ingresa el segundo n�mero");
		b=entrada.nextInt();
		
		if (a>b) {
			System.out.println("El primer n�mero es mayor");
		}else if(b>a) {
			System.out.println("El segundo n�mero es mayor");
		}else {
			System.out.println("Los n�meros son iguales");
		}
		
		
		
	}

}
