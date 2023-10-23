package com.arrays;

import java.util.Scanner;

public class Arrays1_ELP {

	public static void main(String[] args) {
		// 1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde

		int [] numeros = new int [11];
		
		numeros[0]=100;
		numeros[1]=110;
		numeros[2]=120;
		numeros[3]=130;
		numeros[4]=140;
		numeros[5]=150;
		numeros[6]=160;
		numeros[7]=170;
		numeros[8]=180;
		numeros[9]=190;
		numeros[10]=200;
		
		System.out.println(numeros[5]);
		
		Scanner leer = new Scanner(System.in);
		
		int [] numeros3 = new int [9];
		
		for (int i = 0; i < numeros3.length; i++) {
			System.out.println("Ingresa un numero en la posicion " + i);
			numeros3[i]=leer.nextInt();
		}
		
		
		leer.close();
		
		System.out.println(numeros3[6]);
		
		for (int i=0; i< numeros3.length; i++) {
			System.out.println(numeros3[i]+ ", ");
			
		}
}

		
	}

