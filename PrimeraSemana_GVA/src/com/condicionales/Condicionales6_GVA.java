package com.condicionales;

import java.util.Scanner;

public class Condicionales6_GVA {

	public static void main(String[] args) {
		
		/*6. La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva,
		 * la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2).
		 * Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o,
		 * se requiere determinar cu�nto recibir� un productor por la uva que entrega en un embarque considerando lo siguiente:
		 * Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de tama�o 2.
		 * Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de tama�o 2.
		 * Precio inicial se recibe desde teclado 
		 */ 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el precio inicial del kilo de uva");
		double precioI = entrada.nextDouble();
		
		
		System.out.println("Ingrese el tipo de uva (A o B): ");
		char tipo = entrada.next().charAt(0);
		
		System.out.println("Ingrese el tama�o de la uva (1 o 2): ");
		int tama�o = entrada.nextInt();
		
		double precioF = 0.0;
		
		if (tipo == 'A') {
			if (tama�o == 1) {
				precioF = precioI + 0.20;
			} else if (tama�o == 2) {
				precioF = precioI + 0.30;
			}
		} else if (tipo == 'B') {
			if (tama�o == 1) {
				precioF = precioI - 0.30;
			} else if (tama�o == 2) {
				precioF = precioI - 0.50;
			}
		} else {
			System.out.println("Tipo de uva debe ser 'A' o 'B' " );
		}
		System.out.println("El precio final es: " + precioF);

		entrada.close();
	}

}
