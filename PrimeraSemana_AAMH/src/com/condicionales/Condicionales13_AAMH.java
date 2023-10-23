package com.condicionales;

import java.util.Scanner;

public class Condicionales13_AAMH {

	public static void main(String[] args) {
		//13. Una institución benéfica recibe anualmente una donación proveniente de Europa
		//y lo reparte entre un centro de salud, un comedor de niños 
		//y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
		//Si el monto de la donación es de $10000 o más:
		//30% se destina al centro de salud,
		//50% al comedor de niños y el resto se invierte en la bolsa.
		//Si el monto de la donación es menor que $10000:
		//25% se destina al centro de salud,
		//60% al comedor de niños y el resto se invierte en la bolsa.
		//La institución desea saber cuánto de dinero destinará a cada rubro anualmente.

		Scanner entrada = new Scanner (System.in);
		int donación,salud,comedor,bolsa;
		System.out.println("Ingrese donación:  ");
		
		Float donación1 = entrada.nextFloat();
		
		if (donación1 >=10000) {
		
		Float salud1 = (donación1 * 30)/100;
		Float comedor1 = (donación1 * 50)/100;
		Float bolsa1 = donación1-salud1-comedor1;
		
		System.out.println("Salud le corresponde: " +salud1);
		System.out.println("Comedor le corresponde: " +comedor1);		
		System.out.println("Bolsa le corresponde: " +bolsa1);
			
			}else {
				
			if (donación1 <=10000)	{
				Float salud1 = (donación1 * 25)/100;
				Float comedor1 = (donación1 * 60)/100;
				Float bolsa1 = donación1-salud1-comedor1;
				
				System.out.println("Salud le corresponde: " +salud1);
				System.out.println("Comedor le corresponde: " +comedor1);		
				System.out.println("Bolsa le corresponde: " +bolsa1);	
				
			}
	
		
					
		}
		
	
	}
	}
