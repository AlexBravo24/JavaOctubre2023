package com.bucles;

import java.util.Scanner;

public class Bucles12_MASE {

	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        int sum = 0;
	        int count = 0;

	        while (true) {
	            System.out.print("Ingresa una edad (o un valor negativo para salir): ");
	            int edad = input.nextInt();

	            if (edad < 0) {
	                break;
	            }

	            sum += edad;
	            count++;
	            double promedio = (double) sum / count;

	            if (promedio == 25) {
	                System.out.println("El programa ha finalizado porque el promedio superó 25.");
	                break;
	            }
	        }

	        input.close();
	    }
	}
