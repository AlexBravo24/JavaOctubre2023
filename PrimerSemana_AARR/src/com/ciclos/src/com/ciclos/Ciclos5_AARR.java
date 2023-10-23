package com.ciclos;

import java.util.Scanner;

public class Ciclos5_AARR {

	public static void main(String[] args) throws InterruptedException {
		
		int horas = 00, minutos = 00, segundos = 00;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Reloj");
		
		
		for(int i=0; i<61; i++ ) {
			
			System.out.println("Hora: "+horas+":"+minutos+":"+segundos);
			segundos++;
			Thread.sleep(1000);
			if(segundos==60) {
				segundos=00;
				minutos++;
				i=0;
				if(minutos==60) {
					minutos=00;
					horas++;
					if(horas==24) {
						horas=00;
					}
				}
			}
		}
	}
}
