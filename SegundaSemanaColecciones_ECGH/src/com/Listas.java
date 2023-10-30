package com;


import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		// Una lista es una colleción o conjunto de elemntos 
		//que adite elementos duplicaods 
		//se implmenta a traves de ala claseArrayList
		//Se basa en un array redimensionable
		//Es de las que mejor rendimiento tiene 
		//sobre la mayoría de situaciones 
		
		//Puede almacenar un tipo de datos en común 
		//icluyengo objetos
		
		//Ejemplo de como declarar una lista de elementos 
		//String
		//Estas colecciones se encuentran en el paquete java.until
		//por lo que hay que importarlas
		
		List<String>lista=new ArrayList<String>();
		
		//Ejemplo de una list con elementos de tipo entero
		//Las listas solo admiten tipo de datos estructurados (Objeto
		List<Integer>numeros=new ArrayList<Integer>();
		
		//Agregar valores a una lista
		lista.add("Elias");
		lista.add("Jafet");
		lista.add("Aradandi");
		lista.add("Marcos");
		lista.add("Rafael");
		lista.add("Elias");
		
		//Visualizar el conjunto de elementos en mi lista
		System.out.println(lista);
		
		//Siquiero mostrar un elemento especifico en consola
		
		System.out.println(lista.get(3));
		
		//.contains()-devuelve true si el elemento existe en la lista
		System.out.println(lista.contains("Rafael"));
		
		//.indexOf - Devuelve la posicion en la que encuentra por primera
		//vez al elemento
		System.out.println(lista.indexOf("Elias"));
		
		//.lastIndexOf - Devuelce elindicie donde encuentra al elemento 
		//la ultima vez
		
		System.out.println(lista.lastIndexOf("Elias"));
		
		//.remove() - elimina al elemento mediante la posicion
		//o mediante el objeto pero lo elimina soo al primera vez que lo encuentra
		
		lista.remove(3);
		System.out.println(lista);

		lista.remove(3);
		System.out.println(lista);
		//Conforme vamos eliminando elementos, los valores del indice
		//sevan desplazando, siendo ocupados por los otros elementos
		
		
		//Si yo quiero agregar un nuevo elemento en la posición 3 
		//el elemento que ocupa esa osicion va a ser desplazando a la 
		//siguiente más no eliminado o reemplazado
		lista.add(3,"Enrique");
		System.out.println(lista);
		
		//Reemplazar el valor de una determinada posición
		lista.set(4, "Alexis");
		System.out.println(lista);
		
		//Mostrar todos los valores de forma individual
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		//Podemos declarr una lista sin parametrizar (definir dato)
		//List elementos=new ArrayList();
		List<Object> elementos=new ArrayList<Object>();//es equivalente a la de arriba
		
		//Esto me va a permitir guardar diferentes tipos de datos en ella
		elementos.add("Alex");
		elementos.add(1200.53);
		elementos.add(true);
		
		System.out.println(elementos);
;		
		
	}

}
