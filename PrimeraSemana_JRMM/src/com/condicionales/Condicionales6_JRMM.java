package com.condicionales;

import java.util.Scanner;

public class Condicionales6_JRMM {

	public static void main(String[] args) {
		
		/* 6. La asociaci�n de vinicultores tiene como pol�tica fijar un precio
		 *inicial al kilo de uva, la cual se clasifica en tipos (A y B), y 
		 *adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta
		 *es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir�
		 * un productor por la uva que entrega en un embarque considerando lo siguiente:
		 * Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o
		 * 1 y 30 c�ntimos si es de tama�o 2. 
		 * Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1,
		 *  y 50 c�ntimos cuando es de tama�o 2.
		 *  Precio inicial se recibe desde teclado
		*/
		
		Scanner entrada = new Scanner(System.in);
		
		double precio, tama�o = 2, total, kgvendidos=1;
		String tipo="a";
		
		System.out.println("Ingrese el precio por cada kilo de uva: ");
		precio = entrada.nextInt();

		if(tipo.equalsIgnoreCase("a")){
			if(tama�o == 1) {
				precio = precio + 0.20;
				total = kgvendidos * precio;
				System.out.println("El total es: $" + total);
			}else if(tama�o == 2) {
				precio = precio + 0.30;
				total = kgvendidos * precio;
				System.out.println("El total es: $" + total);
			}
		}else if(tipo.equalsIgnoreCase("B")){
			if(tama�o == 1) {
				precio = precio - 0.30;
				total = kgvendidos * precio;
				System.out.println("El total es: $" + total);
			}else if(tama�o == 2) {
				precio = precio - 0.50;
				total = kgvendidos * precio;
				System.out.println("El total es: $" + total);
			}
		
	}else {
		System.out.println("ERROR:  XX ");
	}

}
}
