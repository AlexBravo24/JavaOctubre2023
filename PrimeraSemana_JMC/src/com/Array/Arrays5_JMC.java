package com.Array;

public class Arrays5_JMC {

	public static void main(String[] args) {
		String[] Articulos = {"Plancha","Estereo","Television","Estufa","Refrigerador"};
        int[] Precios = {800,200,5000,7000,9000};
        
        
        for (int i = 0; i < Precios.length; i++) {
			System.out.println("El articulo "+Articulos[i]+" tiene un precio de $"+Precios[i]);
		}
        
	}

}
