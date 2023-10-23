package com.ciclos;

import java.util.Scanner;

public class Ciclos12_ELP {

	public static void main(String[] args) {
		/*
	 	12.Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara 
		cuando el promedio de las edades sea superior a 25
		 */
		
		  Scanner leer = new Scanner(System.in);
	        int totalEdades = 0;
	        int cantidadEdades = 0;

	        while (true) {
	            System.out.print("Ingresa una edad (o ingresa un número negativo para finalizar): ");
	            int edad = leer.nextInt();

	            if (edad < 0) {
	                break;
	            }

	            totalEdades += edad;
	            cantidadEdades++;
	        }

	        if (cantidadEdades > 0) {
	            double promedio = (double) totalEdades / cantidadEdades;
	            System.out.println("El promedio de las edades es: " + promedio);
	            if (promedio > 25) {
	                System.out.println("El programa se detiene, el promedio es superior a 25.");
	            }
	        } else {
	            System.out.println("No se ingresaron edades.");
	        }

	        leer.close();
	    }
	}
	
