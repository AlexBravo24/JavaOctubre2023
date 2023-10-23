
//La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se
//clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta
//es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que
//entrega en un embarque considerando lo siguiente:
//* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si
//es de tama�o 2.
//* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de
//tama�o 2.
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
			System.out.println("El precio de la UVA A de tama�o 1 es de: " + pa1);
			System.out.println("El precio de la UVA A de tama�o 2 es de: " + pa2);
			break;
		case 2:
			pb1=precio-b1;
			pb2=precio-b2;
			System.out.println("El precio de la UVA B de tama�o 1 es de: " + pb1);
			System.out.println("El precio de la UVA B de tama�o 2 es de: " + pb2);
			break;		
		default:
			System.out.println("ERROR");
			break;
		}
		
	}

}
