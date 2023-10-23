package com.condicionales;

import java.util.Scanner;

public class Condicionales6_EGG {
	
	public static void main(String[] args) {
		/* La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se 
		 * clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta 
		 * es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que 
		 * entrega en un embarque considerando lo siguiente:
		 * * Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si  es de tamaño 2.
		 * * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de 
		 * tamaño 2.
		 * Precio inicial se recibe desde teclado
		 * 
		 */
		
		Scanner entrada =  new Scanner(System.in);
		
		float precio;
		System.out.println("Introduce el precio:");
		precio = entrada.nextFloat();
		System.out.println("Precio clasificado:");
		System.out.println("Clase A Tamaño 1: " + (precio+0.20));
		System.out.println("Clase A Tamaño 2: " + (precio+0.30));
		System.out.println("Clase B Tamaño 1: " + (precio-0.30));
		System.out.println("Clase B Tamaño 2: " + (precio-0.50));
		
		
	}
}
 