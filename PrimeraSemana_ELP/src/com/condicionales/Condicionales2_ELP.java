package com.condicionales;

import java.util.Scanner;

public class Condicionales2_ELP {

	public static void main(String[] args) {
		//2.Realiza un programa que pida un 
		//número por teclado y nos indique si es par o impar.

		Scanner leer = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.println("Ingresa el primer numero");
		n1 = leer.nextInt();
		
		System.out.println("Ingresa el segundo numero");
		n2 = leer.nextInt();
		
		if(n1 ==n2) {
			System.out.println("Es par");
		}else if (n1!=n2) {
			System.out.println("Es inpar");
		}
	}

}
	
		
		
		
		
	




