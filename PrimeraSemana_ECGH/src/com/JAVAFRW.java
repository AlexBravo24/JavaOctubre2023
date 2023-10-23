package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JAVAFRW {

	public static void main(String[] args) {
		// Uso de las clases File, FileReader y BufferedReader
		//Cada una nos sirve para una tarea esoecifica
		//File-Identifica la ruta del archivo
		//BufferedReader-Nos permite leer el contenido
		//del archivo y acceder al mismo
		
		//Declaramos un String donde oidamos guardar la informaci�n
		//que vamos a ller de un archivo de prueba
		
		String linea;
		
		//Utilizar una estructura try & catch para intentar
		//realizar la comunicacion o lectura del archivo y asi poder 
		//controlar una excepci�n si esta surgiera
		
		try {//Intentar ejecutar el siguiente boque de codigo
			
			//Clase File - Representacion del archivo en meroria 
//			File archivo= new File("C:\\Users\\ECGH_\\Desktop\\archivo.txt");
//			
//			//Para poder leer el archivo hacemos uso de la clase FileReader
//			FileReader fr=new FileReader(archivo);
//			
//			//Ahora si vamos a leer el contenido del archivo con BufferedReader
//			BufferedReader buffer=new BufferedReader(fr);
//			
//			//Ahora que ya podemos acceder al contenido y leerlo, lo voy a guardar
//			//en mi String linea para poder mostrarlo finalmente en consola
//			//linea=buffer.readLine();
//			
//			//Si quiero ver m�s lineas de texto, voy a recurrir al uso de un ciclo 
//while((linea=buffer.readLine())!=null) {
//	
//	System.out.println(linea);
//	
//}			
			

			//Escritura de archivos-FileWriter
			
			String nombre="\nGENERACION 157";

			File archivo= new File("C:\\Users\\ECGH_\\Desktop\\Fichero.txt");
			
			//Hacemos uso de la clase FileWriter para escribir informaci�n en el archivo
			FileWriter line= new FileWriter(archivo,true);//Agrefo el valor booleano
			//true para respetar la informaci�n contenida en nuestro archivo originalmente
			
			//Utilizamos el m�todo .write para escribir en nuestro archivo el valor 
			//String nombre
			line.write(nombre);
			
			//Para confirmar la escritura, utilizamos el m�todo .close
			
			line.close();
			
			
			
		} catch (Exception e) {//Si algo falla, se controla la excepci�n
			// TODO: handle exception
			System.out.println("No se encontr� el archivo");//En este ejemplo no se visualiza el error 'e'
		e.printStackTrace();//Este m�todo me permite ver la traza de errro en consola
		//es decir,ver la excepci�n que se atrap� aqu�
		
		}
		
		
		
		
		

	}

}
