package com.condicionales;

import java.util.Scanner;

public class Condicionales1_GVA {

	public static void main(String[] args) {
		
		//1. Realiza un programa que reciba dos n�meros por teclado 
		//e indique cu�l es mayor o si son iguales.
		
		Scanner entrada = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("Ingrese el primer n�mero");
		a = entrada.nextInt();
		
		System.out.println("Ingrese el segundo numero");
		b = entrada.nextInt();
		
		if (a > b) {
			System.out.println(a + " es mayor que " + b);
		} else if (b > a) {
			System.out.println(b + " es mayor que " + a);
		} else { 
			System.out.println("Ambos n�meros son iguales"); 
		} //Cierre del else
		
		entrada.close();
	} //Cierre del main 

}
