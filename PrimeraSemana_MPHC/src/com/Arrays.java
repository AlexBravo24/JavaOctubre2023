package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// Arrays

		/*
		 * Los arrays o arreglos, otambien conocidos como "Vectores" son una estructura
		 * de datos que nos permiten almacenar un tipo de datos en comun son una especie
		 * de colecciones de datos
		 */

		// Formas de declarar un array

		// Declarando un array de numero enteros con su tamaño

		int[] numeros = new int[5];

		// Guardar o asignar valores a cada posicion del array

		numeros[0] = 1;
		numeros[1] = 10;
		numeros[2] = 20;
		// Una vez declarado su tamaño o longitud, este no puede crecer
		// en tiempo de ejecucion

		numeros[2] = 30;
		numeros[4] = 40;

		// Imprimir en consola determinada posicion del array

		System.out.println(numeros[1]);
		Scanner input = new Scanner(System.in);
		
		int [] numeros2= new int [5];
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println("Ingresa un numero en la posicion:"+i);
			numeros2[i]=input.nextInt();	
		}
		
		input.close();
		System.out.println(numeros2[3]);
		
		//para imprimir todos
		
		
		for (int i = 0; i < numeros2.length; i++) {	
			System.out.print(numeros2[i]+"- ");
			
		}
		
		//otra manera de declarar array con valores definidos desde un inicio
		
		int []numeros3= {1,2,3,4,5};
		char []numero= {'a','b','c','d','e'};
		String [] nombres= {"Marcos","Rafael","Jafet","Jareth","Marcos"};
		for (String i : nombres) {
			
			System.out.println(i);
		}
	}

}
