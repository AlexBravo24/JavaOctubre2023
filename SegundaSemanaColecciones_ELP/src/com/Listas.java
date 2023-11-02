package com;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		        // Una lista es una coleccion o conjunto de elementos
				// que admite elementos duplicados
				// se implementa a través de la clase ArrayList
				// se basa en un array redimensionable
				// es de las que mejor rendimiento tiene
				// sobre la mayoria de situaciones
				
				// Puede almacenar un tipo de datos en común
				// incluyendo objetos
				
				// Ejemplo de como declarar una Lista de elementos
				// String
				// Estas colecciones se encuentran en el paquete java.util
				// por lo que hay que importarlas
				
				List<String> lista = new ArrayList<String>();
				
				// Ejemplo de una lista con elementos de tipo entero
				// Las listas solo admiten tipos de datos estructurados (Objeto)
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
				
				//Si quiero mostrar un elemento especifico en consola
				System.out.println(lista.get(3));

				//.contains() – Devuelve true si el elemento existe en la lista
				System.out.println(lista.contains("Rafael"));
				
				//.lastIndexOf – Devuelve el indice donde encuentra al elemento
				//la ultima vez
				System.out.println(lista.indexOf("Elias"));
				
				//.lastIndexOf – Devuelve el indice donde encuentra al elemento
				//la ultima vez
				System.out.println(lista.lastIndexOf("Elias"));
				
				//.remove() – elimina al elemento mediante la posición 
				//o mediante el objeto
				lista.remove(3);
				
				System.out.println(lista);
				
				lista.remove(3);
				System.out.println(lista);
				
				//Conforme vamos eliminando elementos, los valores del índice
				//se van desplazando, siendo ocupados por los otros elementos

				//Si yo quiero agregar un nuevo elemento en la posición 3
				//el elemento que ocupa esa posición va a ser desplazado a la siguiente posición
				//más no eliminado o reemplazado
				lista.add(3,"Enrique");
				System.out.println(lista);
				
				//Reemplazar el valor de una determinada posición
				lista.set(4, "Alexis");
				System.out.println(lista);
				
				//Mostrar todos los valores de forma individual
				for (int i = 0; i < lista.size(); i++) {
				System.out.println(lista.get(i));
				}
				
				//Podemos declarar una lista sin parametrizar
				List elementos = new ArrayList();
				
				//Esto me va a permitir guardar diferentes tipos de dato en ella
				elementos.add("Alex");
				elementos.add(1200.59);
				elementos.add(true);

				System.out.println(elementos);

	}

}
