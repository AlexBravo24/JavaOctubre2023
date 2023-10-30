package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		// API Stram- Funcionalinalidad a partir de java 8
		//Que nos permite manipular colecciones de datos 
		//Lo cual nos va a permitir filtrar la información
		//ordenarla, etc
		//Todo a traves de una fuente (.stream)
		//y posteriormente funciones intermedias
		
		//Vamos a crear una Lista de elementos Persona
		
		List <Persona> lista=new ArrayList<Persona>();
		
		//Crear otra lista para agregar los elementos filtrados cuando 
		//utilicemos los métodos respectivos
		
		List<Persona> listaFiltrada=new ArrayList<Persona>();
		
		//añadir elementos a nuestra lista original
		
		lista.add(new Persona("Emmanuel", 21, "MASCULINO"));
		lista.add(new Persona("Abreham", 25, "MASCULINO"));
		lista.add(new Persona("Rafael", 27, "MASCULINO"));
		lista.add(new Persona("Arasandi", 21, "FEMENINO"));
		lista.add(new Persona("Alexis", 28, "MASCULINO"));
		lista.add(new Persona("Elías", 26, "MASCULINO"));
		lista.add(new Persona("Marcos", 22, "MASCULINO"));
		lista.add(new Persona("Alex", 37, "MASCULINO"));
		
		
		//Para imprimir a cada elemento de la lista
		//solemos utilizar un ciclo for o for each
		
//		for(Persona i: lista) {
//			System.out.println(i);
//		}
		//Ciclo for each en una sola linea
		//lista.forEach(a->System.out.println(a));
		
		//Otra sintaxis para imprimir todos los elemenstos de una lista
		//lista.forEach(System.out::println); 
		
		//Vamos a ver como podriamos filtrar elementos de una lista original
		//por medio d eun criterio. Por ejemplo, genero
		
		for (Persona i: lista) {
			if(i.getGenero().equals("MASCULINO")) {
				listaFiltrada.add(i);
			}
		}
		
		//listaFiltrada.forEach(System.out::println);
		
		
		//Vamos a realizar la misma acción de filtrar por género
		//pero ahora utilizando al API Stream
		
//		listaFiltrada=lista.stream()//Esta linea pasa los datos de mi lista a traves de una
//				//tuberis (embudo)
//				.filter(i->i.getGenero().equals("FEMENINO"))//Esta linea filtra los datos
//				//de acuerdo a un criterio
//				.collect(Collectors.toList());//Una vez filtrados los coleccionamos 
//		//para agregarlos a la listaFiltrada
//		
//		System.out.println(listaFiltrada);
		
		
		//Ordenar a las personas por edad Ascendente
//		listaFiltrada=lista.stream()
//				.sorted(Comparator.comparing(Persona::getNombre).reversed())
//				.collect(Collectors.toList());
//		
//		listaFiltrada.forEach(System.out::println);
		
		//Solicitar el conteo de los elementos de una lista
		
		long conteo=lista.stream().count();
		System.out.println(conteo);
		
		//La clase Optional nos permite menejar valores que pudieran ser nulos
		//en un elemento dado en un flujo de datos
		
		Optional<Persona> menorEdad=lista.stream()
				.min(Comparator.comparing(Persona::getEdad));
		
		System.out.println(menorEdad);
		
		
		
	}

}
