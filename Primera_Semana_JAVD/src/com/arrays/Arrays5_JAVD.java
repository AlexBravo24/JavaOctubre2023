
//Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
//respectivos precios. Muestra en consola la lista de productos y sus precios.
//Por lo menos 5 productos o artículos.

package com.arrays;

public class Arrays5_JAVD {

	public static void main(String[] args) {
		
		String [] productos = {"USB","Celular","CPU","Xbox","Play5"};
		int [] precios = {50,5000,1200,10000,9000};
		
		System.out.println("---TABLA DE PRODUCTOS---");
		for(int i = 0; i<precios.length;i++) {
			System.out.println();
			System.out.println(productos[i]+"    $"+precios[i]);
		}

	}

}
