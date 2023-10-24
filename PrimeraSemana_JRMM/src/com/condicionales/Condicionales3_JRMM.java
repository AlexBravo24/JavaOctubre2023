package com.condicionales;

import java.util.Scanner;

public class Condicionales3_JRMM {

	public static void main(String[] args) {
		
		// 3.Crea un programa que pida al usuario dos números y muestre el resultado de su división.
		//Si el segundo número es 0, debe mostrar un mensaje de error.
		
		Scanner entrada = new Scanner (System.in);
		
		int numero1, numero2, division;
		
		System.out.println("Ingrese el primer numero: ");
		numero1 = entrada.nextInt();
		
		System.out.println("Ingrese el segundo numero: ");
		numero2 = entrada.nextInt();
		
		if(numero2 != 0) {
			division = numero1 / numero2;
			System.out.println("El resultado de la division es: " + division);
		}else {
			System.out.println("Error");
		}

	}

}
