package com.condicionales;

import java.util.Scanner;

public class Condicionales1_AAMH {

	public static void main(String[] args) {
		//1.Realiza un programa que reciba dos n�meros 
		//por teclado e indique cu�l es mayor o si son iguales.

		
		Scanner entrada = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("Ingresa el primer n�mero");
		a = entrada.nextInt();	
		System.out.println("Ingresa el segundo n�mero");
		b = entrada.nextInt();
		if (a>b)
			System.out.println("El n�mero mayor es : " + a);
		if (b>a)
			System.out.println("El n�mero mayor es : " + b);
		if (a==b)
			System.out.println("Son n�meros iguales");
		
	}

}
