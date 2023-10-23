package com.condicionales;

import java.util.Scanner;

public class Condicionales13_JJTJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner entrada = new Scanner(System.in);
		
		int donacion;
		
		System.out.println("Introduzca la donacion");
		donacion=entrada.nextInt();
		
		if(donacion >=  10000) {
			int r1 = 30 * donacion;
			double r2 =  r1 / 100;
			
			int r3 = 50 * donacion;
			double r4 = r3/100;
			
			int r5 = 20 * donacion;
			double r6 = r5/100;
			System.out.println("La donacion fue de: " + donacion + " Se destinara al centro de salud: "  + r2 + " Se destinara al comer de niños: " + r4 + " Se invertira a la bolsa " + r6);
			
		}else if(10000 > donacion) {
			int q1 = 25 * donacion;
			double q2 =  q1 / 100;
			
			int q3 = 60 * donacion;
			double q4 = q3/100;
			
			int q5 = 15 * donacion;
			double q6 = q5/100;
			System.out.println("La donacion fue de: " + donacion + " Se destinara al centro de salud: "  + q2 + " Se destinara al comer de niños: " + q4 + " Se invertira a la bolsa " + q6);
		}
		

	}

}
