
//Dado un array de números de 5 posiciones con los siguientes valores:
//{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
//los valores invertidos, es decir, que el segundo array deberá tener los valores
//{5,4,3,2,1}.

package com.arrays;

public class Arrays4_JAVD {

	public static void main(String[] args) {
		
		int [] num1 = {1,2,3,4,5};
		int [] num2 = new int [num1.length]; 
		
		for(int i = 0; i<num1.length;i++) {			
			num2[i]=num1[num1.length -1 -i];			
		}
		
		System.out.println("-----------Array inicial-----------");
		for(int j=0; j<num1.length;j++) {
			System.out.print(num1[j]+" ");
		}
		
		System.out.println();
		System.out.println("-----------Array invertido-----------");
		for(int b=0; b<num1.length;b++) {
			System.out.print(num2[b]+" ");
		}

	}

}
