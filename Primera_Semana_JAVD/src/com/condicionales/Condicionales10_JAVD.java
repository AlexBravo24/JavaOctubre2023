
//Realiza un programa que pida un n�mero entero entre uno y doce e imprima el n�mero de d�as que tiene el
//mes correspondiente.

package com.condicionales;

import java.util.Scanner;

public class Condicionales10_JAVD {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int mes;
		
		System.out.println("Ingresa un n�mero entre del 1-12:");
		mes=in.nextInt();
		
		switch (mes) {
		case 1:
			System.out.println("Los d�as que tiene Enero son: 31");
			break;
		case 2:
			System.out.println("Los d�as que tiene Frebrero son: 28 o 29 en a�o bisiesto");
			break;
		case 3:
			System.out.println("Los d�as que tiene Marzo son: 31");
			break;
		case 4:
			System.out.println("Los d�as que tiene Abril son: 30");
			break;
		case 5:
			System.out.println("Los d�as que tiene Mayo son: 31");
			break;
		case 6:
			System.out.println("Los d�as que tiene Junio son: 30");
			break;
		case 7:
			System.out.println("Los d�as que tiene Julio son: 31");
			break;
		case 8:
			System.out.println("Los d�as que tiene Agosto son: 31");
			break;
		case 9:
			System.out.println("Los d�as que tiene Septiembre son: 30");
			break;
		case 10:
			System.out.println("Los d�as que tiene Octubre son: 31");
			break;
		case 11:
			System.out.println("Los d�as que tiene Noviembre son: 30");
			break;
		case 12:
			System.out.println("Los d�as que tiene Diciembre son: 31");
			break;
		default:
			System.out.println("ERROR");
			break;
		}
		
		
	}

}
