package com.condicionales;

import java.util.Scanner;

public class Condicionales13_EGG {

	public static void main(String[] args) {
		//Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un 
		//centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
		//Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños 
		//y el resto se invierte en la bolsa.
		//Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
		//niños y el resto se invierte en la bolsa.
		//La institución desea saber cuánto de dinero destinará a cada rubro anualmente.
		
		Scanner entrada = new Scanner(System.in);
		
		double centroS, comedor, bolsa;
		System.out.println("Monto de donación");
		int dona = entrada.nextInt();
		
		if (dona >= 10000) {
			centroS = (dona*0.30);
			comedor = (dona*0.50);
			bolsa = (dona*0.20);
			System.out.println("El monto anual destinado a cada rubro es:");
			System.out.println("Centro de Salud: " + centroS);
			System.out.println("Comedor de Niños: " + comedor);
			System.out.println("Invertido en Bolsa: " + bolsa);
		}else if (dona < 10000) {
			centroS = dona*0.25;
			comedor = dona*0.60;
			bolsa = dona*0.15;
			System.out.println("El monto anual destinado a cada rubro es:");
			System.out.println("Centro de Salud: " + centroS);
			System.out.println("Comedor de Niños: " + comedor);
			System.out.println("Invertido en Bolsa: " + bolsa);
		}
	}

}
