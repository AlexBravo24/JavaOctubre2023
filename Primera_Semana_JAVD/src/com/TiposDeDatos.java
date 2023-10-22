package com;//Nombre del paquete

public class TiposDeDatos {//Nombre y apertura de clase

	public static void main(String[] args) {//apertura del main
		//main + ctrl + espacio
		
		//Comentario de una sola línea
		
		/*Comentario
		 * de
		 * multiples
		 * líneas
		 */
		
		//CTRL + S para guardar nuestro código
		
		//TIPOS DE DATOS
		
		/*
		 * TIPOS DE DATOS PRIMITIVOS
		 * NUMÉRICOS ENTEROS
		 */
		
		//Variable de tipo numérico entera declarada sin valor asignado
		byte b;//Ocupa un espacio en la memoria de 8 bits (1 byte)
		//Posteriormente puedo llamar a esa variable y asignarle un valor
		b=127;//admite valores enteros de -128 a 128
		
		//Declarar variables con valores asignados desde un inicio
		short s= -32768;//ocupa 2 bytes de memoria
		int i= 2147483647;//ocupa 4 bytes de memoria
		long l= 2147483649L;//ocupa 8 bytes de memoria y una vez rebasado
		//el rango de los int, necesita el sufijo "L" para seguir admitiendo
		//los valores.
		
		//La variable más utilizada es la de tipo int
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NÚMERO DECIMAL O COMA FLOTANTE
		 */
		
		float f= 3.141612345697654F;//Ocupan 4 bytes de memoria
		//y necesitan del sufijo de la letra "F" para admitir el valor
		double d=3.141612345697654;//Ocupa 8 bytes
		//y no necesita del sufijo. Y tiene un rango más amplio que los float
		
		//double es el tipo de dato más utilizado para decimales
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * BOOLEANOS
		 * CARACTER
		 */
		
		boolean boo=true;//Facilitan el trabajo al evaluar expresiones
		//o condiciones. Solo admiten valores verdadero (true) o falso (false)
		
		char caracter= 'd';//Solo admiten un caracter. Utilizan 2 bytes de memoria.
		//Y se define su valor entre comillas simples (' ').
		
		//TIPOS DE DATOS NO PRIMITIVOS
		
		/*TIPOS DE DATOS ESTRUCTURADOS O TIPO DE DATO OBJETO
		 */
		
		//String - almacena secuencias de caracteres/Cadenas de texto
		String nombre="Javier Aldair Veronica Dominguez";
		
		/*TIPOS DE DATO ENVOLTORIO
		 * WRAPPER
		 * Estos tipos de datos envuelven a los primitivos para otorgarles
		 * otras propiedades o funcionalidades
		 */
		Byte by=127;
		Short sh;
		Integer in;
		Long lo;
		Float flo;
		Double dou;
		Boolean bu;
		Character ch;
		
		//Darle salida a nuestros datos en consola
		
		System.out.println("Hola mundo");
		
		//Atajo para escribir la linea de System.out.println
		//syso + ctrl + espacio
		
		System.out.println(nombre);
		
		//Imprimir valores numéricos directamente
		System.out.println(46+4);
		
		//Concatenar
		System.out.println("El resultado de 46 + 4 es: " + (46+4));
		
	}
	
}
