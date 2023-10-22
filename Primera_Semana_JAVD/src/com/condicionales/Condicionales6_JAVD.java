
//La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se
//clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta
//es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que
//entrega en un embarque considerando lo siguiente:
//* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si
//es de tamaño 2.
//* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de
//tamaño 2.
//Precio inicial se recibe desde teclado

package com.condicionales;

import java.util.Scanner;

public class Condicionales6_JAVD {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
				
		int a1=20,a2=30,b1=30,b2=50, precio,pa1,pa2,pb1,pb2;
		int tipo;
		
		System.out.println("Ingresa 1 para escoger el tipo A.");
		System.out.println("Ingresa 2 para escoger el tipo B.");
		tipo=in.nextInt();
		System.out.println("Ingresa el precio inicial de la UVA: ");
		precio=in.nextInt();			
				
		switch (tipo) {
		case 1:
			pa1=precio+a1;
			pa2=precio+a2;
			System.out.println("El precio de la UVA A de tamaño 1 es de: " + pa1);
			System.out.println("El precio de la UVA A de tamaño 2 es de: " + pa2);
			break;
		case 2:
			pb1=precio-b1;
			pb2=precio-b2;
			System.out.println("El precio de la UVA B de tamaño 1 es de: " + pb1);
			System.out.println("El precio de la UVA B de tamaño 2 es de: " + pb2);
			break;		
		default:
			System.out.println("ERROR");
			break;
		}
		
	}

}
