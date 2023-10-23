package com.ciclos;

import java.util.Scanner;

public class Ciclos11_ECGH {
	public static void main(String[] args) {
		// 11.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el ancho y el alto. 
		//Ejemplo: 8 x 8
		
		int alto;
		int ancho;
        String cadena="";

		Scanner entrada=new Scanner(System.in);
		
System.out.println("Introduce ancho del rectángulo:");
ancho=entrada.nextInt();
System.out.println("Introduce alto del rectángulo:");
alto=entrada.nextInt();

for(int i=0;i<ancho;i++) {
	cadena+="*";
}

for(int j=0;j<alto;j++) {
	System.out.println(cadena);
}


entrada.close();
	
	}

}
