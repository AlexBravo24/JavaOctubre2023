package com.condicionales;

import java.util.Scanner;

public class Condicionales13_EGG {

	public static void main(String[] args) {
		//Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un 
		//centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
		//Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os 
		//y el resto se invierte en la bolsa.
		//Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
		//ni�os y el resto se invierte en la bolsa.
		//La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente.
		
		Scanner entrada = new Scanner(System.in);
		
		double centroS, comedor, bolsa;
		System.out.println("Monto de donaci�n");
		int dona = entrada.nextInt();
		
		if (dona >= 10000) {
			centroS = (dona*0.30);
			comedor = (dona*0.50);
			bolsa = (dona*0.20);
			System.out.println("El monto anual destinado a cada rubro es:");
			System.out.println("Centro de Salud: " + centroS);
			System.out.println("Comedor de Ni�os: " + comedor);
			System.out.println("Invertido en Bolsa: " + bolsa);
		}else if (dona < 10000) {
			centroS = dona*0.25;
			comedor = dona*0.60;
			bolsa = dona*0.15;
			System.out.println("El monto anual destinado a cada rubro es:");
			System.out.println("Centro de Salud: " + centroS);
			System.out.println("Comedor de Ni�os: " + comedor);
			System.out.println("Invertido en Bolsa: " + bolsa);
		}
	}

}
