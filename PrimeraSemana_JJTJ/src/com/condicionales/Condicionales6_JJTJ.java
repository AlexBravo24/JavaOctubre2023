package com.condicionales;

import java.util.Scanner;

public class Condicionales6_JJTJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (A y B)
		 * , y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, 
		 * se requiere determinar cu�nto recibir� un productor por la uva que entrega en un embarque considerando lo siguiente: *
		 *  Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de tama�o 2. * 
		 * Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de tama�o 2. Precio inicial se recibe desde teclado
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
         System.out.println("introduzca el tama�o de la uva (1 0 2)");
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
