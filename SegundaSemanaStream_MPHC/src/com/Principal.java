package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {

		// Api Strema es una funcionalidasd a partir de java 8 que nos permite almacenar
		// colecciones de datos y nos va a permitir filtrar la informacion ordenarla,
		// etc..
		// Todo a traves de una fuente (.stream)
		// y posteriormente funciones intermedias

		// Vamos a crer una lista de elementos PERSONAS

		List<Persona> lista = new ArrayList<Persona>();

		// crear otra lista para agregar los elmentos filtrados cuando utilicemos los
		// metodos respectivos.

		List<Persona> listaFiltrada = new ArrayList<Persona>();

		lista.add(new Persona("Manuel", 22, "Masculino"));
		lista.add(new Persona("Abraham", 25, "Masculino"));
		lista.add(new Persona("Rafael", 27, "Masculino"));
		lista.add(new Persona("Arasandi", 21, "Femenino"));
		lista.add(new Persona("Alexis", 26, "Masculino"));
		lista.add(new Persona("Elias", 26, "Masculino"));
		lista.add(new Persona("Marcos", 22, "Masculino"));
		lista.add(new Persona("Alex", 37, "Masculino"));

		// Para imprimir a cada elemento de la lista solamente utilizar un ciclo for o
		// for each

//		for (Persona i: lista) {
//			System.out.println(i);
//		}
//		

		// Ciclo for each en una sola linea

		// lista.forEach(a-> System.out.println(a));

		// Otras sintaxis para imprimir todos los elementos de una lista

//		lista.forEach(System.out::println);

		// Como filtrar elemntos de la lista por medio de un criterio, por ejemplo: por
		// genero

		for (Persona i : lista) {

			if (i.getGenero().equals("Masculino"))
				
			{
				listaFiltrada.add(i);

			}

		}

		listaFiltrada.forEach(System.out::println);

		// Esta linea filtra los datos de acuerdo a un criterio

		// Una vez filtrados los coleccionamos para agregarlos a las listaFiltrada
//		listaFiltrada= lista.stream().filter(i->i.getGenero().equals("Femenino"))
//		.collect(Collectors.toList());
//		
//		System.out.println(listaFiltrada);
//		
//		
//		listaFiltrada= lista.stream().sorted(Comparator.comparing(Persona::getEdad))
//				.collect(Collectors.toList());
//		listaFiltrada.forEach(a -> System.out.println(a));
//		
//
//		listaFiltrada= lista.stream().sorted(Comparator.comparing(Persona::getEdad).reversed())
//				.collect(Collectors.toList());
//		listaFiltrada.forEach(a -> System.out.println(a));
//		

//		listaFiltrada= lista.stream().sorted(Comparator.comparing(Persona::getNombre))
//				.collect(Collectors.toList());
//		listaFiltrada.forEach(a -> System.out.println(a));
//		
//
//		listaFiltrada= lista.stream().sorted(Comparator.comparing(Persona::getNombre).reversed())
//				.collect(Collectors.toList());
//		listaFiltrada.forEach(a -> System.out.println(a));

		long conteo = lista.stream().count();

		System.out.println(conteo);

		// Filtrado de persona con menor edad
		// la clase optional nos permite manejar valores que pudieran ser nulos en un
		// momentodado en un flujo de datos
		Optional<Persona> menorEdad = lista.stream().min(Comparator.comparing(Persona::getEdad));
        
		System.out.println(menorEdad);
	}

}
