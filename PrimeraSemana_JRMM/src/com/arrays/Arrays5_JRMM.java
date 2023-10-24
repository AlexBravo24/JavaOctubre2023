package com.arrays;

public class Arrays5_JRMM {

	public static void main(String[] args) {
		
		// 5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
		//respectivos precios. Muestra en consola la lista de productos y sus precios.
		//Por lo menos 5 productos o artículos.
		
		String [] productos = {"Sabrita", "Cremax", "Maruchan", "Mantecadas", "Negrito"};
		double [] precios = {18, 22, 25, 23, 18};
		System.out.println("Productos               Precio");
		for(int i=0; i<productos.length;i++) {
			System.out.println(productos[i] + "                  " + "$"+ precios[i]);
			
			}
//		for (int j = 0; j < precios.length; j++) {
//			System.out.println(precios[j]);
//		}

	}

}
