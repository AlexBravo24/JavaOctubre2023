package com.arrays;

public class Arrays4_EGG {

	public static void main(String[] args) {
		//  Dado un array de números de 5 posiciones con los siguientes valores:
		// {1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
		// los valores invertidos, es decir, que el segundo array deberá tener los valores 
		// {5,4,3,2,1}.
		
		int[] arrayOriginal = {1, 2, 3, 4, 5};
	    int[] arrayInvertido = new int[arrayOriginal.length];
	        
	    // Llenar el segundo array con los valores invertidos del primer array
	    for (int i = 0; i < arrayOriginal.length; i++) {
	    	arrayInvertido[i] = arrayOriginal[arrayOriginal.length - 1 - i];
	    }
	        
	    // Imprimir el segundo array
	    System.out.print("Array invertido: {");
	    for (int i = 0; i < arrayInvertido.length; i++) {
	    	System.out.print(arrayInvertido[i]);
	    	if (i < arrayInvertido.length - 1) {
	    		System.out.print(", ");
	        }
	    }
	    System.out.println("}");

	}

}
