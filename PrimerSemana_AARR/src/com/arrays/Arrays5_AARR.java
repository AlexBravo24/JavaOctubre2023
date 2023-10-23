package com.arrays;

import java.util.Scanner;

public class Arrays5_AARR {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int productos;
		
		System.out.println("cuantos productos quieres ingresar? ");
		productos=entrada.nextInt();
		
		int [] NProducto = new int[productos];
		int [] PProducto = new int[productos];
		
		System.out.println("ingrese los precios de los productos");
		
		for (int i = 0; i < NProducto.length; i++) {
			PProducto[i]=entrada.nextInt();
		}
		for (int i = 0; i < NProducto.length; i++) {
			System.out.println("el producto numero: "+(i+1)+" tiene un costo de: "+PProducto[i]);
		}
		
	}

}
