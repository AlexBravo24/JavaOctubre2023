package com.condicionales;

import java.util.Scanner;

public class Condicionales12_EGG {

	public static void main(String[] args) {
		// Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura^2 
		//[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
		/* Valor de IMC      Diagnostico
		 * <16			Criterio de ingreso en hospital
		 * de 16 a 17	Infrapeso
		 * de 17 a 18	Bajo peso
		 * de 18 a 25	Peso normal (saludable)
		 * de 25 a 30	sobrepeso(Obesidad de Grado I)
		 * de 30 a 35	Sobrepeso crónico (Obesidad de Grado II)
		 * de 35 a 40	Obesidad premórbida (Obesidad de grado III)
		 * > 40			Obesidad mórbida (Obesidad de grado IV)
		 */
		//Nota 1: se recomienda el empleo de sentencias if–else anidadas. Nota 2: Los operandos (peso y altura) deben 
		//ser introducidos por teclado por el usuario.
		
		Scanner entrada = new Scanner(System.in);
		
		float peso;
		float altura, imc;
		
		System.out.println("Calculadora de IMC");
		System.out.println("Ingresa tu peso en KG");
		peso = entrada.nextFloat();
		System.out.println("Ingresa tu altura en cm");
		altura =entrada.nextFloat();
		
		imc = peso / (altura*altura);
		
		if (imc < 16) {
			System.out.println("Criterio de ingreso en hospital");
		}else if (imc == 16) {
			System.out.println("Infrapeso");
		}else if (imc == 17) {
			System.out.println("Bajo Peso");
		}else if (imc >= 18 && imc <= 24) {
			System.out.println("Peso normal (Saludable)");
		}else if (imc >= 25 && imc <= 29) {
			System.out.println("Sobrepeso (Obesidad de Grado I)");
		}else if (imc >= 30 && imc <= 34) {
			System.out.println("Sobrepeso crónico (Obesidad de Grado II)");
		}else if (imc >= 35 && imc <= 39) {
			System.out.println("Obesidad premórbida (Obesidad de grado III)");
		}else if (imc > 40) {
			System.out.println("Obesidad mórbida (Obesidad de grado IV)");
		}
		
		
		
	}

}
