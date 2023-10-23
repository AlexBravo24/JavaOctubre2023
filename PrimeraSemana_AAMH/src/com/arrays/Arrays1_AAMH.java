package com.arrays;

import java.util.Scanner;

public class Arrays1_AAMH {

	public static void main(String[] args) {
		//1.Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde.
		
		    
		Scanner entrada = new Scanner (System.in); //Creación de un objeto Scanner
        int[] array = new int[5];
        int i, limiteDelArreglo;
        System.out.println("Ingrese el limite del arreglo");
        limiteDelArreglo = entrada.nextInt();
        
        System.out.println ("Digite los elementos del arreglo");
        for ( i= 0; i<limiteDelArreglo; i++){
            
            array[i]= entrada.nextInt();
            System.out.println ("El Indice ["+ (i) +"]="+ " esta en el valor "+array[i]);
        }
        for ( i= 0; i<limiteDelArreglo; i++){
            System.out.print(array[i]+ ", ");
        } 
        
	}

}
