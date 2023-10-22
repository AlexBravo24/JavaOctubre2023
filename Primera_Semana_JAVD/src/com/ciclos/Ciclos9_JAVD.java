
//Programa Java que lea dos números y muestre los números pares entre ellos

package com.ciclos;

import java.util.Scanner;

public class Ciclos9_JAVD {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Ingrese el primer número:");
		a=in.nextInt();
		System.out.println("Ingresa el segundo número:");
		b=in.nextInt();
		
		if (a>b) {
			c=a;
			a=b;
			b=c;
		}
		
		System.out.println("Los número pares entre "+a+" y "+b+" son: ");
		
		for(int i=a;i<=b;i++) {
			if((i % 2) == 0) {
				System.out.println(i);
			}
		}
		

	}

}
