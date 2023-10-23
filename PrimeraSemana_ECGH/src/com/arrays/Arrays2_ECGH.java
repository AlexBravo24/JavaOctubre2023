package com.arrays;

public class Arrays2_ECGH {

	public static void main(String[] args) {
		// 2. Crea un array de números de 100 posiciones, 
		//que contendrá los números del 1 al 100. 
		//Obtén la suma de todos ellos y la media.
	
	
	int[]numero=new int[100];
	int suma=0;
	int promedio;
	
	for (int i = 0; i < numero.length; i++) {
		numero[i]=i+1;
	}
	
	for (int i = 0; i < numero.length; i++) {
		suma=suma+numero[i];
	}
	promedio=suma/numero.length;
	
	System.out.println("La suma es: "+suma);
	System.out.println("El promedio es: "+promedio);	
	
	
	}

}
