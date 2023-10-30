package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		// API Stream . funcionalidad a partir de java 8
		//que nos permite manipulas coleeciones de datos
		//lo cual nos va a permitir filtrar la infomrmcaion
		//ordenarla , etc.
		//todo a traves de una fuente (.stram)
	
	
	List<Persona> lista = new ArrayList<Persona>();
	
	//Crear otra lista para agregar los elementos filtrados
	
	List<Persona>listaFiltrada = new ArrayList<Persona>();

	//Añadir elementos a nuestra lista original
	
    lista.add(new Persona("Emmanuel",22,"Masculino"));
    lista.add(new Persona("Abrahm",25,"Masculino"));
    lista.add(new Persona("Rafael",27,"Masculino"));
    lista.add(new Persona("Arasandi",21,"Femenino"));
    lista.add(new Persona("Alexis",28,"Masculino"));
    lista.add(new Persona("Elias",26,"Masculino"));
    lista.add(new Persona("Marcos",22,"Masculino"));
    lista.add(new Persona("Alex",26,"Masculino"));
	
    
    //Para imprimir a cada elemento de la lista
    //solemos utilizar el ciclo for o foe each
    
//    for (Persona i: lista) {
//    	System.out.println(i);	
//    }

   // lista.forEach(a->System.out.println(a));
    
    
    //Otra sintaxis para imprimir todos los elementos de una lista 
   //    lista.forEach(System.out::println);
    
    //VAMOS A VER COMO PODEMOS FILTRAR ELEMENTOS DE LA LISTA ORIGINARL //
   System.out.println("POR MEDIO DE UN CRITERIO POR EJEMPLO  GENERO"); 
    
    for(Persona i: lista) {
    	
    	if(i.getGenero().equals("Femenino")) {
    		listaFiltrada.add(i);
    	}
    }
    
    
      listaFiltrada.forEach(System.out::println);
//    
//    listaFiltrada = lista.stream()//Esta linea para los datos de mi lista a traves de una tuberia
//    		//o embudo
//    		.filter(i->i.getGenero().equals("Femenino"))//Una vez filtrados los coleccionamos
//    		.collect(Collectors.toList());
//    //para agregarlos a la listaFiltrada
//    System.out.println(listaFiltrada);

    
    //Ordenar a las personas por edad Ascendente
//    listaFiltrada = lista.stream()
//    		.sorted(Comparator.comparing(Persona::getEdad))
//    		.collect(Collectors.toList());
//    		
//    listaFiltrada.forEach(System.out::println);
//  //Ordenar a las personas por edad descendente
//    
//    listaFiltrada = lista.stream()
//    		.sorted(Comparator.comparing(Persona::getEdad).reversed())
//    		.collect(Collectors.toList());
//    		
//    listaFiltrada.forEach(System.out::println);
	
	
  //Ordenar a las personas por nombre descendente
    
//    listaFiltrada = lista.stream()
//    		.sorted(Comparator.comparing(Persona::getNombre).reversed())
//    		.collect(Collectors.toList());
//    		
//    listaFiltrada.forEach(System.out::println);
//	
//    
//    
	long conteo = lista.stream().count();
////	
	System.out.println(conteo);
////	
//	//Filtrado de la persona con menor edad
//	
//    //La clase optional nos permite manejar valores que pudieran ser nulos
//    //en un momento dado en un flujo de datos
//	Optional<Persona>MayorEdad =lista.stream()
//		.max(Comparator.comparing(Persona::getEdad));
//    
//	
//	System.out.println(MayorEdad);
	
	
	
	
	}
	
	
	
}
