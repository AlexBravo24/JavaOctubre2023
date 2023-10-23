
//2.Realiza un programa que pida un número por teclado y nos indique si es par o impar.

package com.condicionales;

import java.util.Scanner;

public class Condicionales2_JAVD {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a, div;
		System.out.println("Ingresa un número: ");
		a=in.nextInt();
		
		div=a%2;
		
		if(div==0) {
			System.out.println("El número que ingresaste es par");
		}
		else {
			System.out.println("El número que ingresaste es inpar");
		}

	}

}
