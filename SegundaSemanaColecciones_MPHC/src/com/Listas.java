package com;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		// Una lista es una coleccion o conjunto de elementos
		// Que admite elmentos duplicados
		// Se implementa a traves de la claase ArrayList
		// Se basa en un Array redimencionable
		// Es de las que mejor rendimiento tiene
		// Sobre la mayoria de situaciones

		// Puede almacenar un tipi de datos en comun
		// incluyendo objetos

		// Ejemplo de como declarar una Lista de elmentos String
		// Estas coleccioness se encuentran en el paquete java.util por lo que hay que
		// importarlas

		List<String> lista = new ArrayList<String>();

		// Ejemplo de una lista con elemntos de tipo entero
		// Las listas solo admiten tipos de datos estructurados(objeto)

		List<Integer> numeros = new ArrayList<Integer>();

		// agregar valores a una lista

		lista.add("Elias");
		lista.add("Jafet");
		lista.add("Arasandi");
		lista.add("Marcos");
		lista.add("Rafael");
		lista.add("Elias");

		//
		System.out.println(lista);
		// Siquiero mostrar un elemento en especifico en consola
		System.out.println(lista.get(3));
		// .contains() -Devuelve true si el elemento existe en la lista
		System.out.println(lista.contains("Rafael"));

		// .idexof . devuelve la posicion en la que se encuentra por primera vez al
		// elemento
		System.out.println(lista.indexOf("Elias"));

		// .lastindexof -Devuelve el idice donde encuentra el elmento la ultima vez

		System.out.println(lista.lastIndexOf("Elias"));

		// .remove() elimina el elemento mediante la posicion
		// o mediante el objeto pero lo elimina solo la primera vez que lo encuentra
		lista.remove(3);

		System.out.println(lista);
		lista.remove(3);
		System.out.println(lista);
		// Conforme vamos eliminando elementos, los valores de indice se van
		// desplazando, siendo ocupado por los otros elementos

		// Si yo quiero agregar nuevo elemento en la posicion 3
		// el elemnto que ocupe esa posicion va a ser desplazado a la siguiente posicion
		// mas no eliminado o remplazado

		lista.add(3, "Enrique");

		System.out.println(lista);
		// Remplazr el valor en determinada posicion
		lista.set(4, "Alexis");

		System.out.println(lista);

		// Mostar todos los valores de forma individual

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));

		}
        // Se puede declarar una lista sin parametrizar
		List<Object> elementos = new ArrayList<Object>();

		// Esto me va a permitir guardar diferentes tipos de datos en ella

		elementos.add("Alex");
		elementos.add(1200.59);
		elementos.add(true);
		System.out.println(elementos);
	}

}
