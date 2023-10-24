package com.arrays;

public class Arrays4_JRMM {

	public static void main(String[] args) {
		/* 4. Dado un array de números de 5 posiciones con los siguientes valores:
		*{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
		*los valores invertidos, es decir, que el segundo array deberá tener los valores
		*{5,4,3,2,1}.
		*/
		
		 int [] numeros = {1,2,3,4,5};
		 int [] numeros2 = new int[numeros.length]; //se coloca numeros.length,
		 //para que nuestro segundo arreglos tenga la misma cantidad de elementos que el primero
		 int aux = numeros.length - 1;
		 
		 System.out.print("Arreglo numeros [");
		 for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]);
		}
		 System.out.println("]");
		 
		 for (int i = 0; i < numeros.length; i++) {
			numeros2[i] = numeros[aux];
			aux--;
		}
		 System.out.print("Arreglo invertido [");
		 
		 for (int i = 0; i < numeros2.length; i++) {
				System.out.print(numeros2[i]);
			}
		 System.out.println("]");
	}

}
