package com.ciclos;

import java.util.Scanner;

public class Ciclos9_JRMM {

	public static void main(String[] args) {
		
		// 9. Programa Java que lea dos números y muestre los números pares entre ellos 
		
		Scanner entrada = new Scanner(System.in);
		
		int n1,n2;
		System.out.println("Inserte primer numero: ");
		n1=entrada.nextInt();
		System.out.println("Inserte segundo numero: ");
		n2=entrada.nextInt();
		
		if(n1 < n2) {
			for(int i = n1; i <= n2; i++) {
				if(i%2==0) {
					System.out.println(i);
				}
			}
		}else {
			for(int i = n2; i <= n1; i++) {
				if(i%2==0) {
					System.out.println(i);
				}
			}
		}

	}

}
