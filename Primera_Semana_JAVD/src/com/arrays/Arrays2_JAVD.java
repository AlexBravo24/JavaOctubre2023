
//Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del
//1 al 100. Obt�n la suma de todos ellos y la media.

package com.arrays;

public class Arrays2_JAVD {

	public static void main(String[] args) {
		
		int [] num = new int[100];
		double sum=0,me=0;
		
		for(int i=0;i<num.length;i++) {
			num[i]=(i+1);
			sum+=num[i];			
		}
		
		me=sum/100;
		
		System.out.println("El valor de la suma de todos los n�meros es: "+sum);
		System.out.println("El valor de la media de todos los n�meros es: "+me);				

	}

}
