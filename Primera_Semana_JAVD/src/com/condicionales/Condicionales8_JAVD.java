
//Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de
//seis caras y muestre por pantalla el n�mero en letras (dato cadena) de la cara opuesta al resultado
//obtenido.
//Nota 1: En las caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4.
//Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, se mostrar� el mensaje:
//�ERROR: n�mero incorrecto�.

package com.condicionales;

import java.util.Scanner;

public class Condicionales8_JAVD {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int dado;		
		
		System.out.println("Ingresa el n�mero que se obtuvo al lanzar el dado: ");
		dado=in.nextInt();
		
		switch (dado) {
		case 1:
			System.out.println("El lado opuesto tiene el numero:");
			System.out.println("SEIS");
			break;
		case 2:
			System.out.println("El lado opuesto tiene el numero:");
			System.out.println("CINCO");
			break;
		case 3:
			System.out.println("El lado opuesto tiene el numero:");
			System.out.println("CUATRO");
			break;			
		case 4:
			System.out.println("El lado opuesto tiene el numero:");
			System.out.println("TRES");
			break;
		case 5:
			System.out.println("El lado opuesto tiene el numero:");
			System.out.println("DOS");
			break;
		case 6:
			System.out.println("El lado opuesto tiene el numero:");
			System.out.println("UNO");
			break;
		default:
			System.out.println("ERROR: n�mero incorrecto");
			break;
		}
		

	}

}
