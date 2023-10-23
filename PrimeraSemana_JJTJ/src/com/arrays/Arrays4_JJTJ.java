package com.arrays;

public class Arrays4_JJTJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Dado un array de números de 5 posiciones con los siguientes valores: {1,2,3,4,5}. 
		 * Guardar los valores de este array en otro array distinto pero con los valores invertidos,
		 *  es decir, que el segundo array deberá tener los valores {5,4,3,2,1}.
		 * */
         
		int[] arrayOriginal = {1, 2, 3, 4, 5};

       
        int[] arrayInvertido = new int[arrayOriginal.length];

       
        int indiceInvertido = arrayInvertido.length - 1;

 
        for (int i = 0; i < arrayOriginal.length; i++) {
        
            arrayInvertido[indiceInvertido] = arrayOriginal[i];
           
            indiceInvertido--;
        }

       
        for (int valor : arrayInvertido) {
            System.out.print(valor + " ");
        }
		
	}

}
