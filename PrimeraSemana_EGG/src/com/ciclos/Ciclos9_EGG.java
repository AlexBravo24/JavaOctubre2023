package com.ciclos;

import java.util.Scanner;

public class Ciclos9_EGG {

	public static void main(String[] args) {
		// Programa Java que lea dos n�meros y muestre los n�meros pares entre ellos 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el un n�mero");
		int a = entrada.nextInt();
		System.out.println("Introduce el otro n�mero");
		int b = entrada.nextInt();
		
		if (a>b) {
			for (int i=1; i<=a; i++) {
				if (i%2 == 0) {
					System.out.println(i);
				}
			}
		}else if (b>a) {
			for (int i=1; i<=b; i++) {
				if (i%2 == 0) {
					System.out.println(i);
				}
			}
		}

	}

}
