package com.condicionales;

import java.util.Scanner;

public class Condicionales1_GVA {

	public static void main(String[] args) {
		
		//1. Realiza un programa que reciba dos números por teclado 
		//e indique cuál es mayor o si son iguales.
		
		Scanner entrada = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("Ingrese el primer número");
		a = entrada.nextInt();
		
		System.out.println("Ingrese el segundo numero");
		b = entrada.nextInt();
		
		if (a > b) {
			System.out.println(a + " es mayor que " + b);
		} else if (b > a) {
			System.out.println(b + " es mayor que " + a);
		} else { 
			System.out.println("Ambos números son iguales"); 
		} //Cierre del else
		
		entrada.close();
	} //Cierre del main 

}
