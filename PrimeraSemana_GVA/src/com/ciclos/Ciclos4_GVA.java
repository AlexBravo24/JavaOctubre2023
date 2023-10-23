package com.ciclos;

import java.util.Scanner;

public class Ciclos4_GVA {

	public static void main(String[] args) {
		// 
		
		//Necesitamos un Scanner para introducir los datos
		Scanner entrada = new Scanner(System.in);
		
		//Declaramos una variable contador para guardar las veces la letra 
		int contador = 0;
		
		//Ingresamos una frase y una letra
		String frase;
		String letra;
		
		//Solicitamos los datos con un mensaje en consola
		 System.out.println("Introduce una frase: ");
		 frase = entrada.nextLine();
		 System.out.println("Introduce una letra a encontrar: ");
		 letra = entrada.nextLine();
		 
		 for (int i = 0; i < frase.length(); i++) {
			 if (frase.charAt(i) == letra.charAt(0)) {
				 contador++;
			 }
			 
		
		
		 }
		 if (contador != 0) {
				System.out.println("El caracter " + letra + " se repite " + contador + " vez");
		 } else { 
			 System.out.println("Caracter no encontrado");
		 }
		 entrada.close();
	}

}
