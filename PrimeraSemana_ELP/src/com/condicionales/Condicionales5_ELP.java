package com.condicionales;

import java.util.Scanner;

public class Condicionales5_ELP {

	public static void main(String[] args) {
		// 5. Realiza un programa que calcule la aceptación 
		//de una solicitud en base a los siguientes 
		//parámetros: edad, nota y sexo.
//		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
//		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
//		* Otros casos -> NO ACEPTADA

		Scanner leer = new Scanner(System.in);
		
		int edad;
		double nota;
		char sexo;
		
        System.out.print("Ingrese la nota: ");
        nota = leer.nextDouble();
        System.out.print("Ingrese la edad: ");
        edad = leer.nextInt();
        System.out.print("Ingrese el sexo: ");
        sexo = leer.next().charAt(0);

        
        if (nota >= 5 && edad >= 18) {
            if (sexo == 'M') {
                System.out.println("POSIBLE");
            } else if (sexo == 'F') {
                System.out.println("ACEPTADA");
            } else {
                System.out.println("NO ACEPTADA");
            }
        } else {
            System.out.println("NO ACEPTADA");
        }

    }
}