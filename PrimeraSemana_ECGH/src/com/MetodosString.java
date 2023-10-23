package com;

public class MetodosString {

	public static void main(String[] args) {
		// M�todos o funcionalidades de la clase String
		
		//Declarar una cadena de texto 
		//que  nos sirva como ejemplo
		
		String cadena="Hoy es 18 de Octubre de 2023";
		
		///.length- devuelve el valor del tama�o de nuestra
		//cadena de texto de un valor num�rico en entero
		System.out.println("Probando el m�tofo .length()");
		System.out.println(cadena.length());
		
		// .charAT() - Nos devuelve el caracter de acuerdo 
		//a la posici�n en la que se encuentre dicho caracter
		
		System.out.println("Probando el m�tofo .charAt()");
		System.out.println(cadena.charAt(cadena.length()-1));
		
		// .substring() - Nos devuelve una subcadena a partir
		//del indice especificado
		System.out.println("Probando el m�tofo .substring()");
		System.out.println(cadena.substring(4));
		System.out.println(cadena.substring(4, 20));

		
		//.toLowerCase()/.toUpperCase()-
		//Convierte la cadena a min�scula/ Convierte la cadena a may�sculas
		System.out.println("Probando el m�todo .toLowerCase()");
		System.out.println(cadena.toLowerCase());
		System.out.println("Probando el m�todo .toUpperCase()");
		System.out.println(cadena.toUpperCase());
		
		//.equals() - Compara el valorde un objeto contra otro
		//Comparar el valor de un String contra otro
		System.out.println("Probando el m�todo .equals()");
		System.out.println(cadena.equals("Hoy es 18 de Octubre de 2023"));
		System.out.println(cadena.contentEquals("Hoy es 18 de Octubre de 2023"));
	
		
		//.equalsIgnoreCase() - Compara el valor de un String contra otro
		//e ignora el uso de may�sculas y min�sculas
		System.out.println("Probando el m�todo .equalsIgnoreCase()");				
		System.out.println(cadena.equalsIgnoreCase("HOY es 18 de OCTUBRE de 2023"));
		
		//.replace()- Nos permite reemplazarlas apariciones de un caracter 
		// con otro que indiquemos
		System.out.println("Probando el m�todo .replace()");
		System.out.println(cadena.replace("e", "%"));
	}

}
