package com.Condicionales;

import java.util.Scanner;

public class Condicionales13_JMX {

	public static void main(String[] args) {
//		13. Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un 
//		centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
//		Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños 
//		y el resto se invierte en la bolsa.
//		Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
//		niños y el resto se invierte en la bolsa.
//		La institución desea saber cuánto de dinero destinará a cada rubro anualmente.
		Scanner entrada13 = new Scanner(System.in);
		int donacion;
		float CS,CN,BOLSA;
		System.out.println("Ingresa el monto de la donacion");
		donacion = entrada13.nextInt();
		
		if(donacion>=10000) {
			
			CS= (donacion/100)*30;
			CN= (donacion/100)*50;
			BOLSA=(donacion/100)*20;
			System.out.println("El centro de salud recibe: "+CS+" El comedor de niños recibe: "+CN+" A la bolsa se le invierte: "+BOLSA);
		}
	
		else if (donacion<10000) {
			
			CS= (donacion/100)*25;
			CN= (donacion/100)*60;
			BOLSA=(donacion/100)*15;
			System.out.println("El centro de salud recibe: "+CS+" El comedor de niños recibe: "+CN+" A la bolsa se le invierte: "+BOLSA);
			
		}
		
		else {
			
			System.out.println("No se recibio donacion");
		}
		
	}

}
