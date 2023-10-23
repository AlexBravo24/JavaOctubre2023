package com.condicionales;

import java.util.Scanner;

public class Condicional7_MPHC {

	public static void main(String[] args) {
		
		Scanner entrada= new  Scanner(System.in);
		System.out.println();
		System.out.println("<<< Cotizacion de viaje de estudios >>>");
		
		int alumnos;
		
		System.out.println("Ingrese la cantidad de alumnos");
		alumnos=entrada.nextInt();
		
		
		
		if (alumnos>=100) {
			
			int total=alumnos*65;
			int precioAlumno=65;
			
			System.out.println("Total a pagar a la empresa de autobuses:$"+total+" Euros");
			System.out.println();
			System.out.println("Total por alumno:$"+precioAlumno+" Euros");
			
		}else if(alumnos>=50 && alumnos<=99){
			int total=alumnos*70;
			int precioAlumno=70;
			
			System.out.println("Total a pagar a la empresa de autobuses:$"+total+" Euros");
			System.out.println();
			System.out.println("Total por alumno:$"+precioAlumno+" Euros");
			
		}else if(alumnos>=30 && alumnos<=49){
			int total=alumnos*95;
			int precioAlumno=95;
			
			System.out.println("Total a pagar a la empresa de autobuses:$"+total+" Euros");
			System.out.println();
			System.out.println("Total por alumno:$"+precioAlumno+" Euros");
		}else if(alumnos<=30) {
			
			int total=4000;
	
			
			System.out.println("Total a pagar a la empresa de autobuses:$"+total+" Euros");
			
			
		}
		
		
		

	}

}
