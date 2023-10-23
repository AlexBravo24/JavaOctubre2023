
//Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el
//ancho y el alto. Ejemplo: 8 x 8 

package com.ciclos;

import java.util.Scanner;

public class Ciclos11_JAVD {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
		 
		 int an,al;
		 
		 System.out.println("Ingresa el ancho del cuadro:");
		 an=in.nextInt();
		 System.out.println("Ingresa el alto del cuadro:");
		 al=in.nextInt();
		 
		 for(int i=1;i<=an;i++) {			 
			 for(int j=1;j<=al;j++) {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }

	}

}
