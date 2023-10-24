package com.condicionales;

import java.util.Scanner;

public class Condicionales1_JRMM {

	public static void main(String[] args) {
		
		// 1.Realiza un programa que reciba dos numeros
		//por teclado e indique cual es mayor o si son iguales.
		
		Scanner entrada = new Scanner (System.in);
		
		int a;
		int b;
		
		System.out.println("Ingrese el primer numero: ");
		a = entrada.nextInt();
		
		System.out.println("Ingrese el segundo numero: ");
		b = entrada.nextInt();
		
		if(a > b) {
			System.out.println("El primer numero es mayor");
		}else if(a < b) {
			System.out.println("El segundo numero es mayor");
		}else {
			System.out.println("Los numeros son iguales");
		}
		

	}

}
