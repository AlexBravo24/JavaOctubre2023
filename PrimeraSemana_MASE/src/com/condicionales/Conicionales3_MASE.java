package com.condicionales;

import java.util.Scanner;

public class Conicionales3_MASE {

	public static void main(String[] args) {
		//3.Crea un programa que pida al usuario dos n�meros y muestre el resultado de su divisi�n. Si el 
		//segundo n�mero es 0, debe mostrar un mensaje de error
 
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, resultado;
		
		System.out.println("Ingresa un numero");
		num1 = entrada.nextInt();
		
		System.out.println("Ingresa otro numero");
		num2 = entrada.nextInt();
		
		System.out.println("El resultado de la divisi�n es: " + (num1/num2));
		
		if(num2==0) {
			System.out.println("ERROR");
		}
	}
	
}