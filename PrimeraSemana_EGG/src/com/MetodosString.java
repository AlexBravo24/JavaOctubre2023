package com;

public class MetodosString {

	public static void main(String[] args) {
		// Metodos o funcionalidades de la clase
		//String
		
		//Declarar una cadena de texto
		//que nos sirva como ejemplo
		
		String cadena ="Hoy es 18 de Octubre de 2023";
		
		//.Length - devuelve el valor del tama�o de nuestra
		//cadena de texto en un valor num�rico entero
		System.out.println("Probando el m�todo .length");
		System.out.println(cadena.length());
		
		//.charAt () - Nos devuelve el caracter de acuerdo
		//a la posici�n en la que se encuentre dicho caracter
		
		System.out.println("Probando el m�todo .charAt");
		System.out.println(cadena.charAt(2)); //index(2) = posici�n del caracter
		//System.out.println(cadena.charAt(cadena.length()-1));
		
		//.substring () - devuelve una subcadena a partir del
		//indice especificado
		System.out.println("Probando el m�todo .substring");
		System.out.println(cadena.substring(4));//beginIndex(4)
		System.out.println(cadena.substring(4));
		
		//.toLowerCase()/.toUpperCase
		//Convierte la cadena a min�sculas/Convierte la cadena a m�yusculas
		
		System.out.println("probando el m�todo .toLowerCase()");
		System.out.println(cadena.toLowerCase());
		System.out.println("probando el m�todo .toUpperCase()");
		System.out.println(cadena.toUpperCase());
		
		//.equals() - Compara el valor de un objeto contra otro
		//Comparar el valor de un String contra otro
		
		System.out.println("Probando el m�todo .equals()");
		System.out.println(cadena.equals("Hoy es 18 de Octubre de 2023"));//anObject
		System.out.println(cadena.contentEquals("Hoy es 18 de Octubre de 2023"));
		
		//.equalsIgnoreCase() - Compara el valor de un String contra otro
		//e ignora el uso de may�sculas y min�sculas
				
		System.out.println("Probando el m�todo .equalsIgnoreCase()");
		System.out.println(cadena.equalsIgnoreCase("HoY eS 18 De OcTuBrE DE 2023"));//anObject
		
		//.replace () - Nos permite remplazar las apariciones de un texto o caracter
		//con otro que indiquemos
		System.out.println("Probando el m�todo .replace ()");
		System.out.println(cadena.replace(" ", "$"));
		
	}

}
