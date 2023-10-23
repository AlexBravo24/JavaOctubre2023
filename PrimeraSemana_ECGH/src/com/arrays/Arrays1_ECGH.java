package com.arrays;

import java.util.Scanner;

public class Arrays1_ECGH {

	public static void main(String[] args) {
		// 1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde.
int[]datos=new int[10];

Scanner input=new Scanner(System.in);

for (int j = 0; j < datos.length; j++) {
	System.out.println("Ingresa el valor "+j+" del array");
	datos[j]=input.nextInt();
}

for (int i = 0; i < datos.length; i++) {
System.out.println("Valor en la posición "+i+" es: "+datos[i]);	
}

input.close();


		
		
		
		
		
		
		
		
	}

}
