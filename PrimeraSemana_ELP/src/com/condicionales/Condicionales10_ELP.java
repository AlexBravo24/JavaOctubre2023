package com.condicionales;

import java.util.Scanner;

public class Condicionales10_ELP {

	public static void main(String[] args) {

		//10.Realiza un programa que pida un número entero entre uno y doce
		//e imprima el número de días que tiene el mes correspondiente.
		
		Scanner leer = new Scanner(System.in);
		
		int mes;
		int numeroDias;
		
		 System.out.print("Ingresa un número entre 1 y 12: ");
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

	            System.out.println("El mes " + mes + " tiene " + numeroDias + " días.");
	        } else {
	            System.out.println("Número fuera de rango. Debe ser entre 1 y 12.");
	        }
	    }
	}
	