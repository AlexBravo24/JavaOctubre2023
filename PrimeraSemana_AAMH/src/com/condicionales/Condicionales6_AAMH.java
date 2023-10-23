package com.condicionales;

import java.util.Scanner;

public class Condicionales6_AAMH {

	public static void main(String[] args) {
		// 6. La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva,
		//la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2).
		//Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o,
		//se requiere determinar cu�nto recibir� un productor por la uva que entrega en un embarque considerando lo siguiente:
		//*Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de tama�o 2. 
		//* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de tama�o 2.
		//Precio inicial se recibe desde teclado

		
		//DECLARACI�N DE VARIABLES
		Scanner precio = new Scanner (System.in);
		int kilos;
		double precioInicial;
		String tipo;
		int tama�o;
		
		//REQUERIMIENTOS DEL USUARIO
		
		System.out.println("Obtener el precio del vino de acuerdo al TIPO, TAMA�O y CANTIDAD VENDIDA");
		System.out.print("Introducir los kilogramos de uva entregada: ");
		kilos = precio.nextInt();
		System.out.print("Precio por kilogramos inicial: ");
		precioInicial = precio.nextDouble();
		System.out.print("Uva de valor \"A\" � \"B\":");
		tipo = precio.next(); precio.nextLine();
		System.out.print("Uva de valor \"1\" � \"2\":");
		tama�o = precio.nextInt();
		
		//Realizar calculos y mostrar en pantalla
		if (!((tipo.toUpperCase() .equals("A") || tipo.toUpperCase() .equals("B")) && (tama�o == 1 || tama�o == 2))) {
		System.out.println("Tipo o Tama�o incorrecto, vualva a introducir los valores.");
		
	}else {
		if (tipo.toUpperCase() .equals("A") && tama�o ==1) {
			System.out.println("La ganancia final es de: " + ((kilos * precioInicial)+(kilos*0.20)));
		}else if (tipo.toUpperCase().equals("A") && tama�o == 2) {
	        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)+(kilos*0.30)));
	      } else if (tipo.toUpperCase().equals("B") && tama�o == 1) {
	        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)-(kilos*0.30)));
	      } else if (tipo.toUpperCase().equals("B") && tama�o == 2) {
	        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)-(kilos*0.50)));
	
	}
	}
	}
}




