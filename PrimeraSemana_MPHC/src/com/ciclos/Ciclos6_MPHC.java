package com.ciclos;

import java.util.Scanner;

public class Ciclos6_MPHC {
//	6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s 
//	mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si 
//	todo el dinero lo reinvierte?

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Ingrese cantidad a invertir:");
		double cantidad = entrada.nextFloat();		
		
		
		for (int i = 1; i <=12; i++) {
			cantidad=(cantidad*0.02)+cantidad;

			
		}
		
		System.out.println("Cantidad obtenida al fin de a�o:$"+cantidad);


	}

}
