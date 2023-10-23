package com.arrays;

import java.util.Scanner;

public class Arrays5_ECGH {

	public static void main(String[] args) {
		// 5. Crea dos arrays, uno para mostrar n productos 
		//y otro para mostrar sus respectivos precios. 
		//Muestra en consola la lista de productos y sus precios.
		//Por lo menos 5 productos o artículos.
		
	//	int[] precio= {100,20,80,150,600};
	//	String [] producto= {"Producto 1","Producto 2","Producto 3","Producto 4","Producto 5"};
		int n;
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("Numero de productos?");
		n=input.nextInt();
		
		int[] precio=new int[n];
		String [] producto=new String[n];
		
		
		for (int i = 0; i < producto.length; i++) {
			System.out.println("Introduce el nombre del producto");
			input.nextLine();
			producto[i]=input.nextLine();
			System.out.println("Introduce el precio del producto");
			precio[i]=input.nextInt();
		}
		
		
		for (int i = 0; i < producto.length; i++) {
			System.out.println("El precio del "+producto[i]+" es de $"+precio[i]);
		}

	}

}
