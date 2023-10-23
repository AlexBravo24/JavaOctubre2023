package com.condicionales;

import java.util.Scanner;

public class Condicionales11_ECGH {
	public static void main(String[] args) {
//		11. Una compa��a de transporte internacional tiene servicio en algunos pa�ses de Am�rica del Norte, 
//		Am�rica Central, Am�rica del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso
//		del paquete y la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:

//		ZONA UBICACI�N      COSTO/KILOGRAMO
//		1 Am�rica del Norte 24,00 euros
//		2 Am�rica Central 20, 00 euros
//		3 Am�rica del Sur 21,00 euros
//		4 Europa 10,00 euros
//		5 Asia 18,00 euros

//		Parte de su pol�tica implica que los paquetes con un peso superior a 5kg no son transportados, 
//	    por cuestiones de log�stica y seguridad.
//		Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega.
		
		int peso;
		int region;
		int costo=0;
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce el peso del equipaje");
		peso=entrada.nextInt();
		System.out.println("Introduce el n�mero de la regi�n de destino");
		region=entrada.nextInt();
		
		if (peso>5) {
			System.out.println("El equpaje no puede ser enviado por exceso de peso");
		}
		else {
			switch(region) {
			case 1:
				costo=peso*24;
				break;
			case 2:
				costo=peso*20;
				break;
			case 3:
				costo=peso*21;
				break;
			case 4:
				costo=peso*10;
				break;
			case 5:
				costo=peso*18;
				break;
			default:
				System.out.println("ERROR: La regi�n no est� disponible");
				break;
			}
			
			
			System.out.println("El costo por el servicio es: "+costo+" euros");
			
			
			
			
		}
		
		
		
		
	}
}
