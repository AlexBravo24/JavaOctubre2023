package com.condicionales;

import java.util.Scanner; //Se importa el scanner

public class Condicionales1_ELP {

	public static void main(String[] args) {
		
		//1.Realiza un programa que reciba dos números 
		//por teclado e indique cuál es mayor o si son iguales.

		
		//Se declara la clase Scanner
		Scanner leer = new Scanner (System.in);
		
		//Se declaran los dos numeros en variable
		int n1, n2;
		
		//Pediremos que el usuario ingrese el primer numero
		System.out.println("Ingrese el primer numero");
		n1 = leer.nextInt(); //Se almacena el primer numero digitado en la variable n1
		
		//Pediremos que el usuario ingrese el segundo numero
		System.out.println("Ingrese el segundo numero");
		n2 = leer.nextInt(); //Se almacena el segundo numero digitado en la variable n1
		
		//Uso de la seleccion if - else
		
		//Si n1 es mayor a n2 muestre un mensaje "n1 es mayor que n2"
		if(n1>n2) {
			System.out.println("El primer numero " +n1 +" es mayor que el numero dos "+n2);
		//Si n1 es menor a n2 muestre un mensaje "Numero menor"
		} else if (n1<n2) {
			System.out.println("El segundo numero "+n2+" es mayor que el numero uno "+n1);
		} else {
			System.out.println("Son iguales");
		
		}
		
	}

}
