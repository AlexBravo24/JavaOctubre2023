package com.Array;

public class Arrays4_JMC {

	public static void main(String[] args) {
		//  Dado un array de números de 5 posiciones con los siguientes valores:
		//{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
		//los valores invertidos, es decir, que el segundo array deberá tener los valores 
		//{5,4,3,2,1}.

		int[] numeros = {1,2,3,4,5};
		int [] numeros2 = new int [5];
		
		
		int j=4;
		for (int i = 0; i < numeros2.length; i++) {
			numeros2[j]=numeros[i];
			j--;
		}
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.print(numeros2[i]);
		}
		
	}

}
