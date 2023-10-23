package com.condicionales;

import java.util.Scanner;

public class Condicionales7_AARR {
	
	public static void main(String[] args) {
		
		double Alumnos, CostoAlumno;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Viaje de estudios, presione ENTER");
		entrada.nextLine();
		
		System.out.println("¿Cuantos alumnos desea inscribir?");
		Alumnos = entrada.nextDouble();
		entrada.nextLine();
		
		if(Alumnos > 99) {
			System.out.println("El costo por alumno es de 65 €");
		}else if(Alumnos > 49 && Alumnos <100) {
			System.out.println("El costo por alumno es de 70 €");
		}else if (Alumnos > 29 && Alumnos <50) {
			System.out.println("El costo por alumno es de 95 €");
		}else {
			CostoAlumno = (4000/Alumnos);
			System.out.println("El costo por alumno es de "+ CostoAlumno + " €");
		}
		
		
		
	}
}
