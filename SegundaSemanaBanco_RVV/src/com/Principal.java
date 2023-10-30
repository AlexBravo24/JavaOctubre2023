package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {

		// necesitamos crear un objeto cajero para poder realizar
		// las operaciones
		// primero necesitamos crear el hashmap para pasarselo como valor
		// a cajero, para que acceda a la BD de las cuentas

		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();

		// voy a guardar objetos cuenta en mi Hashmap
		// existen dos formas en este ejemplo
		// podemos crear primero la cuenta y despues guardarla en el hashmap
		Cuenta marcos = new Cuenta(1001, "marcos", 1500, "debito", 500, 50000);

		// la guardo en el hashmap
		cuentas.put(1001, marcos);

		// puedo guardar las cuentas creandolas directamente en el hashmap
		cuentas.put(1002, new Cuenta(1002, "arasandi", 3000, "debito", 1000, 20000));
		cuentas.put(1003, new Cuenta(1003, "rafael", 5000, "debito", 100, 100000));
		cuentas.put(1004, new Cuenta(1004, "alexis", 1000, "debito", 500, 30000));
		cuentas.put(1005, new Cuenta(1005, "elias", 30000, "debito", 4000, 200000));

//		System.out.println(cuentas.get(1005));

		Cajero cajero1 = new Cajero(cuentas, "polanco, cdmx", 116);

		// vamos a probar el metodo de buscarcuenta que ahora queda a cargo
		// de nuestro cajero1
		System.out.println(cajero1.buscarcuenta(1003));
		System.out.println(cajero1.buscarcuenta(1007));

		// vamos a probar el metodo retirar pero con una cuenta que no existe
		System.out.println("probando metodo retirar de una cuetna que no existe");
		System.out.println(cajero1.retirar(1009, 5000));

		// vamos a probar el metodo retirar exitoso
		System.out.println("probando metodo retirar exitoso");
		System.out.println(cajero1.retirar(1005, 5000));
		System.out.println(cajero1.retirar(1005, 1000));

		// vamos a probar el metodo retirar, pero excediendo el monto de retiro del
		// cajero
		System.out.println("probando metodo retirar excediendo el monto permitido por el cajero");
		System.out.println(cajero1.retirar(1005, 10000));

		// vamos a probar el metodo retirar, pero excediendo el monto de retiro del
		// cajero
		System.out.println("probando metodo retirar excediendo el saldo de la cuenta");
		System.out.println(cajero1.retirar(1002, 4000));
		// vamos a probar el metodo retirar, excediendo el saldo minimo
		System.out.println("probando metodo retirar excediendo el monto minimo de la cuenta");
		System.out.println(cajero1.retirar(1002, 2500));

		// vamos a probar el metodo depositar
		System.out.println("probando metodo depositar exitoso");
		System.out.println(cajero1.depositar(1005, 16000));

		// vamos a probar el metodo depositar
		System.out.println("probando metodo depositar excediendo el saldo maximo");
		System.out.println(cajero1.depositar(1002, 21000));

		// vamos a probar el metodo depositar
		System.out.println("probando metodo depositar rebasando el saldo maximo permitido");
		System.out.println(cajero1.depositar(1002, 18000));

		// probando metodo transferir exitoso
		System.out.println("probando metodo transferir exitoso");
		System.out.println(cajero1.transferir(1005, 1002, 2000));
		System.out.println(cajero1.buscarcuenta(1002));

		// probando metodo transferir
		System.out.println("probando metodo transferir excediendo el saldo maximo");
		System.out.println(cajero1.transferir(1005, 1002, 21000));
		System.out.println(cajero1.buscarcuenta(1002));

		// probando metodo transferir
		System.out.println("probando metodo transferir dejando por debajo del minimo el origen");
		System.out.println(cajero1.transferir(1002, 1004, 4100));
		System.out.println(cajero1.buscarcuenta(1004));

		//ejercicio elaborar una maquina expendedora
		//sugerencia para desarrollar logica de POO

	}

}