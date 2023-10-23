package com.condicionales;

import java.util.Scanner;

public class Condicionales9_JJTJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente.
		 *  Si introducimos otro número nos da un error.
		 * */
		Scanner entrada = new Scanner(System.in);
		int dia;
		System.out.println("Introduzca el numero del dia de la semana"); 
		dia=entrada.nextInt();
		
		if(dia == 1) {
			System.out.println("Lunes"); 
		}else if(dia==2) {
			System.out.println("Martes");
		}else if(dia==3){
			System.out.println("Miercoles");
		}else if(dia==4) {
			System.out.println("Jueves");
		}else if(dia==5){
			System.out.println("viernes");
		}else if(dia==6) {
			System.out.println("Sabado");
		}else if(dia==7) {
			System.out.println("Domingo");
		}else {
			System.out.println("Error");
		}
		
	}

}
