package com.condicionales;

import java.util.Scanner;

public class Condicionales3_JJTJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crea un programa que pida al usuario dos números y muestre el resultado de su división. 
		 * Si el segundo número es 0, debe mostrar un mensaje de error.
		 * */
Scanner entrada = new Scanner(System.in);
		
		int numero1;
		System.out.println("introduce el numero1");
		
		numero1=entrada.nextInt();
		
		System.out.println("introduce el numero 2");
		int numero2;
		numero2 = entrada.nextInt();
		int resultado = ((numero1)/(numero2));
		if(numero2 == 0 || numero1 == 0) {
			System.out.println("hay un error");	
		}else {
			
			System.out.println("el resultado de la division es: " + resultado );	
		}
	}

}
