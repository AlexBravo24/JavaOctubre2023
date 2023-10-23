package com;

public class MetodosString {

	public static void main(String[] args) {
		// Metodos o funcionalidades de la clase 
		//String
		
		//Declarar una cadena de textoo
		//que nos sirva como ejemplo 
		
		String cadena = "Hoy es 18 de Octubre de 2023";

	   //.length() - devuelve  el valor del tamaño de nuestra 
		//cadena de texto en un valor numerico
		System.out.println("Probando la funcion .legth");
		System.out.println(cadena.length());
		
		
		//.charAt ()- Nos devuelve el caracter de acuerdo 
		//a la posicion en la que se encuentre dicho caracter
		
		System.out.println("Probando la funcion .charAt");
		System.out.println(cadena.charAt(cadena.length()-1));
		
		//.substring - devuelve una subcadena a partir del 
		//indice especidicado
		
		System.out.println("Probando la funcion .substring");
		System.out.println(cadena.substring(4));
		System.out.println(cadena.substring(4,20));
		
		//.toLowerCase()/.toUpperCase
		//Convierte la cadena a minusculas /Convierte la cadena a mayusculas
		System.out.println("Probando la funcion .toLowerCase");
		System.out.println(cadena.toLowerCase());
		System.out.println("Probando la funcion .toUpperCase");
		System.out.println(cadena.toUpperCase());
		
		
		//.equals() - Compara el valor de un objeto contra otro
		//Comparar el valor de un string a otro
		System.out.println("Probando la funcion .equals");
		System.out.println(cadena.contentEquals("Hoy es 18 de Octubre de 2023"));
	
	
	
		//.equals() - Compara el valor de un objeto contra otro
				//E ignora el uso de mayusculas y minusculas 
		System.out.println("Probando la funcion .equalsIgnoreCase");
	System.out.println(cadena.equalsIgnoreCase("HOY es 19 de Octubre de 2023"));
	
	
	  //.replace() - Nos permite remmplazar las apariciones de un caracter 
	 //con otro que indiquemos 
	System.out.println("Probando la funcion .replace");
	System.out.println(cadena.replace("e", "0"));

	
	
	
	}
	

}
