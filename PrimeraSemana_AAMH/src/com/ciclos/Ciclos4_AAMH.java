package com.ciclos;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ciclos4_AAMH {

	public static void main(String[] args) {
		//4.Programa que reciba una frase y una letra por teclado.
		//Deberá retornar como resultado cuántas veces existe esa letra dentro de la frase.
		//Si no existe, imprimir un mensaje “Carácter no encontrado”.

		//Necesitamos un Scanner para introducir los datos
		Scanner entrada = new Scanner (System.in);
        
		//Necesitamos introducir una frase y una letra, entonces declaramos
		//las variables para guardar esos valores
		String frase;
		String letra;
		//Declarar una variable contador para guardar 
		int contador = 0;
		
		//solicitamos los datos con un mensaje en consola
		
		System.out.println("Introduce una frase: ");
		frase=entrada.nextLine();
		System.out.println("Introduce una letra: ");
		letra=entrada.nextLine();
		
		
		//Creamos un ciclo for para poder recorrer las posiciones de
		//nuestra frase y comparar el valor de la letra contra la que
		//va recorriendo el ciclo. Si la letra es igual a la de la posición
		//de la frase, entonces incrementamos nuestro contador en 1.
		
		
		for (int i = 0; i < frase.length(); i++) {
			if ((frase.charAt(i)== letra.charAt(0))) {
				contador=contador+1;
			}
			}
			if(contador != 0) {
				System.out.println("El caracter "+ letra + " se repite "+ contador + " Veces ");
			
			}else {
		System.out.println("Caracter no encontrado");
	}
	}

}
