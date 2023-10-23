package com.condicionales;

import java.util.Scanner;

public class Condicional12_MPHC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("<<< Indice de masa corporal de una persona >>>");
		System.out.println("");

		System.out.println("Ingrese su peso");
		int peso = entrada.nextInt();

		System.out.println("Ingrese su altura");
		double altura = entrada.nextDouble();

		double resultado = peso / (altura * altura);

		if (resultado < 16) {
			System.out.println("IMC:"+resultado);
			System.out.println("Criterio de ingreso al hospital");

		} else if (resultado >= 16 && resultado < 17) {
			System.out.println("IMC:"+resultado);
			System.out.println("Infrapeso");

		} else if (resultado >= 17 && resultado < 18) {
			System.out.println("IMC:"+resultado);
			System.out.println("bajo peso");

		} else if (resultado >= 18 && resultado < 25) {
			System.out.println("IMC:"+resultado);
			System.out.println("Peso normal (Saludable)");

		} else if (resultado >= 25 && resultado < 30) {
			System.out.println("IMC:"+resultado);
			System.out.println("Sobrepeso(Obesidad de grado I)");

		} else if (resultado >= 30 && resultado < 35) {
			System.out.println("IMC:"+resultado);
			System.out.println("Sobrepeso cronico (Obesidad de grado II)");

		}

		else if (resultado >= 35 && resultado < 40) {
			System.out.println("IMC:"+resultado);
			System.out.println("Obesidad premórbida (Obesidad de grado III)");

		} else if (resultado >= 40) {
			System.out.println("IMC:"+resultado);
			System.out.println("Obesidad mórbida (Obesidad de grado IV)");

		} else {

			System.out.println("Error en el sistema");
		}

	}

}
