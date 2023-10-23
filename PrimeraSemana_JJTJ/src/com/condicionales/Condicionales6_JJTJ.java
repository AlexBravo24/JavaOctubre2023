package com.condicionales;

import java.util.Scanner;

public class Condicionales6_JJTJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (A y B)
		 * , y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, 
		 * se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque considerando lo siguiente: *
		 *  Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de tamaño 2. * 
		 * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2. Precio inicial se recibe desde teclado
		 * 
	
		 * */
		Scanner entrada = new Scanner(System.in);
		int precio;
		int venta;
		int tamano;
		int total;
		char tipo;
		System.out.println("introduzca el precion inicial");
         precio=entrada.nextInt();
         System.out.println("introduzca cuantos kilos vendio o desea vender");
         venta=entrada.nextInt();
         System.out.println("introduzca el tamaño de la uva (1 0 2)");
         tamano=entrada.nextInt();
         System.out.println("introduzca el Tipo de Uva (A o B)");
         tipo=entrada.next().charAt(0);
         total = (venta*precio);
         if(tipo=='A' && tamano==1) {
        	 System.out.println("Usted recibira: " + ((total)+(venta*.20)) + "pesos");
         }else if(tipo=='A' && tamano==2) {
        	 System.out.println("Usted recibira: " + ((total)+(venta*.30)) + "pesos");
         }else if(tipo=='B' && tamano==1) {
        	 System.out.println("Usted recibira: " + ((total)-(venta*.30)) + "pesos"); 
         }else if(tipo=='B' && tamano==2) {
        	 System.out.println("Usted recibira: " + ((total)-(venta*.50)) + "pesos"); 
         }
         
	}

}
