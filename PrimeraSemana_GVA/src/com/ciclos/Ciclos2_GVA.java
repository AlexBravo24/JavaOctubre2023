package com.ciclos;

import java.util.Scanner;

public class Ciclos2_GVA {

	public static void main(String[] args) {
		//2. Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
		//desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
		//23 x 95 = ???
		
		Scanner entrada = new Scanner(System.in);
		int numero, iteracion;
		
		System.out.println("Ingrese el número que desea multiplicar: ");
		numero = entrada.nextInt();
		
		System.out.println("Ingrese la iteración deseada: ");
		iteracion = entrada.nextInt();
		
		for (int i = 1; i <= iteracion; i++) {
			int resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
		}
		
		entrada.close();
	}

}
