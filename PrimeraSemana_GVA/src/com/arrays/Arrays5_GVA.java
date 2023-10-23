package com.arrays;

public class Arrays5_GVA {

	public static void main(String[] args) {
		
		//5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus respectivos precios. 
		//Muestra en consola la lista de prodcutos y sus precios. Por lo menos 5 productos o artículos.
		
		
		String[] productos = {"Producto 1", "Producto 2", "Producto 3", "Producto 4", "Producto 5"};
        double[] precios = {10.00, 32.05, 7.49, 15.25, 3.25};

        System.out.println("Lista de Productos y Precios:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + ": $" + precios[i]);
        }
	}

}
