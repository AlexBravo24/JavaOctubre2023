package com.condicionales;

import java.util.Scanner;

public class Condicionales3_GVA {

	public static void main(String[] args) {
		
		// 3. Crea un programa que pida al usuario dos n�meros y muestre el resultado de su divisi�n. 
		//Si el segundo n�mero es 0, debe mostrar un mensaje de error.
		
		Scanner entrada = new Scanner(System.in);
		
		double numero1;
		double numero2;
		
		System.out.println("Ingrese un n�mero: ");
		numero1 = entrada.nextDouble();
		
		System.out.println("Ingrese otro n�mero: ");
		numero2 = entrada.nextDouble();
		
		if (numero2 == 0 ) {
			System.out.println("Error");
		} else {
			
		}
		
		double resultado = numero1 / numero2;
		
		System.out.println("El resultado de la divisi�n es: " + resultado);
		
		entrada.close();
	}

}
