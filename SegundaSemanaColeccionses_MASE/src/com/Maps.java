package com;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {

		
		
		// La interface Map asocia claves a valores
		//	Esta interfaace no puede contener claves duplicados (TD)
		//Pero si valores duplicados
		//Cada cñlave puede tener asociado como maximo  
		
		
		//HashMap esta implementacion almacena las claves en una tabla 
		//hash. Es la que mejor rendimiento tiene en los maps, pero esto no ti
		//no garantiza un orden al momento de realizar iteraciones
		
		//Declarando un hashMap
		//el primer valor es el tipo de dato que funcione como clave
		//clave o llave(key)
		//El segundo valor serà el tipo de dato a almacemnar 
		//en dicha clave
		//Ejemplo vamos a declarar un HashMap para guardar elemntos tipo String
		
		Map<Integer,String> usuarios =new  HashMap<Integer, String>();
		
		//Agregar datos a mi HashMap
		usuarios.put(1, "Arasandi");
		usuarios.put(2, "Enrrique");
		usuarios.put(3, "Elias");
		usuarios.put(4, "Alexis");
		usuarios.put(5, "Noè");
		
		//Imprimir en consola determinado valor contenido en una llave
		System.out.println(usuarios.get(5));
		
		usuarios.put(5,"Gerardo");
		System.out.println(usuarios.get(5));
		
		//Declarar un HashMap con llaves String y guardar elemnetos Double
		Map<String, Double>decimales = new HashMap<String,Double>();
		decimales.put("A", 258.36);
		decimales.put("b", 558.36);
		
		System.out.println(decimales.get("b"));
		
		//Para remover un elemnto - remove
		decimales.remove("b");
		
		
		//El metodo .keySet() va a devolver el valor de las llaves del hashMap
		
		System.out.println(usuarios.keySet());
		System.out.println(decimales.keySet());
		
		
		//el metodo .values() nos devuelve los valores contenidos en el HashMap
		System.out.println(usuarios.values());
		System.out.println(decimales.values());
		
		//For each para imprimir todas las llaves de un HashMap
		
		for(Integer i: usuarios.keySet()) {
			System.out.println(i);
		}
		
		//For each para imprimir todos los valores de un HashMap
		for (String i: usuarios.values()) {
			System.out.println(i);
		}
		
		//For each para imprimir llaves y valores
		for(Integer i: usuarios.keySet()) {
			System.out.println("llave: " + i+ "  Valor: " + usuarios.get(i));
		}
		
	}

}
