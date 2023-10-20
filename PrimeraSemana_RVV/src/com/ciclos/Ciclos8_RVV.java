package com.ciclos;

import java.util.Scanner;

public class Ciclos8_RVV {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingresa el primer número: ");
	        int a = scanner.nextInt();

	        System.out.print("Ingresa el segundo número: ");
	        int b = scanner.nextInt();

	        int menor = Math.min(a, b);
	        int mayor = Math.max(a, b);

	        System.out.println("Números desde el menor hasta el mayor:");

	        for (int c = menor; c <= mayor; c++) {
	            System.out.println(c);
	        }
	}

}
