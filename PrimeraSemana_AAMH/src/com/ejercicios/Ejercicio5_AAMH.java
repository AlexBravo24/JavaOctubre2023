package com.ejercicios;

public class Ejercicio5_AAMH {

	public static void main(String[] args) {
		// Modifica el programa anterior a�adiendo colores. Puedes mostrar
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
		System.out.println(verde+"Matem\tEspa�\tCSociales\tIngles\tNatural");
		System.out.println(naranja+"Espa�\tMatema\tIngles123\tNatura\tSociale");
		System.out.println(azul+"Natur\tEspa�o\tMatematic\tEspa�o\tIngles1");
		System.out.println(morado+"Socia\tIngles\tNaturales\tMatema\tMatemat");
		System.out.println(blanco+"Ingle\tSocial\tEspa�ol12\tSocial\tEspa�ol");
		System.out.print("");

	}

}
