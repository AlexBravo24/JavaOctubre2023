
//Crea un array de números de 100 posiciones, que contendrá los números del
//1 al 100. Obtén la suma de todos ellos y la media.

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
		
		System.out.println("El valor de la suma de todos los números es: "+sum);
		System.out.println("El valor de la media de todos los números es: "+me);				

	}

}
