package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
		
		//uso de las clases file, filereader y bufferedreader
		//cada una nos sirve para una tarea especifica
		//file- identifica la ruta del archivo
		//Filereader nos permite abirr el archivo en modo lectura
		//Bufferedreader - nos permite leer el contenido
		//del archivo y acceder al mismo
		
		
		//declaramos un string donde podamos guardar la informacion
		//que vamos a  leer en un archivo de prueba
		
		String linea;
		
		//utilizar una estructura try & catch para intentar
		//realizar la comunicacion o lectura del archivo y asi poder
		//controlar una excepcion si esta surgiera
		
		try {//intentar ejecutar el siguiente bloque de codigo
			//clase file -representacion del archivo en memoria
//			File archivo=new File("C:\\Users\\USER\\OneDrive\\Escritorio\\ficher.txt");
//		//para poder leer el archivo hacemos uso de la clase file reader
//			FileReader fr=new FileReader(archivo);
//			
//			//ahora si vamos a leer el contenido del archivo con BufferedReader
//			
//			BufferedReader buffer=new BufferedReader(fr);
//			
//			//ahora que ya podemos acceder al contenido y leerlo, lo voy a guardar
//			//en mi String linea para poder mostrarlo en consola
//			
//			//linea=buffer.readLine();
//			
//			//si quiero leer mas lineas de tecto, voy a recurrir al uso de un ciclo
//			while((linea=buffer.readLine())!=null) {
//				System.out.println(linea);	
//			}
			
			//escritura de archivos -FileWriter
			
			String nombre="\nGENERACION 157";//\n salto de linea
			
			File archivo=new File("C:\\Users\\USER\\OneDrive\\Escritorio\\fichero.txt");
			
			//HACEMOS USO DE LA CLASE FILEWRITER PARA ESCRIBIR INFORMACION EN EL ARCHIVO
			FileWriter line=new FileWriter(archivo, true); //agrego el valor booleano
			//true para respetar la informacion contenida en nuestro archivo originalmente
			
			//utilizamos el metodo .write para escribir en nuestro archivo el valor del 
			//String nombre
			
			line.write(nombre);
			
			//para confirmar la escritura, utilizamos el metodo .close()
			
			line.close();
			
		} catch (Exception e) {//si algo falla, se controla la excepcion
			System.out.println("No se encontro el archivo");
			e.printStackTrace();//este metodo me permite ves la traza de error en consola
			//es decir, ver la excepcion que se atrapo aqui
		}

	}

}
