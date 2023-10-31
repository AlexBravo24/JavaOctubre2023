package com;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {

		//la interfaz map asocia claves a valores.
		//esta interfase no puede contener claves duplicadas (ID)
		//pero si valores duplicados
		//cada clave puede tener asociado un valor como maximo
		
		//hashmap: esta implementacion almacena las claves en una tabla
		//llamada has. es la que mejor rendimiento tiene en los maps
		//pero esto no garantiza un orden al momento de realizar iteraciones
		
		//declando un hashmap
		//el primer valor es el tipo de dato que funcionara como
		//clave o llave(key)
		//el segundo valor sera el tipo de dato a almacenar en dicha clave
		//ejemplo, vamos a declarar un hashmap para guardar
		//elementos de tipo String
		//1, "Adrian"
		//2, "Rafael"
		//5, "Miguel"
		//3, "Arasandi"
		//3, "alexis"-las llaves no pueden repetirse
		
		Map<Integer, String> usuarios=new HashMap<Integer, String>();

		//agregar datos a mi hashmap-.put(clave, valor)
		usuarios.put(1, "marcos");
		usuarios.put(2, "enrique");
		usuarios.put(3, "rafael");
		usuarios.put(4, "elias");
		usuarios.put(5, "alexis");
		
		//imprimir en consola determinado valor contenido en una llave
		System.out.println(usuarios.get(5));
	
		usuarios.put(5, "arasandi");
		System.out.println(usuarios.get(5));
		
		//declarar un hashmap con llaves String y guardar elementos double
		
		Map<String, Double> decimales=new HashMap<String, Double>();
		
		decimales.put("a", 1200.59);
		decimales.put("b", 200.59);
		
		System.out.println(decimales.get("b"));
		
		//para remover un elemnto- .remove
		decimales.remove("b");
		
		//el metodo .keyset() nos va a devolver el valor de las llaves
		//Hashmap
		System.out.println(usuarios.keySet());
		System.out.println(decimales.keySet());
		
		//el metodo .values()-nos devuelve los valores contenido en
		//el hashmap
		System.out.println(usuarios.values());
		System.out.println(decimales.values());
		
		//for each para imprimir todas las llaves de un hashmap
		for(Integer i: usuarios.keySet()) {
			System.out.println(i);
		}
		
		//for each para imprimir todos los valores de un hashmap
		for(String i: usuarios.values()) {
			System.out.println(i);
		}
		
		//for each para imprimir llaves y valores
		for(Integer i: usuarios.keySet()) {
			System.out.println("Llave: "+i+ " Valor: "+usuarios.get(i));
		}
		
		
		
		
		
	}

}