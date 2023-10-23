package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
		// Uso de las clases File, FileReader y BufferedReader
		// Cada una nos sirve para una tarea especifica
		// File - identifica la ryta dek archivo
		// FileReader nos permite abrir el archivo en modo lectura
		// BufferedReader - nos permite leer el contenido
		// del archivo
		
		//Declaramos un String donde podamos guardar la informacion
		//que vamos a leer de un archivo de prueba
		
		String linea;
		
		// Utilizar una estructura try & catch para intentar
		// realizar la comunicación o lectura del archivo y así poder
		// controlar una excepcion si esta surgiera
		
		try { // Intentar ejecutar el siguiente bloque de código
			// Clase File - Representación del archivo en memoria
//			File archivo = new File("C:\\Users\\mane_\\OneDrive\\Desktop\\fichero.txt");
//			
//			// Para poder leer el archivo hacems uso de la clase FileReader
//			FileReader fr = new FileReader(archivo);
//			
//			//ahora si vamos a leer el contenido del archivo con BufferedReader
//			BufferedReader buffer = new BufferedReader(fr);
//			
//			// Ahora que ya podemos acceder al contenido y leerlo, lo voy a guardar
//			// en mi String linea para poder mostrarlo finalmente en consola
//			
//			// linea = buffer.readLine(); // para leer una linea
//			// System.out.println(linea); //para leer solo la primer linea
//			
//			//Si quiero leer más lineas de texto, voy a recurrir al uso de un ciclo
//			
//			while ((linea = buffer.readLine()) != null) {
//				System.out.println(linea);
//			}
				
			
			/* 
			 * La Escritura de archivos - FileWriter
			 */
			
			String nombre = "\nGENEREACION 157"; // \n - es introducir un salto de linea
			
			File archivo = new File("C:\\Users\\mane_\\OneDrive\\Desktop\\fichero.txt");
			
			// Hacemos uso de la clase FIleWriter para escribir informacion en el archivo
			FileWriter line = new FileWriter(archivo, true); //Agrego el valor booleano
			//true para respetar la información contenida en nuestro archivo originalmente
			
			// Utilizamos el metodo. write para escribir en nuestro archivo el valor del
			// String nombre
			line.write(nombre);
			
			// Para confirmar la escritura, utilizamos el método .close()
			line.close();
			
			
			
		//atrapar la excepción que se encuentra guardada en el catch (Exception e)	
		} catch (Exception e) { // Si algo falla, se controla la excepción
			System.out.println("No se encontro el archivo");
			e.printStackTrace(); //Este método me permite ver la traza de error en consola
			//es decir, ver la excepcion que se atrapo aquí
			
		}

	}

}
