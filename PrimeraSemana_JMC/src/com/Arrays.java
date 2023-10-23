package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// Arrays
		
		
//		Los arrays o arreglos o tambien conocidos como vectores
//		son una estructura de datos que nos permiten almacenar
//		un tipo de datos comun
//		son una especie de coleccion de datos
//		
//		Una vez declarado su tamaño o longitud, este no puede crecer
//		en tiempo de ejecucion.
//		
//		
//		Tenemos formas de declarar un array
//		
//		Declarando una array de numeros enteros con su tamaño
		
		int [] numeros = new int [5];
//		
//		//guardar o asignar valores a cada posicion del array
//		
//		
		numeros[0]=1;
		numeros[1]=10;
		numeros[2]=20;
		numeros[3]=30;
		numeros[4]=40;
		
		numeros[5]=15;//puedo agregar un array mas pero no lo puedo 
//		              //imprimir por que me arrojaria un error
//		
		Imprimir en consola determinada posicion del array
		System.out.println(numeros[4]);
		
        //Declarando un Scanner para solicitar los valors por teclado
		
		  Scanner input = new Scanner(System.in);
		
		int [] numeros2 = new int [5];
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println("Ingresa un numero en la posicion "+i);
		   numeros2[i]=input.nextInt();
		}
		
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]+" ");
		}
		
		//Otra manera de declarar un array 
		//Es con sus vlores definidos desde un inicio
		
		int[] numeros3 = {1,2,3,4,5,6,7};
		
		char [] letras = {'a','b','c'};
		
		String [] nombres = {"Abraham","josue"};
		
	
		
	
//		
		
		
		for (String i:nombres) {
			
			System.out.println(i);
			
		}
		
		}
		
	}
	
	


