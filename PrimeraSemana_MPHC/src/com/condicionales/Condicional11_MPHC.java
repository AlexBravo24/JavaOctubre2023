package com.condicionales;

import java.util.Scanner;

public class Condicional11_MPHC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("<<< Transporte internacional de paqueteria >>>");
		System.out.println("");

	
		System.out.println("Seleccione el destino del 1 al 5");
		System.out.println("1. America del Norte");
		System.out.println("2. America Central");
		System.out.println("3. America del Sur");
		System.out.println("4: Europa");
		System.out.println("5: Asia");
		int destino = entrada.nextInt();
		System.out.println();
		
		System.out.println("Ingrese peso del paquete, Maximo 5 kilogramos");
		int peso = entrada.nextInt();

		System.out.println();

		if (peso <= 5 && destino==1) {

			double total = peso * 24.00;
			System.out.println("El cobro por la entrega a America del Norte es de:$" + total + " Euros");

		} else if (peso <= 5 && destino==2) {

			double total = peso * 20.00;
			System.out.println("El cobro por la entrega a America Central es de:$" + total + " Euros");

		} else if (peso <= 5 && destino==3) {

			double total = peso * 20.00;
			System.out.println("El cobro por la entrega a America del sur es de:$" + total + " Euros");

		} else if (peso <= 5 && destino==4) {

			double total = peso * 10.00;
			System.out.println("El cobro por la entrega a Europa es de:$" + total + " Euros");

		} else if (peso <= 5 && destino==5) {

			double total = peso * 18.00;
			System.out.println("El cobro por la entrega a Asia es de:$" + total + " Euros");

		} else {
			System.out.println("Ops! El paquete excede el limite de peso permitido");
		}

	}

}
