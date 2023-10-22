
//Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos
//de un día desde las 00:00:00 horas hasta las 23:59:59 horas

package com.ciclos;

public class Ciclos5_JAVD {

	public static void main(String[] args) {
		
		String hora;
		
		for(int i=0;i<24;i++) {
			for(int a=0;a<60;a++) {
				for(int b=0;b<60;b++) {
					hora=String.format("%02d:%02d:%02d", i,a,b);
					
					System.out.println(hora);
					
					try {
						Thread.sleep(1000);						
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			}
		}

	}

}
