package com.condicionales;

import java.util.Scanner;

public class Condicionales1_JJTJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realiza un programa que reciba dos números por teclado e
		 *  indique cuál es mayor o si son iguales.
		 * */
		
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		System.out.println("introduce el numero1");
		
		numero1=entrada.nextInt();
		
		System.out.println("introduce el numero 2");
		int numero2;
		numero2 = entrada.nextInt();
		
		
		if(numero2 < numero1) {
			System.out.println("el numero 1 es mayor que el numero 2");
	}else if(numero2 > numero1 ) {
		System.out.println("el numero 2 es mayor que el numero 1");
	}else if(numero2 == numero1) {
		System.out.println("los numero son iguales");
	}

}
}
