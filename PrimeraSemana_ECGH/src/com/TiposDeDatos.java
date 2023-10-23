package com;//nombre del paquete

public class TiposDeDatos {//Nombre y pertura de clase

	public static void main(String[] args) {//apertura del main
		
		/*
		 * 
		 * 
		 */

		//CTRL + S para guardar código
		
		//Tipos de datos
		
		/*
		 * TIPOS DE DATOS PRIMITIVOS
		 * NUMEéRICO ENTEROS
		 */
		
		//Variable de tipo númerico entera declarada sin valor asignado
		byte b; //Ocupa un espacio de memoria de 8 bits (1 byte) 
		//Posteriormente puedo llamar a esa variable y asignarle un valor
		b=127;// Admite valores de -128 a 127
		
		//Declarar variables con valores asignados dedes un inicio 
		short s=-32768;//ocupa 2 bytes de memoria
		int i=2147483647;//ocuoa 4 bytes de almacenamieto
		long l=2147483647L;//ocupa 8 bytes de memoria y
		//una vez rebasado el rango de los int, necesita el sufijo "L"
		//para seguir admitiendo valores
		
		//La variable más utilizada es la de tipo int
		
		
		/* TIPOS DE DATOS PRIMITIVOS 
		 * NUMERICOS DE PUTO DECIMAL Y COMA FLOTANTE
		 */
	float f=3.141612345611548F;//Ocupan 4 bytes de memoria INVESTIGAR 	
	//y necesitan del sufijo de la letra "F" para admitir el valor 

	double d=3.141612345611548;//Ocupa 8 bytes
	//y no necesita de subfijo. Y tiene un rango más amplio que 
	//los float
	
	//double es el tipo de dato más utilizado para decimales (porque no utiliza el subfijo)
	
	/*TIPOS DE DATOS PRIMITIVOS 
	 * BOOLEANOS
	 * CARACTER
	 */
	boolean boo=true; //Facilitan el trabajo al evaluar expresiones
	//o condiciones. Solo admiten valores verdadero (true) o falso(false)
	
	char caracter='a';//Solo admiten un caracter. Utilizan 2 bytes de 
	//memoria. Y se define su valor enre comilla simple('').
	
	//TIPOS DE DATOS NO PRIMITIVOS
	
	/*TIPOS DE DATOS ESTRUCTURADOS O TIPOS DE DATO OBJETO
	 */
	
	//String- almacenan secuencias de caracteres/Cadenas de texto
	String nombre="Elias Christopher Garcia Herrera";
	
	/*TIPOS DE DATO ENVOLTORIO
	 * WRAPPER
	 * Estos tipos de datos envuelven  los primitivos pata otorgarles
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
	
	//Darle salida a uestros datos en consola
	
	System.out.println("Hola mundo");
	
	//Atajo para escribir la linea de System.out.println
	//syso + ctrl+espacio
	System.out.println(nombre);
	
	//Imprimir valores numericos directamente
	System.out.println(46+4);
	
	//Concatenar (unir texto, numeros, etc)
	System.out.println("El resultado de 46+4 es: " +(46+4) );
	//hay que encerrar entre parentesis para que se concatene el resultado de la suma
	
	}//cierre del main
}//cierre de la clase
