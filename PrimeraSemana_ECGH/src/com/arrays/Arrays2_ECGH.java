package com.arrays;

public class Arrays2_ECGH {

	public static void main(String[] args) {
		// 2. Crea un array de n�meros de 100 posiciones, 
		//que contendr� los n�meros del 1 al 100. 
		//Obt�n la suma de todos ellos y la media.
	
	
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
