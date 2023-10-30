package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos {
	
	//Clase que va a implementar las acciones o l�gica
	//de las operaciones

	private Map<Integer, Cuenta> cuentas;
	private String sucursal;
	private int idCajero;
	//El folio solo lo declaramos como atributo de Cajero para auxiliarnos
	//en el incremento del folio en el Ticket
	private int folio=1;
	
	public Cajero() {
		
	}
	
	public Cajero(Map<Integer, Cuenta> cuentas, String sucursal, int idCajero) {
		super();
		this.cuentas = cuentas;
		this.sucursal = sucursal;
		this.idCajero = idCajero;
	}

	@Override
	public Cuenta buscarCuenta(int numeroCuenta) {
		//Como tenemos que retornar el valor de una cuenta
		//instanciamos una, momentaneamente vacia
		
		Cuenta cuenta = null;//Nula, porque si la cuenta no existe
		//retornamos un valor nulo
		
		//Si la cuenta existe, la asignamos a ella
		cuenta = cuentas.get(numeroCuenta);
		
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		//Como tenemos que responder o devolver el valor de un ticket
		//instanciamos uno vac�o de momento
		Ticket ticket = null;
		
		//Para hacer un retiro necesitamos buscar la cuenta de la cual retiran
		//dichos recursos
		//Si el m�todo buscarCuenta, localiza una y es diferente de nulo
		if(buscarCuenta(numeroCuenta) != null) {//la asignamos a un objeto
			//cuenta para manipular su saldo
			Cuenta cuenta = buscarCuenta(numeroCuenta);
		//Los cajeros en la vida real, realizan ciertas validaciones
		//para crear las operaciones
			if(monto>8000) {//Validamos la condici�n que el cajero tiene
				//de retiros ese d�a
				System.out.println("El monto excede el m�ximo permitido por el cajero");
				return ticket;
			}
			//Ahora validamos, si el monto puede retirarse, que la cuenta tenga fondos suficientes
			else if(cuenta.getSaldo()<monto) {
				System.out.println("La cuenta no tiene saldo suficiente");
				return ticket;
			}
			//Siguente validaci�n, si la cuenta tiene saldo suficiente,
			//pero esto deja por debajo del saldo minimo a la cuenta
			else if(cuenta.getSaldo()-monto<cuenta.getMinimo()) {
				System.out.println("El retiro dejar�a por debajo del saldo m�nimo a la cuenta");
				return ticket;
			}
			else {
				//Si el retiro si puede realizarse
				//Actualizamos el saldo de la cuenta
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				//Y entonces emitimos un nuevo ticket
				ticket = new Ticket(folio++,new Date(), cuenta.getNumeroCuenta(), cuenta.getSaldo(),sucursal,idCajero);
				return ticket;
			}
			
		}
		
		else {//En caso de que la cuenta de la que queremos retirar recurso, no existe
			System.out.println("No hay cuenta asociada a ese cliente");
			return ticket;
		}
		
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		if(buscarCuenta(numeroCuenta) != null) {
			Cuenta cuenta = buscarCuenta(numeroCuenta);
		//Validaciones 
			//Si el monto a depositar es mayor que el saldo m�ximo de la cuenta
			if(monto>cuenta.getMaximo()) {
				System.out.println("El monto a depositar excede el saldo m�ximo permitido en la cuenta");
				return ticket;
			}
			//Siguiente validaci�n - si el saldo de la cuenta m�s el monto
			//a depositar exceden el saldo m�ximo permitido
			else if(cuenta.getSaldo()+monto>cuenta.getMaximo()) {
				System.out.println("El deposito exceder�a el saldo m�ximo permitido en la cuenta");
				return ticket;
			}
			else {//Si el deposito si puede realizarse
				//Actualizamos el saldo de la cuenta
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				//Creamos un nuevo ticket
				ticket = new Ticket(folio++,new Date(), cuenta.getNumeroCuenta(), cuenta.getSaldo(),sucursal,idCajero);
				return ticket;
			}
		}
		else {
			System.out.println("No hay cuenta asociada a ese cliente");
			return ticket;
		}		
	}

	@Override
	public Ticket transferir(int cuentaOrigen, int cuentaDestino, double monto) {
		Ticket ticket = null;
		if(buscarCuenta(cuentaOrigen) != null && buscarCuenta(cuentaDestino) != null) {
			Cuenta origen = buscarCuenta(cuentaOrigen);
			Cuenta destino = buscarCuenta(cuentaDestino);
			
			//Validaciones
			//Si la cuenta de origen tiene un saldo menor al que quiere transferir
			if(origen.getSaldo()<monto) {
				System.out.println("No hay fondos suficientes para la transferencia");
				return ticket;
			}
			//Si la operaci�n del monto, deja por debajo del m�nimo a la cuenta de origen
			else if(origen.getSaldo()-monto<origen.getMinimo()) {
				System.out.println("La transferencia dejar�a por debajo del m�nimo a la cuenta de origen");
				return ticket;
			}
			//Si la transferencia excede el monto m�ximo de la cuenta destino
			else if(monto>destino.getMaximo()) {
				System.out.println("El monto excede el saldo m�ximo permitido en la cuenta destino");
				return ticket;
			}
			//Si la transferencia m�s el saldo de la cuenta destino exceden el saldo m�ximo
			else if(destino.getSaldo()+monto>destino.getMaximo()) {
				System.out.println("El saldo de la cuenta destino exceder�a el m�ximo permitido");
				return ticket;
			}
			//Si la transferencia si se puede llevar a cabo, actualizamos los saldos de ambas cuentas
			else {
				origen.setSaldo(origen.getSaldo()-monto);
				destino.setSaldo(destino.getSaldo()+monto);
				ticket = new Ticket(folio++,new Date(), destino.getNumeroCuenta(), origen.getSaldo(),sucursal,idCajero);
				return ticket;
			}
		}
		else {
			System.out.println("Alguno de los clientes no tiene una cuenta asociada");
			return ticket;
		}
	}

}