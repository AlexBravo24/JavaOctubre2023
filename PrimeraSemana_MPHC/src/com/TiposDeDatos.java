package com;  // Nombre del paquete

public class TiposDeDatos {  // Nombre y apertura de clse
	


	public static void main(String[] args) { // apertura del main
		
	//Variable de tipo numerica entera declarada sin valor asignado
		byte b;//1 byte de almacenamiento
		
		
		b=127;
		
		
		short s=-32768;  //2 bytes de almacenamiento
		
		int i=2147483647;//4 bytes de almacenamiento
		
		long l=2147483648l;
		//8 bytes de memoria y una vez rebasado el rango de los int, necesita el sufijo "L"
		//para seguir admitiendo los valores
		
		
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUmericoa  de punto decimal o coma flotante
		 */
		
		float f=3.1416f;//ocupan 4 bytes de memoria y necesitan del sufijo de la letra f para admitir el valor
		double d =3.1416; // tipo de dato mas utilizado para decimales
		
		/*
		 * Tipos de datos primitivos
		 * Booleanos
		 * Caracter
		 */
		boolean boo= true;
		// Facilitan el trabajo a evaluar expresiones o condiciones.
		// solo admiten valores  true or false
		
		char caracter='a'; 
		//solo admiten un caracter. Utilizan 2 bytes de memoria
		// sw define su valor entere comillas simples('')
		
		
		// TIPOS DE DATOS NO RPIMITIVOS
		
		
		/*
		 * TIPOS DE DATOS ESTRUCTUTRADOS O TIPOS DE DATOS OBJETO
		 */
		// String - almacenan secuencias de caracteres/cadenas de texto
		String nombre = "Marcos";
		
		/*
		 * TIOS DE DATOS ENVOLTORIO
		 * WRAPPER
		 * Estos tipos de datos envuelven a los primitivos para otorgarles otras propiedade3s o funcionalidades
		 */
		
		Byte by=127;
		Short sh;
		Integer in;
		Long lg;
		Float fl;
		Double db;
		Boolean bo;
		Character ch;
		
		// imprimir valores numericos directamente
		System.out.println("Hola mundo");
		
		System.out.println(nombre);
		
		System.out.println(46+4);
		System.out.println("El resultado de 46 + 4 es:"+ (46+4)); // ejemplo de concatenar e imprimir


		
	}// cierre del main
	

}//cieere de la clase

