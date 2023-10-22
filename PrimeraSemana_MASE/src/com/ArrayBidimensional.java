package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayBidimencional-- nos permite allmacenar datos de forma tabular
				//Pasndo a un concepto de tabla
				//Permitiendonos tener datos en filas y columnas
				
				//Declarar un Array de dos dimensiones
				//Con un tamaño inicial
				
				int [] [] matriz = new int [3] [3];
				
				//[0,0] [0,1] [0,2] 
				//[1,0] [0,1] [0,2] 
				// [2,0] [0,1] [0,2] 
				
				matriz [0] [0]=1;
				matriz [0] [1]=2;
				matriz [0] [2]=3;
				
				matriz [1] [0]=4;
				matriz [1] [1]=5;
				matriz [1] [2]=6;
				
				matriz [2] [0]=7;
				matriz [2] [1]=8;
				matriz [2] [2]=9;
				
				
				//Declarando una matriz de forma Bidimensional con valores desde el inicio
				
				int [] [] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
				
				//Para recorrer este array necesiitamos dos ciclos for, uno anidado dentro del otro
				
				for (int i=0; i< matriz2.length; i++) {
					
					for (int j=0; j< matriz2.length; j++) {
						System.out.print(matriz2[i][j] + " ");
					}
					}
				//Existe una clase en java para almacenar màs de un tipo de datos
				//seria el objeto Object
				
				Object [] array = {1,"Sandi", 'S',10000.5}; 
				
				

	}

}
