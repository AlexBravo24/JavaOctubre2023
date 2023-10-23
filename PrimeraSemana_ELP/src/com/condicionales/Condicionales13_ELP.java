package com.condicionales;

import java.util.Scanner;

public class Condicionales13_ELP {

	public static void main(String[] args) {

		
//		13. Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un 
//		centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
//		Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños 
//		y el resto se invierte en la bolsa.
//		Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
//		niños y el resto se invierte en la bolsa.
//		La institución desea saber cuánto de dinero destinará a cada rubro anualmente
		
		Scanner leer = new Scanner(System.in);
		
		 System.out.print("Ingrese el monto de la donación: $");
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
	        System.out.println("Monto destinado al comedor de niños: $" + comedorNinos);
	        System.out.println("Monto destinado a la inversión en bolsa: $" + inversionBolsa);
	    }
	}

	