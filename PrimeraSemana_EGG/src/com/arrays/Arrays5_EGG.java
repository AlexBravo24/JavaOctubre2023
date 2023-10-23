package com.arrays;

public class Arrays5_EGG {

	public static void main(String[] args) {
		//  Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
		//  respectivos precios. Muestra en consola la lista de productos y sus precios. 
		// Por lo menos 5 productos o artículos.
		
		String [] productos = {"Lapiz", "Lapicero", "Goma", "Cuaderno", "Sacapuntas"};
		//double [] precios = {'4.50', '5.50', '8', '22.50', '4'};
		Object [] precios = {4.5, 5.5, 8, 22.5, 4};
		
		System.out.println("Artículos \t Precio");
		for (int i=0; (i < productos.length) && (i < precios.length); i++) {
			System.out.println(productos[i] + "   " + " \t " +precios[i]);
		}
		
		

	}

}
