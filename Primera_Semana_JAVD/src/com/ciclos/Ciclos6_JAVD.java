
//Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s
//mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si
//todo el dinero lo reinvierte?

package com.ciclos;

public class Ciclos6_JAVD {

	public static void main(String[] args) {
		
		double ii=1000,im=.02,ca;
		int m=12;
		
		ca=ii;
		
		for(int i=1;i<=m;i++) {
			ca+=ca*im;
		}
				
		System.out.printf("La cantidad que va a tener despu�sde un a�o es $%.2f\n",ca);
		
	}
	
}
