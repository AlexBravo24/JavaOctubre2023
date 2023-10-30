package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos {

	// Clase que va a implementar las acciones o lógica
	// de las operaciones

	private Map<Integer, Cuenta> cuentas;
	private String sucursal;
	private int idCajero;
	private int folio = 1;

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
		// Como tenen,os que retornar el valor de una cuenta
		// instanciamos una, momentaneamente vacia

		Cuenta cuenta = null;// Nula porque si la cuenta no existe retornamos un valor nulo}

		// Si la cuenta existe, la asigna,mos a ella
		cuenta = cuentas.get(numeroCuenta);
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		// Como tenemos que responder con un ticket instanciamos uno vacio de momento

		Ticket ticket = null;

		// Para hacer un retiro buscamos la cuenta de la cual retiramos recursos
		// Si el metodo buscarCuenta, localiza una y es diferente de nulo

		if (buscarCuenta(numeroCuenta) != null) // la Asignamos a un objeto

		{
			// cuenta para manipular su saldo

			Cuenta cuenta = buscarCuenta(numeroCuenta);

			// los cajeros realizan ciertas validaciones para realizar las operaciones

			if (monto > 8000) {// validamos la condicion del cajero de retiros en el dia

				System.out.println("El monto excede el maixmo permitido por el cajero");
				return ticket;
			} else if (cuenta.getSaldo() < monto) {// Validar si monto puede retirarse, que la cuenta tenga fondos
													// suficientes
				System.out.println("La cuenta no tiene saldo suficiente");
				return ticket;

				// Otra validacion, si la cuenta tiene saldo suficiente pero esta deja por
				// debajo del saldo minimo a la cuenta no se realiza la operacion

			} else if (cuenta.getSaldo() - monto < cuenta.getMinimo()) {
				System.out.println("El retiro dejaria por debajo del saldo minimo a la cuenta");
				return ticket;
			} else {

				// Si el retiro si se puede realizar
				cuenta.setSaldo(cuenta.getSaldo() - monto);

				ticket = new Ticket(folio++, new Date(), cuenta.getNumeroCuenta(), cuenta.getSaldo(), sucursal,
						idCajero);

				return ticket;
			}

		} else { // En caso de que la cuenta de la cual queremos retirar recurso, no exite

			System.out.println("No hay una cuenta asociada e ese ticket");
			return ticket;

		}

	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		
		if (buscarCuenta(numeroCuenta) != null) // la Asignamos a un objeto

		{
			// cuenta para manipular su saldo

			Cuenta cuenta = buscarCuenta(numeroCuenta);
			//Validaciones 
			//Si el monto a depositar es mayor al permitido por la cuenta
			
			if(monto>cuenta.getMaximo()) {
				System.out.println("El monto a depositar excede el saldo maximo permitido en la cuenta");
				return ticket;
				//Siguinte validacion similar, si el saldo de la cuenta mas el monto
				// a depositar excede el saldo maximo permito
			}else if (cuenta.getSaldo()+ monto>cuenta.getMaximo()) {
				System.out.println("El monto a depositar excede el saldo maximo permitido en la cuenta");
				return ticket;
				
			}else {
				
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				
				ticket = new Ticket(folio++, new Date(), cuenta.getNumeroCuenta(), cuenta.getSaldo(), sucursal,
						idCajero);
				return ticket;
			}
			
			
		}else {
			System.out.println("No hay una cueta asociada a ese cliente");
			return ticket;
			
		}

		

	
	}

	@Override
	public Ticket transferir(int cuentaOrigen, int cuentaDestino, double monto) {
		Ticket ticket = null;
		
		if(buscarCuenta(cuentaOrigen)!=null && buscarCuenta(cuentaDestino)!=null) {
			Cuenta origen = buscarCuenta(cuentaOrigen);
			Cuenta destino = buscarCuenta(cuentaDestino);
			//Validaciones
			//Si la cuenta de origen tiene un saldo menor al que quiere transferir
			if(origen.getSaldo()<monto) {
				System.out.println("No hay fondos suficientes para la transferencia");
				return ticket;
			//Si la operacion del monto, deja por debajo del minimo a la cuenta de origen
			}else if(origen.getSaldo()-monto<origen.getMinimo()) {
				System.out.println("La transferencia dejaría por debajo del minimo a la cuenta origen");
				return ticket;
				//Si la transferencia excede el monto máximo de la cuenta destino
			}else if (monto>destino.getMaximo()) {
				System.out.println("El monto excede el saldo máximo permitido en la cuenta destino");
				return ticket;
				//Si la transferencia más el saldo de la cuenta destino exceden el saldo máximo
			}else if(destino.getSaldo()+monto>destino.getMaximo()) {
				System.out.println("El saldo de la cuenta destino excedería el máximo permitido");
				return ticket;
			}else {
				//Si la transferencia puede realizarse, actualizamos los saldos de ambas cuentas
				origen.setSaldo(origen.getSaldo()-monto);
				destino.setSaldo(destino.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(), destino.getNumeroCuenta(), origen.getSaldo(), sucursal,
						idCajero);
				return ticket;
			}
			
		}else {
			System.out.println("Alguno de los clientes no tiene una cuenta asociada");
			return ticket;
		}
	}

}
