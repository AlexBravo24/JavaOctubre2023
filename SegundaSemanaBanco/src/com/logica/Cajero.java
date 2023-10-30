package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos {

	//Clase que va a implementar las acciones o l�gica
	//de las operaciones
	
	private Map <Integer, Cuenta> cuentas;
	private String sucursal;
	private int idCajero;
	//El folio solo lo declaramos como atributo de cajero para auxiliarnos
	//en el incremento del folio en el Ticket
	private int folio = 1;
	
	public Cajero() {}
	
	
	
	public Cajero(Map<Integer, Cuenta> cuentas, String sucursal, int idCajero) {
		super();
		this.cuentas = cuentas;
		this.sucursal = sucursal;
		this.idCajero = idCajero;
	}


	@Override
	public Cuenta buscarCuenta(int numeroCuenta) {
		//Como tenemos que retornar el valor de una cuenta
		//instanciamos una, momentaneamente vac�a 
		
		Cuenta cuenta = null; //Null, porque si la cuenta no existe 
		//retorna un valor nulo
		
		//Si la cuenta existe, la asiganamos a ella
		
		cuenta = cuentas.get(numeroCuenta);
		
		return cuenta;
	}
	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		//Como tenemos que responder o devolver el valor de un ticket 
		//instanciamos uno vac�o de momento 
		Ticket ticket = null;
		
		//para hacer un retiro, necesitamos buscar la cuenta de la cual 
		//retiraremos dichos recursos
		//Si el m�todo buscar cuenta, localiza una y diferente de nulo
		if(buscarCuenta(numeroCuenta) != null) { //Asignaci�n a un objeto
			//Cuenta para manipular su saldo
			Cuenta cuenta = buscarCuenta(numeroCuenta);
		//Los cajeros en la vida real, realizan ciertas validaciones para realizar
			//las operaciones
			if(monto>8000) { //Validamos la condici�n que el cajero tiene 
				//de monto m�ximo a retirar ese d�a
				System.out.println("El monto excede el l�mite diario por el cajero.");
				return ticket;
			//Ahora validamos, si el monto puede retirarse, que la cuenta tenga fondos suficientes
			} else if (cuenta.getSaldo() < monto) {
				System.out.println("La cuenta no tiene saldo suficiente.");
				return ticket;
			//Siguiente validaci�n, si la cuenta tiene saldo suficiente,
			//pero esto deja por debajo del saldo m�nimo a la cuenta
			} else if (cuenta.getSaldo() - monto < cuenta.getMinimo()) {
				System.out.println("El retiro dejar�a debajo del saldo m�nimo a la cuenta.");
				return ticket;
			} else { //Si el retiro puede realizarse, se actualiza el saldo de la cuenta
				cuenta.setSaldo(cuenta.getSaldo() - monto);
				//Entonces, emitimos un nuevo ticket
				ticket = new Ticket(folio++, new Date(), cuenta.getNumeroCuenta(), cuenta.getSaldo(), sucursal, idCajero);
				return ticket;
			}
		} else { //En caso de que la cuenta de la cual queremos retirar recurso, no existe
			System.out.println("No hay una cuenta asociada a ese cliente.");
			return ticket;
		}
	}
	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		
		if(buscarCuenta(numeroCuenta) != null) { //Asignaci�n a un objeto
			//Cuenta para manipular su saldo
			Cuenta cuenta = buscarCuenta(numeroCuenta);
		//Validaciones
		//Si el monto a depositar es mayor que el saldo m�ximo de la cuenta
		if (monto > cuenta.getMaximo()) {
			System.out.println("El monto a depositar excede el saldo m�ximo permitido en la cuenta.");
			return ticket;
			//Siguiente validaci�n similar, si el saldo de la cuenta m�s el monto
			//a depositar exceden el saldo m�ximo permitido 
		} else if(cuenta.getSaldo() + monto > cuenta.getMaximo()) {
			System.out.println("El deposito exceder�a el saldo m�ximo permitido en la cuenta.");
		} else { //Si el deposito si puede realizarse
			//Actualizamos el saldo de la cuenta
			cuenta.setSaldo(cuenta.getSaldo() + monto);
			//Creamos un nuevo ticket 
			ticket = new Ticket(folio++, new Date(), cuenta.getNumeroCuenta(), cuenta.getSaldo(), sucursal, idCajero);
			return ticket;			
		}
		
		} else {
			System.out.println("No hay cuenta asociada a ese cliente.");
			return ticket;
		}
		return ticket;
	
	}
	@Override
	public Ticket transferir(int cuentaOrigen, int cuentaDestino, double monto) {
		Ticket ticket = null;
		
		if(buscarCuenta(cuentaOrigen) != null && buscarCuenta(cuentaDestino) != null) {
			Cuenta origen = buscarCuenta(cuentaOrigen);
			Cuenta destino = buscarCuenta(cuentaDestino);
			//Validaciones
			//Si la cuenta de origen tiene un saldo menor al que quiere transferir
			if(origen.getSaldo() < monto) {
				System.out.println("No hay fondos suficientes para realizar esta transacci�n.");
				return ticket = null;
			//Si la operaci�n del monto, deja por debajo del m�nimo a la cuenta de origen
			} else if (origen.getSaldo() - monto < origen.getMinimo()) {
				System.out.println("La transacci�n no se puede realizar porque dejar�a la cuenta sin el saldo m�nimo.");
				return ticket;
			//Si la transferencia excede el monto m�ximo de la cuenta destino	
			} else if (monto > destino.getMaximo()) {
				System.out.println("El monto excede el saldo m�ximo permitido de la cuenta.");
				return ticket;
			//Si la transferencia m�s el saldo actual de la cuenta destino exceden el saldo m�ximo de la misma
			} else if (destino.getSaldo() + monto > destino.getMaximo()) {
				System.out.println("El saldo de la cuenta destino excede el m�ximo permitido.");
				return ticket;
			} else {
			//Si la transferencia es exitosa, se actualizan los saldos de ambas cuentas
				origen.setSaldo(origen.getSaldo() - monto);
				destino.setSaldo(destino.getSaldo() + monto);
				ticket = new Ticket(folio++, new Date(), destino.getNumeroCuenta(), origen.getSaldo(), sucursal, idCajero);
				return ticket;				
	}
	
	} else { 
		System.out.println("Alguno de los clientes no tiene cuenta asociada");
		return ticket;
	}
	
	}
		
}
