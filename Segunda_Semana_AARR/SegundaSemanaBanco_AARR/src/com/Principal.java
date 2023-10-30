package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		
		//Necesitamos crear un objeto Cajero para poder realizar las operaciones
		//primero necesitamos crear el HashMap para pasarselo como valor a cajero, para que acceda a la BD de las cuentas
		
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		
		//Voy a guardar objetos cuenta en mi HashMap
		//Existen dos formas en este ejemplo
		//Podemos crear primero la cuenta y despues guardarla en el HashMap
		Cuenta marcos = new Cuenta(1001, "Marcos", 1500, "Debito", 500, 50000);
		
		//La guardo en el HashMap
		cuentas.put(1001, marcos);
		//Puedo guardar las cuentas creandolas directamente en el HashMap
		cuentas.put(1002, new Cuenta(1002, "Arasandi", 3000, "Debito", 1000, 20000));
		cuentas.put(1003, new Cuenta(1003, "Rafael", 5000, "Debito", 100, 100000));
		cuentas.put(1004, new Cuenta(1004, "Alexis", 1000, "Debito", 500, 30000));
		cuentas.put(1005, new Cuenta(1005, "Elias", 30000, "Debito", 4000, 200000));
		
		//System.out.println(cuentas.get(1005));
		
		Cajero cajero1 = new Cajero(cuentas, "Polanco, CDMX", 116);
		
		//probar metodo de buscar cuenta que ahora queda a cargo de nuestro cajero1
		System.out.println("probando metodo buscar cuenta");
		System.out.println(cajero1.buscarCuenta(1003));
		
		//Vamos a probar el metodo retirar exitoso		
		System.out.println("probando metodo retirar exitoso");
		System.out.println(cajero1.retirar(1005, 5000));
		System.out.println(cajero1.retirar(1005, 1000));
		
		//Vamos a probar el metodo retirar pero excediendo el monto de retiro del cajero
		System.out.println("Probando metodo retirar excediendo el monto permitido por el cajero");
		System.out.println(cajero1.retirar(1005, 10000));
		
		//vamos a probar el metodo retirar excediendo el saldo de la cuenta
		System.out.println("probando retirar excediendo el saldo de la cuenta");
		System.out.println(cajero1.retirar(1002, 4000));
		
		//vamos a probar el metodo depositar exitoso
		System.out.println("probando depositar exitoso");
		System.out.println(cajero1.depositar(1005, 6000));
		
		//Deposito que excede el saldo maximo
		System.out.println("Excediendo saldo maximo en un deposito");
		System.out.println(cajero1.depositar(1002, 17001));
		
		//probando metodo transferir exitoso
		System.out.println("Probando metodo transferir exitoso");
	
		System.out.println(cajero1.transferir(1005, 1002, 2000));
		System.out.println(cajero1.buscarCuenta(1002));
		
		System.out.println("Probando excediendo el saldo maximo");
		System.out.println(cajero1.transferir(1005, 1002, 21000));
		System.out.println(cajero1.buscarCuenta(1002));
		
		System.out.println("Probando quedando sin el minimo de la cuenta");
		System.out.println(cajero1.transferir(1002, 1004, 4100));
		System.out.println(cajero1.buscarCuenta(1002));
		
		//Sugerencia para desarrollar  logica de POO
		//elaborar una maquina expendedora
		
		
		
		
		
	}

}
