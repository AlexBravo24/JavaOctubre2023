package com.ciclos;

public class Ciclos5_JRMM {

	public static void main(String[] args) {
		// 5. Simular el comportamiento de un reloj digital, imprimiendo la hora,
		//minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 horas
		
		for(int h=00; h<= 23; h++) {
			for (int m = 00; m < 59; m++) {
				for (int s = 0; s < 59; s++) {
					System.out.println(h + " : " + m + " : " + s);
				}
				
			}
		}

	}

}
