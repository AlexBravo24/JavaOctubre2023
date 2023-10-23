package com.condicionales;

import java.util.Scanner;

public class Condicionales5_AARR {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String Sexo, Masculino, Femenino;
		int Nota, Edad;
			Masculino = "M"; Femenino = "F";
		
			System.out.println("ingresa tu nota ");
			Nota = entrada.nextInt();
			
			System.out.println("ingresa tu edad ");
			Edad = entrada.nextInt();
			entrada.nextLine();
			
			System.out.println("ingresa tu sexo en formato M o F ");
			Sexo = entrada.nextLine();
			
			if (Nota > 4 && Edad > 17 && Sexo.equalsIgnoreCase(Masculino)) {
				System.out.println("Tu admision es posible");
			}else if (Nota > 4 && Edad > 17 && Sexo.equalsIgnoreCase(Femenino)) {
				System.out.println("Has sido aceptada");
			}else {
				System.out.println("No fuiste aceptado");
			}

	}

}
