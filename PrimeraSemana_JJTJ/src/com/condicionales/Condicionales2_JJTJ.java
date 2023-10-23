package com.condicionales;

import java.util.Scanner;

public class Condicionales2_JJTJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Realiza un programa que pida un número por teclado
		 *  y nos indique si es par o impar.
		 * 
		 * */
		Scanner entrada = new Scanner(System.in);
		 
		int numero;
		System.out.println("introduce un numero");
		numero= entrada.nextInt();
		
		if((numero%2)==0) {
			System.out.println("el numero es par");
		}else {
			System.out.println("el numero es impar");
		}

	}

}
