package com;


import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// Arrays
		
		//Array, arreglos o vectores
		// Son una estructura de datos que nos permiten almacenar un tipo de datos en comùn
		//Son una especie de colecciòn de datos
		//	Una vez declarado su tamaño o longitud este no puede crecer en su tiempo de ejecuciòn
		
		//Formas de declarar un Array
		
		//Declaramos un array de numeros enteros con su tamaño
		
		int [] numeros = new int [5];
		// Como guardar o asignar valores a cada posicion del array
		numeros[0] =23;
		numeros[1] =24;
		numeros[2] =25;
		numeros[3] =26;
		numeros[4] =27;
		//Imprimir en consola determinada posicion
		System.out.println(numeros[4]);

		// Declaramos un Scanner para solicitar los valores por teclado
		Scanner input = new Scanner(System.in);
		
		int [] numeros2 = new int [5]; 
		
		for(int i=0; i<numeros2.length; i++) {
			System.out.println("Ingresa un numero en la pocisiciòn " + i);
			numeros2[i]=input.nextInt();
			
		}
		input.close();
		
		System.out.println(numeros2[2]);
		
		//Para imprimirlos todos puedo hacer uno nuevamente de un ciclo
		
		for(int i=0; i<numeros2.length; i++) {
			System.out.print(numeros2[i]+ ", ");
		
		}
		
		
		//segundo Declarar un array con valores definidos desde el inicio
		int [] numeros3 = {1,2,8,5,6};	
		
		char [] nombre = {'a','b','c','d','e'};
		
		String [] n = { "Sandi","Noè","Arasandi","Gerardo","Maria"};
		
		//Otra forma de imprimir todos los elementos del array en con un ciclo llamado
		//For each
		
		for(String i:n) {
			System.out.print(i + "   "); //Para cada elemento primero cada uno tiene 
			//imprimiendo cada uno nuuevamente
			
		}
	
	}
		}
		
		
	


