package com.condicionales;

import java.util.Scanner;

public class Condicionales6_AARR {

	public static void main(String[] args) {
		
		float UvaA1, UvaB1,  UvaA2, UvaB2, Kg;
		int Tipo;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingresa el precio de la Uva tipo A tamaño 1");
		UvaA1 = entrada.nextFloat();
		
		System.out.println("ingresa el precio de la Uva tipo A tamaño 2");
		UvaA2 = entrada.nextFloat();
		
		System.out.println("ingresa el precio de la Uva tipo B tamaño 1");
		UvaB1 = entrada.nextFloat();
		
		System.out.println("ingresa el precio de la Uva tipo B tamaño 2");
		UvaB2 = entrada.nextFloat();
		
		UvaA1 = UvaA1 + 0.20f;
		UvaA2 = UvaA2 + 0.30f;
		UvaB1 = UvaB1 - 0.30f;
		UvaB2 = UvaB2 - 0.50f;
		
		System.out.println("que tipo de uva quieres? escribe 1 por Uva tipo A tamaño 1");
		System.out.println("escribe 2 por Uva tipo A tamaño 2");
		System.out.println("escribe 3 por Uva tipo B tamaño 1");
		System.out.println("escribe 4 por Uva tipo B tamaño 2");
		
		Tipo = entrada.nextInt();
		
		System.out.println("ingresa cuantos kilos necesita");
		Kg = entrada.nextFloat();
		
		
		switch(Tipo) {
		
		case 1: 
			System.out.println("el productor recibira: "+ (UvaA1 * Kg)+ " mxn");
			break;
		
		case 2: 
			System.out.println("el productor recibira: "+ (UvaA2 * Kg)+ " mxn");
			break;

		case 3: 
			System.out.println("el productor recibira: "+ (UvaB1 * Kg)+ " mxn");
			break;

		case 4: 
			System.out.println("el productor recibira: "+ (UvaB2 * Kg)+ " mxn");
			break;


	}

}
}