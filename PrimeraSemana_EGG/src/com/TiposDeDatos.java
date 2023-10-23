package com; //Nombre del paquete

public class TiposDeDatos { //Nombre y apertura de clase

	/**
	 * @param args
	 */
	public static void main (String [] args) { //apertura del main
		//main + ctrl + espacio
		
		//Comentario de una sola linea
		
		/*Comentarios
		 * de 
		 * multiples
		 * lineas
		 * 
		 */
		
		//CTRL + S PARA GUARDAR CAMBIOS EN NUESTRO CÓDIGO
		
		//TIPOS DE DATOS
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NÚMERICOS ENTEROS
		 */
		
		//Variable de tipo númerico entera declarada sin valor aignado
		byte b; //Ocupa un espacio en memoria de 8 bits(1byte)
		
		//Posteriormente puedo llamar a esa variabley asignarle un valor
		b=127; //admiye valores entre -128 a 127
		
		//Declarar variables con valores asignados desde un inicio
		short s = -32768;//ocupa 2 bytes de memoria
		int i = 2147483647;//ocupa 4 bytes de almacenamiento
		long l = 2147483649L;//ocupa 8 bytes de memoria y 
		//una vez rebasado el rango de los int, necesita ek sufico "L"
		//para seguir admitiendo valores
		
		//La variable más utilizada es la de tipo int
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NÚMERICOS DE PUNTO DECIMAL O COMA FLOTANTE
		 */
		
		float f =3.141612345697654F; //Ocupa 4 bytes de memoria
		//y necesitan del sufijo de la letra "F" para adminitir el valor
		double d = 3.141612345697654; //Ocupa 8 bytes
		//Y no necesita de sufijo. Y tiene un rango más amplio que 
		//los float
		
		//double es el tipo de dato más utilizado para decimales
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * BOOLEANOS
		 * CARACTER
		 */
		
		boolean boo = true; //Facilitan el tgrabajo al evaluar expresiones
		//o condiciones. Solo adminten verdadero (true) o falso (false)
		
		char caracter = 'a'; //Solo admiten un caracter. Utilizan 2 bytes de
		//memoria. Y se define su valir entre comilla simple ('').
		
		
		//TIPOS DE DATOS NO PRIMITIVOS
		
		/*TIPOS DE DATOS ESTRUCTURADOS O TIPOS DE DATOS OBJETO
		 */
		
		//String - almacenan secuencias de caracteres/Cadenas de texto
		String nombre = "Emmanuel Galves Galvan"; 
		
		/*TIPOS DE DATOS ENVOLTORIO
		 * WRAPPER
		 * Estos tipos de datos envuelven a los primitivos para otorgarles
		 * otras propiedades o funcionalidades
		 */
		
		Byte by = 127;
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
		
		//Imprimir valores numericos directamente
		System.out.println(46+4);
		
		//Concatenar 
		System.out.println("El resultado de 46 + 4 es; " + (46+4));
		
		
	}//Cierre del main
	
}//Cierre de la clase
