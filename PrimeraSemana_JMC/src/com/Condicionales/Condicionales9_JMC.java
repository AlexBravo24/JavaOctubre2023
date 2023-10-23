package com.Condicionales;

import java.util.Scanner;

public class Condicionales9_JMC {

	public static void main(String[] args) {
		
//		9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si 
//		introducimos otro número nos da un error.
		
		Scanner entrada9 = new Scanner(System.in);
		
		int dia;
		
	System.out.println("Digita el numero del dia");
		dia = entrada9.nextInt(); 
		
		switch (dia) {
		case 1:
			System.out.println("el dia es lunes");
			break;
		case 2:
			System.out.println("el dia es Martes");
			break;
		case 3:
			System.out.println("el dia es Miercoles");
			break;
		case 4:
			System.out.println("el dia es Jueves");
			break;
		case 5:
			System.out.println("el dia es Viernes");
			break;
		case 6:
			System.out.println("el dia es sabado");
			break;
		case 7:
			System.out.println("el dia es Domingo");
			break;
		default:
			System.out.println("No existe el dia");
			break;
		}
		
	}

}
