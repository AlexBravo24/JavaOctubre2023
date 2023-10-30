package com;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		
		//Una lista es una colecci�n o conjunto de elementos 
		//Que admite elementos duplicados 
		//Se implementa a trav�s de la clase ArrayList 
		//Se basa en un array redimensionable
		//Es de las que mejor rendimiento tiene 
		//sobre la mayor�a de situaciones 
		
		//Puede almacenar un tipo de datos en com�n 
		//incluyendo objetos 
		
		//Ejemplo de como declarar una Lista de elementos String
		//Est�s colecciones se encuentran en el paquete java.util
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
		
		//Si quier mostrar un elemento especif�co en consola
		System.out.println(lista.get(3));
		
		//.contains() - Devuelve true si el elemento existe en la lista
		System.out.println(lista.contains("Rafael"));
		
		//.indexOF - Devuelve la posici�n en la que encuentra por primera vez
		//al elemento
		System.out.println(lista.indexOf("Elias"));
		
		//.lastIndexOf - Devuelve el �ndice donde encuentra el elemento 
		//la �ltima vez
		System.out.println(lista.lastIndexOf("Elias"));
		
		//.remove() - Elimina al elemento mediante la posici�n o mediante el objeto
		//Pero lo elimina solo la primera vez que lo encuentra
		lista.remove(5);
		System.out.println(lista);
		
		lista.remove(2);
		System.out.println(lista);
		
		//Conforme vamos eliminando elementos, los valores del �ndice 
		//se van desplazando, siendo ocupados por los otros elementos
		
		//Si yo quiero agregar un nuevo elemento en la posici�n 3
		//el elemento que ocupa esa posici�n va a ser desplazado al siguiente
		//m�s no eliminado o reemplazado
		lista.add(3, "Enrique");
		System.out.println(lista);
		
		//Reemplaar el valor de una determinada posici�n
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
