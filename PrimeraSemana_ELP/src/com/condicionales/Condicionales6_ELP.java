package com.condicionales;

import java.util.Scanner;

public class Condicionales6_ELP {

	public static void main(String[] args) {

//		6. La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se 
//		clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta 
//		es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que 
//		entrega en un embarque considerando lo siguiente:
//		* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si 
//		es de tama�o 2.
//		* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de 
//		tama�o 2.
//		Precio inicial se recibe desde teclado	
		
		Scanner leer = new Scanner(System.in);

		String tipo;
		int tama�o;
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
		tama�o = leer.nextInt();
		
		if(tipo=="A" || tipo=="B" && tama�o==1 || tama�o==2) {
			  System.out.println("Tipo o tama�o incorrecto,  vuelva a introducir los valores.");
	    } else {
	      if (tipo=="A" && tama�o == 1) {
	        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)+(kilos*0.20)));
	      } else if (tipo=="A" && tama�o == 2) {
	        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)+(kilos*0.30)));
	      } else if (tipo=="B" && tama�o == 1) {
	        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)-(kilos*0.30)));
	      } else if (tipo=="B" && tama�o == 2) {
	        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)-(kilos*0.50)));
		}
		
	}
	}}
