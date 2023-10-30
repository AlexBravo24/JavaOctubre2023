package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {

		//api stream-funcionalidad a partir de java 8
		//que nos permite manipular colecciones de datos
		//la cual nos va a permitir filtrar la informacion
		//ordenarla, etc.
		//todo a traves de una fuente (.stream)
		//y posteriormente funciones intermedias
		
		//vamos a crear una lista de elementos perosna
		List<Persona> lista =new ArrayList<Persona>();
		
		//crear otra lista para agregar los elementos filtrados cuando
		//utilicemos los metodos respectivos
		
		List<Persona> listafiltrada=new ArrayList<Persona>();
		
		//a�adir elementos a nuestra lista original
		
		lista.add(new Persona("emmanuel", 22, "masculino"));
		lista.add(new Persona("abraham", 25, "masculino"));
		lista.add(new Persona("rafael", 28, "masculino"));
		lista.add(new Persona("arasandi", 21, "femenino"));
		lista.add(new Persona("alexis", 28, "masculino"));
		lista.add(new Persona("elias", 26, "masculino"));
		lista.add(new Persona("marcos", 22, "masculino"));
		lista.add(new Persona("alex", 37, "masculino"));
		
		//para imprimir a cada elemento d ela lista
		//solemos utilizar un ciclo for o for each
		
		for(Persona i: lista) {
			System.out.println(i);
		}
		
		//ciclo for each en una sola lina
		lista.forEach(a-> System.out.println(a));
		
		//otra sintaxis para imprimir todos los elementos de una lista
		lista.forEach(System.out::println);
		
		//vamos a ver como podriamos filtrar elementos de la lista original
		//por medio de un criterio por ejemplo, genero
		
		for(Persona i:lista) {
			if(i.getGenero().equals("masculino")) {
				listafiltrada.add(i);
				
			}
			
		}
		listafiltrada.forEach(System.out::println);
		//vamos a realizar la misma accion de filtrar por genero
		//pero ahora utilizando al api stream
		
		listafiltrada= lista.stream()//esta linea pasa los datos de mi lista a traves de una
				//tuberia(embudo)
				.filter(i->i.getGenero().equals("femenino"))//esta linea filtra los datos
				//de acuerdo a un criterio
				.collect(Collectors.toList());//una vez filtrados los coleccionamos
				//para agregarlos a la lista filtrada
		System.out.println(listafiltrada);
		
		//ordenar a las personas por edad ascendente
		listafiltrada=lista.stream().sorted(Comparator.comparing(Persona::getEdad))
				.collect(Collectors.toList());
		
		listafiltrada.forEach(System.out::println);
		
		listafiltrada=lista.stream()
				.sorted(Comparator.comparing(Persona::getEdad).reversed())
				.collect(Collectors.toList());
		
		listafiltrada.forEach(System.out::println);
		
		listafiltrada=lista.stream()
				.sorted(Comparator.comparing(Persona::getNombre).reversed())
				.collect(Collectors.toList());
		
		listafiltrada.forEach(System.out::println);
		
		//solicitar el conteo de los elementos de una lista
		long conteo=lista.stream().count();
		System.out.println(conteo);
		
		//filtrado de la perosna con menos edad
		
		//la clase optional nos permite manejar valores que pideran ser nulos
		//en un momento dado en un flujo de datos
		
		Optional<Persona>menoredad=lista.stream()
				.min(Comparator.comparing(Persona::getEdad));
		
		System.out.println(menoredad);
	}

		
	}

