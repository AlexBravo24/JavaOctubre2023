package com.arrays;

public class Arrays4_ECGH {

	public static void main(String[] args) {
		//Dado un array de números de 5 posiciones con los siguientes valores: {1,2,3,4,5}.
		//Guardar los valores de este array en otro array distinto pero con los valores invertidos, 
		//es decir, que el segundo array deberá tener los valores {5,4,3,2,1}.

		int[]numero= {1,2,3,4,5};
		int[]inver=new int[numero.length];
for (int i = 0; i < numero.length; i++) {
	
	inver[i]=numero[numero.length-i-1];
	System.out.println(inver[i]);	
	
}




	}

}
