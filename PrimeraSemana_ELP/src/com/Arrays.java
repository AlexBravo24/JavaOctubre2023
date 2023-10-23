package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

		// Arrays
		
		/*Los arrays o arreglos, o también conocidos como "vectores"
		 * son una estructura de datos que nos permiten almacenar
		 * un tipo de datos en común
		 * Son na especie de colección de datos
		 */
		
		/*Una vez declarado su tamaño o longitud, este no puede crecer
		 * en tiempo de ejecución
		 */
		
		//Formas de declarar un array
		
		//Declarando un array de numeros enteros con su tamaño
		int [] numeros = new int [5];
		
		//Guardar o asignar valores a cada posición del  array
		numeros[0]=1;
		numeros[1]=10;
		numeros[2]=20;
		numeros[3]=30;
		numeros[4]=40;
		
//		numeros[5]=15; //Si quierp agregar una posición más,
//		//puedp "hacerlo", porque la sintaxis es correcta, sin embargo
		//el indice no existe, porque el array ya tiene un tamaño declarado
		//Imprimir en consola determinada posicion del array
//		System.out.println(numeros[4]);
		
		//Declarando un Scanner para solicitar los valores por teclado
		Scanner leer = new Scanner(System.in);
		
		int [] numeros2 = new int [5];
		
//		for (int i = 0; i < numeros2.length; i++) {
//			System.out.println("Ingresa un numero en la posicion " + i);
//			numeros2[i]=leer.nextInt();
//		}
		
		//Si ya no utilizo mi Scanner para introducir datos,
		//lo correcto seria cerrarlo para ahorrar recursos en memoria
		leer.close();
		
		//Vamos a imprimir un valor guardado una vez teniendo numeros en el array
//		System.out.println(numeros2[3]);
		
		//O para imprimirlos todos puedo hacer uso nuevamente de un ciclo
		
//		for (int i=0; i< numeros2.length; i++) {
//			System.out.println(numeros2[i]+ ", ");
//			
//		}
		//Otra manera de declarar un array
		//Es con sus valores definidos desde un inicio
		int [] numeros3 = {1,2,3,4,5};
		
		char [] nombre = {'A', '1', 'e', 'x'};
		
		String [] nombres = {"Abraham", "Rafael", "Jafet", "Jareth", "Marcos"};
		
		for (String i:nombres) { //Para cada elemento del array
			System.out.println(i); //Imprimelo cada uno en una nueva línea
		}
	}
}