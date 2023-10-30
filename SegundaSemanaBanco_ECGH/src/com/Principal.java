package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		// Necesitamos crear un objeto cajero para poder realizar
		// las operaciones
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();

		// Voy a guardar objetos cuenta en mi HashMap
		// Existen dos formas en este ejemplo
		// Podemos crear primero la cuenta y despues guardarla en el HashMap
		Cuenta marcos = new Cuenta(1001, "Marcos", 1500, "Debito", 500, 50000);

		// La guardo en el HashMap
		cuentas.put(1001, marcos);
		// Puedo guardar las cuentas creandolas directsamente en el HashMap
		cuentas.put(1002, new Cuenta(1002, "Arasandi", 3000, "Debito", 1000, 20000));
		cuentas.put(1003, new Cuenta(1003, "Rafael", 5000, "Debito", 100, 100000));
		cuentas.put(1004, new Cuenta(1004, "Alexis", 1000, "Debito", 500, 30000));
		cuentas.put(1005, new Cuenta(1005, "Elias", 30000, "Debito", 4000, 200000));

		// System.out.println(cuentas.get(1005));
		Cajero cajero1 = new Cajero(cuentas, "Polanco,CDMX", 116);

		// Vamos a probar el metod de buscarCuenta que ahora queda a cargo
		// de nuestro cajero1
		System.out.println("Probando método buscar cuenta");
		System.out.println(cajero1.buscarCuenta(1003));

		// Vamos a probar el metodo retirar con una cuenta que no existe
		System.out.println("Probando método retirar de una cuenta que no existe");
		System.out.println(cajero1.retirar(1009, 5000));

		// Vamos a probar el metodo retirar con una cuenta que no existe
		System.out.println("Probando método retirar exitoso");
		System.out.println(cajero1.retirar(1005, 5000));
		System.out.println(cajero1.retirar(1005, 5000));

		// Vamos a probar el método retitar, pero excediendo el monto de retiro del
		// cajero

		System.out.println("Probando método retirar excediendo el monto permitido por el cajero");
		System.out.println(cajero1.retirar(1005, 10000));

		// Vamos a probar el método retirar, pero excediendo el saldo de la cuenta

		System.out.println("Probando método retirar excediendo el saldo de la cuenta");
		System.out.println(cajero1.retirar(1002, 4000));


		// Vamos a probar el método retirar, pero excediendo el saldo de la cuenta

		System.out.println("Probando método retirar excediendo el mínimo requerido en la cuenta");
		System.out.println(cajero1.retirar(1002, 2500));
		
		//Vamos a probar el método depositar exitoso
		System.out.println("Probando el metodo depositar exitoso");
		System.out.println(cajero1.depositar(1005, 16000));
		
		//Vamos a probar el método depositar excediendo el saldo maximo permitido en la cuenta
		System.out.println("Probando el metodo excediendo el saldo maximo permitido en la cuenta");
		System.out.println(cajero1.depositar(1002, 21000));
		
		//Vamos a probar el método depositar pero que en conjunto con el saldo actual
		//rebasan el saldo máximo permitido
		System.out.println("Probando el metodo excediendo el saldo maximo permitido en conjunto");
		System.out.println(cajero1.depositar(1002, 18000));
		
		//Probando el método de transferir exitoso
		System.out.println("Probando el método de transferir exitoso");
		System.out.println(cajero1.transferir(1005, 1002, 2000));
		System.out.println(cajero1.buscarCuenta(1002));
		
		//Probando el método de transferir excediendo el saldo máximo
		System.out.println("Probando el método de transferir excediendo el saldo máximo");
		System.out.println(cajero1.transferir(1005, 1002, 16000));
		System.out.println(cajero1.buscarCuenta(1002));
		
		//Probando el método de transferir dejando por debajo del mínimo
		System.out.println("Probando el método de transferirdejando por debajo del mínimo la cuenta origen");
		System.out.println(cajero1.transferir(1002, 1004, 4100));
		System.out.println(cajero1.buscarCuenta(1002));
		
		//Ejercicio maquina expendedora	
		
		
	}

}
