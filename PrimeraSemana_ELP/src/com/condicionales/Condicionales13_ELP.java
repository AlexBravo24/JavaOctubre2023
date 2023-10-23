package com.condicionales;

import java.util.Scanner;

public class Condicionales13_ELP {

	public static void main(String[] args) {

		
//		13. Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un 
//		centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
//		Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os 
//		y el resto se invierte en la bolsa.
//		Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
//		ni�os y el resto se invierte en la bolsa.
//		La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente
		
		Scanner leer = new Scanner(System.in);
		
		 System.out.print("Ingrese el monto de la donaci�n: $");
	        double montoDonacion = leer.nextDouble();

	        double centroSalud, comedorNinos, inversionBolsa;

	        if (montoDonacion >= 10000) {
	            centroSalud = montoDonacion * 0.30;
	            comedorNinos = montoDonacion * 0.50;
	            inversionBolsa = montoDonacion * 0.20;
	        } else {
	            centroSalud = montoDonacion * 0.25;
	            comedorNinos = montoDonacion * 0.60;
	            inversionBolsa = montoDonacion * 0.15;
	        }

	        System.out.println("Monto destinado al centro de salud: $" + centroSalud);
	        System.out.println("Monto destinado al comedor de ni�os: $" + comedorNinos);
	        System.out.println("Monto destinado a la inversi�n en bolsa: $" + inversionBolsa);
	    }
	}

	