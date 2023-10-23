package com.condicionales;

import java.util.Scanner;

public class Condicionales6_AAMH {

	public static void main(String[] args) {
		// 6. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva,
		//la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2).
		//Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño,
		//se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque considerando lo siguiente:
		//*Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de tamaño 2. 
		//* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.
		//Precio inicial se recibe desde teclado

		
		//DECLARACIÓN DE VARIABLES
		Scanner precio = new Scanner (System.in);
		int kilos;
		double precioInicial;
		String tipo;
		int tamaño;
		
		//REQUERIMIENTOS DEL USUARIO
		
		System.out.println("Obtener el precio del vino de acuerdo al TIPO, TAMAÑO y CANTIDAD VENDIDA");
		System.out.print("Introducir los kilogramos de uva entregada: ");
		kilos = precio.nextInt();
		System.out.print("Precio por kilogramos inicial: ");
		precioInicial = precio.nextDouble();
		System.out.print("Uva de valor \"A\" ó \"B\":");
		tipo = precio.next(); precio.nextLine();
		System.out.print("Uva de valor \"1\" ó \"2\":");
		tamaño = precio.nextInt();
		
		//Realizar calculos y mostrar en pantalla
		if (!((tipo.toUpperCase() .equals("A") || tipo.toUpperCase() .equals("B")) && (tamaño == 1 || tamaño == 2))) {
		System.out.println("Tipo o Tamaño incorrecto, vualva a introducir los valores.");
		
	}else {
		if (tipo.toUpperCase() .equals("A") && tamaño ==1) {
			System.out.println("La ganancia final es de: " + ((kilos * precioInicial)+(kilos*0.20)));
		}else if (tipo.toUpperCase().equals("A") && tamaño == 2) {
	        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)+(kilos*0.30)));
	      } else if (tipo.toUpperCase().equals("B") && tamaño == 1) {
	        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)-(kilos*0.30)));
	      } else if (tipo.toUpperCase().equals("B") && tamaño == 2) {
	        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)-(kilos*0.50)));
	
	}
	}
	}
}




