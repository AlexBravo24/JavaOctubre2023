package com.ciclos;

import java.util.Scanner;

public class Ciclos11_AAMH {

	public static void main(String[] args) {
		// 11.Dibuja un cuadrado, como en la imagen que acompaña, 
		//introducir desde teclado el ancho y el alto. Ejemplo: 8 x 8

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Inserta número de asteriscos lado cuadrado:");
		int lado = entrada.nextInt();
		
		
		for(int i=1; i <= lado; i++) {
			for(int j=1; j <= lado; j++) {
				System.out.print(" * ");
				
			}
			System.out.println(" ");
		}
	
}
}
