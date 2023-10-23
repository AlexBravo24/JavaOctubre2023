
//Una compa��a de transporte internacional tiene servicio en algunos pa�ses de Am�rica del Norte, Am�rica
//Central, Am�rica del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y
//la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:

//ZONA UBICACI�N                         COSTO/KG
//Am�rica del Norte                      24.00 euros
//Am�rica Central                        20.00 euros
//Am�rica del Sur                        21.00 euros
//Europa                                 10.00 euros
//Asia                                   18.00 euros

//Parte de su pol�tica implica que los paquetes con un peso superior a 5kg no son transportados, por
//cuestiones de log�stica y seguridad.
//Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo
//de la entrega.

package com.condicionales;

import java.util.Scanner;

public class Condicionales11_JAVD {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int z;
		double p,an=24,ac=20,as=21,e=10,a=18,c;
		System.out.println("Ingresa el peso del paquete");
		p=in.nextDouble();
		
		
		if(p<=5) {
			System.out.println("Selecciona la ubicaci�n a la que mandas el paquete:");
			System.out.println("1. Am�rica del Norte");
			System.out.println("2. Am�rica Central");
			System.out.println("3. Am�rica del Sur");
			System.out.println("4. Europa");
			System.out.println("5. Asia");
			z=in.nextInt();
			System.out.println("--------------COSTO--------------");
			switch (z) {
			case 1:
				c=p*an;
				System.out.println("El precio es de: "+c+" euros.");
				break;
			case 2:
				c=p*ac;
				System.out.println("El precio es de: "+c+" euros.");
				break;
			case 3:
				c=p*as;
				System.out.println("El precio es de: "+c+" euros.");
				break;
			case 4:
				c=p*e;
				System.out.println("El precio es de: "+c+" euros.");
				break;
			case 5:
				c=p*a;
				System.out.println("El precio es de: "+c+" euros.");
				break;
			default:
				break;
			}
		}
		else {
			System.out.println("Su paquete excede el peso permitido.");
		}

	}

}
