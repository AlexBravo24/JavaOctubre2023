package com.ciclos;

import java.util.Scanner;

public class Ciclos2_EGG {

	public static void main(String[] args) {
		// Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
		//desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
		//23 x 95 = ???
		
		Scanner entrada = new Scanner(System.in);
		int tabla;
		int i = 1;
		int iteracion = 0;
		System.out.println("Introduce la tabla a multiplicar");
		tabla = entrada.nextInt();
		System.out.println("Introduce hasta que iteración desea multiplicarlo");
		iteracion = entrada.nextInt();
		
		
		while (i <= iteracion) {
			System.out.println(+ tabla + " x " + i + " = " +(tabla*i) );
			i++;
		}
		
	}

}
