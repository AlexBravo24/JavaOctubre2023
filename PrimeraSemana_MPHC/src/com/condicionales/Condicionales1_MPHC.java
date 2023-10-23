package com.condicionales;

import java.util.Scanner;

public class Condicionales1_MPHC {

	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		
		int a;
		int b;
		
		
		System.out.println("Ingrese el primer numero");
		a=entrada.nextInt();
		
		
		System.out.println("Ingrese el segundo  numero");
		b=entrada.nextInt();
		
		
		
		if (a>b) {
			System.out.println("El resultado es : a es mayor que b");
			
		}else if (a==b) {
			System.out.println("son iguales");
		
		}else {
			
			System.out.println("El resultado es: b es mayor que a");
		}
	
		

	}

}
