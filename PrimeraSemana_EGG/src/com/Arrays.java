package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// Arrays
		
		/* Los arrays o arreglos, o tambien conocidos con "Vectores"
		 * son una estructura de datos que nos permiten almacenar
		 * un tipo en común
		 * Son una especie de colección de datos
		 */
		
		// Una vez declarado su tamaño o longitud, este no puede crecer
		// en tiempo de ejecución
		
		// Formas de declarar un array
		
		// Declarando un array de numeros enteros con su tamaño
		
		int [] numeros = new int [5];
		
		// Como guardar o asignar valores a cada posición del array
		
		numeros [0] = 1;
		numeros [1] = 10;
		numeros [2] = 20;
		numeros [3] = 30;
		numeros [4] = 40;
		
		//numeros [5] = 15; // Si quiero agregar una posicion más,
		// puedo "hacerlo", porque la sintaxis es correcta, sin embargo
		// el indice no existe, porque el array ya tiene un tamaño declarado
		// imprimir en consola determinada posición del array
		
		// Imprimir en consola determinda posicion del array
		System.out.println(numeros [4]);
		
		// Declarando un Scanner para solicitar los valores por teclado
		Scanner input = new Scanner(System.in);
		
		int [] numeros2 = new int [5];
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println("Ingresa un numero en la posición " + i);
			numeros2[i] = input.nextInt();
		}
		
		// Si ya no utilizo mi Scanner para introducir datos.
		// lo correcto seria cerrarlo para ahorrar recursos en memoria.
		input.close();
		
		// Vamos a imprimir un valor guardado una vez teniendo numeros en el array
		System.out.println(numeros2[3]);
		
		// O para imprimirlos todos puedo hacer uso nuevamente de un ciclo
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.print(numeros2[i] + " ");
		}
		
		// Otra manera de declarar un array
		// Es con sus valores definifos desde un inicio
		
		int [] numeros3 = {1, 2, 3, 4, 5};
		
		char [] nombre = {'A', 'l', 'e', 'x'};
		
		String [] nombres = {"Abraham", "Rafael", "Jafet", "Jareth", "Marcos"};
		
		// Otra forma de imprimir todos los valores de un array
		// es con un ciclo FOR EACH
		
		for (String i:nombres) { //Ciclo FOR EACH para cada elemento del array
			System.out.println(i); //Imprimelo cada uno en una nueva linea
		}
		

	}

}
