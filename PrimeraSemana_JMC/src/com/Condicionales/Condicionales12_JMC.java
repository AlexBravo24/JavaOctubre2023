package com.Condicionales;

import java.util.Scanner;

public class Condicionales12_JMC {

	public static void main(String[] args) {
//		12.Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 
//				[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
		
		 Scanner entrada12 = new Scanner(System.in);
         
		 float Altura,peso,IMC;
		 
		 System.out.println("Ingresa tu peso en kg");
			peso = entrada12.nextFloat();
			System.out.println("Ingresa tu altura (Metros)");
			Altura = entrada12.nextFloat();
	
	 IMC = peso/(Altura*Altura);
	 System.out.println(IMC);
	
	if (IMC<16) {
		System.out.println("Criterio de ingreso en hospital");
	}
	else if(IMC>15&&IMC<18) {
		System.out.println("Infrapeso");
	}
	else if(IMC>16&&IMC<19) {
		System.out.println("Bajo peso");
	}
	else if(IMC>17&&IMC<26) {
		System.out.println("Peso normal(saludable)");
	}
	else if(IMC>24&&IMC<31) {
		System.out.println("Sobrepeso(Obesidad de grado I)");
	}
	else if(IMC>29&&IMC<36) {
		System.out.println("Sobrepeso cronico(Obesidad de grado II)");
	}
	else if(IMC>34&&IMC<41) {
		System.out.println("Obesidad premorbida(Obesidad de grado III)");
	}
	else {
		System.out.println("Obesidad morbida(Obesidad de grado IV)");
	}
	 
	 
	 
	}
	
	
	

}
