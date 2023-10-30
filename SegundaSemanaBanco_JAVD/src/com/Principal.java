package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {

		// Necesitamos crear un objeto Cajero para poder realizar
		// las operaciones
		// Primero necesitamos crear el HashMap para pasarlo como valor
		// a cajero, para que acceda a la BD de las cuentas

		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();

		// Voy a guardar objetos cuenta en mi HashMap
		// Existen dos formas en este ejemplo
		// Podemos crear primero la cuenta y despu�s guardarla en el HashMap
		Cuenta marcos = new Cuenta(1001, "Marcos", 1500, "Debito", 500, 50000);

		// La guardo en el HashMap
		cuentas.put(1001, marcos);

		// Puedo guardar las cuentas creandolas directamente en el HashMap
		cuentas.put(1002, new Cuenta(1002, "Arasandi", 3000, "Debito", 1000, 20000));
		cuentas.put(1003, new Cuenta(1003, "Rafael", 5000, "Debito", 100, 10000));
		cuentas.put(1004, new Cuenta(1004, "Alexis", 1000, "Debito", 500, 30000));
		cuentas.put(1005, new Cuenta(1005, "Elias", 30000, "Debito", 4000, 200000));

		// System.out.println(cuentas.get(1005));

		Cajero cajero1 = new Cajero(cuentas, "Polanco, CDMX", 116);

		// Vamos a probar el m�todo de buscarCuenta que ahora queda a cargo
		// de nuestro cajero1

		System.out.println(cajero1.buscarCuenta(1003));

		// Vamos a probar el m�todo retirar, pero con una cuenta que no existe
		System.out.println("Probando m�todo retirar de una cuenta que no existe");
		System.out.println(cajero1.retirar(1009, 5000));

		// Vamos a probar el m�todo retirar exitoso
		System.out.println("Probando m�todo retirar exitoso");
		System.out.println(cajero1.retirar(1005, 5000));
		System.out.println(cajero1.retirar(1005, 1000));

		// Vamos a probar el m�todo retirar, pero excediendo el monto de retiro del
		// cajero
		System.out.println("Probando el m�todo retirar excediendo el monto permitido por el cajero");
		System.out.println(cajero1.retirar(1005, 10000));

		// Vamos a probar el m�todo retirar, pero excediendo el saldo de la cuenta
		System.out.println("Probando el m�todo retirar excediendo el saldo de la cuenta");
		System.out.println(cajero1.retirar(1002, 4000));

		// Vamos a probar el m�todo retirar, pero intentando dejar por debajo del saldo
		// m�nimo
		// a la cuenta
		System.out.println("Probando el m�todo retirar dejando por debajo del m�nimo saldo de la cuenta");
		System.out.println(cajero1.retirar(1002, 2500));

		// Vamos a probar el m�todo depositar exitosamente
		System.out.println("Probando el m�todo depositar exitosamente");
		System.out.println(cajero1.depositar(1005, 16000));

		// Vamos a probar el m�todo depositar, excediendo el saldo m�ximo permitido en
		// la cuenta
		System.out.println("Probando el m�todo depositar excediendo el saldo m�ximo permitido en la cuenta");
		System.out.println(cajero1.depositar(1002, 21000));

		// Vamos a probar el m�todo depositar pero que en conjunto con el saldo actual
		// rebasan el saldo m�ximo permitido
		System.out
				.println("Probando el m�todo depositar excediendo el saldo m�ximo permitido en conjunto en la cuenta");
		System.out.println(cajero1.depositar(1002, 18000));

		// Vamos a probar el m�todo de transferir exitoso
		System.out.println("Probando el el m�todo transferir exitosamente");
		System.out.println(cajero1.transferir(1005, 1002, 2000));
		System.out.println(cajero1.buscarCuenta(1002));

		// Vamos a probar el m�todo de transferir excediendo el saldo m�ximo
		System.out.println("Probando el el m�todo transferir excediendo el saldo m�ximo");
		System.out.println(cajero1.transferir(1005, 1002, 16000));
		System.out.println(cajero1.buscarCuenta(1002));

		// Vamos a probar el m�todo de transferir dejando por debajo del m�nimo a la cuenta origen
		System.out.println("Probando el el m�todo transferir dejando por debajo del m�nimo a la cuenta origen");
		System.out.println(cajero1.transferir(1002, 1004, 4000));
		System.out.println(cajero1.buscarCuenta(1004));
		
		//Ejercicio elaborar una m�quina expenderora
		//Sugerencia para desarrollar l�gica de POO
	}

}
