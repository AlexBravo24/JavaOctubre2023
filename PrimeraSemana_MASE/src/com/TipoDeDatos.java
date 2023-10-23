package com;

public class TipoDeDatos {
	
	public static void main(String[] args) {
		/*Tipos de datos primitivos
		 * Tipos de datos Numericos
		 */
		//variable de tipo numerico entero declarada sin valor asignable
		//byte //b;// ocupa un espacio en memoria de 8 bytes
		//posteriormente le asigno un valor
		
		//b=-128;//admite valores de -128 a 127
		
		//Declarar variables de valores asignados desde un inicio
		
		short s = -32768; //ocupa 2 bytes de memoria
		
		int i = 2147483647; //ocupa 4 bytes de almacenamiento
		
		long l = 2147483649l; //ocupa 8 bytes de memoria y una vez rebasado
		//el rango int; necesita el sufijo "L" para seguir admitiendo valores
		
		//la variable màs utilizada es de tipo int
		/* Tipos de Datos Primitivos
		 * Numericos de Punto Decimal o Coma Flotante
		 */
		 float f = 3.14161234586325F; //ocupan 4 bytes de memoria 
		 //y necesitan del sufijo de la letra "F" para admitir el valor
		 
		 double d = 3.141615255256652; //ocupa 8 bytes, no necesita de sufijos  y tiene un tipo de dato mas amplio
		 
		 //double es el tipo de dato màs utilizado para decimales
		 
		 /* Tipo de Datos Primitivos 
		  * booleanos
		  * Caracteres
		  */
	      boolean b  = true; //Facilitan el trabajo al evaluar expreciones 
	      // o condicione. Solo admiten valores verdadero (true) o falso (false)
	
	      char caracter = 'a'; //Solo admite un caracter. Utiliza 2 bytes de memoria
	      //Y define su valor entre comillas simples ('').
	      
	      
	      //Tipos de Datos NO Primitivos
	      //Tipos de Datos Estructurado  o Tipos de Dato Objeto
	      
	      String nombre = "Arasandi"; //String - almacenan secuencias de caracteres/cadenas de Texto 
	      
	      /* Tipo de Dato Envoltorio
	       * Wrapper
	       * Estos Tipos de datos envuelven a los primitivos para otorgarles
	       *  otras propiedades y funcionalidades
	       */
	     
	      Byte by = 127;
	      Short sh;
	      Integer in;
	      Long lo;
	      Float flo;
	      Double dou;
	      Boolean boo;
	      Character ch;
	      
	      //Darle salida a nuestros datos
	      
	      System.out.println("Hola mundo");
	      System.out.println("nombre");
	       System.out.println(46+4);
	       System.out.println("el resultado de 46+4 es : " + (46+4));
	      
	
	}
	

}
