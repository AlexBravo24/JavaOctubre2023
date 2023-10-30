package com;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		// La interfaz map asocia claves a valores.
		//esta interface no puede contener claves duplicadas
		//pero si valores duplicados
		//cada clavr puede tener asociado un valor como maximo
		
		
		//HashMap : esta implementacion almacena las claves en una tabla
		// hash. es la que mejor rendimiento tiene en los maps, pero 
		//esto no garantiza un orden al momento de realizar iteraciones
		
		//Declarando un HashMap
		//El primer valor es el tipo de dato que funcionara como
		//clave o llave (key)
		//el segundo valor sera el tipo de dato a almacenar dicha clave
		//Ejemplo, vamos declarar un HashMap para guardar
		//elementos de tipo String
		//1 "adrian"
		//2  "rafa"
		//5   "miguel"
		//3   "arasandi"
		//3    "alexis""

		Map<Integer,String> usuarios = new HashMap<Integer,String>();
	
		//Agregar datos a mi HashMap
		usuarios.put(1, "Marcos");
		usuarios.put(2, "Enrique");
		usuarios.put(3, "Rafael");
		usuarios.put(4, "Elias");
		usuarios.put(5, "Alexis");
		
		//Imprimir en consola determinado valor contenido en una llave
		System.out.println(usuarios.get(5));
		
		usuarios.put(5, "Arasandi");
		
		System.out.println(usuarios.get(5));
		
		usuarios.replace(4, "hola");
		
		Map<String,Double> decimales = new HashMap<String,Double>();
		
		decimales.put("A", 1200.59);
		decimales.put("B", 1200.59);
		
		System.out.println(decimales.get("B"));
		
		//Para remover un elemento- .remove
		
		decimales.remove("B");
		System.out.println(decimales);
		
		//El metodo . keySet() nos va a devolver el valor de las llaves
		//del HashMap
		
		System.out.println(usuarios.keySet());
		System.out.println(decimales.keySet());
	
	//El metodo .values() - nos devuelve los valores contenidos en
		// el HashMap
		
		System.out.println(usuarios.values());
		System.out.println(decimales.values());
		
		
		//for each para imprimir las llaves de un HashMap
		
		for(Integer i: usuarios.keySet()) {
			
			System.out.println(i);
		}
		
		//for each para imprimir los valores de un HashMap
		for (String i: usuarios.values()) {
			
			System.out.println(i);
		
			
			//for each para imprimir las llaves y valores
			
			for(Integer u: usuarios.keySet()) {
				
				System.out.println("llave "+u+" valor "+usuarios.get(u));
			}	
			
			
			
			
		}
		
	}

}
