package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		// necesitamos crear un objeto Cajero para poder realizar 
		//las operaciones
		
		//Primero necesitamos crear el HashMap para pasarselo como valor
		
		
		Map<Integer, Cuenta> cuentas = new HashMap<Integer,Cuenta>();
		
		//Voy a guardar objetos cuenta en mi HashMap
		//Existen dos formas en este ejemplo
		//podemos crear primero la cuenta y depues guardarla en el HashMap
		
		Cuenta marcos = new Cuenta(1001, "marcos", 1500, "debito", 500, 5000);
		Cuenta josue = new Cuenta(1005, "josue", 1500, "debito", 500, 5000);
		Cuenta oscar = new Cuenta(1006, "oscar", 1500, "debito", 500, 5000);
		//La guardo en el HashMap
		
		
		cuentas.put(1001, marcos);
		cuentas.put(1005,josue);
		cuentas.put(1006,oscar);
		cuentas.put(1002, new Cuenta(1002, "Arasandi", 100, "Debito", 1000, 2000));
//		System.out.println(cuentas.get(1002));
		Cajero cajero1 = new Cajero(cuentas,"Polanco,CDMX", 116);

		//vamos a probar  el metodo de buscarCuenta que ahora queda a cargo
		//de nuestro cajero1
		System.out.println(cuentas.get(1001));
		
		System.out.println(cajero1.buscarCuenta(1009));
		System.out.println(cuentas.get(1001));
	
	//probar el metodo depositar exitoso
		System.out.println("probar el metodo exitoso");
		System.out.println(cajero1.depositar(1002, 50));
		
		//Probando el metodo de transferir
		System.out.println("//Probando el metodo de transferir exitoso");
		System.out.println(cajero1.transferir(1001, 1002,200));

		System.out.println(cajero1.buscarCuenta(1002));
		
		System.out.println("probando metodo tranferir excediendo el saldo maximo");
	
	    System.out.println(cajero1.transferir(1001, 1002, 10000));
	
	    System.out.println("probando metodo transferir debajo por el minimo a la cuenta origen");
	    System.out.println(cajero1.transferir(1005, 1006, 1100));
	//Ejercicio elaborar una maquina expendedora
	    //sugerencia para desarrollar
	
	}
	
	
}