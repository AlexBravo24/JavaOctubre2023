package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {

		// uso de las clases FileReader y Bufferedreader
		// cada una nos sirve para una tarea en especifico
		// File- identifica la ruta del archivo
		// BufferedReader - nos permite leer el contenido del archivo y acceder al mismo
		// FileReader - nos permite abrir el archivo en modo lectura

		// declaramos un String donde podamos guardar la informacion
		// que vamos a leer de un archivo dde prueba

		String linea;

		// Utilizar una estructura try & catch para intentar
		// realizar la comunicacion o lectura del archivo y asi poder controlar una
		// excepcion si esta surgiera

		try {// intenta ejecutar el siguiente bloque de codigo

			// clase file - representacion del archivo en memoria
//			File archivo = new File("C:\\Users\\marcos\\Desktop\\fichero.txt");
//
//			// para poder leer el archivo hacemos uso de la clase FileReader
//
//			FileReader fr = new FileReader(archivo);
//
//			// Ahora si vamos a leer el contenido del archivo con BufferedReader
//
//			BufferedReader buffer = new BufferedReader(fr);
//
//			// Ya que se puede acceder al contenido y leerlo se va a guardar en la variable
//			// de String linea para poder mostrarlo finalmente en consola
//			
////			linea = buffer.readLine();
////			System.out.println(linea);
//			
//			
////			while ((linea = buffer.readLine()) !=null) {
////				
////				System.out.println(linea);
////				
////			}

			// escritura de archivos

			String nombre = "\nGeneracion 157";
			File archivo = new File("C:\\Users\\marcos\\Desktop\\fichero.txt");

			// se hace uso de la clase filewriter para escribir informacion en el archivo
			FileWriter line = new FileWriter(archivo, true);// agrego el valor booleano para respetar el valor que exite
															// en el archivo
			// se utiliza el metodo .write para escribir en el archivo el valor del string
			// nombre
			line.write(nombre);
			// para confirmar la escritura utilizamos el metodo .close()

			line.close();

		} catch (Exception e) { // si algo falla, se cotrola la excepcion
			System.out.println("No se encontro el archivo");
			e.printStackTrace();// permite ver la traza de error, es decir ver la excepcion que se atrapo

		}

	}

}
