package com.Array;

import java.util.Scanner;

public class Arrays3_JMC {

	public static void main(String[] args) {
		// 3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
		//caracteres.

		 Scanner scanner = new Scanner(System.in);
		 String frase;
		 
		 
		 System.out.print("Por favor, ingresa una frase: ");
		 frase = scanner.nextLine();
		
	   
		 char Arreglo[]= frase.toCharArray();
		 
		 
		 for (int i = 0; i < Arreglo.length; i++) {
		    System.out.println("Posicion "+i+" ="+Arreglo[i]);	
		}
		 
	
	
	}
	
	
	

}
