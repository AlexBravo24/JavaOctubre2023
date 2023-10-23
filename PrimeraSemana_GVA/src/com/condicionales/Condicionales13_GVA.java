package com.condicionales;

import java.util.Scanner;

public class Condicionales13_GVA {

	public static void main(String[] args) {
		
		//13. Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un 
		//centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
		//Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os 
		//y el resto se invierte en la bolsa. Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
		//ni�os y el resto se invierte en la bolsa.
		//La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente.

		Scanner entrada = new Scanner(System.in);
		double montoRecibido, centroDeSalud, comedor, inversion;
		
		System.out.println("Ingrese el monto recibido anualmente: ");
		montoRecibido = entrada.nextDouble();
		
		
		if (montoRecibido >= 10000) {
			centroDeSalud = montoRecibido*0.30;
			comedor = montoRecibido*0.50;
			inversion = montoRecibido*0.20;
			System.out.println("El monto que corresponde al centro de salud es: " + centroDeSalud + ", el monto para el comedor es de: " + comedor + " y el monto que se invierte en la bolsa es de: " + inversion);
		} else {
			centroDeSalud = montoRecibido*0.25;
			comedor = montoRecibido*0.60;
			inversion = montoRecibido*0.15;
			System.out.println("El monto que corresponde al centro de salud es: " + centroDeSalud + ", el monto para el comedor es de: " + comedor + " y el monto que se invierte en la bolsa es de: " + inversion);
		}
		entrada.close();
	}

}
