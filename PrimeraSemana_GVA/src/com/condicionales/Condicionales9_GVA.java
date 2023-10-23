package com.condicionales;
import java.util.Scanner;

public class Condicionales9_GVA {

	public static void main(String[] args) {
		
		//9. Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a correspondiente. 
		//Si introducimos otro n�mero nos da un error.

		Scanner entrada = new Scanner(System.in);
		int numero;
		
		System.out.println("Ingrese el d�a de la semana (del 1 al 7): ");
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
			dia = "S�bado";
			break;
		case 7:
			dia = "Domingo";
			break;
		default:
				dia = "Error. N�mero fuera de rango.";
		}
		System.out.println("El d�a correspondiente es: " + dia);
		
		entrada.close();

	}

}
