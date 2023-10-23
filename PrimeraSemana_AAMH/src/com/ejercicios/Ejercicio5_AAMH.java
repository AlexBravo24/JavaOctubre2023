package com.ejercicios;

public class Ejercicio5_AAMH {

	public static void main(String[] args) {
		// Modifica el programa anterior añadiendo colores. Puedes mostrar
		//cada asignatura de un color diferente.
		
		String rojo = "\033[31m";
		String verde = "\033[32m";
		String naranja = "\033[33m";
		String azul = "\033[34m";
		String morado = "\033[35m";
		String blanco = "\033[37m";
		
		System.out.println("");
		System.out.println(rojo+"Lunes\tMartes\tMiercoles\tJueves\tViernes");
		System.out.println("=====\t======\t=========\t======\t=======");
		System.out.println(verde+"Matem\tEspañ\tCSociales\tIngles\tNatural");
		System.out.println(naranja+"Españ\tMatema\tIngles123\tNatura\tSociale");
		System.out.println(azul+"Natur\tEspaño\tMatematic\tEspaño\tIngles1");
		System.out.println(morado+"Socia\tIngles\tNaturales\tMatema\tMatemat");
		System.out.println(blanco+"Ingle\tSocial\tEspañol12\tSocial\tEspañol");
		System.out.print("");

	}

}
