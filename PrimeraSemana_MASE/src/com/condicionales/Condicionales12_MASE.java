package com.condicionales;

import java.util.Scanner;

public class Condicionales12_MASE {

	public static void main(String[] args) {
	       Scanner entrada = new Scanner(System.in);
	          
	      	double peso;
	      	double altura;
	      	double imc ;

			
	      	
			
			//
			
			System.out.println("Ingresa el peso en kg : ");
			peso= entrada.nextDouble();
			
			System.out.println("Ingresa la altura  en m : ");
			altura= entrada.nextDouble();
			
			System.out.println("el indice de masa corporal es de "+ (imc=(peso/(altura*altura))));

			
			
			//
			
			
			 if(imc<16 ){
				 System.out.println("criterio de ingreso al hospital :  ");
			 }else if(imc<17) {
				 System.out.println("Usted tiene infrapeso" );
			 }else if(imc<18) {
				 System.out.println("Usted tiene bajopeso " );
			 }else if(imc<25) {
				 System.out.println(" Usted tiene peso normal  " );
			 }else if(imc<30) {
				 System.out.println("Usted tiene sobrepeso de grado I  " );
			 }else if(imc<35) {
				 System.out.println("Usted tiene sobrepeso de grado II " );
			 }else if(imc<40) {
				 System.out.println("Usted tiene sobrepeso de grado III  " );
			 }else if(imc>40) {
				 System.out.println("Usted tiene sobrepeso de grado IV  " );
			 }
			 
			 

	}

}
