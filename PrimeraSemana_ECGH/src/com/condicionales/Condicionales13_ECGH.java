package com.condicionales;

import java.util.Scanner;

public class Condicionales13_ECGH {
	public static void main(String[] args) {
		
		//13. Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un centro 
//		de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
//		*Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 
//		50% al comedor de niños y el resto se invierte en la bolsa.
//		*Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 
//		60% al comedor de niños y el resto se invierte en la bolsa.
//		La institución desea saber cuánto de dinero destinará a cada rubro anualmente.
		
		
	    	double donacion;
			double centro;
			double comedor=0;
			double bolsa=0;
			
			Scanner entrada=new Scanner(System.in);
			System.out.println("Introduce la donación");
			donacion=entrada.nextDouble();
			
			if (donacion>=10000) {
				centro=donacion*0.3;
				comedor=donacion*0.5;
				bolsa=donacion*0.2;
			}
			else {	centro=donacion*0.25;
			comedor=donacion*0.6;
			bolsa=donacion*0.15;
			}
			
			System.out.println("Centro de Salud: "+centro);
			System.out.println("Comedor de niños: "+comedor);
			System.out.println("Inversión en la bolsa: "+bolsa);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
