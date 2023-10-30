package com;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		
		//una lista es una coleccion o conjunto de elemntos
		//que admite elementos duplicados
		//que implementa a traves de la clase arraylist
		//y se basa en un array redimensionable
		//es de las que mejor rendimiento tiene
		//sobre la mayoria de situaciones
		
		//puede almacenar un tipo de datos en comun
		//incluyendo objetos
		
		//ejemplo de como declarar una lista de elementos String
		//estas colecciones se encuentran en el paquete java.util
		//por lo que hay que importarlas
		
		
		List<String> lista=new ArrayList<String>();
		
		//ejemplo de una lista con elementos de tipo entero
		//las listas solo admiten tipos de datos estructurados
		List<Integer> numeros=new ArrayList<Integer>();
		
		//agregar valores a una lista
		lista.add("Elias");
		lista.add("Jafet");
		lista.add("arasandi");
		lista.add("marcos");
		lista.add("Rafael");
		lista.add("Elias");
		
		//visualizar el conjunto de elementos de mi lista
		System.out.println(lista);
		
		//si quiero mostrar un elemento especifico en consola
		System.out.println(lista.get(3));
		
		//.contains()-devuelve true si el elemento existe en la lista
		System.out.println(lista.contains("Rafael"));
		
		//.indexOf-Devuelve la posicion en la que encuentra por primera vez
		//al elemento
		
		System.out.println(lista.indexOf("Elias"));
		
		//.lastindexof-devuelve el indice donde encuentra el elemento
		//la ultima vez
		System.out.println(lista.lastIndexOf("Elias"));
		
		//.remove()-elimina al elemento mediante la posicion
		lista.remove(3);
		System.out.println(lista);
		
		lista.remove(3);
		System.out.println(lista);
		//conforme vamos eliminando elementos, los valores del indice
		//se van desplazando, siendo ocupados por los otros elementos
		
		//si yo quiero agregar un nuevo elemento en la posicion 3
		//el elemento que ocupa esa posicion va a ser desplazado a ala siguiente
		//mas no eliminado
		lista.add(3, "enrique");
		System.out.println(lista);
		
		//reemplazar el valor de una determinada posicion
		lista.set(4, "Alexis");
		System.out.println(lista);
		
		//mostrar todos los valores de forma individual
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		
		//podemos declarar una lista sin parametrizar
		List <Object> elementos=new ArrayList<Object>();
		
		//esto me va a permitir guardar diferentes tipos de dato en ella
		elementos.add("alex");
		elementos.add(1200.59);
		elementos.add(true);
		
		System.out.println(elementos);
		
		
		
		
		
	}

}
