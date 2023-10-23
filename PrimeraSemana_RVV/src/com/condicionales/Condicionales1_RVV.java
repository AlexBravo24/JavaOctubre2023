package com.condicionales;

import java.util.Scanner;

public class Condicionales1_RVV {

	public static void main(String[] args) {
		System.out.println("Realiza un progrmaa que reciba 2 numeros e indique cual es mayor o si son iguales");
		Scanner entrada= new Scanner (System.in);
		
		int a;
		int b;
		
		System.out.println("ingrese el primer numero");
		a = entrada.nextInt();
		System.out.println("ingrese el segundo numero");
		b=entrada.nextInt();
		
		System.out.println("Los numeros ingresados son: "+ a + " y "+ b);
		
		if (a>b) {
			System.out.println("El numero " + a + " es mayor que el numero " + b);
		}else if (a<b) {
			System.out.println("El numero "+ b + " es mayor que el numero " + a);
		}else if (a==b) {
			System.out.println("El numero "+a+" y el numero "+b+" son iguales");
		}else {
			System.out.println("Error en el procesamiento");
		}
		

	}

}
