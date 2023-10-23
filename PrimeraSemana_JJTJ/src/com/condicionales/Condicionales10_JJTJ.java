package com.condicionales;

import java.util.Scanner;

public class Condicionales10_JJTJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el mes correspondiente.*/
		
	
		Scanner entrada = new Scanner(System.in);
		int mes;
		System.out.println("Introduce el numero del mes de 1 a 12"); 
		mes=entrada.nextInt();
		
		if(mes==1) {
			System.out.println("El mes es enero y tiene 31 dias"); 
		}else if(mes==2){
			System.out.println("El mes es febrero y tiene 30 dias"); 
		}else if(mes==3) {
			System.out.println("El mes es marzo y tiene 31 dias"); 
		}else if(mes==4) {
			System.out.println("El mes es abril y tiene 30 dias"); 
		}else if(mes==5) {
			System.out.println("El mes es mayo y tiene 31 dias"); 
		}else if(mes==6) {
			System.out.println("El mes es junio y tiene 30 dias");
		}else if(mes==7) {
			System.out.println("El mes es julio y tiene 31 dias"); 
		}else if(mes==8) {
			System.out.println("El mes es agosto y tiene 31 dias"); 
		}else if(mes==9) {
			System.out.println("El mes es septiembre y tiene 30 dias"); 
		}else if(mes==10) {
			System.out.println("El mes es octubre y tiene 31 dias"); 
		}else if(mes==11) {
			System.out.println("El mes es noviembre y tiene 31 dias"); 
		}else if(mes==12) {
			System.out.println("El mes es diciembre y tiene 31 dias"); 
			
		}else {
			System.out.println("Error introduce un numero del 1 al 12"); 
		}
		
	
		
	}

}
