package com;

public class MetodosString {

	public static void main(String[] args) {
		
		//Metodos o funcionalidades de la clase
		//String
		
		//declarar un cadena de texto
		//que nos sirva como ejemplo
		
		String cadena="hoy es 18 de Octubre de 2023";
		//.length() - devuelve el valor del tamaño de nuestra
		//cadena de texto en un valor numerico entero
		System.out.println("Probando el metodo.Length()");
		System.out.println(cadena.length());
		
		//.charAT() - nos devuelve el caractes de acuerdo
		//a la posicion en la que se encuentre dicho caracter
		
		System.out.println("Probando el metodo .charAt()");
		System.out.println(cadena.charAt(cadena.length()-1));
		
		//.substring - devuelve una subcadena a partir del 
		//indice especificado
		
		System.out.println("Probando el metodo .substring()");
		System.out.println(cadena.substring(4));
		System.out.println(cadena.substring(4,20));
		
		
	}

}
