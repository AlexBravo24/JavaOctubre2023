package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
		
		//Uso de las clases File, FileReader y BufferReader
		//Cada una nos sirve para una tarea especifíca
		//File - identifica la ruta del archivo 
		//FileReader - nos permite abrir el archivo en modo lectura
		//BufferReader - nos permite leer el contenido 
		//del archivo y acceder al mismo 
		
		//Declaramos un String donde podamos guardar la información 
		//que vamos a leer de un archivo de prueba
		String linea; 
		
		//Utilizar uns estructura try and catch para intentar 
		//realizar la comunicación o lectura del archivo y así poder 
		//controlar una excepción si esta surgiera
		
		try {//Intentar ejecutar el siguiente bloque de código 
			//Clase File - Representación del archivo en memoria
//			File archivo = new File("C:\\Users\\cindy\\Desktop\\archivo.txt");
//			
//			//Para poder leer el archivo hacemos uso de la clase FileReader
//			FileReader fr = new FileReader(archivo);
//			
//			//Ahora sí vamos a leer el contenido del archivo con BufferReader
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
			
			//Escritura de archivos - FileWriter
			
			String nombre = "\nGENERACIÓN 157"; // \n - es introducir un salto de línea 
			
			File archivo = new File("C:\\Users\\cindy\\Desktop\\fichero.txt");
			
			//Hacemos uso de la clase FileWriter para escribir información en el archivo
			
			FileWriter line = new FileWriter(archivo, true); //Agrego el valor booleano
			//true para respetar la información contenida en nuestro archivo originalmente
			
			//Utilizamos el método .wrtite para escribir en nuestro archivo el valor del 
			//String nombre 
			line.write(nombre);
			
			//Para confirmar la escritura utilizamos el método .close()
			line.close();
			
			
		} catch (Exception e) { //Si algo falla, se controla la excepción 
			System.out.println("No se encontró el archivo");
			e.printStackTrace(); //Este método me permite ver la taza de error en consola
			//Ver la excepción que se atrapó aquí
		}

	}

}
