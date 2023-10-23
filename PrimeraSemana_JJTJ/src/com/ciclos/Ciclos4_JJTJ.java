package com.ciclos;

public class Ciclos4_JJTJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * Simular el comportamiento de un reloj digital, imprimiendo la hora, 
		 * minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 horas
		 * 
		 * */
		
		
		for(int i = 0; i<=23; i++) {
			for(int j =0; j<=59; j++) {
				for(int a = 0; a<=59; a++) {
					System.out.println(String.format("%02d:%02d:%02d", i, j, a));
				}
				}
			
		
		}

	}

}
