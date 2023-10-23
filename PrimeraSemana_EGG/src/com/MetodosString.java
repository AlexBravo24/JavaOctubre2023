package com;

public class MetodosString {

	public static void main(String[] args) {
		// Metodos o funcionalidades de la clase
		//String
		
		//Declarar una cadena de texto
		//que nos sirva como ejemplo
		
		String cadena ="Hoy es 18 de Octubre de 2023";
		
		//.Length - devuelve el valor del tamaño de nuestra
		//cadena de texto en un valor numérico entero
		System.out.println("Probando el método .length");
		System.out.println(cadena.length());
		
		//.charAt () - Nos devuelve el caracter de acuerdo
		//a la posición en la que se encuentre dicho caracter
		
		System.out.println("Probando el método .charAt");
		System.out.println(cadena.charAt(2)); //index(2) = posición del caracter
		//System.out.println(cadena.charAt(cadena.length()-1));
		
		//.substring () - devuelve una subcadena a partir del
		//indice especificado
		System.out.println("Probando el método .substring");
		System.out.println(cadena.substring(4));//beginIndex(4)
		System.out.println(cadena.substring(4));
		
		//.toLowerCase()/.toUpperCase
		//Convierte la cadena a minúsculas/Convierte la cadena a máyusculas
		
		System.out.println("probando el método .toLowerCase()");
		System.out.println(cadena.toLowerCase());
		System.out.println("probando el método .toUpperCase()");
		System.out.println(cadena.toUpperCase());
		
		//.equals() - Compara el valor de un objeto contra otro
		//Comparar el valor de un String contra otro
		
		System.out.println("Probando el método .equals()");
		System.out.println(cadena.equals("Hoy es 18 de Octubre de 2023"));//anObject
		System.out.println(cadena.contentEquals("Hoy es 18 de Octubre de 2023"));
		
		//.equalsIgnoreCase() - Compara el valor de un String contra otro
		//e ignora el uso de mayúsculas y minúsculas
				
		System.out.println("Probando el método .equalsIgnoreCase()");
		System.out.println(cadena.equalsIgnoreCase("HoY eS 18 De OcTuBrE DE 2023"));//anObject
		
		//.replace () - Nos permite remplazar las apariciones de un texto o caracter
		//con otro que indiquemos
		System.out.println("Probando el método .replace ()");
		System.out.println(cadena.replace(" ", "$"));
		
	}

}
