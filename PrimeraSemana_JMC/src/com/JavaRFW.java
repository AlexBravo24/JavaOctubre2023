package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaRFW {

	public static void main(String[] args) {
		
		// Uso de las clases File , FileReader y BufferedReader
		//File - identifica la ruta del archivo
		//fileReader no permite abrir el archivo en modo lectura
		//

		
		
		
		//declaramos un String donde podamos guardar la informacion
		//que vamos a leer de un archivo de prueba
		String linea;
		
		//Utilizar una estructura try & catch para intentar
		//realizar la comunicacion o lectura del archivo y asi poder 
		//controlar una excepcion
		
		try {//Intenta ejecutar el siguiente bloque de codigo
			
//			//Clase file - representacion del archivo en memoria
//			File archivo = new File("C:\\Users\\user1\\Desktop\\fichero.txt");
//			
//			//Para poder leer el archivo hacemos uso de la clase FileReader
//			FileReader fr = new FileReader(archivo);
//			
//			//Ahora vamos a leer el contenido del archivo con BufferedReader
//			BufferedReader buffer = new BufferedReader(fr);
//			
//			//Ahora que ya podemos acceder al contenido y leerlo, lo voy a guardar
//			// en mi String linea para poder mostrarlo en consola
//			
//			
//			//linea = buffer.readLine();
//			
//			//si quiero leer mas lineas de texto, voy a recurrir al uso de un ciclo
//			while ((linea = buffer.readLine()) !=null) {
//				System.out.println(linea);	
//			}
//			
//			System.out.println(linea);
			
			//Escriyura de archivos - FileWriter
			
			String nombre = "\nGeneracion 157";// recuerda (\n) es salto de linea
			
			File archivo = new File("C:\\Users\\user1\\Desktop\\fichero.txt");
			
			//Hacemos uso de la clase FileWriter para escribir en el archivo
			FileWriter  line = new FileWriter(archivo,true);//agrego el valor booleano
			//true para respetar la informacion contenida en nuestro archivo originalmente
			
			//Utilizamos el metodo . Write para escribir en nuestro archivo el valor
			//del String Nombre
			line.write(nombre);
			
			//Para confirmar la escritura, utilizamos el metodo .close()
            line.close();
			
		} catch (Exception e) {//si algo falla, se controla la excepcion
			System.out.println("No se encontro el archivo");
			e.printStackTrace();//este metodo me permite ver la traza del error en consola 
			//es decir, ver la excepcion que atrapo aqui
		}
		
		
		
		
	}

}
