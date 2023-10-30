package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {

		// API Stream - Funcionalidad a partir de Java 8
		// Que nos permite manipular colecciones de datos
		// Lo cual nos va a permitir filtrar información,
		// ordenarla, etc
		// Todo a través de una fuente (.stream)
		// y posteriormente funciones intermedias

		// Vamos a crear una lista de elementos persona
		List<Persona> lista = new ArrayList<Persona>();

		// Crear otra lista para agregar los elementos filtrados cuando
		// utilicemos los métodos respectivos
		List<Persona> listaFiltrada = new ArrayList<Persona>();

		// Añadir elementos a nuestra lista original

		lista.add(new Persona("Emmanuel", 22, "MASCULINO"));
		lista.add(new Persona("Abraham", 25, "MASCULINO"));
		lista.add(new Persona("Rafael", 27, "MASCULINO"));
		lista.add(new Persona("Arasandi", 21, "FEMENINO"));
		lista.add(new Persona("Alexis", 28, "MASCULINO"));
		lista.add(new Persona("Elias", 26, "MASCULINO"));
		lista.add(new Persona("Marcos", 22, "MASCULINO"));
		lista.add(new Persona("Alex", 37, "MASCULINO"));

		// Para imprimir cada elemento de la lista
		// solemos utilizar el ciclo for o for each

//		for(Persona i: lista) {
//			System.out.println(i);
//		}

		// Ciclo for each en una sola línea
		// lista.forEach(a -> System.out.println(a));

		// Otra sintáxis para imprimir todos los elementos de una lista
		// lista.forEach(System.out::println);

		// Vamos a ver como podriamos filtrar elementos de la lista original
		// por medio de un criterio. Por ejemplo, por genero
//		for(Persona i: lista) {
//			if(i.getGenero().equals("MASCULINO")) {
//				listaFiltrada.add(i);
//			}			
//		}

//		listaFiltrada.forEach(System.out::println);

		// Vamos a realizar la misma acción de filtrar por genero
		// pero ahora utilizando la API Stream

		// listaFiltrada = lista.stream()//Esta linea pasa los datos de mi lista a
		// través de una
		// tubería (embudo)
//				.filter(i -> i.getGenero().equals("FEMENINO"))//esta línea filtra los datos
		// de acuerdo a un criterio
//				.collect(Collectors.toList());//Una vez filtrados los coleccionamos
		// para agregarlos a la listaFiltrada

//		System.out.println(listaFiltrada);

		// Ordenar a las personas por edad ascendente
//		System.out.println("------------Ascendente------------");
//		listaFiltrada = lista.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
//
////		listaFiltrada.forEach(System.out::println);
//		listaFiltrada.forEach(a -> System.out.println(a));
//
//		// Ordenar a las personas por edad descendente
//		System.out.println("------------Descendente------------");
//		listaFiltrada = lista.stream().sorted(Comparator.comparing(Persona::getEdad).reversed())
//				.collect(Collectors.toList());
//
////		listaFiltrada.forEach(System.out::println);
//		listaFiltrada.forEach(a -> System.out.println(a));

		// Ordenar a las personas por nombre descendente
//		System.out.println("------------Descendente------------");
//		listaFiltrada = lista.stream().sorted(Comparator.comparing(Persona::getNombre).reversed())
//				.collect(Collectors.toList());
//
////				listaFiltrada.forEach(System.out::println);
//		listaFiltrada.forEach(a -> System.out.println(a));
		
		//Solicitar el conteo de los elementos de una lista
//		long conteo = lista.stream().count();
//		
//		System.out.println(conteo);
		
		//Filtrado de la persona con menor edad
		
		//La clase Optional nos permite manejar valores que pudieran ser nulos
		//en un momento dado en el flujo de datos
		Optional<Persona> menorEdad = lista.stream().min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);

	}

}
