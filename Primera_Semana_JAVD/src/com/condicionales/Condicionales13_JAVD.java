
//Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un
//centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
//Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os
//y el resto se invierte en la bolsa.
//Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de
//ni�os y el resto se invierte en la bolsa.
//La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente.

package com.condicionales;

import java.util.Scanner;

public class Condicionales13_JAVD {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double a,cs,cn,ib;
		
		System.out.println("Ingrese la donaci�n anual:");
		a=in.nextDouble();
		
		System.out.println("---------------DESTINO DEL DINERO---------------");
		
		if(a>=10000) {
			cs=a*.3;
			cn=a*.6;
			ib=a*.1;
			System.out.println("Para el Centro de Salud: "+cs);
			System.out.println("Para el Comedor de Ni�os: "+cn);
			System.out.println("Para Invertir en la Bolsa: "+ib);
		}
		else {
			cs=a*.25;
			cn=a*.6;
			ib=a*.15;
			System.out.println("Para el Centro de Salud: "+cs);
			System.out.println("Para el Comedor de Ni�os: "+cn);
			System.out.println("Para Invertir en la Bolsa: "+ib);
		}

	}

}
