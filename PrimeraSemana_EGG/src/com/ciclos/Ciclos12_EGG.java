package com.ciclos;

import java.util.Scanner;

public class Ciclos12_EGG {

	public static void main(String[] args) {
		//Se ingresan un conjunto de n edades de personas por teclado. 
		//El programa finalizara cuando el promedio de las edades sea superior a 25.

		int edad, suma = 0, contador = 0, promedio=0;
		Scanner entrada=new Scanner(System.in);
		do {
			System.out.println("Ingrese la edad de la persona: ");
			edad=entrada.nextInt();
			suma=suma+edad;
			contador=contador+1;
			promedio=suma/contador;
			System.out.println("El promedio por ahora es: " + promedio);
			if (promedio>25) {
			   break;  
			}	 
		} while (edad>0);
			  System.out.println("La suma de las edades es : " + suma    + " La Cantidad  de edades ingresadas fueron: "+ contador);
			  System.out.println("El promedio es igual a : "+ promedio);
			  if (promedio>25) {
				  System.out.println("El promedio fue mayor que 25 y ha finalizado");
			  }else {
				  System.out.println("Reinicia el programa ya que el promedio no fue superior a 25");
			  }
		
	}

}
