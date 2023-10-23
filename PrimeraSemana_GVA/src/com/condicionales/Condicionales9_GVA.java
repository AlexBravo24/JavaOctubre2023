package com.condicionales;
import java.util.Scanner;

public class Condicionales9_GVA {

	public static void main(String[] args) {
		
		//9. Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. 
		//Si introducimos otro número nos da un error.

		Scanner entrada = new Scanner(System.in);
		int numero;
		
		System.out.println("Ingrese el día de la semana (del 1 al 7): ");
		numero = entrada.nextInt();
		
		String dia;
		
		switch (numero) {
		case 1:
			dia = "Lunes";
			break;
		case 2:
			dia = "Martes";
			break;
		case 3:
			dia = "Miercoles";
			break;
		case 4:
			dia = "Jueves";
			break;
		case 5:
			dia = "Viernes";
			break;
		case 6: 
			dia = "Sábado";
			break;
		case 7:
			dia = "Domingo";
			break;
		default:
				dia = "Error. Número fuera de rango.";
		}
		System.out.println("El día correspondiente es: " + dia);
		
		entrada.close();

	}

}
