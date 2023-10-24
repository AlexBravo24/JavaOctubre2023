package com;

public class MetodosString {

	public static void main(String[] args) {
		
		// Métodos o funcionalidades de la clase
		//String
		
		//Declarar una cadena de texto
		//que nos sirva como ejemplo
		
		String cadena = "Hoy es 18 de Octubre de 2023";
		
		//.length() - devuelve el valor del tamaño de nuestra
		//cadena de texto en un valor numérico entero
		System.out.println("Probando el metodo .length()");
		System.out.println(cadena.length());
		
		//.charAt() - Nos devuelve el caracter de acuerdo
		//a la posicion en la que se encuentre dicho caracter
		System.out.println("Probando el metodo .charAt()");
		System.out.println(cadena.charAt(27));
		
		//.substring - devuelve una subcadena a partir del
		//indice especificado
		System.out.println("Probando el método .substring()");
		System.out.println(cadena.substring(4));
		System.out.println(cadena.substring(4,20));
		
		//.toLoweCase()/.toUpperCase
		//Convierte la cadena a minusculas/ Convierte la cadena a mayusculas
		System.out.println("Probando el metodo .toLowerCase()");
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		//.equals() - compara el valor de un objeto contra otro
		//compara el valor de un string contra otro
		System.out.println("Probando el metodo .equals()");
		System.out.println(cadena.equals("Hoy es 18 de Octubre de 2023"));
		System.out.println(cadena.contentEquals("Hoy es 18 de Octubre de 2023"));
		
		//.equalsIgnoreCase() - compara el valor de un string contra otro
		//e ignora el uso de mayusculas y minusculas
		System.out.println("Probando el metodo .equalsIgnoreCase()");
		System.out.println(cadena.equalsIgnoreCase("HoY eS 18 De OcTuBrE DE 2023"));
		
		//.replace() - Nos permite reemplazar las apariciones de un caracter
		//con otro que indiquemos
		System.out.println("Probando el metodo .replace()");
		System.out.println(cadena.replace(" ", "&"));
		
	}

}
