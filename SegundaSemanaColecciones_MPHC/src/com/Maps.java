package com;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		// La interfaz Map asocia claves a valores.
		// Esta interface no puede contener claves duplicadas (id)
		// Pero si valores duplicados
		// Cada clave puede tener asociado un valor como maximo

		// HashMap: esta emplementacion almacena las claves en una tabla
		// hash Es la que mejor rendimeinto tiene en los maps, pero esto no garantiza un
		// orden al momento de realizar iteracciones
		
		
		//Declarando un HashMap 
		//El primer valor es el tipo de dato que funciona como clave o llave(key)
		//El segundo valor sera el tipo de dato a almacenar en dicha clave 
		//ejemplo, vamos a declarar un HashMap para guardar elementos de tipo String
		
		//1, "Adrian"
		//2, "Marcos" las llaves no pueden repetirse
		
		
		Map<Integer, String> usuarios = new  HashMap<Integer, String>();
		
		//Agregar datos a mi HashMap
		
		usuarios.put(1,"Marcos");
		usuarios.put(2,"Enrique");
		usuarios.put(3,"Rafael");
		usuarios.put(4,"Elias");
		usuarios.put(5,"Alexis");
		
		//Imprimir en consola determinado valor contenido en una llave
		
		System.out.println(usuarios.get(5));
		
		usuarios.put(5, "Angel");
		
		System.out.println(usuarios.get(5));
		
		//Declarar  un HashMap con llaves String y guardar elementos Double
		
		Map<String, Double> decimales = new HashMap<String, Double>();
		
		decimales.put("A", 1200.59);
		decimales.put("B", 200.59);
		
		System.out.println(decimales.get("B"));
		
		decimales.remove("B");
		
		
		
		System.out.println(usuarios.keySet());
		System.out.println(decimales.keySet());
		System.out.println(usuarios.values());
		System.out.println(decimales.values());
		
		// el metodo. value() nos devuelve los valores contenidos en el HasMap
		for (Integer i : usuarios.keySet()) {
			System.out.println("Llave:" + i + " Valor:" + usuarios.get(i));
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
