package com.condicionales;

import java.util.Scanner;

public class Condicionales8_AAMH {

	public static void main(String[] args) {
		// 8.Realiza un programa que pida por teclado el resultado (dato entero)
		//obtenido al lanzar un dado de seis caras y muestre por pantalla el número en letras (dato cadena)
		//de la cara opuesta al resultado obtenido.
		//Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
		//Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6,
		//se mostrará el mensaje: “ERROR: número incorrecto”.

		Scanner entrada = new Scanner (System.in);
		int dado;
		
		//Solicitud de datos
		System.out.println("Este programa indica el número aparecido en el " + "lado opuesto al que sale en el dado: ");
		System.out.print("Resultado Cara obtenida: ");
		dado = entrada.nextInt();
		
			
		//Realizamos comparaciones y mostramos el resultado
		
		switch (dado) {
		case 1:
			System.out.println("Cara opuesta \"6\".");
			break;
		case 2:
			System.out.println("Cara opuesta \"5\".");
			break;
		case 3:
			System.out.println("Cara opuesta \"4\".");
			break;
		case 4:
			System.out.println("Cara opuesta \"3\".");
			break;
		case 5:
			System.out.println("Cara opuesta \"2\".");
			break;
		case 6:
			System.out.println("Cara opuesta \"1\".");
			break;
		default:
			System.out.println("ERROR: número incorrecto.");
		}
		
		
	}

}
