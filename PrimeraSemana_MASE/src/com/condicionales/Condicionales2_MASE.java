package com.condicionales;

import java.util.Scanner;

public class Condicionales2_MASE {

	public static void main(String[] args) {
		//2.Realiza un programa que pida un número por teclado y nos indique si es par o impar
 
		Scanner entrada = new Scanner(System.in);
		
		int x;
		 
		System.out.println("Ingresa un numero");
		x = entrada.nextInt();
		
		if(x%2==0) {
			System.out.println("El numero es par ");
		}else {
			System.out.println("El numero es impar");
		}
		 
	}

}
