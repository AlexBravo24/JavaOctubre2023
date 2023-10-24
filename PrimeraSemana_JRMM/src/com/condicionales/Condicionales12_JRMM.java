package com.condicionales;

import java.util.Scanner;

public class Condicionales12_JRMM {

	public static void main(String[] args) {
		
		/* 12.Construir un programa que calcule el índice de masa corporal
		 * de una persona (IMC = peso [kg] / altura2[m]) e indique el estado
		 * en el que se encuentra esa persona en función del valor de IMC:
		 */
		Scanner entrada = new Scanner(System.in);
		
		float peso, altura, IMC;
		
		System.out.println("Inserte su peso en KG: ");
		peso = entrada.nextFloat();
		System.out.println("Inserte su estatura en metros: ");
		altura = entrada.nextFloat();
		
		IMC = peso / (altura*altura);
		
		if(IMC < 16) {
			System.out.println(IMC+" ---> "+"Criterio de ingreso en hospital");
		}else if(IMC >=16 && IMC <17) {
			System.out.println(IMC+" ---> "+"Infrapeso");
		}else if(IMC >=17 && IMC <18) {
			System.out.println(IMC+" ---> "+"bajo peso");
		}else if(IMC >= 18 && IMC <25) {
			System.out.println(IMC+" ---> "+"peso normal (saludable)");
		}else if(IMC >=25 && IMC<30) {
			System.out.println(IMC+" ---> "+"sobrepeso (obesidad de grado I)");
		}else if(IMC >=30 && IMC <35) {
			System.out.println(IMC+" ---> "+"sobrepeso crónico (obesidad de grado II");
		}else if(IMC >=35 && IMC <40) {
			System.out.println(IMC+" ---> "+"sobrepeso premórbida (obesidad de grado III");
		}else if(IMC >=40) {
			System.out.println(IMC+" ---> "+"sobrepeso mórbida (obesidad de grado IV");
		}
		
		

	}

}
