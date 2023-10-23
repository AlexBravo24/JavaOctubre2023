package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class JavaFRW {

	public static void main(String[] args) {
		// Uso de las clases fileReader y BufferReader
		
		// Cada una nos sirve para una tarea en especifico
		//File identifica la ruta del archivo
		// FileReader nos permite abrir el archivo en modo lectura
		// BufferReader nos permite leer el contenido de archivo y acceder al mismo
		
		//Declaramos un String donde podamos guardar la informaciòn 
		// que vayamos a leer de un archivo de prueba
		
		String linea;
		
		//Utilizar una estructura try & catch para intentar
		//realizar la comunicacion  o lectura del archivo
		//y asi poder controlar una excepciòn si està sugiera
		
		try {//Intenta ejecutar el siguiente bloque de codigo
			
			//Clase File seria la representacion del archivo en memoria
			
//			File archivo = new File("C:\\Users\\Arasandi\\Desktop\\fichero.txt");
//			
//			//Para poder leer el archivo hacemos uso de FifeRider
//			
//			FileReader fr = new FileReader(archivo);
//			
//			//Ahora vamos a leer el contenido del archivo con BufferedReader
//			
//			BufferedReader buffer = new BufferedReader(fr);
//			
//			//Ahora que podemos acceder al contenido y leerlo 
//			// lo guardo en mi String linea para poder mostrarlo finalmente en consola
//			
//			//linea = buffer.readLine();
//			
//			//Si quiero leer màs lineas de texto voy a recurrir a un ciclo while 
//			
//			while((linea = buffer.readLine())!=null) {
//				System.out.println(linea);
//			}
			
			// Escitura de Archivos FileWrite
			String nombre = "Generacion 157";
			File archivo = new File("C:\\Users\\Arasandi\\Desktop\\fichero.txt");
			
			//Hacemos Uso de la clase FileWrite para escribir la informaciòn
			FileWriter line =new FileWriter(archivo, true);
			line.write(nombre);
			
			line.close();
			
		}catch (Exception e) {// Si algo falla, se controla la excepcion
			System.out.println("no se encontro el archivo");
			e.printStackTrace(); //Este metodo me sirve para ver la traza de error en consola
		}
		}

	
	}

	


