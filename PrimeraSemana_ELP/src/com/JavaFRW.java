package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
		
		// Uso de las clases files, FileReader y BufferedReader
		// Cada una nos sirve para una tarea especifica
		// File - identifica la ruta del archivo
		// FileReader - nos permite leer el contenido
		/// del archivo y accceder al mismo
		
		//Declaramos un String donde podamos guardar la informacion
		//que vamos a leer de un archivo de prueba
		
		String linea;
		
		// Utilizar una estructua try & catch para intentar
		// realizar la comunicación o lectura del archivo y así poder
		// controlar una excepción si esta surgiera.
		
		try { // Intentar ejecutar el siguiente bloque de código
			//Clase File = Representación del archivo en memoria
//			File archivo = new File("C:\\Users\\usuar\\OneDrive\\Escritorio\\fichero.txt");
//			//Para poder leer el archivo hacemos uso de la clase FileReader
//			FileReader fr = new FileReader (archivo);
//			
//			//Ahora si vamos a leer el contenido del archivo con BufferedReader
//			BufferedReader buffer = new BufferedReader(fr);
//			
//			//Ahora que ya podemos acceder al contenido y leerlo, lo voy a guardar
//			//en mi String linea para poder mostrarlo finalmente en consola
//			//linea = buffer.readLine();
//			
//			//Si quiero leer más lineas de texto, voy a recurrir al uso de un ciclo
//			while ((linea = buffer.readLine()) != null) {
//				System.out.println(linea);
//			}
//			
//			System.out.println(linea);
//			
//		} 
			//Escritura de archivo - FileWriter
			
			String nombre = "\nGENERACION 157";
			
			File archivo = new File("C:\\Users\\usuar\\OneDrive\\Escritorio\\fichero.txt");
// Hacemos uso de la clase FileWriter para escribir información en el archivo
			FileWriter line = new FileWriter(archivo, true); // Agrego el valor booleano
			//true para respetar la informacion contenida en nuestro archivo originalmente
			
			
			//Utilizamos el método .write para escribir en nuestro archivo el valor del
			//String nombre
			
			line.write(nombre);
			
			//Para confirmar la escritura, utilizamos el método .close()
			line.close();
			
			
			
		} catch (Exception e) { //Si algo falla, se controla la exepción
			e.printStackTrace(); //Este metodo me permite ver la traza de error en consola
			//es decir, ver la excepcion que se atrapo por aqui
			System.out.println("No se encontro el archivo");
			
		}
		}
}
	


