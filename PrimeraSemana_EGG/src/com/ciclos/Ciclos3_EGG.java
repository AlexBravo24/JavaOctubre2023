package com.ciclos;

import java.util.Scanner;

public class Ciclos3_EGG {

	public static void main(String[] args) {
		// Realiza un programa para determinar si un String es palíndromo.
		
		Scanner entrada = new Scanner(System.in);
		 	String original; //= "Anita lava la tina";
	        String invertida = "";
	        String verdad;
	        
	        System.out.println("Introduce una frase:");
	        original = entrada.nextLine();
	        
	        for (int i = original.length() - 1; i >= 0; i--) {
	            invertida += original.charAt(i);
	        }
	        
	        System.out.println("Cadena original: " + original);
	        System.out.println("Cadena invertida: " + invertida);
		
	      
	       
	        if (original.replace(" ","").equalsIgnoreCase(invertida.replace(" ",""))){
	        	System.out.println("Es palindromo");
	        }else {
	        	System.out.println("No es palindromo");	
	        }

	}

}
