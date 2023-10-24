package com.condicionales;

import java.util.Scanner;

public class Condicionales10_JRMM {

	public static void main(String[] args) {
		
		/* 10. Realiza un programa que pida un número entero entre uno
		 * y doce e imprima el número de días que tiene el mes
		 * correspondiente.
		 */
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Ingrese un numero entero entre 1 y 12: ");
		numero = entrada.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("El mes es: ENERO y tiene: 31 días");
			
			break;
		case 2:
			System.out.println("El mes es: FEBRERO y tiene: 28 dias");
			
			break;
		case 3:
			System.out.println("El mes es: MARZO y tiene: 31 dias");
			
			break;
		case 4:
			System.out.println("El mes es: ABRIL y tiene: 30 dias");
			
			break;
		case 5:
			System.out.println("El mes es: MAYO y tiene: 31 dias");
			
			break;
		case 6:
			System.out.println("El mes es: JUNIO y tiene: 30 dias");
			
			break;
		case 7:
			System.out.println("El mes es: JULIO y tiene: 31 dias");
			
			break;
		case 8:
			System.out.println("El mes es: AGOSTO y tiene: 31 dias");
			
			break;
		case 9:
			System.out.println("El mes es: SEPTIEMBRE y tiene: 30 dias");
			
			break;
		case 10:
			System.out.println("El mes es: OCTUBRE y tiene: 31 dias");
			
			break;
		case 11:
			System.out.println("El mes es: NOVIEMBRE y tiene: 30 dias");
			
			break;
		case 12:
			System.out.println("El mes es: DICIEMBRE y tiene: 31 dias");
			
			break;

		default:
			System.out.println("ERROR!!");
			break;
		}
		

	}

}
