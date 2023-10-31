package com;


import java.util.ArrayList;
import java.util.List;

public class listas {

	public static void main(String[] args) {
		
		
		// Una lista es una coleccion o conjunto de elementos 
		//Que admite elementos duplicados 
		//Se implementa a traves de la clase ArrayList
		//Se basa en un array redimencional
		//Es de las que mejor rendimiento tiene
		//sobre la mayoria de situaciones
		
		
		//Puede almacenar un tipo de datos en comùn 
		//Incluyendo objetos
		
		//Ejemplo de como declarar una lista de elementos de tipo String
		
		//Estas colecciones se encuentran en el paquete java.util
		//por lo que hay que importalas
		
		List<String> lista =new ArrayList<String>();
		
		//Ejemplo de una lista con elementos de tipo entero
		//Las listas solo admiten tipos de datos estructurados (Objetos)
		List<Integer> numeros =new ArrayList<Integer>();

		
		//Agregar valores a una lista
		lista.add("Elias");
		lista.add("Jafet");
		lista.add("Arasandi");
		lista.add("Marcos");
		lista.add("Rafael");
		lista.add("Arasandi");
		
		//Visualizar el conjunto de elementos  de mi lista
		System.out.println(lista);
		
		//Puedo mostrar un elemento especifico en consola
		System.out.println(lista.get(2));
		
		//.contains() devuelve true si el elemento existe en la lista
		System.out.println(lista.contains("Arasandi"));
		
		//.indexOf- Devuelve la posicion en la que encuentra por primera vez al elemento
		System.out.println(lista.indexOf("Arasandi"));
		
		//.lastIndexof devuelve el indice donnde se encuentra al elemnto la ultima vez
		System.out.println(lista.lastIndexOf("Arasandi"));
		
		//.remove() elimina al elemento mediante  la posicion
		lista.remove("Elias");
		System.out.println(lista);
		
		//Conforme vamos eliminando, los valores  del indice 
		//se van  desplazando, siendo ocupados por los otros elemntos
		
		//Si yo quiero agregar un elemnto en la posicion 3
		//el elemnto que ocupa esa posicion  va a ser desplazado a la 
		//siguiente posicion mas no eliminado o reemplazado
		
		lista.add(3,"Enrrique");
		System.out.println(lista);
		
		//Reemplazar el valor de una determinada pocision 
		lista.set(4, "Alexis");
		System.out.println(lista);
		
		//Mostrar todos los valores de forma individual
		for (int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
			
			//Podemos declarar una lista sin parametrizar
			List elementos= new ArrayList();
			elementos.add("Ara");
			elementos.add(1200);
			elementos.add("Hola");
			elementos.add(true);
			
			System.out.println(elementos);
			
		}

	}

}
