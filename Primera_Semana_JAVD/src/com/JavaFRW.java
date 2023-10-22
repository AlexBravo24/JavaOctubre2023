package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
		
		//Uso de las clases File, FileReader y BufferedReader
		//Cada una nos sirve para una tarea especifica
		
		//File - identifica la ruta del archivo
		//BufferedReader - nos permite leer el contenido
		//del archivo y acceder al mismo
		
		//Declaramos un String donde podamos guardar la información
		//que vamos a leer de un archivode prueba
		
		String linea;
		
		//Utilizar un bloque try & catch para intentar
		//realizar la comunicación o lectura del archivo y así poder
		//controlar una excepción si esta surgiera
		
		try {//Intentar ejecutar el siguiente cloque de código
			
			//Clase File - Representación del archivo en memoria
//			File archivo = new File("C:\\Users\\Omen\\Documents\\nombre.txt");
//			
//			//Para poder leer el archivo hacemos uso de la clase FileReader
//			FileReader fr = new FileReader(archivo);
//			
//			//Ahora sí vamos a leer el contenido del archivo con BufferedReader
//			BufferedReader buffer = new BufferedReader(fr);
//			
//			//Ahora que ya podemos acceder al contenido y leerlo, lo voy a guardar
//			//en mi String linea para poder mostrarlo finalmente en consola
//			//linea = buffer.readLine();
//			
//			//Si quiero leer más líneas de texto voy a recurrir a un ciclo
//			while((linea=buffer.readLine()) != null) {
//				System.out.println(linea);
//			}			
			
			//Escritura de archivos - FileWriter
			String nombre = "\nGENERACIÓN 157";//\n - es introducir un salto de línea 
			
			File archivo = new File("C:\\Users\\Omen\\Desktop\\nombre.txt");
			
			//Hacemos uso de la clase FileWriter para escribir información en el archivo
			FileWriter line = new FileWriter(archivo,true);//agrego el valor booleano
			//true para respetar la información contenida en nuestro archivo originalmente
			
			//Utilizamos el método .write para escribir en nuestro archivo el valor del
			//String nombre
			line.write(nombre);
			
			//Para confirmar la escritura, utilizamos el método .close()
			line.close();
			
			} catch (Exception e) {//Si algo falla, se controla la excepción
				System.out.println("No se encontró el archivo");
				e.printStackTrace();//Este método me permite 
			}
		
		

	}

}
