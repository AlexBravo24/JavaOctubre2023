package com.condicionales;

import java.util.Scanner;

public class Condicionales13_AAMH {

	public static void main(String[] args) {
		//13. Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa
		//y lo reparte entre un centro de salud, un comedor de ni�os 
		//y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
		//Si el monto de la donaci�n es de $10000 o m�s:
		//30% se destina al centro de salud,
		//50% al comedor de ni�os y el resto se invierte en la bolsa.
		//Si el monto de la donaci�n es menor que $10000:
		//25% se destina al centro de salud,
		//60% al comedor de ni�os y el resto se invierte en la bolsa.
		//La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente.

		Scanner entrada = new Scanner (System.in);
		int donaci�n,salud,comedor,bolsa;
		System.out.println("Ingrese donaci�n:  ");
		
		Float donaci�n1 = entrada.nextFloat();
		
		if (donaci�n1 >=10000) {
		
		Float salud1 = (donaci�n1 * 30)/100;
		Float comedor1 = (donaci�n1 * 50)/100;
		Float bolsa1 = donaci�n1-salud1-comedor1;
		
		System.out.println("Salud le corresponde: " +salud1);
		System.out.println("Comedor le corresponde: " +comedor1);		
		System.out.println("Bolsa le corresponde: " +bolsa1);
			
			}else {
				
			if (donaci�n1 <=10000)	{
				Float salud1 = (donaci�n1 * 25)/100;
				Float comedor1 = (donaci�n1 * 60)/100;
				Float bolsa1 = donaci�n1-salud1-comedor1;
				
				System.out.println("Salud le corresponde: " +salud1);
				System.out.println("Comedor le corresponde: " +comedor1);		
				System.out.println("Bolsa le corresponde: " +bolsa1);	
				
			}
	
		
					
		}
		
	
	}
	}
