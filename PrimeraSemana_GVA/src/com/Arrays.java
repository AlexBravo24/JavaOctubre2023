package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		// Arrays
		
		/*Los arrays o arreglos, o también conocidos como "vectores"
		 * son una estructura de datos que nos permiten almacenar 
		 * un tipo de datos en común 
		 * Son una especie de colección de datos
		 */
		
		//Una vez declarado su tamaño o longitud, este no puede crecer 
		//en tiempo de ejecución
		
		//Formas de declarar un array 
		
		//Declarar un array de números enteros con su tamaño 
		int [] numeros = new int [5];
		
		//Guardar o asignar valores a cada posición del array
		numeros [0]=1;
		numeros [1]=10;
		numeros [2]=20;
		numeros [3]=30;
		numeros [4]=40;
		
		//Imprimir en consola determinada posición del array
		System.out.println(numeros[4]);
		
		//Declarando un Scanner para solicitar los valores por teclado
		Scanner input = new Scanner(System.in);
		
		int [] numeros2 = new int [5];
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println("Ingrese un número en la posición: " + i);
			numeros2[i] = input.nextInt();
		}
		//Si ya no utilizo mi Scanner para introducir datos,
		//lo correcto sería cerrarlo para ahorrar recursos en memoria
		input.close();
		
		//Vamos a imrprimir un valor guardado una vez teniendo los números en el array
		System.out.println(numeros2[3]);
		
		//Para imprimir todos los valores del array
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros2[i] + " ");
		}
		
		//Otra manera de declarar un array
		//Es con sus valores definidos desde un inicio
		int [] numeros3 = {1, 2, 3, 4, 5};
		
		char [] nombre = {'A', 'l', 'e', 'x'};
		
		String [] nombres = {"Abraham", "Rafael", "Jafet", "Jareth", "Marcos"};
		
		//Otra forma de imprimir todos los valores de un array 
		//es con ciclo for each
		
		for (String i:nombres) { //Para cada elemento del array 
			System.out.println(i); //Imprimir cada uno en una nueva línea
		}
	}

}
