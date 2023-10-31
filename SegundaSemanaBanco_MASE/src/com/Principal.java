package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {

		// Necesitamos crear un objeto cajero para poder realizar las operaciones
		// primero necesitamos crear el HashMap para pasarselo como valor
		// a cajero para que acceda a la BD de las cuentas

		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();

		// Voy a guardar objetos cuenta en mi HasMap
		// Existen dos formas en este ejemplo
		// Podemos crear primero que es la cuenta y despues guardar el HashMap

		Cuenta arasandi = new Cuenta(1001, "Arasandi", 1500, "Debito", 500, 3000);

		// Los guardo en el HashMap
		cuentas.put(1001, arasandi);

		// System.out.println(cuentas.get(100));

		// Tambien puedo guardar las cuentas creandolas en el HashMap
		cuentas.put(1002, new Cuenta(1002, "Alexis", 500, "Debito", 1000, 2000));
		cuentas.put(1003, new Cuenta(1003, "Alejandro", 5000, "Debito", 45000, 50000));
		cuentas.put(1004, new Cuenta(1004, "Gerardo", 12500, "Debito", 40000, 2000000));
		cuentas.put(1005, new Cuenta(1005, "Noe", 50000, "Debito", 500, 2580000));

		Cajero cajero1 = new Cajero(cuentas, "Polanco CDMX", 116);

		// vamos a probar el Metodo de buscarCuenta que ahora guarda a cargo de nuestro
		// cajero1

		System.out.println(cajero1.buscarCuenta(1002));

		// Probar metodo retirar, pero con una cuenta que no existe
		System.out.println(cajero1.retirar(1001, 500));
		System.out.println(cajero1.retirar(1001, 500));
		System.out.println(cajero1.retirar(1005, 5000));
		
		
		System.out.println("Metodo Depositar");
	System.out.println(cajero1.depositar(1005, 15000));
	
	
	
	//Metodo Tranferir exitoso
	System.out.println("Metodo transferir excediendo el saldo");
	System.out.println(cajero1.transferir(1005, 1002, 16000));
	System.out.println(cajero1.buscarCuenta(1002));
	
	//Metodo tranferir excediendo el saldo maximo
	System.out.println("Metodo transferir exitoso");
	System.out.println(cajero1.transferir(1005, 1002, 2000));
	
	//Metodo tranferir excediendo el saldo minimo
		System.out.println("Metodo transferir dejando por denajo el saldo minimo");
		System.out.println(cajero1.transferir(1002, 1005, 3000));
	
	}

}
