package com.arrays;

public class Arrays5_JJTJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * Crea dos arrays, uno para mostrar n productos y otro para mostrar sus respectivos precios. 
		 * Muestra en consola la lista de productos y sus precios. Por lo menos 5 productos o artículos.
		 * */
		String productos [] = {"Xbox", "Play5", "Iphone", "Lenovo", "Xiaomi"};
		double precios [] = {5000.00, 10000.00, 15000.00, 18000.00, 4000.00};
		
		for(int i=0; i < productos.length; i++){
			System.out.println(productos[i] + " : " + precios[i] + "$");
		}

	}

}
