package com.ciclos;

import java.util.Scanner;

public class Ciclos6_AAMH {

	public static void main(String[] args) {
		// 6.- Una persona desea invertir $1000.00 en un banco, 
		//el cual le otorga un 2% de inter�s mensual.
		//�Cu�l ser� la cantidad de dinero que esta persona tendr�
		//al cabo de un a�o si todo el dinero lo reinvierte?
		
		Scanner entrada = new Scanner (System.in);
		
		double dinero = 1000;
		int mes = 1;
		
		while (mes<=12) {
			dinero = dinero *1.02;
			mes++;
			
		}

		System.out.println(dinero);
	}

}
