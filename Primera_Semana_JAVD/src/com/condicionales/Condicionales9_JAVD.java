
//Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a correspondiente. Si
//introducimos otro n�mero nos da un error

package com.condicionales;

import java.util.Scanner;

public class Condicionales9_JAVD {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int dia;
		
		System.out.println("Ingresa el numero del d�a de la semana. (van del 1-7)");
		dia=in.nextInt();
		
		if(dia==1) {
			System.out.println("Lunes");
		}
		else if(dia==2) {
			System.out.println("Martes");
		}
		else if(dia==3) {
			System.out.println("Mi�rcoles");
		}
		else if(dia==4) {
			System.out.println("Jueves");
		}
		else if(dia==5) {
			System.out.println("Viernes");
		}
		else if(dia==6) {
			System.out.println("S�bado");
		}
		else if(dia==7) {
			System.out.println("Domingo");
		}
		else {
			System.out.println("Error de d�a");
		}

	}

}
