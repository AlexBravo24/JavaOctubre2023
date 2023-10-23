package com.condicionales;

import java.util.Scanner;

public class Condicion2_MPHC {

	public static void main(String[] args) {
		
	int numero;
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Ingrese un numero");
	numero=entrada.nextInt();
	
	
	if(numero % 2==0) {
		System.out.println("El resultado es: El numero es par");
	}else {
		System.out.println("El resultado es: El numero es inpar");
	}
	

	}

}
