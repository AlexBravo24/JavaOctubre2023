package com.Condicionales;

import java.util.Scanner;

public class Condicionales13_JMX {

	public static void main(String[] args) {
//		13. Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un 
//		centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
//		Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os 
//		y el resto se invierte en la bolsa.
//		Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
//		ni�os y el resto se invierte en la bolsa.
//		La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente.
		Scanner entrada13 = new Scanner(System.in);
		int donacion;
		float CS,CN,BOLSA;
		System.out.println("Ingresa el monto de la donacion");
		donacion = entrada13.nextInt();
		
		if(donacion>=10000) {
			
			CS= (donacion/100)*30;
			CN= (donacion/100)*50;
			BOLSA=(donacion/100)*20;
			System.out.println("El centro de salud recibe: "+CS+" El comedor de ni�os recibe: "+CN+" A la bolsa se le invierte: "+BOLSA);
		}
	
		else if (donacion<10000) {
			
			CS= (donacion/100)*25;
			CN= (donacion/100)*60;
			BOLSA=(donacion/100)*15;
			System.out.println("El centro de salud recibe: "+CS+" El comedor de ni�os recibe: "+CN+" A la bolsa se le invierte: "+BOLSA);
			
		}
		
		else {
			
			System.out.println("No se recibio donacion");
		}
		
	}

}
