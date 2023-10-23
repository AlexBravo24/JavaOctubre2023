package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
		// Uso de las clases File, FileReader y BufferedReader
		//Cada una nos sirve para una tarea especifica
		//File - identifica la ruta del archivo
		//FileReader nos permite abrir el archivo en modo lectura
		//BufferedReader - nos permite leer el contenido
		//del archivo y acceder al mismo
		
		//declaramos un String donde podamos guardar la informaci�n
		//que vamos a leer de un archivo de prueba
		
		String linea;
		
		//Utilizar una estructura try & catch para intentar
		//realizar la comunicaci�n o lectura del archivo y as� poder
		//controlar una excepci�n si esta surgiera
		
		try {//intentar ejecutar el siguiente bloque de codigo
			
			//Clase File - Representaci�n del archivo en memoria
//			File archivo = new File("C:\\Users\\ingel\\OneDrive\\Escritorio\\fichero.txt");
//			
//			//Para poder leer el archivo hacemos uso de la clase FileReader
//			FileReader fr = new FileReader(archivo);
//			
//			//Ahora si vamos a leer el contenido del archivo con BufferedReader
//			BufferedReader buffer = new BufferedReader(fr);
//			
//			//Ahora que ya podemos acceder al contenido y leerlo, lo guardo en
//			//String linea para poder mostrarlo finalmente en consola
////			linea = buffer.readLine();
//			
//			//Si quiero leer m�s lineas de texto, voy a recurrir al uso de un ciclo
//			while ((linea = buffer.readLine()) !=null) {
//			System.out.println(linea);
//			}	
			
			//Escritura de archivos - FileWriter
			
			String nombre = "\nGENERACION 157"; // \n es introducir un salto de linea
			
			File archivo = new File("C:\\Users\\ingel\\OneDrive\\Escritorio\\fichero.txt");
			
			//Hacemos uso de la clase FileWriter para escribir informaci�n en el archivo
			FileWriter line = new FileWriter(archivo, true); //Agrego el valor booleano true
			//para respetar la informaci�n contenida en nuestro archivo originalmente
			
			//Utilizamos el m�todo .write para escribir en nuestro archivo el valor del
			//String nombre
			
			line.write(nombre);
            
			//Para conformar la escritura, utilizamos el m�todo .close()
			line.close();
			
		}
		
		catch (Exception e) { //Si algo falla, se controla la excepci�n
			System.out.println("No se encontro el archivo");
			e.printStackTrace(); //Este metodo me permite ver la traza de error en consola 
			//es decir, ver la excepcion que se atrapo aqui
			
		}	
			
			
		}

	}
