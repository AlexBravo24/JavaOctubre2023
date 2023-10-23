
//Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el
//mes correspondiente.

package com.condicionales;

import java.util.Scanner;

public class Condicionales10_JAVD {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int mes;
		
		System.out.println("Ingresa un número entre del 1-12:");
		mes=in.nextInt();
		
		switch (mes) {
		case 1:
			System.out.println("Los días que tiene Enero son: 31");
			break;
		case 2:
			System.out.println("Los días que tiene Frebrero son: 28 o 29 en año bisiesto");
			break;
		case 3:
			System.out.println("Los días que tiene Marzo son: 31");
			break;
		case 4:
			System.out.println("Los días que tiene Abril son: 30");
			break;
		case 5:
			System.out.println("Los días que tiene Mayo son: 31");
			break;
		case 6:
			System.out.println("Los días que tiene Junio son: 30");
			break;
		case 7:
			System.out.println("Los días que tiene Julio son: 31");
			break;
		case 8:
			System.out.println("Los días que tiene Agosto son: 31");
			break;
		case 9:
			System.out.println("Los días que tiene Septiembre son: 30");
			break;
		case 10:
			System.out.println("Los días que tiene Octubre son: 31");
			break;
		case 11:
			System.out.println("Los días que tiene Noviembre son: 30");
			break;
		case 12:
			System.out.println("Los días que tiene Diciembre son: 31");
			break;
		default:
			System.out.println("ERROR");
			break;
		}
		
		
	}

}
