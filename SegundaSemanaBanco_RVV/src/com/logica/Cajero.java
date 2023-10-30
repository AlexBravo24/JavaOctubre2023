package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos {
	// clase que va a implementar las acciones o logica
	// de las operaciones

	private Map<Integer, Cuenta> cuentas;
	private String sucursal;
	private int idcajero;
	private int folio = 1;

	public Cajero() {
	}

	public Cajero(Map<Integer, Cuenta> cuentas, String sucursal, int idcajero) {
		super();
		this.cuentas = cuentas;
		this.sucursal = sucursal;
		this.idcajero = idcajero;
	}

	@Override
	public Cuenta buscarcuenta(int numerocuenta) {
		// como tenemos que retornar el valor de una cuenta
		// instanciamos una, momentaneamente vacia
		Cuenta cuenta = null; // nula porque si la cuenta no existe
		// retornaremos un valor nulo
		// si la cuenta existe, le asignamos a ella
		cuenta = cuentas.get(numerocuenta);
		return cuenta;
	}

	@Override
	public Ticket retirar(int numerocuenta, double monto) {
		// como tenemos que responder o devolver el valor de un ticket
		// instanciamos uno vacio de momento
		Ticket ticket = null;
		// para hace run retiro necesitamos buscar la cuenta de la cual retiraremos
		// recursos
		if (buscarcuenta(numerocuenta) != null) { // la asignamos a un objeto
			// cuenta para manipular su saldo
			Cuenta cuenta = buscarcuenta(numerocuenta);
			// los cajero en la vida real, realizan ciertas validaciones
			// para realizar las operaciones
			if (monto > 8000) { // validamos la condicion que el cajero tiene
				// de retiros en ese dia
				System.out.println("el monto excede el maximo permitido por el cajero");
				return ticket;
				// ahora validamos si el monto puede retirarse, que la cuenta tenga fondos
				// suficientes

			} else if (cuenta.getSaldo() < monto) {
				System.out.println("la cuenta no tiene saldo suficiente");
				return ticket;
				// siguiente validacion, si la cuenta tiene saldo suficiente,
				// pero esto deja por debajo del saldo minimo a la cuenta
			} else if (cuenta.getSaldo() - monto < cuenta.getMinimo()) {
				System.out.println("el retiro dejaria por debajo del saldo minimo a la cuenta");
				return ticket;
			} else {// si el retiro si puede realizarse
					// actualizamos el saldo de la cuenta
				cuenta.setSaldo(cuenta.getSaldo() - monto);
				// entonces emitimos un nuevo
				ticket = new Ticket(folio++, new Date(), cuenta.getNumerocuenta(), cuenta.getSaldo(), sucursal,
						idcajero);
				return ticket;
			}

		} else {// en caso de que la cuenta de la cuel queremos retirar, no existe
			System.out.println("no hay una cuenta asociada a ese cliente");
			return ticket;
		}

	}

	@Override
	public Ticket depositar(int numerocuenta, double monto) {
		Ticket ticket =null;
		if(buscarcuenta(numerocuenta)!=null) {
			Cuenta cuenta=buscarcuenta(numerocuenta);
			//validaciones
			//si el monto a depositar es mayor que el saldo maximo
			if(monto>cuenta.getMaximo()) {
				System.out.println("el monto a depositar excede el saldo maximo permitido en la cuenta");
				return ticket;
				//siguiente validacion similar, si el saldo de la cuenta mas el monto
				//a depositar exceden el saldo maximo permitido
			}else if(cuenta.getSaldo()+monto>cuenta.getMaximo()) {
				System.out.println("el deposito excederia el saldo maximo de la cuenta");
				return ticket;
			}else {//si el deposito si puede realizarse
				//actualizamos el saldo de la cuenta
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				//creamos un nuevo ticket
				ticket = new Ticket(folio++, new Date(), cuenta.getNumerocuenta(), cuenta.getSaldo(), sucursal,
						idcajero);
				return ticket;
			}
		}else {
			System.out.println("no hay cuenta asociada a ese cliente");
			return ticket;
		
		}
		
		
		
		
		}

	@Override
	public Ticket transferir(int cuentaorigen, int cuentadestino, double monto) {
		Ticket ticket =null;
		if(buscarcuenta(cuentaorigen)!=null && buscarcuenta(cuentadestino)!=null) {
			Cuenta origen=buscarcuenta(cuentaorigen);
			Cuenta destino=buscarcuenta(cuentadestino);
			//validaciones
			//si la cuenta de origen tiene un saldo menor al que quiere transferir
			if(origen.getSaldo()<monto) {
				System.out.println("no hay fondos suficientes");
				return ticket;
				//si la operacion del monto deja por debajo del minimo a la cuenta origen
			}else if(origen.getSaldo()-monto<origen.getMinimo()) {
				System.out.println("la transferencia dejaria por debajo del minimo a la cuenta de origen");
				return ticket;
				//si la transferencia excede el monto maximo de la cuenta destino
			}else if(monto>origen.getMaximo()) {
				System.out.println("el monto excede el saldo maximo permitido en la cuenta");
				return ticket;
				//si la transferencia mas el saldo de la cuenta destino exceden el saldo maximo
			}else if(destino.getSaldo()+monto>destino.getMaximo()) {
				System.out.println("el saldo de la cuenta destino excederia el maximo permitido");
				return ticket;
			}else {
				//si la transferencia puede realizarse actualizamos los saldos de ambas cuentas
				origen.setSaldo(origen.getSaldo()-monto);
				destino.setSaldo(destino.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(), destino.getNumerocuenta(), origen.getSaldo(), sucursal,
						idcajero);
				return ticket;
			}
			
	}else {
		System.out.println("alguno de los clientes no tiene una cuenta asociada");
		return ticket;
	}
		
	}
}