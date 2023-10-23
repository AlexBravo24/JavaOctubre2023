
/* Realiza un programa que calcule la aceptaci�n de una solicitud en base a los siguientes
 * par�metros: edad, nota y sexo.
 * M�nimo: Nota (5), edad (18), sexo M -> POSIBLE
 * M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA
 * Otros casos -> NO ACEPTADA
 */

package com.condicionales;

import java.util.Scanner;

public class Condicionales5_JAVD {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int nota, edad;
		String sexo;
		
		System.out.println("Ingresa tu nota: ");
		nota=in.nextInt();
		System.out.println("Ingresa tu edad: ");
		edad=in.nextInt();
		System.out.println("Ingresa tu sexo: ");
		in.nextLine();
		sexo=in.nextLine();
		
		if(nota==5 && edad==18  && sexo.equals("M")) {
			System.out.println("POSIBLE");
		}
		else if(nota==5 && edad==18  && sexo.equals("F")) {
			System.out.println("ACEPTADA");
		}
		else {
			System.out.println("NO ACEPTADA");
		}
	}
	
}
