package com.Ciclos;

import java.util.Scanner;

public class Ciclos4_JMC {

	public static void main(String[] args) {
//		 4.Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado 
//		cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje 
//		“Carácter no encontrado”.
		Scanner entrada = new Scanner(System.in);
		char letra;
		String cadena;
		
		System.out.println("Ingresa una palabra" );
		cadena = entrada.nextLine();
		
		System.out.println("Ingresa una letra" );
		letra = entrada.next().charAt(0);
		
		
		 
           int contador=0;
	        for (int i = 0; i < cadena.length(); i++) {
	            if (cadena.charAt(i) == letra) {
	               
	            }
	        }
		if(contador<=0) {
	        System.out.println("la letra no aparece");
	        }
		
		
		else if (contador==1) {
			System.out.println("la letra aparece 1 vez");
		}
		else {
			System.out.println("la letra aparece: "+contador+" veces");
		}

}
}