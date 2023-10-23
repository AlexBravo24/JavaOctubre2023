package com.arrays;

import java.util.Scanner;

public class Arrays3_ECGH {
	
	public static void main(String[] args) {
		//3. Pide al usuario por teclado una frase y
				//pasa sus caracteres a un array de caracteres.
		String frase;
		//char [] array=new char[frase.length()];
		Scanner input=new Scanner(System.in);

		System.out.println("Ingrese una frase");
		frase=input.nextLine();

		if (frase.length()>0) {
		char [] array=new char[frase.length()];
		
		for (int i = 0; i < frase.length(); i++) {
			array[i]=frase.charAt(i);
		}
		
		System.out.println("La frase en array es: "+array.toString());
		
		
		
		}
		
		else {
		System.out.println("ERROR");
		}		
		
		
		
		
		

	}


}
