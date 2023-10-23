package com;//Apertura del paquete

public class TiposDeDatos {//Nombre y apertura de clase
 public static void main(String[] args) { //apertura del main
     //usando ctrl+espacio se completa el codigo base
     /*comentario
      * de
      * multiples
      * lineas
      */
	 
     //CTRL + S para guardar cambios
	 //TIPOS DE DATOS
	 
	 /*TIPOS DE DATOS PRIMITIVOS
	  * NUMERICOS ENTEROS
	  */
	 
	 // variable de tipo numerico entera declarada sin valor asignado
	 byte b;
	 
	 //posteriormente puedo llamar a esa variable y asignarle un valor
	 b=-127; //admite valores de -128 a 127
	 
	 //Declarar variables con valores asignados desde un inicio
	 short s=-32768;//ocupa 2 bytes de memoria
	 int i=2147483647; //ocupa 4 bytes de memoria
	 long l=9223372036854775807l; //ocupa una letra L al final del numero para seguir admitiendo los valores
	 //ocupa 8 bytes de memoria
	 
	 //la variable mas utilizada es la de tipo int
	 
	 /*TIPO DE DATOS PRIMITIVOS
	  * NUMERICOS DE PUNTO DECIMAL O COMA FLOTANTE
	  */
	 
	 float f=3.1416f; //ocupan 4 bytes de memoria
	 //necesitan del sufijo de la letra "f" para admitir el valor
	 double d=3.141643183474863; //ocupa 8 bytes
	 //no necesita de sufijos y tiene un rango mas amplio que los float
	 
	 //double es el tipo de dato mas utilizado para decimales
	 
	 /*TIPOS DE DATOS PRIMITIVOS
	  * BOULEANOS
	  * CARACTER
	  */
	 
	 boolean boo= true; //facilitan el trabajo al evaluar expresiones o condiciones
	 //solo admiten valores true o false
	 
	 char caracter= '-'; //solo admiten un caracter. utiliza 2 bytes de memoria
	 //define su valor entre comilla '' simple.
	 
	 //TIPOS DE DATOS NO PRIMITIVOS
	 
	 /*TIPOS DE DATOS ESCTRUTURADOS O TIPOS DE DATO OBJETO
	  */
	 
	 //String almacena secuencias de caracteres/cadenas de texto
	 String nombre = "Rafael valdes vidrio";
	 
	 /*TIPOS DE DATO ENVOLTORIO
	  * WRAPPER
	  * estos tipos de datos envuelven a los primitivos para otorgarles otras propiedas o funcionalidades
	  */
	 
	 Byte by= 127;
	 Short sh;
	 Integer in;
	 Long lo;
	 Float flo;
	 Double dou;
	 Boolean bu;
	 Character ch;
	 
	 //darle salida a nuestros datos en consola
	 
	 System.out.println("hola mundo");//syso+ctrl+espacio
	 System.out.println(nombre);
	 
	 //Imprimir valores numeros directamente
	 System.out.println(46+4);
	 
	 //concatenar
	 System.out.println("El resultado de 46 + 4 es: " + (46+4));
	 
	 
	
 }	//cierre del main
}//cierrre de la clase