package com.ciclos;

import java.util.Scanner;

public class Ciclos2_JRMM {

	public static void main(String[] args) {
		
		/*2.- Programa un algoritmo que realice la tabla de multiplicar
		 *de un numero introducido desde teclado, hasta la iteración deseada
		 *por el usuario. Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		int tabla, iteracion;
		
		System.out.println("Ingresa el numero de tabla: ");
		tabla = entrada.nextInt();
		
		System.out.println("Ingresa el numero de iteraciones para la tabla");
		iteracion = entrada.nextInt();
		
		for(int i = 1; i <= iteracion; i++) {
			System.out.println(i + " x " + tabla + " = " + (i * tabla));
		}

	}

}
