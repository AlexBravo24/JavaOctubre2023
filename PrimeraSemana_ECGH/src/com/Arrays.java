package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// Declarando un array de números enteros con su tamaño
int [] numeros= new int [6];

//Guardar o asignar valores a cada posición del array
numeros[0]=1;
numeros[1]=10;
numeros[2]=20;
numeros[3]=30;
numeros[4]=40;
numeros[5]=15;//Si quiero agregar una posición más,
//puedo "hacerlo", porque la sintaxis es corracta, sin embargo 
//el indice no existe, porque el array ya tiene un tamaño declarado



//Imprimir en consola determinada posicion del array

//System.out.println(numeros[5]);


//Declarando un Scanner para solicitar los valores por teclado

Scanner input= new Scanner(System.in);

int[] numeros2= new int [5];

//for (int i=0;i<numeros2.length;i++) {
//	System.out.println("Ingresa un número en la posición "+i);
//	numeros2[i]=input.nextInt();
//}


//for (int i = 0; i < numeros2.length; i++) {
//	System.out.print(numeros2[i]+" ");
//}
//

//Otra manera de declarar un array
//Es con sus valores definidos desde un inicio
int[] numeros3= {100,200,300,400,500};

char[]nombre= {'E','l','i','a','s'};

//System.out.println(nombre);


String[] nombres= {"Abraham","Rafael","Jafet","Jareth","Marcos"};

//Otra forma de imprimir todos los valores de un array
//es con un ciclo for each

for(String i:nombres) {//Para cada elemento del array
	System.out.println(i);//imprimelo cada uno en una linea nueva
	
	
}





//Si ya no utilizo mi Scanner para introducir datos,
//lo correcto seria cerrarlo para ahorrar recursos de memoria



input.close();








	}

}
