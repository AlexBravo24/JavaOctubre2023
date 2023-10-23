package com.condicionales;

import java.util.Scanner;

public class Condicionales10_ELP {

	public static void main(String[] args) {

		//10.Realiza un programa que pida un n�mero entero entre uno y doce
		//e imprima el n�mero de d�as que tiene el mes correspondiente.
		
		Scanner leer = new Scanner(System.in);
		
		int mes;
		int numeroDias;
		
		 System.out.print("Ingresa un n�mero entre 1 y 12: ");
	        mes = leer.nextInt();
	        
	        if (mes >= 1 && mes <= 12) {
	            
	            switch (mes) {
	                case 2:
	                    numeroDias = 28; 
	                    break;
	                case 4: case 6: case 9: case 11: 
	                    numeroDias = 30;
	                    break;
	                default:
	                    numeroDias = 31; 
	                    break;
	            }

	            System.out.println("El mes " + mes + " tiene " + numeroDias + " d�as.");
	        } else {
	            System.out.println("N�mero fuera de rango. Debe ser entre 1 y 12.");
	        }
	    }
	}
	