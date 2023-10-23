package com;

public class MetodoString {

	public static void main(String[] args) {
		
		//Metodos y funcionalidades de la clase String
		//Declarar una cadena de texto que nos sirva como ejemplo
		
		String cadena ="Hoy es 18 de Octubre de 2023";
		
		//.lenght() - devuelve el valor del tamaño de nuestra cadena de texto en un valor numerico entero
		System.out.println("probando el metodo .length");
		System.out.println(cadena.length());
		
		
		//.charAt() - Nos devuelve el caracter con la posición en la que se encuentre dicho caracter
		System.out.println("probando el metodo .charAt");
		System.out.println(cadena.charAt(2));
		System.out.println(cadena.charAt(cadena.length()-1));
		//.substring - devuelve una cadena del indice especificado
		System.out.println("probando metodo substring");
		System.out.println(cadena.substring(4));
		System.out.println(cadena.substring(4, 20));
		
		//.toLowerCase() / .toUpperCase() - Convierte la cadena a minusculas o a mayusculas 
		System.out.println("probando metodo .toLowerCase");
		System.out.println(cadena.toLowerCase());
		System.out.println("probando metodo .toUpperCase");
		System.out.println(cadena.toUpperCase());
		
		//.equals() - compara el valor de un objeto contra otro
		// vamos a comparar el valor de un string contra otro
		
		System.out.println("probando metodo .equals");
		System.out.println(cadena.equals("Hoy es 18 de Octubre de 2023"));
		System.out.println("probando .contentEquals");
		System.out.println(cadena.contentEquals("Hoy es 18 de Octubre de 2023"));
		
		
		//.equalsIgnoreCase() - ignora mayusculas y minusculas
		
		System.out.println("probando metodo .equalsIgnoreCase");
		System.out.println(cadena.equalsIgnoreCase("hoy es 18 de octubre de 2023"));
		
		//.replace() - nos permite reemplazar las apariciones de un textno o caracter con otro que indiquemos
		System.out.println("probando metodo .replace");
		System.out.println(cadena.replace(" ", "_"));
		
		
		
	}
	}


