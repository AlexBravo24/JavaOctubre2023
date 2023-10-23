package com.condicionales;

import java.util.Scanner;

public class Condicionales2_GVA {

	public static void main(String[] args) {
		
		// 2. Realiza un programa que pida un número 
		//por teclado y nos indique si es par o impar.
		
		Scanner entrada = new Scanner(System.in);
		
		int a;
		
		System.out.println("Ingrese un número");
		a = entrada.nextInt();
		
		if (a % 2 == 0) {
			System.out.println(a + " es un número par");
		} else {
			System.out.println(a + " es un número impar");
		}//Cierre del else

		entrada.close();
	}

}
