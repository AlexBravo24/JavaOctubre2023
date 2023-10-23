package com.condicionales;

import java.util.Scanner;

public class Condicionales12_GVA {

	public static void main(String[] args) {
		//12. 2.Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 
		//[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
		
		Scanner entrada = new Scanner(System.in);
		double peso, altura, indiceMC;
		
		System.out.println("Ingrese el peso en kilogramos: ");
		peso = entrada.nextDouble();
		
		System.out.println("Ingrese la altura en metros: ");
		altura = entrada.nextDouble();
		
		indiceMC = peso/(altura*altura);
		System.out.println("El índice de masa corporal del usuario es de " + indiceMC);
		
		if (indiceMC < 16) {
			System.out.println("El usuario tiene criterio de ingreso al hospital");
		} else if (indiceMC >= 16 && indiceMC <= 17) {
			System.out.println("El usuario tiene infrapeso");
		} else if (indiceMC >= 17 && indiceMC <= 18 ) {
			System.out.println("El usuario tiene bajo peso");
		} else if (indiceMC >= 18 && indiceMC <= 25) {
			System.out.println("El usuario tiene peso normal (saludable)");
		} else if (indiceMC >= 25 && indiceMC <= 30) {
			System.out.println("El usuario tiene sobrepeso (obesidad de grado I)");
		} else if (indiceMC >= 30 && indiceMC <= 35) {
			System.out.println("El usuario tiene sobrepeso crónico (obesidad de grado II)");
		} else if (indiceMC >= 35 && indiceMC <= 40) {
			System.out.println("El usuario tiene obesidad premórbida (obesidad de grado III)");
		} else {
			System.out.println("El usuario tiene obesidad mórbida (obesidad de grado IV)");
		}
		
		entrada.close();
	}

}
