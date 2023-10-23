package com.bucles;

import java.util.Scanner;

public class Bucles9_MASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese el primer número: ");
	        int numero1 = scanner.nextInt();

	        System.out.print("Ingrese el segundo número: ");
	        int numero2 = scanner.nextInt();

	        scanner.close();
	        

	        System.out.println("Números desde el menor hasta el mayor:");

	        for (int i =numero1; i <=numero2; i++) {
				
				if(i%2==0) {
				
				
				
	            System.out.print(i + " ");
				}
	        }
		}

}
