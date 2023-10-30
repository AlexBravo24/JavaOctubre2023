package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Cientifica calcu=new Cientifica();
		calcu.setColor("Gris");
		calcu.setGraficadora("Sin graficadora");
		calcu.setMarca("Casio");
		calcu.setModelo("fx-991ES PLUS");
		calcu.setNoFunciones(8);
		calcu.setPilas("Pila de botón");
		
		System.out.println(calcu);
		
		System.out.println("Introduce el primer dato");
		double dato1=input.nextDouble();
		System.out.println("Introduce el segundo dato");
		double dato2=input.nextDouble();
		
		System.out.println("La suma de "+dato1+"+"+dato2+" es "+calcu.suma(dato1, dato2));
		System.out.println("La resta de "+dato1+"-"+dato2+" es "+calcu.resta(dato1, dato2));
		System.out.println("La multiplicación de "+dato1+"x"+dato2+" es "+calcu.multiplicacion(dato1, dato2));
		System.out.println("La división de "+dato1+"/"+dato2+" es "+calcu.division(dato1, dato2));

		System.out.println();
		calcu.tomarTemperatura();
		
		input.close();
	}

}
