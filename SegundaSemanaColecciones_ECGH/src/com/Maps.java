package com;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		//La interfaz Map asocia claves a valores
		//Esta interfaz no puede contener claves duplicadas(ID)
		//Pero si valores duplicdos
		//Cads clave puede tener asociado un valos como máximo
		
		//HashMap:esta implementación almacena las claves en una tabla
		//hash. Es la que mejor rendimiento tiene en los maps, pero 
		//esto no garantiza un orden al memento de realizae iteraciones
		
		//Declarando un HashMap
		//El primer valor es el tipo de dato que funcionara como
		//clave o llave (Key)
		//El segundo valor sera el tipo de dato a almacenar en dicha clave
		
		//Ejemplo, vamos a declarar un HashMAo para guardar 
		//elementos de tipo String 
		//1, "Adrian"
		//2,"Rafael"
		//5,"Miguel:
		//3,"Arasandi"
		//3,"Alexis"-Las llaves no pueden repetirse
		
		Map<Integer, String> usuarios=new HashMap<Integer,String>();
		
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
		
		//Declarar un HashMap con llaves String y guardar elementos Double
		
		Map<String,Double> decimales=new HashMap<String,Double>();
		
		decimales.put("A", 1200.53);
		decimales.put("B", 80.16);
		System.out.println(decimales.get("B"));
		
		
		//Para remover un elemento - .remove
		
		
	    decimales.remove("B");
		
		//El metodo .keySet() nos va a devolver el valor de las llaves del 
		//HashMap
		System.out.println(usuarios.keySet());
		System.out.println(decimales.keySet());
		
		
		//El metodo .values()- bos devuelve los valores contenidos en 
		//el HashMap
		
		System.out.println(usuarios.values());
		System.out.println(decimales.values());
		
		//for each para imprimir todas las llaves de un HashMap
		for (Integer i: usuarios.keySet()) {
			System.out.println(i);
			
		}
		
		for (String i: usuarios.values()) {
			System.out.println(i);			
		}
		
		//for each para imprimir llaves y valores
		for (Integer i: usuarios.keySet()) {
			System.out.println("Llave: "+i+" Valor: "+usuarios.get(i));				
		}
		
		
		

	}

}
