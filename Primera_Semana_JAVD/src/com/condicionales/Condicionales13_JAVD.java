
//Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un
//centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
//Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños
//y el resto se invierte en la bolsa.
//Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de
//niños y el resto se invierte en la bolsa.
//La institución desea saber cuánto de dinero destinará a cada rubro anualmente.

package com.condicionales;

import java.util.Scanner;

public class Condicionales13_JAVD {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double a,cs,cn,ib;
		
		System.out.println("Ingrese la donación anual:");
		a=in.nextDouble();
		
		System.out.println("---------------DESTINO DEL DINERO---------------");
		
		if(a>=10000) {
			cs=a*.3;
			cn=a*.6;
			ib=a*.1;
			System.out.println("Para el Centro de Salud: "+cs);
			System.out.println("Para el Comedor de Niños: "+cn);
			System.out.println("Para Invertir en la Bolsa: "+ib);
		}
		else {
			cs=a*.25;
			cn=a*.6;
			ib=a*.15;
			System.out.println("Para el Centro de Salud: "+cs);
			System.out.println("Para el Comedor de Niños: "+cn);
			System.out.println("Para Invertir en la Bolsa: "+ib);
		}

	}

}
