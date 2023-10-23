package com.condicionales;

import java.util.Scanner;



public class Condicionales2_ECGH {

	public static void main(String[] args) {
		//2.Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		
		Scanner entrada=new Scanner(System.in);
		
		int a;
		int r;
		System.out.println("Introduce un número");
		a=entrada.nextInt();
		r=a%2;
				
		if(r==0){	
		System.out.println("El número es par");
		}
		else {
			System.out.println("El núumero es impar");
		}
		
		
	
	
	
	
	}
	
	
}
