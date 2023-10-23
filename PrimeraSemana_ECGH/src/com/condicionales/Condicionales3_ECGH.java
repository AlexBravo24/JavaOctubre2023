package com.condicionales;

import java.util.Scanner;

public class Condicionales3_ECGH {

	public static void main(String[] args) {
		//3. Crea un programa que pida al usuario dos 
		//números y muestre el resultado de su división. 
		//Si el segundo número es 0, debe mostrar un mensaje de error.
		double a;
		double b;
		double c;
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce el primer número");
		a=entrada.nextInt();
		
		System.out.println("Introduce el segundo número");
		b=entrada.nextInt();
		
		if (b==0) {
			System.out.println("ERROR");
		}
		else {
			c=a/b;
			System.out.println("El resultado es: "+c);
		}
		
		
		
		
	}

}
