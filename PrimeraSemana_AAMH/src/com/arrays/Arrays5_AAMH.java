package com.arrays;

public class Arrays5_AAMH {

	public static void main(String[] args) {
		// 5. Crea dos arrays, uno para mostrar n productos 
		//y otro para mostrar sus respectivos precios.
		//Muestra en consola la lista de productos y sus precios.
		//Por lo menos 5 productos o art�culos.
		
		String productos [] = {"Zapatos","Corbata","Camisa","Pantal�n","Cintur�n"};
		double precios [] = {1199.99, 300, 899.99, 1500, 250};
		
		for(int i=0; i<productos.length; i++) {
			System.out.println(productos[i]+ " = "+ precios[i]);
		}

	}

}
