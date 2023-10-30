package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {

		// Necistamos crear un objeto para poder realizar las operaciones
		// Primero necesitamos crear el HashMap para pasarselo como valor
		// a cajero, para que accede a la BD de las cuentas

		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		// Voy a guardar objetos cuenta en mi HashMap
		// Existen dos formas en este ejemplo
		// Podemos crear primero la cuenta y desoues guardarla en el HashMap

		Cuenta marcos = new Cuenta(1001, "Marcos", 1500, "Debito", 500, 50000);
		// La guardo en el HashMap
		cuentas.put(1001, marcos);

		// System.out.println(cuentas.get(1001));// Imprime resumen de cuenta

		cuentas.put(1002, new Cuenta(1002, "Arasandi", 3000, "Debito", 1000, 20000));
		cuentas.put(1003, new Cuenta(1003, "Rafael", 5000, "Debito", 100, 100000));
		cuentas.put(1004, new Cuenta(1004, "Alexis", 1000, "Debito", 500, 30000));
		cuentas.put(1005, new Cuenta(1005, "Elias", 30000, "Debito", 4000, 200000));

		Cajero cajero1 = new Cajero(cuentas, "Polanco, CDMX", 116);

		// Probar metodo buscar cuenta que ahora queda a cargo de nuestro cajero
//		System.out.println("Probando metodo Buscar cuenta");
//		System.out.println(cajero1.buscarCuenta(1003));
//
//		System.out.println("");
//		// Probano metodo retirar con cuenta que no exite
//		System.out.println("Probando metodo retirar de una cuenta que no existe");
//		System.out.println(cajero1.retirar(1009, 5000));
//		System.out.println("");
//
//		System.out.println("Probando metodo retiro exitoso");
//		System.out.println(cajero1.retirar(1005, 5000));
//		// Probando metodo retirar
//		System.out.println();
//		System.out.println("Probando metodo retirar excediendo el saldo  de la cuenta");
//		System.out.println(cajero1.retirar(1002, 4000));
//		System.out.println();
//		System.out.println("Probando metodo retirar excediendo el saldo  de la cuenta");
//		System.out.println(cajero1.retirar(1002, 2500));
//
//		// Metodo deposito exitoso
//
//		System.out.println("Deposito exitoso");
//		System.out.println(cajero1.depositar(1005, 16000));
//
//		// Metodo cuenta no exite
//		System.out.println("Probando Deposito a cuenta que no existe");
//		System.out.println(cajero1.depositar(1055, 16000));
//		// Metodo deposito excede el permitido
//		System.out.println("Probando metodo excediendo saldo maximo permitido por la cuenta");
//		System.out.println(cajero1.depositar(1002, 30000));
//
//		System.out.println("Probando metodo excediendo saldo maximo permitido en conjunto con el saldo ya existente");
//		System.out.println(cajero1.depositar(1002, 18000));
//		
//		Metodo transferencias
//		
		System.out.println("Probando metodo trasferir exitoso");
		System.out.println(cajero1.transferir(1005, 1002, 2000));
		
		System.out.println(cajero1.buscarCuenta(1002));
		
		
		System.out.println("Probando metodo transferir excediendo el saldo maximo");
		System.out.println(cajero1.transferir(1005, 1002, 16000));
		
		System.out.println(cajero1.buscarCuenta(1002));
		

		System.out.println("Probando metodo transferir dejando por debajo del minimo a la cuenta origen");
		System.out.println(cajero1.transferir(1002, 1004, 4100));
		
		System.out.println(cajero1.buscarCuenta(1002));
		
		
		//Ejercicio elaborar una maquina expendedora
		
		
		
		
		

	}

}
