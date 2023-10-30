package com;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		
		//Una lista es una colección o conjunto de elementos 
		//Que admite elementos duplicados 
		//Se implementa a través de la clase ArrayList 
		//Se basa en un array redimensionable
		//Es de las que mejor rendimiento tiene 
		//sobre la mayoría de situaciones 
		
		//Puede almacenar un tipo de datos en común 
		//incluyendo objetos 
		
		//Ejemplo de como declarar una Lista de elementos String
		//Estás colecciones se encuentran en el paquete java.util
		//Por lo que hay que importarlas 
		
		List<String> lista = new ArrayList<String>();
		
		//Ejemplo de una lista con elementos de tipo entero
		//Las listas solo admiten tipos de datos estructurados (Objeto)
		List<Integer> numeros = new ArrayList<Integer>();
		
		//Agregar valores a una lista
		lista.add("Elias");
		lista.add("Jafet");
		lista.add("Arasandi");
		lista.add("Marcos");
		lista.add("Rafael");
		lista.add("Elias");
		
		//Visualizar el conjunto de elementos de mi lista
		System.out.println(lista);
		
		//Si quier mostrar un elemento especifíco en consola
		System.out.println(lista.get(3));
		
		//.contains() - Devuelve true si el elemento existe en la lista
		System.out.println(lista.contains("Rafael"));
		
		//.indexOF - Devuelve la posición en la que encuentra por primera vez
		//al elemento
		System.out.println(lista.indexOf("Elias"));
		
		//.lastIndexOf - Devuelve el índice donde encuentra el elemento 
		//la última vez
		System.out.println(lista.lastIndexOf("Elias"));
		
		//.remove() - Elimina al elemento mediante la posición o mediante el objeto
		//Pero lo elimina solo la primera vez que lo encuentra
		lista.remove(5);
		System.out.println(lista);
		
		lista.remove(2);
		System.out.println(lista);
		
		//Conforme vamos eliminando elementos, los valores del índice 
		//se van desplazando, siendo ocupados por los otros elementos
		
		//Si yo quiero agregar un nuevo elemento en la posición 3
		//el elemento que ocupa esa posición va a ser desplazado al siguiente
		//más no eliminado o reemplazado
		lista.add(3, "Enrique");
		System.out.println(lista);
		
		//Reemplaar el valor de una determinada posición
		lista.set(4, "Alexis");
		System.out.println(lista);
		
		//Mostrar todos los valores de forma individual 
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			
		}
		
		//Podemos declarar una lista sin parametrizar 
		List<Object> elementos = new ArrayList<Object>();
		
		//Esto me va a permitir guardar diferentes tipos de datos en ella 
		elementos.add("Alex");
		elementos.add(1200.59);
		elementos.add(true);
		
		System.out.println(elementos);
	}

}
