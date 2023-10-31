package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		
		
		// API Stream - funcionalidad a partir de java 8
		//Que nos permita manipular colecciones de datos lo cual
		//nos va a permitir filtrar la informacion 
		//ordenada
		//todo a traves de una fuente . stream
		//y posteriormente funciones intermedias
		
		//Crear lista de elementos persona
		List<Persona>lista = new ArrayList<Persona>();
		
		//Crear otra lista para agregar los elementos filtrados cuando
		//Cuando utilicemos los metodos respectivamente
		List<Persona>listaFiltrada= new ArrayList<Persona>();
		
		//Añadir elementos a nuestra lista original
		lista.add(new Persona("Emmanuel", 22,"Masculino"));
		lista.add(new Persona("Arasandi", 24,"Femenino"));
		lista.add(new Persona("Alexis", 28,"Masculino"));
		lista.add(new Persona("Elias", 26,"Masculino"));
		lista.add(new Persona("Rafael", 20,"Masculino"));
		lista.add(new Persona("Marcos", 25,"Masculino"));
		lista.add(new Persona("Noe", 23,"Masculino"));
		lista.add(new Persona("Gerardo", 22,"Masculino"));
		
		//Para imprimir a cada elemento de la lista
		//Solemos utilizar un ciclo for o for each
		
//		for(Persona i: lista) {
//			System.out.println(i);
//		}
		
		//ciclo for each
//		lista.forEach(a -> System.out.println(a));
//		
//		//Otra sintaxis para imprimir todods los elementos de mi lista
//		
//		lista.forEach(System.out::println);
		
		//Filtrar elementos de la lista original 
		// por medio de un criterio; por ejemplo por genero
//		for(Persona i: lista) {
//			if(i.getGenero().equals("Masculino")) {
//				listaFiltrada.add(i);
//			}
//		}
//		
//		listaFiltrada.forEach(System.out::println);
//		
//		
//		//Filtramos por genero pero ahora utilizando al APIStream
//		
//		listaFiltrada= lista.stream()
//				.filter(i->i.getGenero()
//						.equals("Femenino")).collect(Collectors.toList());
//		System.out.println(listaFiltrada);
		
		
		
//		//Ordenar a las personas por edad ascendente
//		listaFiltrada=lista.stream()
//				.sorted(Comparator.comparing(Persona::getEdad))
//				.collet(Collectors.toList());
//		listaFiltrada.forEach(a->System.out.println(a));
		
//		//Ordenar personas por edad descendentes
//		listaFiltrada=lista.stream()
//			.sorted(Comparator.comparing(Persona::getEdad).reversed())
//			.collect(Collectors.toList());
//				listaFiltrada.forEach(a->System.out.println(a));
//		
//		//Ordenar personas porpor nombre descendente
//				listaFiltrada=lista.stream()
//					.sorted(Comparator.comparing(Persona::getNombre).reversed())
//					.collect(Collectors.toList());
//						listaFiltrada.forEach(a->System.out.println(a));
//				
//		//Solicitar el conteo de los elementos de una lista 
//						long conteo =lista.stream().count();
//						System.out.println(conteo);
//						
		
		//Filtrado de la persona con menor edad
		Optional<Persona>menorEdad =
		lista.stream().min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
						
		}

}
