package com.Condicionales;

import java.util.Scanner;

public class Condicionales7_JMC {

	public static void main(String[] args) {
//		El director de una escuela est� organizando un viaje de estudios y requiere determinar cu�nto 
//		debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio. La forma de 
//		cobrar es la siguiente:
//		* Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
//		* De 50 a 99 alumnos, el costo es de 70 euros.
//		* De 30 a 49 alumnos, el costo es de 95 euros.
//		* Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de 
//		alumnos.
//		Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe 
//		pagar cada alumno por el viaje

		Scanner entrada7 = new Scanner(System.in);
	    int alumnos;
	    
	    System.out.println("ingresa la catidad de alumnos ");
	    alumnos = entrada7.nextInt();
	
	    if(alumnos>=100) {
	    	System.out.println("El alumno pagara 65 euros y el pago a la compa�ia sera de: "+(alumnos*65)+" Euros");
	    	
	    }
	    else if (alumnos<=99&&alumnos>=50) {
	    	System.out.println("El alumno pagara 70 euros y el pago a la compa�ia sera de: "+(alumnos*70)+" Euros");
	    }
	    else if (alumnos<=49&&alumnos>=30) {
	    	System.out.println("El alumno pagara 70 euros y el pago a la compa�ia sera de: "+(alumnos*95)+" Euros");
	    }
	    else {
	    	System.out.println("\"Se le pagara a la compa�ia 4000 euros y el alumno pagara:"+(4000/alumnos)+"Euros");
	    }
	}

	

}
