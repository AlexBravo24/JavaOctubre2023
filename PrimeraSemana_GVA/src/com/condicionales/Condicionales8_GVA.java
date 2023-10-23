package com.condicionales;

import java.util.Scanner;

public class Condicionales8_GVA {

	public static void main(String[] args) {
		
		// 8. Realiza un programa que pida por teclado el resultado (dato entero)
		// obtenido al lanzar un dado de seis caras y muestre en pantalla 
		// el número en letras (dato cadena) de la cara opuesta al resultado obtenido
		// Nota 1: En las caras opuestas de un dado de seis caras están los números 1-6, 2-5 y 3-4.
		// Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6,
		// se mostrará el mensaje: "ERRORR: número incorrecto"
		
		Scanner entrada = new Scanner(System.in);
		
		int resultadoDado;
		System.out.println("Ingrese el resultado al lanzar el dado (1 al 6");
		resultadoDado = entrada.nextInt();
		
		if (resultadoDado < 1 || resultadoDado > 6) {
			System.out.println("ERROR: número incorrecto");
		} else {
			int numeroOpuesto = 7 - resultadoDado;
			String numeroEnLetra = obtNumeroEnLetra(numeroOpuesto);
			System.out.println("El número opuesto en letra es " + numeroEnLetra);
		}
		entrada.close();
	}
	
}
