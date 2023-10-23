package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// Array Bidimensional
		//Nos permite almacenar datos de forma tabular
		//Pasando a un concepto de "Tabla"
		//Permitiendonos tener datos en filas y columnas
		
		//Declarar un array de dos dimensiones
		//con su tama�o inicial
		
		int [][] matriz= new int[3][3];
		
		//[f][c]
		//[0,0][0,1][0,2]
		//[1,0][1,1][1,2]
		//[2,0][2,1][2,2]
		
		matriz[0][0]=1;
		matriz[0][1]=2;
		matriz[0][2]=3;
		
		matriz[1][0]=4;
		matriz[1][1]=5;
		matriz[1][2]=6;
		
		matriz[2][0]=7;
		matriz[2][1]=8;
		matriz[2][2]=9;
		
		
		//Declarando una matriz o array bidimensional con valores asignados
		//desde un inicio
		
		int [][]matriz2= {{1,2,3},{4,5,6},{7,8,9}};
		
		//System.out.println(matriz2.length);
		
		
		
		//Para recorrer este array necesitamos dos ciclos for
		//uno anidado dentro del otro
		
		for (int i = 0; i < matriz2.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz2.length; j++) {
				System.out.print(matriz2[i][j]);
			}
		}
		
		//Existe una clase en java que nos permite almacenar m�a
		//de un tipo de dato Y ser�a la clase Object
		System.out.println("\n");
		
		Object[]array= {70,"Alex",'B',10000.5};
		
		for(Object i:array) {
			System.out.println(i);
		}
		
		
		

	}

}