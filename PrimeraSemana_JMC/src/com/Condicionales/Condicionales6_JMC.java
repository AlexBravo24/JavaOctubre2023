package com.Condicionales;

import java.util.Scanner;

public class Condicionales6_JMC {

	public static void main(String[] args) {
//		La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se 
//		clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta 
//		es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que 
//		entrega en un embarque considerando lo siguiente:
//		* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si 
//		es de tamaño 2.
//		* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de 
//		tamaño 2.
//		Precio inicial se recibe desde teclado
	
		Scanner entrada6 = new Scanner(System.in);
        float kilo;
        int tamaño;
        char tipo;
        
        System.out.println("Introduce el valor del kilo");
        kilo = entrada6.nextFloat();
        System.out.println("Introduce el tipo de uva(A) o (B)");
        tipo = entrada6.next().charAt(0);
        System.out.println("Introduce el tamaño de la una (1) (2)");
        tamaño = entrada6.nextInt();

        if(tipo=='A' && tamaño==1) {
        	System.out.println("el productor recibira"+(kilo+0.20));
        }
        else if(tipo=='A' && tamaño==2) {
        	System.out.println("el productor recibira"+(kilo+0.30));
        }
        else if(tipo=='B' && tamaño==1) {
        	System.out.println("el productor recibira"+(kilo-0.30));
        }
        else {
        	System.out.println("el productor recibira"+(kilo-0.50));
        }
	}
	
	

}
