
//Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
//desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
//23 x 95 = ???

package com.ciclos;

import java.util.Scanner;

public class Ciclos2_JAVD {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("----------TABLAS DE MULTIPLICAR----------");
		System.out.println("Ingresa la tabla de multiplicar que quieres:");
		a=in.nextInt();
		System.out.println("Ingresa el límite de la tabla:");
		b=in.nextInt();
		
		for(int i=1;i<=b;i++) {
			System.out.println(a+" X "+i+" = "+(i*a));
		}

	}

}
