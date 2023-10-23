package com.condicionales;

import java.util.Scanner;

public class Condicionales14_AARR {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int HorasT, HorasE;
		
		System.out.println("Ingrese las horas completas trabajadas");
		HorasT = entrada.nextInt();
		entrada.nextLine();
		
		if(HorasT<41) {
			System.out.println("Tu salario esta semana sera de: "+ (HorasT*16));
		}else {
			HorasE = HorasT - 40;
			HorasT = HorasT - HorasE;
			System.out.println("Tu salario esta semana sera de: "+ ((HorasT * 16)+(HorasE * 20)));
		}
	}

}
