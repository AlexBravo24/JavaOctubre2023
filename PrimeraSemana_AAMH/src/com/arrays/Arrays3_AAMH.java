package com.arrays;

import java.util.Scanner;

public class Arrays3_AAMH {

	public static void main(String[] args) {
		// 3. Pide al usuario por teclado una frase 
		//y pasa sus caracteres a un array de caracteres.
		
		Scanner sn=new Scanner(System.in);
        
        //Pido al usuario que escriba una frase
        System.out.println("Escriba una frase: ");
         
        //Recomiendo usar nextLine en lugar de next por los espacios
        String frase=sn.nextLine(); 
         
        //Creamos un array de caracteres
        char caracteres[]=new char[frase.length()];
         
        //Recorremos la frase y cogemos cada caracter y lo metemos en el array
        for(int i=0;i<frase.length();i++){
            caracteres[i]=frase.charAt(i);
            System.out.println(caracteres[i]);
        }

	}

}