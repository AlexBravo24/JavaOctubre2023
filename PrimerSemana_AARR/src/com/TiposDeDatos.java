package com;//nombre del paquete

public class TiposDeDatos {//nombre y apertura de clase
	
	public static void main(String[] args) {//apertura de main
		//escribimos main + control + espaciadora y genera el main
		
		//este es un comentario de una sola linea
		/* comentario
		 * multiples 
		 * lineas
		 */
		
		/* 
		 * tipos de datos primitivos
		 * numericos enteros
		 */
			
			//variable numerico entera declarada sin valor asignado
			byte b; //tipo de dato byte -128 a 127 y ocupa un espacio en memoria de 8 bits (1 byte)
			//posteriormente puedo llamar esa variable y asignarle un valor
			b=-128;
			
			//declarar variables con valores asignados desde un inicio
			short s = -32678; // ocupa 2 bytes de memoria va de -32678 a 32677
			int i = 2147483647; //ocupa 4 bytes de memoria va de -2,147,483,648 al 2,147,483,647
			long l = 2147483647654L;//ocupa 8 bytes de memoria, cuando supera el numero maximo de un int se declara como Long necesita el sufijo L al finasl de la linea para seguir admitiendo los valores
			//la variable mas utilizada es la de tipo int
			
			
			/*tipos de datos primitivos
			 * numéricos de punto decimal o coma flotante
			 */
			float f = 3.1416F;//los float al igual que los long necesitan el sufijo "f" y utilizan 4 bytes de memoria, supuestamente usa 6 a 7 digitos decimales
			double d = 3.141612345697654; // ocupa 8 bytes de memoria, no necesita sufijo y tiene un rango mas amplio que los float
			//double es la variable mas utilizada con decimales
			
			/*tipos de datos primitivos
			 * booleanos
			 * caracter
			 */
			boolean boo = true;//solo puede ser true o false, facilitan el trabajo al evaluar expresiones o condiciones
			char caracter = 'a';//se guarda entre '' simples en forma de texto y que sea 1 solo caracter, utiliza 2 bytes de memoria
			
			/*tipos de datos no primitivos
			 * tipos de datos de estructura o de objetos
			 */
			String nombre = "Alexis Antonio Real Robles";//el tipo de dato string es una clase en Java
			
			/*tipo de dato envoltorio
			 * WRAPPER
			 * envuelven a los datos primitivos para otorgarles otras propiedades o funcionalidades
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
			
			//forma o atajo para escribir System.out.println es syso + ctrl + espacio (tambien sout)
			System.out.println(nombre);
			
			//imprimir valores numericos directamente
			System.out.println(46);
			//tambien mandar a llamar un numero directamente
			System.out.println(46+4);
			//concatenar es unir texto con valores numericos etc.
			System.out.println("el resultado de 46 + 4 es: " + (46+4));
			
			
	}//cierre main
	
}//cierre clase

