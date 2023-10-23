
//Crea un array de 10 posiciones de números con valores pedidos por teclado.
//Muestra por consola el índice y el valor al que corresponde.

package com.arrays;

import java.util.Scanner;

public class Arrays1_JAVD {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int [] num = new int[10];
		
		System.out.println("----Ingresa 10 números----");
		
		for(int i=0; i<num.length;i++) {
			System.out.println("Ingresa el "+(i+1)+"° número: ");
			num[i]=in.nextInt();
		}
		
		System.out.println("------------------VALORES------------------");
		for(int j=0;j<num.length;j++) {
			System.out.println("El del "+(j+1)+"° valor es: "+num[j]);
		}

	}

}
