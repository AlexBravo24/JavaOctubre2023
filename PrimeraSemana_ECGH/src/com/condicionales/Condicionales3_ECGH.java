package com.condicionales;

import java.util.Scanner;

public class Condicionales3_ECGH {

	public static void main(String[] args) {
		//3. Crea un programa que pida al usuario dos 
		//n�meros y muestre el resultado de su divisi�n. 
		//Si el segundo n�mero es 0, debe mostrar un mensaje de error.
		double a;
		double b;
		double c;
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce el primer n�mero");
		a=entrada.nextInt();
		
		System.out.println("Introduce el segundo n�mero");
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
