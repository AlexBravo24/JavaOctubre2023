package com.condicionales;

import java.util.Scanner;

public class Condicionales13_JRMM {

	public static void main(String[] args) {
		/*13. Una institución benéfica recibe anualmente una donación proveniente de Europa
		 * y lo reparte entre un centro de salud, un comedor de niños y una parte lo invierte
		 * en la bolsa de acuerdo a lo siguiente:
		 * Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud,
		 * 50% al comedor de niños y el resto se invierte en la bolsa.
		 * Si el monto de la donación es menor que $10000: 25% se destina al centro de salud,
		 * 60% al comedor de niños y el resto se invierte en la bolsa.
		 * La institución desea saber cuánto de dinero destinará a cada rubro anualmente.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		double donacion,centroS,comedor,inversionB;
		
		System.out.println("Inserte la cantidad donada: ");
		donacion = entrada.nextDouble();
		
		if(donacion >= 10000) {
			centroS = donacion * 0.30;
			comedor = donacion * 0.50;
			inversionB = donacion * 0.20;
			
			System.out.println("La donacion al Centro de Salud es de: $"+centroS);
			System.out.println("La donacion al Comedor de Niños es de: $"+comedor);
			System.out.println("La Inversion a la Bolsa es de: $"+inversionB);
			
		}else if(donacion < 10000) {
			centroS = donacion * 0.25;
			comedor = donacion * 0.60;
			inversionB = donacion * 0.15;
			
			System.out.println("La donacion al Centro de Salud es de: $"+centroS);
			System.out.println("La donacion al Comedor de Niños es de: $"+comedor);
			System.out.println("La Inversion a la Bolsa es de: $"+inversionB);
			
		}
		

	}

}
