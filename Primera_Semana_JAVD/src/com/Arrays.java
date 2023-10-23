package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		//Arrays
		
//		Los arrays o arreglos, o también conocidos como "vectores"
//		son una estructura de datos que nos permiten almacenar
//		un tipo de dato en común.
//		Son una especie de collección de datos.
		
		//Una vez declarado su tamaño o longitud este no puede crecer
		//en tiempo de ejecución
		
		//Formas de declarar un array
		
		//Declaramos un array de nuestros números enteros con su tamaño
		int [] numeros = new int [5];
		
		//Guardar o asignar valores a cada posición del array 
		numeros [0]=1;
		numeros [1]=10;
		numeros [2]=20;
		numeros [3]=30;
		numeros [4]=40;
		
		//numeros [5]=15;//Si quiero agregar una posición más,
		//puedo "hacerlo", porque la sintaxis es correcta, sin embargo
		//el íncice no existe, porque el array ya tiene un tamaño declarado
		
		//Imprimir en consola determinada posición del array
		System.out.println(numeros[4]);
		
		//Declarando un Scanner para solicitar los valores por teclado
		Scanner in = new Scanner(System.in);
		
		int [] numeros2 = new int [5];
		
		for(int i=0;i<numeros2.length;i++) {
			System.out.println("Ingresa un número en la poción "+i);
			numeros2[i]=in.nextInt();
		}
		
		//Si ya no utilizo mi Scanner para introducir datos,
		//lo correcto sería carrarlo para ahorrar recursos de memoria
		in.close();
		
		//Vamos a imprimir un valor guardado, una vez teniendo los números en el array
		System.out.println(numeros2[3]);
		
		//O para imprimirlos todos puedo hacer uso nuevamente de un ciclo 
		
		System.out.println("Los valores son:");
		for(int i=0;i<numeros2.length;i++) {
			System.out.print(numeros2[i]+ ", ");
		}
		
		//Otra manera de declarar un array
		//Es con sus valores definidos desde un inicio.
		int [] numeros3 = {1,2,3,4,5};
		
		char [] nombre = {'J','A','V','I','E','R'};
		
		String [] nombres = {"Abraham","Rafael", "Jafet", "Jareth","Marcos"};
		
		//Otra forma de imprimir todos los valores de un array
		//es con un ciclo for each
		
		for(String i:nombres) {//Para cada elemento del array
			System.out.println(i);//imprimelo cada uno en una nueva línea
		}
		

	}

}
