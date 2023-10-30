package com;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		// Una lista es una coleccion o conjunto de elementos 
		//Que admite elementos duplicados
		//Se implementa a traves de la clase de ArrayList
		//se basa en un arrar redimensionable
		//es de las que mejor rendimiento tiene 
		//sobre la mayoria de situaciones
		
		
		//puede almacenar un tipo de datos en comun
		//incluye objetos
		
		//ejemplo de como declarar una lista de elementos 
		//string 
		//Estas colecciones se encuentran en el paquete de java.util
		//por lo que hay importarlas
		
		
		List<String>lista = new ArrayList<String>();

		//Ejemplo de una lista con elementos de tipo entero
		//Las listas solo admiten tiposde datos estructurados (objetos)
		List<Integer> numeros = new ArrayList<Integer>();
		
		//Agregar valores a una lista
		lista.add("Elias");
		lista.add("Jafet");
		lista.add("josue");
		lista.add("luis");
		lista.add("Elias");

		
		//vizualizar el conjunto de elementos de mi lista
		System.out.println(lista);
		//si quiero mostrar un elemenyo especifico en consola
		System.out.println(lista.get(3));
		
		//.contains () -Devuelve true si el elemento existe en la lista
		System.out.println(lista.contains("luis"));
	
		//.indexOf -devueve la posicion en la que encuentra por primera
		//vez al elemento
		System.out.println(lista.indexOf("Elias"));
		//.lastIndexOf - Devuelve el indice donde encuentra al elemenyo
		//la ultima vez
		System.out.println(lista.lastIndexOf("Elias"));
		
		//.remove() - elimina al elemento mediante la posicion
		//o mediante el objeto pero lo elimina solo la primera vez que lo encuentra
		
//		lista.remove("Elias");
//		
//		System.out.println(lista);
		
		lista.remove(2);
		System.out.println(lista);
		lista.remove(2);
		System.out.println(lista);
		//Conforme vamos eliminando elementos , los valres del indice
		//se van desplazando. siendo ocupados por los otrs elementos
		
		//Si yo quiero agregar un nuevo elemento en la posicion 3
		//el elemento que ocupa esa posicion va a ser desplazado a la siquiente
		//mas no elimindado o remplazado
		lista.add(2, "Enrique");
		System.out.println(lista);
	
	//Remplazar el valor de una determinada posicion
	lista.set(3, "Alexis");
	System.out.println(lista);
	
	//mostrar todos los valores de forma individual
	
	for (int i = 0; i < lista.size(); i++) {
		System.out.println(lista.get(i));
		
	}
	
	List<Object> elementos = new ArrayList<Object>();
	//Podemos poner esto sin parametros de Object aunque me saldira una
	//advertencia 
	elementos.add("Alex");
	elementos.add(1200);
	System.out.println(elementos);
	
	
	
	
	
	}
	

}
