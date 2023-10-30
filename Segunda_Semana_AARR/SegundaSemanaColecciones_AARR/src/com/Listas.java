package com;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {

		//Una lista es una coleccion o conjunto de elementos que admite elementos duplicados que implementa
		//Atravez de la clase ArrayList y se basa en un array redimencionable
		//Es de las que mejor rendimiento tienen en la mayoria de situaciones
		
		//Puede almacenar un tipo de datos en común incluyendo objetos.
		
		//Ejemplo: de como declarar una lista de elementos String
		//Estas colecciones se encuentran en los paquetes o en el paquete Java.util por lo que
		//Hay que importarlas
		List<String> lista = new ArrayList<String>();
		
		//Ejemplo de una lista con elementos de tipo entero
		//Las listas solo admiten tipos de datos estructurados, estos son tipos de dato objeto
		List<Integer> numeros = new ArrayList<Integer>();
		
		//Agregar valores a una lista
		lista.add("Elias");
		lista.add("Jafeth");
		lista.add("Sandy");
		lista.add("Marcos");
		lista.add("Rafael");
		lista.add("Elias");
		
		//Visualizar el conjunto de elementos de mi lista
		System.out.println(lista);
		
		//Si quiero mostrar un elemento especifico en consola puedo hacerlo
		System.out.println(lista.get(3));
		
		System.out.println(lista.get(3).equalsIgnoreCase("marcos"));
		
		//.contains() - devuelve true si el elemento existe en la lista
		System.out.println(lista.contains("Elias"));
		
		//.indexOf - devuelve la posición en la que encuentra por primera vez el elemento
		System.out.println(lista.indexOf("Elias"));
		
		//.lastIndexOf - devuelve el indice donde encuentra por ultima vez el elemento
		System.out.println(lista.lastIndexOf("Elias"));
		
		//.remove - elimina al elemento mediante la posición 
		//o mediante el objeto, pero solo elimina el primero que encuentra
		lista.remove(3);
		System.out.println(lista);
		
		lista.remove(3);
		System.out.println(lista);
		//Conforme vamos eliminando elementos los valores en indice se van desplazando siendo ocupados por los otros elementos
		
		//si yo quiero agregar nuevo elemento en la posición 3
		//el elemento que ocupa esa posición va a ser desplazado un lugar hacia adelante mas no eliminado o reemplazado
		lista.add(3, "Enrique");
		System.out.println(lista);
		
		//Reemplazar el valor de una determinada posición
		lista.set(4, "Alexis");
		System.out.println(lista);
		
		//Mostrar todos los valores de forma individual
		for (int i = 0; i < lista.size(); i++) {	
			
			System.out.println(lista.get(i));
			
		}
		
		//podemos declarar una lista sin parametrizar
		List<Object> elementos = new ArrayList<Object>();
		
		//List elementos = new ArrayList();
		//me va a permitir guardar diferentes tipos de datos en ella
		
		elementos.add("Alex");
		elementos.add(1200.59);
		elementos.add(true);
		
		System.out.println(elementos);
		

	}

}
