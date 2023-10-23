package com;

public class MetodosString {

	public static void main(String[] args) {
		// Mètodos de String
		// Declarar una cadena de texto
		//que sirva como texto
		
		String cadena = "hoy es 18 de octubre de 2023";
		
		
		//.length() devuelve el valor de tipo entero
		System.out.println("Probando el metodo .length()");
       System.out.println(cadena.length());
		
       //.charAt() - Nos devuelve el caracter de acuerdo a la 
       //pocicion en la que se encuentre 
       System.out.println("Probando el metodo .charAt()");
       System.out.println(cadena.charAt(cadena.length()-1));
       
       //.substring -devuelve una subcadena a partir del indice especificado
       System.out.println("probando el metodo .substring()");
       System.out.println(cadena.substring(4));
       System.out.println(cadena.substring(4,20));
       
       //.toLowerCase()/.toUpperCase
       //Convierte las cadenas a minusculas/convierte a mayuscula
       System.out.println("probando el mètodo .toLowerCase() ");
       System.out.println(cadena.toLowerCase());
       
       System.out.println("probando el mètodo .toUpperCase ");
       System.out.println(cadena.toUpperCase());
       
       //.ecuals() - compara el valor de un objeto contra otro 
       //compara un valor de string contra otro
       
       System.out.println("probando el mètodo .ecuals ");
       System.out.println(cadena.equals("Hoy es 18 de octubre de 2023"));
       System.out.println(cadena.contentEquals("Hoy es 18 de octubre de 2023"));
       //.equalsIgnoreCase()- compara el valor de un String contra otro
       // ignora mayusculas y minusculas
       
       System.out.println("probando el mètodo .equalsIgnoreCase() ");
       System.out.println(cadena.equalsIgnoreCase("Hoy Es 18 DE OCTUBRE de 2023"));
       
       //.replace() - reemplaza las apariciones de un texto o 
       //caracter con otro que indiquemos
       System.out.println("probando el mètodo  .replace()  ");
       System.out.println(cadena.replace("18", "28"));
       
       
	}

}
