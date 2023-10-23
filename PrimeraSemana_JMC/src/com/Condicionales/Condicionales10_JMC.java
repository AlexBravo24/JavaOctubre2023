package com.Condicionales;

import java.util.Scanner;

public class Condicionales10_JMC {

	public static void main(String[] args) {
//		10.Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el 
//		mes correspondiente.
        Scanner entrada10 = new Scanner(System.in);
		
		int mes;
		
		System.out.println("Introduce el numero del mes");
        mes = entrada10.nextInt();
        
        if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==9||mes==12) {
        System.out.println("el mes tiene 31 dias");	     	
        }
        else if (mes==2) {
        System.out.println("el mes tiene 28 dias");	     	
       }
        else {
        	System.out.println("el mes tiene 30 dias ");
        }
        
	}

}
