package com.condicionales;

import java.util.Scanner;

public class Condicionales12_JJTJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner(System.in);
		int peso;
		double altura; 
		double resultado;

		System.out.println("Introduzca el peso del paciente");
		peso = entrada.nextInt();
		System.out.println("Introduzca su altura (en metros)"); 
		altura = entrada.nextDouble(); 

		resultado = peso / (altura * altura);
		if(resultado <= 16) {
			System.out.println("Criterio de ingreso al hospital su IMC es de" + resultado); 
		}else if(resultado <=17) {
			System.out.println("Infrapeso su IMC es de" + resultado); 	
		}else if(resultado <=18) {
			System.out.println("bajo peso su IMC es de" + resultado); 
		}else if(resultado <=25) {
			System.out.println("Peso normal saludable su IMC es de" + resultado); 
		}else if(resultado <=30) {
			System.out.println("Sobre peso (obesidad de grado 1 ) su IMC es de" + resultado);
			
		}else if(resultado <=35) {
			System.out.println("Sobre pesocornico (obesidad grado 2) su IMC es de " + resultado); 
			
		}else if(resultado <=40) {
			System.out.println("Obesidad premorbidad (obesidad grado 3) su IMC es de " + resultado);
			
		}else if(resultado < 40) {
			System.out.println("Obesidad morbidad (obesidad grado 4) su IMC es de " + resultado); 
		}
		

	}

}
