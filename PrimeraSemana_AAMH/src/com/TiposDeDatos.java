package com; //Nombre del paquete

public class TiposDeDatos { //Nombre y apertura de clase

	public static void main (String[] args) {//apertura del main
		//main + CTRL + barra espaciadora
		
		//Comentario de una sola linea
		
		/*Comentario
		 * de
		 * multiples
		 * lineas
		 * 
		 */
		
		//CTRL + S para guardar cambios en nuestro codigo
		
		//TIPOS DE DATOS
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMÉRICOS ENTEROS
		 */
		
		//Variable de tipo numérico entera declarada sin valor asignado
		byte b; //Ocupa un espacio en memoria de 8 bits (1 byte)
		//Posteriormente puedo llamar a esa variable y asignarle un valor
		b=-128; //admite valores enteros de -128 a 127
		
		//Declarar variables con valores asignados desde un inicio
		short s = -32768; //ocupa 2 bytes de memoria
		int i = -2147483648; //ocupa 4 bytes de almacenamiento
		long l = 2147483649L; //ocupa 8 bytes de memoria y
		//una vez rebasado el rango de los int, necesita el sufijo "L"
		//para seguir admitiendo los valores
		
		//La variable más utilizada es la de tipo int
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NÚMERICOS DE PUNTO DECIMAL O COMA FLOTANTE
		 */
		
		float f = 3.1416f; //Ocupan 4 bytes de memoria
		//y necesitan del sufijo la letra "f" para admitir el valor
		double d = 3.141612345697654; //Ocupa 8 bytes
		//y no necesita de sufijo. Y tiene un rango más amplio que
		//los float
		
		//double es el tipo de dato más utilizado para decimales
		
		/*TIPO DE DATOS PRIMITIVOS
		 * BOOLEANOS
		 * CARACTER
		 */
		
		boolean boo = true; //Facilitan el trabajo al evaluar expresiones
		//o condiciones. Solo admiten valores verdadero (true) o falso (false)
		
		char caracter = 'a'; //Solo admite un caracter. Utiliza 2 bytes de
		//memoria. Y se define su valor entre comilla simple ('').
		
		//TIPOS DE DATOS NO PRIMITIVOS
		
		/*TIPOS DE DATOS ESTRUCTURADOS O TIPOS DE DATO OBJETO
		 */
		
		//String - almacenan secuencias de caracteres/Cadenas de texto
		String nombre = "Abraham Alberto Mejía Hernández";
		
		/*TIPOS DE DATO ENVOLTORIO
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
		
		System.out.println ("Hola mundo");
		
		//Ataajo para escribir la linea de System.out.println
		//syso + ctrl + espacio
		
		System.out.println(nombre);
		
		//Imprimir valores númericos directamente
		System.out.println(46+4);
		
		//Concatenar
		System.out.println("El resultado de 46 + 4 es: " + (46+4));
		
	} // Cierre de main
}