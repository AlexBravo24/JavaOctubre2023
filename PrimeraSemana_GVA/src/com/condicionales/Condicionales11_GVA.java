package com.condicionales;

import java.util.Scanner;

public class Condicionales11_GVA {

	public static void main(String[] args) {
		//11. Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América 
		//Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y 
		//la zona a la que va dirigida.
		//Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por 
		//cuestiones de logística y seguridad.
		//Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo 
		//de la entrega.
		
		Scanner entrada = new Scanner(System.in);
		int zona;
		
		System.out.println("Ingrese la zona de destino (1 al 5) ");
		zona = entrada.nextInt();
		
		if (zona < 1 || zona > 5) {
			System.out.println("Zona de destino no válida ");
		}
		
		System.out.println("Ingrese el peso del paquete en kilogramos: ");
		double peso = entrada.nextDouble();
		
		if (peso > 5) {
			System.out.println("El paquete no puede ser transportado debido a su peso ");
		}
		
		double costoPorKilo = 0.0;
		
		switch (zona) {
		case 1:
			costoPorKilo = 24.00;
			break;
		case 2:
			costoPorKilo = 20.00;
			break;
		case 3:
			costoPorKilo = 21.00;
			break;
		case 4:
			costoPorKilo = 10.00;
			break;
		case 5:
			costoPorKilo = 18.00;
			break;
		}
		
		double costoTotal = peso * costoPorKilo;
		System.out.println("El costo total del envío es: " + costoTotal + " euros");
		
		entrada.close();
	}

}
