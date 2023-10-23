package com.condicionales;

import java.util.Scanner;

public class Condicionales6_ELP {

	public static void main(String[] args) {

//		6. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se 
//		clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta 
//		es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que 
//		entrega en un embarque considerando lo siguiente:
//		* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si 
//		es de tamaño 2.
//		* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de 
//		tamaño 2.
//		Precio inicial se recibe desde teclado	
		
		Scanner leer = new Scanner(System.in);

		String tipo;
		int tamaño;
		double precioInicial;
		int kilos;
		
		System.out.println("**************ASOCIACION DE VINICULTORES****************");
		System.out.println("INTRODUCE LOS KG. DE UVAS: ");
		kilos = leer.nextInt();
		
		System.out.println("PRECIO POR LOS KG. DE UVAS");
		precioInicial = leer.nextDouble();
		
		System.out.println("UVA DE VALOR: A O B");
		tipo = leer.next().toUpperCase();
		
		System.out.println("TIPO DE UVA: 1 O 2");
		tamaño = leer.nextInt();
		
		if(tipo=="A" || tipo=="B" && tamaño==1 || tamaño==2) {
			  System.out.println("Tipo o tamaño incorrecto,  vuelva a introducir los valores.");
	    } else {
	      if (tipo=="A" && tamaño == 1) {
	        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)+(kilos*0.20)));
	      } else if (tipo=="A" && tamaño == 2) {
	        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)+(kilos*0.30)));
	      } else if (tipo=="B" && tamaño == 1) {
	        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)-(kilos*0.30)));
	      } else if (tipo=="B" && tamaño == 2) {
	        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)-(kilos*0.50)));
		}
		
	}
	}}
