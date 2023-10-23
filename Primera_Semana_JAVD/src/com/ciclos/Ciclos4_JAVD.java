
//Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado
//cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje
//“Carácter no encontrado”. 

package com.ciclos;

import java.util.Scanner;

public class Ciclos4_JAVD {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String cadena;
		char p;
		int v=0;
		
		System.out.println("----------DETECTOR DE LETRAS---------");
		
		System.out.println("Ingresa una frase:");
		cadena=in.nextLine();
		System.out.println("Ingresa una letra:");
		p=in.nextLine().charAt(0);
		
		cadena=cadena.replace(" ", "");
		
		for(int i=0;i<cadena.length();i++) {
			if(cadena.charAt(i)==p) {
				v++;
			}
		}
		
		if(v>0) {
			System.out.println("La letra "+p+" existe "+v+" veces.");
		}
		else {
			System.out.println("Carácter no encontrado.");
		}
		
	}

}
