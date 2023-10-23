package com.condicionales;

import java.util.Scanner;
public class Condicionales8_MASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner entrada =new Scanner(System.in);
 
 int dado;
 
 //
 System.out.println("Cara del dado");
 dado=entrada.nextInt();
 
 //
 switch (dado) {
 
 case 1:
	 System.out.println("En la cara opuesta està el \"seis\".");
	 break;
 case 2:
	 System.out.println("En la cara opuesta està el \"cinco\".");
	 break;
 case 3:
	 System.out.println("En la cara opuesta està el \"cuatro\".");
	 break;
 case 4:
	 System.out.println("En la cara opuesta està el \"tres\".");
	 break;
 case 5:
	 System.out.println("En la cara opuesta està el \"dos\".");
	 break;
 case 6:
	 System.out.println("En la cara opuesta està el \"uno\".");
	 break;
 default:
	 System.out.println("ERROR: Numero incorrecto");
	 break;
	 
 }
 
 
 
	}

}
