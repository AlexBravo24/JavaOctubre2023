package com.arrays;

import java.util.Scanner;

public class Arrays1_AARR {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int [] numero = new int [10];
			System.out.println("ingrese los 10 valores para el arreglo");
			for (int i = 0; i < numero.length; i++) {
				System.out.println("ingrese el numero del indice: "+i);
				numero[i]=entrada.nextInt();
			}
			for (int i = 0; i < numero.length; i++) {
				System.out.println("el numero del indice "+i+" es: "+numero[i]);
			}
		}

}
