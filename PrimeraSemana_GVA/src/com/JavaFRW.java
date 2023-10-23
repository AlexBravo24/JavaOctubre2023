package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
		
		//Uso de las clases File, FileReader y BufferReader
		//Cada una nos sirve para una tarea especif�ca
		//File - identifica la ruta del archivo 
		//FileReader - nos permite abrir el archivo en modo lectura
		//BufferReader - nos permite leer el contenido 
		//del archivo y acceder al mismo 
		
		//Declaramos un String donde podamos guardar la informaci�n 
		//que vamos a leer de un archivo de prueba
		String linea; 
		
		//Utilizar uns estructura try and catch para intentar 
		//realizar la comunicaci�n o lectura del archivo y as� poder 
		//controlar una excepci�n si esta surgiera
		
		try {//Intentar ejecutar el siguiente bloque de c�digo 
			//Clase File - Representaci�n del archivo en memoria
//			File archivo = new File("C:\\Users\\cindy\\Desktop\\archivo.txt");
//			
//			//Para poder leer el archivo hacemos uso de la clase FileReader
//			FileReader fr = new FileReader(archivo);
//			
//			//Ahora s� vamos a leer el contenido del archivo con BufferReader
//			BufferedReader buffer = new BufferedReader(fr);
//			
//			//Ahora que ya podemos acceder al contenido y leerlo, lo voy a guardar 
//			//en mi String linea para poder mostrarlo finalmente en consola
//			//linea = buffer.readLine();
//			
//			//Si quiero leer m�s lineas de texto, voy a recurrir al uso de un ciclo
//			while ((linea = buffer.readLine()) != null) {
//				System.out.println(linea);
//			}
			
			//Escritura de archivos - FileWriter
			
			String nombre = "\nGENERACI�N 157"; // \n - es introducir un salto de l�nea 
			
			File archivo = new File("C:\\Users\\cindy\\Desktop\\fichero.txt");
			
			//Hacemos uso de la clase FileWriter para escribir informaci�n en el archivo
			
			FileWriter line = new FileWriter(archivo, true); //Agrego el valor booleano
			//true para respetar la informaci�n contenida en nuestro archivo originalmente
			
			//Utilizamos el m�todo .wrtite para escribir en nuestro archivo el valor del 
			//String nombre 
			line.write(nombre);
			
			//Para confirmar la escritura utilizamos el m�todo .close()
			line.close();
			
			
		} catch (Exception e) { //Si algo falla, se controla la excepci�n 
			System.out.println("No se encontr� el archivo");
			e.printStackTrace(); //Este m�todo me permite ver la taza de error en consola
			//Ver la excepci�n que se atrap� aqu�
		}

	}

}
