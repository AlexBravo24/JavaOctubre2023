package com.Condicionales;

import java.util.Scanner;

public class Condicionales6_JMC {

	public static void main(String[] args) {
//		La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se 
//		clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta 
//		es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que 
//		entrega en un embarque considerando lo siguiente:
//		* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si 
//		es de tama�o 2.
//		* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de 
//		tama�o 2.
//		Precio inicial se recibe desde teclado
	
		Scanner entrada6 = new Scanner(System.in);
        float kilo;
        int tama�o;
        char tipo;
        
        System.out.println("Introduce el valor del kilo");
        kilo = entrada6.nextFloat();
        System.out.println("Introduce el tipo de uva(A) o (B)");
        tipo = entrada6.next().charAt(0);
        System.out.println("Introduce el tama�o de la una (1) (2)");
        tama�o = entrada6.nextInt();

        if(tipo=='A' && tama�o==1) {
        	System.out.println("el productor recibira"+(kilo+0.20));
        }
        else if(tipo=='A' && tama�o==2) {
        	System.out.println("el productor recibira"+(kilo+0.30));
        }
        else if(tipo=='B' && tama�o==1) {
        	System.out.println("el productor recibira"+(kilo-0.30));
        }
        else {
        	System.out.println("el productor recibira"+(kilo-0.50));
        }
	}
	
	

}
