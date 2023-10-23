package com.Array;

public class Arrays2_JMC {

	public static void main(String[] args) {
		// 2. Crea un array de números de 100 posiciones, que contendrá los números del 
		//1 al 100. Obtén la suma de todos ellos y la media.
		float [] numeros = new float [100];
		float contador =1,suma=0;
		float promedio;
		
		
		for (int i = 0; i < numeros.length; i++) {
			
		numeros[i]=contador;
		  
		suma=suma+contador;
		
		if(contador<100) {
			 contador ++;
		 }
				
		}
		

		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
			
		}
		
		System.out.println("la suma de los numeros es :"+suma);
		
		promedio=suma/contador;
		System.out.println();
	}

}
