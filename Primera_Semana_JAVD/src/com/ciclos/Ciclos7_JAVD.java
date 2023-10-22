
//Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés
//mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su
//dinero?


package com.ciclos;

public class Ciclos7_JAVD {

	public static void main(String[] args) {
	
		double ii=700,im=.02,o=1500;
		int m=0;
		
		while(ii<o) {
			ii+=ii*im;
			m++;
		}
		
		System.out.println("En "+m+" meses, tendrás más de $1500.");
		
	}
	
}
