package com;

public class TiposDeDatos {

	public static void main(String[] args) {
		//main + ctrl  + espacio
		
		//Comentario de una sola línea
		
		/*Comentario 
		 * de multiples
		 * líneas
		 * 
		 */
		
		//CTRL + S para guardar cambios en nuestro codigo
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NÚMERICOS ENTEROS
		 */
		
		//Variable de tipo númerico enetera declarada sin valor asigando 
		byte b; //Ocupa un espacio en memoria de 8 bits (1 byte)
		
		//Posteriormente puedo llamar esta variable y asignarle un valor
		b=126; //admite valores enteros de -128 a 127
		
		//Declarar variables con valores asigandos desde un inicio
		short s = -32768; //ocupa 2 bytes de memoria
		int i = 2147483647; //ocupa 4 bytes de almacenamiento
		long l = 21474836478L; //ocupa 8 bytes de memoria 
		//una vez rebasando el rango de los int, necesita el sufijo "L"
		//para seguir admitiendo los valores
		
		//La variable comodin es la de tipo int
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NÚMERICOS DE PUNTO DECIMAL O COMA FLOTANTE
		 */
		
		float f = 3.1416123456789098f; //Ocupan 4 bytes de memoria 
		//y necesitan del sufijo de la letra "F" para admitir el valor
		double d = 3.1416123456789; //Ocupa 8 bytes 
		//y no necesita de sufijo. Y tiene un rango más amplio que
		//los float
		
		//Double es el tipo de dato más utilizado para decimales
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * BOOLEANOS
		 * CARACTER
		 */
		
		boolean boo = true; //Facilitan el trabajo al evaluar expresiones
		//o condiciones. Solo admiten valores verdadero (true) o falso (false)
		
		char caracter = '='; //Solo admite un caracter. Utilizan 2 bytes de 
		//memoria. Se define su valor entre comilla simple ('').
		
		//TIPOS DE DATOS NO PRIMITIVOS
		
		/*TIPOS DE DATOS ESTRUCTURADOS O TIPOS DE DATO OBJETO
		 */
		
		//String - almacenan secuencias de caracteres/cadenas de texto
		String nombre = "Gerardo Viveros Aguilar"; 
		
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
		
		System.out.println("Hola mundo");
		
		//Atajo para escribir la linea de System.out.println
		//syso + ctrl + espacio
		
		System.out.println(nombre);
		
		//Imprimir valores númericos directamente
		System.out.println(46);
		
		//Concatenar
		System.out.println("El resultado de 46 + 4 es: " + (46+4));
		
		
	}//Cierre del main
}
