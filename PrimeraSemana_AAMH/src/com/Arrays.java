package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// Arrays
		
		/*Los arrays o  arreglos, o tambi�n conocidos como "vetores"
		 * son una estructura de datos que nos permiten almacenar
		 * un tipo de datos en com�n
		 * Son una especie de colecci�n de datos
		 */
        //Una vez declarado su tama�o o longitud, este no puede crecer
		//en tiempo de ejecuci�n
		
		//Formas de declarar un array
		
		//Declarando un array de numeros enteros con su tama�o
		
//		int [] n�meros = new int [5];
//		
//		//Guardar o asignar valores a cada posici�n del array
//		
//		n�meros[0]=1;
//		n�meros[1]=10;
//		n�meros[2]=20;
//		n�meros[3]=30;
//		n�meros[4]=40;
//		
//		n�meros[5]=15; //Si quiero agregar una posici�n m�s,
//		//puedo "hacerlo", porque la sintaxis es correcta, sin embargo
//		//el indice no existe, porque el array ya tiene un tama�o declarado
//				
//		//Imprimir en consola determinada posici�n del array
//		
//		System.out.println(n�meros[4]);
//		
		
		//Declarando un Scanner para solicitar los valores por teclado
		Scanner input = new Scanner (System.in);
		
		int [] n�meros2 = new int [5];
		
		for (int i = 0; i < n�meros2.length; i++) {
			System.out.println("Ingresa un n�mero en la posici�n " + i);
			n�meros2[i]=input.nextInt();
		}
		
		//Si ya no utilizo mi Scanner para introducir datos,
		//lo correcto ser�a cerrarlo para ahorrar recursos en memoria
		input.close();
		
		//Vamos imprimir un valor guardado una vez teniendo n�meros en el array
		System.out.println(n�meros2[3]);
		
		//O para imprimirlos todos, puedo hacer el uso nuevamente de un ciclo
		
		for (int i = 0; i < n�meros2.length; i++) {
		System.out.println(n�meros2[i]+ ", ");
			
		//Otra manera de declarar un array
		//Es con sus valores definidos desde un inicio
		
//		int [] n�meros3 = {1,2,3,4,5};
//		
//		char [] nombre= {'A','l','e','x'};
//		
//		String [] nombres = {"Abraham","Rafael","Jafet","Jareth","Marcos"};
//		
//		//Otra forma de imprimir todos los valores de un array
//		//es con un ciclo for each
//		
//		for(String i:nombres) {  //para cada elemento del array
//			System.out.println(i); //Imprimelo cada uno en una linea
		}
		}
	

}

