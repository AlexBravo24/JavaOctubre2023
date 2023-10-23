package com.ciclos;

import java.util.Scanner;

public class Ciclo12_AARR {

		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			int edad, promedio = 0, contador = 1;
			
			System.out.println("ingrese edades hasta llegar a un promedio superior a 25");
			
			
			while(promedio<25) {
				
				System.out.println("ingrese la edad");
				edad = entrada.nextInt();
				promedio = promedio+edad;
				promedio = promedio/contador;
				contador++;
			}
		}
}
