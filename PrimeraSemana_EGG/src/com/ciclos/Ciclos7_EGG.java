package com.ciclos;

import java.util.Scanner;

public class Ciclos7_EGG {

	public static void main(String[] args) {
		// Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés 
		// mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su 
		// dinero?
		Scanner entrada = new Scanner(System.in);
		
		double inversion = 1000, interes = 0.02;
		int c = 0;
		System.out.println("Cantidad que le gustaria obtener:");
		double g = entrada.nextDouble();
		while (inversion < g) {
			inversion += inversion * interes;
			c++;
		}
		
		System.out.println("Te tomara invertir " + c + " meses tu dinero");
		
	}

}
