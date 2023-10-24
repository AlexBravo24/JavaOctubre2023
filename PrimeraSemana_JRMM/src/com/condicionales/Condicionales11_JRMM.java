package com.condicionales;

import java.util.Scanner;

public class Condicionales11_JRMM {

	public static void main(String[] args) {
		
		/* Ejercicio 11
		 * 
		 */
		Scanner entrada = new Scanner(System.in);
		
		int opcion, peso, costo;
		
		
			System.out.println("===== Zonas de envio =====");
			System.out.println("1.- America del Norte");
			System.out.println("2.- America Central");
			System.out.println("3.- America del Sur");
			System.out.println("4.- Europa");
			System.out.println("5.- Asia");
			System.out.println("Elije el numero de zona al que se envia el paquete: ");
			opcion = entrada.nextInt();

			
			switch (opcion) {
			case 1:
				System.out.println("El costo de envio para América del Norte es: 24,00 Euros");
				System.out.println("Ingrese el peso del paquete en KG: ");
				peso = entrada.nextInt();
				if(peso >= 0 && peso <= 5) {
					costo = peso * 24;
					System.out.println("El costo del envio es: "+costo);
				}else {
					System.out.println("Paquete Rechazado");
				}
				break;
				
			case 2:
				System.out.println("El costo de envio para América Central es: 20,00 Euros");
				System.out.println("Ingrese el peso del paquete en KG: ");
				peso = entrada.nextInt();
				if(peso >= 0 && peso <= 5) {
					costo = peso * 20;
					System.out.println("El costo del envio es: "+costo);
				}else {
					System.out.println("Paquete Rechazado");
				}
				break;
			case 3:
				System.out.println("El costo de envio para América del Sur es: 21,00 Euros");
				System.out.println("Ingrese el peso del paquete en KG: ");
				peso = entrada.nextInt();
				if(peso >= 0 && peso <= 5) {
					costo = peso * 21;
					System.out.println("El costo del envio es: "+costo);
				}else {
					System.out.println("Paquete Rechazado");
				}
				break;
			case 4:
				System.out.println("El costo de envio para Europa es: 10,00 Euros");
				System.out.println("Ingrese el peso del paquete en KG: ");
				peso = entrada.nextInt();
				if(peso >= 0 && peso <= 5) {
					costo = peso * 10;
					System.out.println("El costo del envio es: "+costo);
				}else {
					System.out.println("Paquete Rechazado");
				}
				break;
			case 5:
				System.out.println("El costo de envio para Asia: 18,00 Euros");
				System.out.println("Ingrese el peso del paquete en KG: ");
				peso = entrada.nextInt();
				if(peso >= 0 && peso <= 5) {
					costo = peso * 18;
					System.out.println("El costo del envio es: "+costo);
				}else {
					System.out.println("Paquete Rechazado");
				}
				break;

			default:
				System.out.println("ERROR!");
				break;
			}
			
		

	}

}
