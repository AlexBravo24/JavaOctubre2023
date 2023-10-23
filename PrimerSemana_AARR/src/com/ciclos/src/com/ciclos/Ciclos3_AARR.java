package com.ciclos;

import java.util.Scanner;

public class Ciclos3_AARR {

	public static void main(String[] args) {
		
		String palabra ="", invertida = "";
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingrese la palabra para comprobar si es un palindromo");
		palabra = entrada.nextLine();
		
		
		for(int i = palabra.length() - 1; i >= 0; i--) {
			invertida += palabra.charAt(i);
		}
		
		System.out.println("la palabra es: "+palabra);
		System.out.println("la  palabra invertida es: "+ invertida);
		
		if(palabra.replace(" ", "").equalsIgnoreCase(invertida.replace(" ", ""))) {
			System.out.println("la palabra es un palindromo");
		}else {
			System.out.println("la palabra no es palindromo");
		}
		
	}

}
