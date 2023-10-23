package com.condicionales;

import java.util.Scanner;

public class Condicionales6_ECGH {

	public static void main(String[] args) {
		// 6. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, 
//		la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, 
//		ésta es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que entrega
//		en un embarque considerando lo siguiente: 
//		* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando 
//		es de tamaño 1 y 30 céntimos si es de tamaño 2. 
//		* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2. 
//		Precio inicial se recibe desde teclado
		Scanner entrada=new Scanner (System.in);
		
		double inicial;
		
		System.out.println("Introduce el precio inicial");
		inicial=entrada.nextInt();
		
		System.out.println("Tipo A Tamaño 1: "+(inicial+0.20));
		
		System.out.println("Tipo A Tamaño 2: "+(inicial+0.30));
		
		System.out.println("Tipo B Tamaño 1: "+(inicial-0.30));
		
		System.out.println("Tipo B Tamaño 2: "+(inicial-0.50));
		

	}

}
