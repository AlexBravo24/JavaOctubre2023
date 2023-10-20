package com.arrays;

public class Arrays5_RVV {

	public static void main(String[] args) {
		 String[] productos = {
		            "Kilo de huevo",
		            "leche",
		            "cuernito",
		            "coca",
		            "tortillas"
		        };
		        double[] precios = {
		            71.00,
		            25.50,
		            07.50,
		            17.00,
		            15.00
		        };

		        System.out.println("Lista de Productos y Precios:");
		        for (int i = 0; i < productos.length; i++) {
		            System.out.println(productos[i] + ": $" + precios[i]);
		        }
	}

}
