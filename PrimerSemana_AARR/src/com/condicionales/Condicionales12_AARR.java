package com.condicionales;

import java.util.Scanner;

public class Condicionales12_AARR {
	
	public static void main(String[] args) {
		
		Double peso, altura, IMC;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa para calcular indice de masa corporal, presione ENTER para continuar");
		entrada.nextLine();
		
		System.out.println("Ingrese su altra en Metros");
		altura = entrada.nextDouble();
		
		System.out.println("Ingrese su peso en Kilogramos");
		peso = entrada.nextDouble();
		entrada.nextLine();
		
		IMC = peso / (altura*altura);
		
		if(IMC<16) {
			System.out.println("Indice de masa corporal: "+ IMC + "\nDiagnóstico: \nSe necesita ingresar a un hospital para atención. ");
		}else if(IMC < 18 && IMC > 15) {
			System.out.println("Indice de masa corporal: "+ IMC + "\nDiagnóstico: \nUsted tiene infrapeso ");
		}else if(IMC < 19 && IMC > 16) {
			System.out.println("Indice de masa corporal: "+ IMC + "\nDiagnóstico: \nUsted tiene bajo peso ");
		}else if(IMC < 26 && IMC > 17) {
			System.out.println("Indice de masa corporal: "+ IMC + "\nDiagnóstico: \nUsted tiene un peso normal (saludable) ");
		}else if(IMC < 31 && IMC > 24) {
			System.out.println("Indice de masa corporal: "+ IMC + "\nDiagnóstico: \nUsted tiene sobrepeso (obesidad grado 1) ");
		}else if(IMC < 36 && IMC > 29) {
			System.out.println("Indice de masa corporal: "+ IMC + "\nDiagnóstico: \nUsted tiene sobrepeso cronico (obesidad grado 2) ");
		}else if(IMC < 41 && IMC > 34) {
			System.out.println("Indice de masa corporal: "+ IMC + "\nDiagnóstico: \nUsted tiene obesidad premórbida (obesidad grado 3) ");
		}else if(IMC > 40) {
			System.out.println("Indice de masa corporal: "+ IMC + "\nDiagnóstico: \nUsted tiene obesidad morbida (obesidad grado 4) ");
		}
		
	}

}
