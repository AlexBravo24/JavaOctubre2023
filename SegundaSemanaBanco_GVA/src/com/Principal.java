package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		
		//Necesitamos crear un objeto cajero para poder realizar
		//las operaciones
		
		//Primero necesitamos crear el HashMap para pasarlo como valor al objeto cajero
		//Para acceder a la Base de Datos de las cuentas
		
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>(); 
		
		//Guardar objetos cuenta en el HashMap 
		//Existen dos forms en este ejemplo
		//Cear primero la cuenta y despu�s guardarla en el HashMap 
		
		Cuenta marcos = new Cuenta(1001, "Marcos", 1500, "D�bito", 500, 50000);
		
		//La guardo en el HashMap 
		cuentas.put(1001, marcos);
		
		//System.out.println(cuentas.get(1001));
		
		//Puedo guardar las cuentas directamente en el HashMap
		cuentas.put(1002, new Cuenta(1002, "Arasandi", 3000, "D�bito", 1000, 20000));
		cuentas.put(1003, new Cuenta(1003, "Alexis", 1102.65, "D�bito", 100, 100000));
		cuentas.put(1004, new Cuenta(1004, "Gerardo", 5500, "D�bito", 50, 30000));
		cuentas.put(1005, new Cuenta(1005, "Elias", 2200, "D�bito", 100, 20000));
		
		//System.out.println(cuentas.get(1004));
		
		Cajero cajero1 = new Cajero(cuentas, "Polanco, CDMX", 116);

		//Vamos a probar el m�todo de buscar cuenta que ahora queda a cargo
		//del objeto cajero1
		System.out.println("Probando m�todo buscar cuenta: ");
		System.out.println(cajero1.buscarCuenta(1003));
		
		
		//Vamos a probar el m�todo retirar pero con una cuenta que no existe
		System.out.println("Probando m�todo retirar de una cuenta que no existe:");
		System.out.println(cajero1.retirar(1009, 3000));
		
		//Vamos a probar el m�todo retirar exitoso
		System.out.println("Probando m�todo retirar de una cuenta que si existe:");
		System.out.println(cajero1.retirar(1005, 1000));
		System.out.println(cajero1.retirar(1005, 300));
		
		//Vamos a probar el m�todo, pero excediendo el limite diario del cajero
		System.out.println("Probando el m�todo que excede el l�mite diario del cajero:");
		System.out.println(cajero1.retirar(1005, 10000));
		
		//Vamos a probar el m�todo, pero excediendo el saldo de la cuenta
		System.out.println("Probando el m�todo que excede el saldo de la cuenta:");
		System.out.println(cajero1.retirar(1004, 6000));
		
		//Vamos a probar el m�todo, pero intentando dejar por debajo del minimo a la cuenta 
		System.out.println("Probando el m�todo para dejar mas abajo del minimo en la cuenta:");
		System.out.println(cajero1.retirar(1002, 2500));
		
		//Vamos a probar el m�todo de deposito exitoso
		System.out.println("Probando el m�todo exitoso:");
		System.out.println(cajero1.depositar(1004, 20000));
		
		//Vamos a probar el m�todo depositar de exceder el saldo m�ximo permitido 
		System.out.println("Probando el m�todo excediendo el saldo m�ximo permitido");
		System.out.println(cajero1.depositar(1002, 21000));
		
		//Vamos a probar el m�todo depositar pero en conjunto con el saldo actual
		//rebasan el saldo m�ximo permitido 
		System.out.println("Probando el m�todo excediendo el saldo m�ximo permitido en conjunto con el saldo actual:");
		System.out.println(cajero1.depositar(1002, 18000));
		
		//Probando el m�todo de transferir
		System.out.println("Probando el m�todo transferir exitoso:");
		System.out.println(cajero1.transferir(1004, 1002, 1000));
		
		//Probando el m�todo de transferir
		System.out.println("Probando el m�todo transferir exitoso:");
		System.out.println(cajero1.transferir(1004, 1002, 1000));
		System.out.println(cajero1.buscarCuenta(1002));
		
		//Probando el m�todo transferir dejando por dejabo del m�nimo a la cuenta origen
		System.out.println("Probando el m�todo transferir dejando por dejabo del m�nimo a la cuenta origen:");
		System.out.println(cajero1.transferir(1002, 1003, 4500));
		System.out.println(cajero1.buscarCuenta(1002));
		
		//Ejercicio elaborar una m�quina expendedora
		//Sugerencia para desarrollar l�gica de POO
	}

}
