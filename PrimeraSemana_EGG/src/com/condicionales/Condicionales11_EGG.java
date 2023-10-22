package com.condicionales;

import java.util.Scanner;

public class Condicionales11_EGG {

	public static void main(String[] args) {
		// Una compa��a de transporte internacional tiene servicio en algunos pa�ses de Am�rica del Norte, Am�rica 
		//Central, Am�rica del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y 
		//la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
		/*
		 *    ZONA UBICACI�N   - COSTO/KILOGRAMO
		 * 1 Am�rica del Norte - 24,00 euros
		 * 2 Am�rica Central   - 20,00 euros
		 * 3 Am�rica del Sur   - 21,00 euros
		 * 4 Europa            - 10,00 euros
		 * 5 Asia              - 18,00 euros
		*/
		//Parte de su pol�tica implica que los paquetes con un peso superior a 5kg no son transportados, por 
		//cuestiones de log�stica y seguridad.
		//Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo 
		//de la entrega.
		
		Scanner entrada = new Scanner(System.in);
		double res;
		System.out.println("Introduce el Peso del paquete en KG:");
		int kg = entrada.nextInt();
		if (kg > 5) {
			System.out.println("El paquete no puede ser enviado por cuestiones de log�stica y seguridad");
		}else {
			System.out.println("Introduce la Ubicaci�n: (1 Am�rica del Norte, 2 Am�rica Central, 3 Am�rica del Sur, 4 Europa, 5 Asia)");
			int ubi = entrada.nextInt();
			double costo = 0;
			switch (ubi) {
			case 1:
				costo = 24.00;
				break;
			case 2:
				costo = 20.00;
				break;
			case 3:
				costo = 21.00;
				break;
			case 4:
				costo = 10.00;
				break;
			case 5:
				costo = 18.00;
				break;

			default:
				break;
			}
			res = costo*kg;
			System.out.println("El costo total por la entrega del paquete es: " + res + " euros");
		}
		
	}

}
