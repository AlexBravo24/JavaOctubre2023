package com;

public class MetodosString {

	public static void main(String[] args) {
		// Metodos o funcionalidades de la clase tipo String

		// Declarar una cadena de texto que nos sirva como ejemplo

		String cadena = "Hoy es 18 de octubre de 2023";
		// .lenght() - devuelve el valor del tamaño de nuestra cadena de texto en un
		// valor numerico entero

		System.out.println("Probando metodo .length()");
		System.out.println(cadena.length());

		// .charAt()- Nos devuelve el caracter de acuerdo a la posision en que se
		// encuentre dicho caracter

		System.out.println("Probando metodo .charAt()");
		System.out.println(cadena.charAt(cadena.length() - 2));
		System.out.println(cadena.charAt(0));

		// .substring() - devuelve una subcadena a partir del indice especificado

		System.out.println("Probando metodo .substring()");
		System.out.println(cadena.substring(6));
		System.out.println(cadena.substring(0, 6));

		// . toLoerCase()/ . to UpperCase convierte la cadena a minuscula o mayusucula

		System.out.println("Probando metodo .toLowerCase()");
		System.out.println(cadena.toLowerCase());
		System.out.println("Probando metodo .toUpperCase()");
		System.out.println(cadena.toUpperCase());

		// .equals- compara el valor de un objeto contra otro. Comparar valor de un
		// string contra otro
		System.out.println("Probando metodo .equals()");
		System.out.println(cadena.equals("Hoy es 18 de octubre de 2023"));

		// .equalsIgnorecase Comparar valor de un string contra otro ignorando
		// mayusculas y minusculas
		System.out.println("Probando metodo .equalsIgnorecase()");
		System.out.println(cadena.equalsIgnoreCase("Hoy es 18 de octubre de 2023"));

		// metodo .replace() -Nos permite remplazar las apariciones de un caracter con otro que indiquemos
		
		System.out.println("Probando metodo .replace()");
		System.out.println(cadena.replace(" ", ""));
		
		

		
	}

}
