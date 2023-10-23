package com.condicionales;

import java.util.Scanner;

public class Condicionales13_AARR {

	public static void main(String[] args) {
		
		float Valor, CSalud, Comedor, IBolsa;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa la donación que quieres realizar");
		Valor = entrada.nextFloat();
		
		if(Valor > 9999) {
			CSalud = (float) (Valor *.30); Comedor = (float) (Valor * .50); IBolsa = (float) (Valor * .20);
			System.out.println("Tu donación es de: "+ Valor + "\nDinero destinado al centro de salud: "+ CSalud + "\nDinero destinado al Comedor: "
					+ Comedor + "\nDinero invertido en Bolsa: "+ IBolsa);
		}else {
			CSalud = (float) (Valor *.25); Comedor = (float) (Valor * .60); IBolsa = (float) (Valor * .15);
			System.out.println("Tu donación es de: "+ Valor + "\nDinero destinado al centro de salud: "+ CSalud + "\nDinero destinado al Comedor: "
					+ Comedor + "\nDinero invertido en Bolsa: "+ IBolsa);
		}
	}

}
