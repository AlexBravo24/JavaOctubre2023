package com.condicionales;

import java.util.Scanner;

public class Condicionales10_MASE {

	public static void main(String[] args) {
		// 10.Realiza un programa que pida un n�mero entero entre uno y doce e imprima el n�mero de d�as que tiene el 
		//mes correspondiente.
		
		Scanner entrada = new Scanner(System.in);
		
		 int mes;
		//
		    System.out.println("Ingresa el mes con numero : ");
		    mes = entrada.nextInt();
		// 
		    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
		      System.out.println("El mes seleccionado tiene 31 d�as");
		    } else if (mes ==2){
		      System.out.println("Febrero tiene 28 d�as");
		    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
		      System.out.println("El mes seleccionado tiene 30 d�as");
		    } else {
		      System.out.println("Error, el mes debe estar entre 1-12.");
		    } 
	}

}
