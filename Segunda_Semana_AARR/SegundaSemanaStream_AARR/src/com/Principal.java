package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {

		//Api Stream- Funcionalidad a partir de Java 8
		//que nos permite manipular colecciones de datos
		//lo cual nos va a permitir filtrar informacion
		//ordenarla etc. 
		//Todo a traves de la fuente (.stream)
		//y posteriormente funciones intermedias
		
		//Crear una lista de elementos persona
		List<Persona> lista = new ArrayList<Persona>();
		
		//Vamos a crear otra lista para agregar los elementos filtrados cuando utilicemos los elementos respectovos
		List<Persona> listaFiltrada = new ArrayList<Persona>();
		
		//Añadir elementos a nuestra lista original
		lista.add(new Persona("Emanuel", 22, "Masculino"));
		lista.add(new Persona("Abraham", 25, "Masculino"));
		lista.add(new Persona("Rafael", 27, "Masculino"));
		lista.add(new Persona("Arasandi", 21, "Femenino"));
		lista.add(new Persona("Alexis", 28, "Masculino"));
		lista.add(new Persona("Elias", 26, "Masculino"));
		lista.add(new Persona("Marcos", 22, "Masculino"));
		lista.add(new Persona("Alex", 37, "Masculino"));
		
		//Para imprimir cada elemento de la lista  utilizamos un ciclo for o for each
//		for(Persona i: lista) {
//			System.out.println(i);
//		}
		
		//ciclo foreach de una sola linea
		//lista.forEach(a -> System.out.println(a));
		
		//otra sintaxis para imprimir todos los elementos de una lista
		//lista.forEach(System.out::println);
		
		//Vamos a ver como podriamos filtrar elementos de la lista original por medio de un criterio
		//Por ejemplo por genero:
//		for(Persona i: lista) {
//			if(i.getGenero().equals("Masculino")) {
//				listaFiltrada.add(i);
//			}
//		}
//		listaFiltrada.forEach(System.out::println); 
		
		//Vamos a realizar la misma accion filtrar por genero pero ahora utilizando la api Stream
		
//			listaFiltrada = lista.stream()//Esta linea pasa los datos de mi lista a traves de una tuberia o embudo
//				.filter(i -> i.getGenero().contentEquals("Femenino"))//Filtra los datos de acuerdo a un criterio
//				.collect(Collectors.toList());//Una vez filtrados los coleccionamos para agregarlos a la listaFiltrada
//		System.out.println(listaFiltrada);
		
		
		//Ordenar personas por edad ascendente
//		listaFiltrada = lista.parallelStream().sorted(Comparator.comparing(Persona::getEdad))
//				.collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
//		
//		//Forma descendente
//		listaFiltrada = lista.parallelStream().sorted(Comparator.comparing(Persona::getEdad).reversed())
//				.collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
//		
//		//ordenar por nombre
//		listaFiltrada = lista.parallelStream().sorted(Comparator.comparing(Persona::getNombre))
//				.collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
//		
//		//Solicitar el conteo de los elementos de una lista
//		long conteo = lista.stream().count();
//		System.out.println(conteo);
		
		//Filtrado de la persona con menor edad
		//La clase Optional nos permite manejar valores que pudieran ser nulos en un momento dado en un flujo de datos
		Optional<Persona> menorEdad = lista.stream()
				.min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
		
		
		
		
	}

}
