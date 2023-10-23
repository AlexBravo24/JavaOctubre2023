package com;

public class MetodosString {

	public static void main(String[] args) {
		// M�todos o funcionalidades de la clase
		//String
		
		//Declarar una cadena de texto
		//que nos sirva como ejemplp
		
		String cadena = "Hoy es 18 de octubre de 2023";
		
		//.length() - devuelve el valor del tama�o de nuestra
		//cadena de texto en un valor num�rico entero
		System.out.println("Provando el m�todo .length ()");
		System.out.println(cadena.length());
		
		//.charArt() - Nos devuelve el caracter
		//a la posicion en la que se encuentre dicho caracter
		System.out.println("Probando el m�todo .charArt()");
		System.out.println(cadena.charAt(cadena.length()-1));

		//.substring() - devuelve una subcadena a partir del
		//indice especificado
		System.out.println("Probando el m�todo .substring()");
		System.out.println(cadena.substring(4));
		System.out.println(cadena.substring(4,20));
		
		//.toLowerCase()/.toUpperCase() -
		//Convierte la cadena a minusculas/Convierte la cadena a mayuscula
		System.out.println("Probando el m�todo .toLowerCase()");
		System.out.println(cadena.toLowerCase());
		System.out.println("Probando el metodo .toUpperCase()");
		System.out.println(cadena.toUpperCase());
		
		//.equals() - Compara el valor de un objeto contra otro
		//Comparar el valor de un String contra otro
		System.out.println("Probando el m�todo .equals()");
		System.out.println(cadena.equals("Hoy es 18 de octubre de 2023"));
		System.out.println(cadena.contentEquals("Hoy es 18 de octubre de 2023"));
		
		//.equalsIgnoreCase() - Compara el valor de un String contra otro
		//e ignora el uso de may�sculas y min�sculas
		System.out.println("Probando el m�todo .equalsIgnoreCase()");
		System.out.println(cadena.equalsIgnoreCase("Hoy eS 18 de octubre de 2023"));
		
		//.replca() - Nos permite reemplazar las apariciones de un caracter
		//con otro que indiquemos
		System.out.println("Probando el m�todo .replace()");
		System.out.println(cadena.replace(" ", "_"));
		
				
	}

}
