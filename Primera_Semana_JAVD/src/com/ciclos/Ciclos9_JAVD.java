
//Programa Java que lea dos n�meros y muestre los n�meros pares entre ellos

package com.ciclos;

import java.util.Scanner;

public class Ciclos9_JAVD {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Ingrese el primer n�mero:");
		a=in.nextInt();
		System.out.println("Ingresa el segundo n�mero:");
		b=in.nextInt();
		
		if (a>b) {
			c=a;
			a=b;
			b=c;
		}
		
		System.out.println("Los n�mero pares entre "+a+" y "+b+" son: ");
		
		for(int i=a;i<=b;i++) {
			if((i % 2) == 0) {
				System.out.println(i);
			}
		}
		

	}

}
