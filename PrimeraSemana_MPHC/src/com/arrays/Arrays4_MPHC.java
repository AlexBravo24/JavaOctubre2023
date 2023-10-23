package com.arrays;

public class Arrays4_MPHC {

	public static void main(String[] args) {
//		// 4. Dado un array de números de 5 posiciones con los siguientes valores:
//		{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
//		los valores invertidos, es decir, que el segundo array deberá tener los valores 
//		{5,4,3,2,1}
		
		
		
		
		int [] numeros= {1,2,3,4,5};
		int [] numeros2= new int[numeros.length];
		
		for (int i = 0; i < numeros.length; i++) {
			
			 int j = numeros.length-i-1;
	            numeros2[j] = numeros[i];
	        	
		}
		System.out.println("<<Array original>>");
	
		for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
		}
		
		numeros = numeros2;
		System.out.println("<<<Array valores invertidos>>>");
		for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
		}
	}

}
