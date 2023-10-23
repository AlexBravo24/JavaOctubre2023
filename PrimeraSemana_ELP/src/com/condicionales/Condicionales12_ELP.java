package com.condicionales;

import java.util.Scanner;

public class Condicionales12_ELP {

	public static void main(String[] args) {
		/* 12. Construir un programa que calcule el índice de masa corporal 
		 * de una persona (IMC = peso [kg]/altura2[m]) e indique el estado
		 * en el que se encuentra esa persona en función del valor del IMC:
		 * <16 Criterio de ingreso en hospital
		 * de 16 a 17 infrapeso
		 * de 17 a 18 bajo peso
		 * de 18 a 25 peso normal (saludable)
		 * de 25 a 30 sobrepeso (obesidad de grado I)
		 * de 30 a 35 sobrepeso crónico (obesidad de grado II)
		 * de 35 a 40 obesidad premórbida (obesidad de grado III)
		 * > 40 obesidad mórbida (obesidad de grado IV)
		 */

		int ValorIMC;
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Introduce el valor de IMC: ");
		ValorIMC = leer.nextInt();
		
		if(ValorIMC<16) {
			System.out.println("Criterio de ingreso en hospital");
		} else if (ValorIMC>=16 && ValorIMC<18) {
			System.out.println("infrapeso");
		} else if (ValorIMC>=17 && ValorIMC<19) {
			System.out.println("bajo peso");
		} else if (ValorIMC>=18 && ValorIMC<26) {
			System.out.println("peso normal (saludable)");
		} else if (ValorIMC>=25 && ValorIMC<31) {
			System.out.println("sobrepeso (obesidad de grado I");
		} else if (ValorIMC>=30 && ValorIMC<36) {
			System.out.println("sobrepeso crónico (obesidad de grado II)");
		} else if (ValorIMC>=35 && ValorIMC<41) {
			System.out.println("obesidad premórbida (obesidad de grado III)");
		} else{
			System.out.println("obesidad mórbida (obesidad de grado IV)");
		}
	}

}
