package com;

public class TiposDeDatos {
   
	public static void main (String [] args){
		
		//Tipos de datos
		
		/*Tipos de datos primitivos
		 * Numericos Enteros
		 */
		//Variable de tipo numerico entera declarada sin valor asignado
		byte b; //Ocupa un espacion en memoria de 8 bits
		//posteriormente puedo llamar a la variable y asirgnarle un valor
		b=127; //admite valores enteros de -128 a 127
		
		//declarar variables con valores asignados desde un principio
		
		short s = -32768;//ocupa 2 bytes de memoria
		int i = 2147483647; // ocupa 4 bytes de almacenamiento
		long l = 2147483647L; //ocupa 8 bytes de memoria y una vez rebadado el rango de los int, necesita el sufijo "L" para seguir admitiendo los valores
		
		float f = 3.141612345697654F; //Ocupa 4 bytes de memoria y necesitan el sufijo de la letra F para admitir el valor
		
		double d =  3.141612345697654; //ocupa 8 bytes y no necesita de sufijo y tiene un rango mas amplio que los float
		
		boolean boo = true; //Facilitan el trabajo al evaluar expresiones o condiciones, solo admiten valores true o false
		
		char caracter = '9'; //solo admite un caracter, utilizan 2bytes de memoria y se define su valor entre comilla simple (' ') 
		
		//tipos de datos no primitivos
		
		String nombre = "Jafet torres juarez"; //almacena secuencia de caracteres o secuencia de textos
		
		//Tipos de datos envoltorio
		
		Byte by = 127;
		Short sh;
		Integer in;
		Long lo;
		Float flo;
		Double dou;
		Boolean bu;
		Character ch;
		
		System.out.println("Hola mundo");
		
		System.out.println(nombre);
		
		System.out.println(46 + 4);
		
}
}
