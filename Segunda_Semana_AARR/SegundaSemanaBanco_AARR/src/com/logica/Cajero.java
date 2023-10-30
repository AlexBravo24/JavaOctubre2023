package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos{
	//Clase que va a implementar las acciones o lógica de las operaciones
	
	private Map <Integer, Cuenta> cuentas;
	private String sucursal;
	private int idCajero;
	//El folio solo lo declaramos como atributo de cajero para auxiliarnos en el incremento del folio en el Ticket
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
		// Tenemnos que retornar el valor de una cuenta, instanaciamos una momentaneamente
		Cuenta cuenta = null; //Nula, por que si la cuenta no existe retornaremos un valor nulo, si la cuenta existe la asignamos a ella
		cuenta = cuentas.get(numeroCuenta);
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		//Como tenemos que responder o devolver el valor de un ticket instanciamos un vacio de momento
		Ticket ticket = null;
		
		//Para hacer un retiro necesitamos buscar la cuenta de la cual retiraremos dichos recursos
		//Si el metodo buscarCuenta, localiza una y es diferente a nulo
		if(buscarCuenta(numeroCuenta) !=null) {//la asignamos a un objeto cuenta para manipular su saldo
			Cuenta cuenta = buscarCuenta(numeroCuenta);
			//Los cajeros en la vida real realizan ciertas operaciones para validar dichas operaciones
			if(monto>8000) {//Validamos la condicion que el cajero tiene de retiros en ese dia
				System.out.println("El monto excede el máximo permitido por el cajero");
				return ticket;
				//Validamos si el monto puede retirarse, que la cuenta tenga fondos suficientes
			}else if(cuenta.getSaldo()<monto) {
				System.out.println("La cuenta no tiene saldo suficiente");
				return ticket;
				//Siguiente validacion, si la cuenta tiene saldo suficiente, pero esto deja por debajo del saldo minimo a la cuenta
			}else if(cuenta.getSaldo()-monto<cuenta.getMinimo()) {
				System.out.println("El retiro dejaria por debajo del saldo minimo a la cuenta");
				return ticket;
			}else {//Si el retiro puede realizarse actualizamos el saldo de la cuenta
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				//Y entonces emitimos un nuevo ticket
				ticket = new Ticket(folio++, new Date(), cuenta.getNumeroCuenta(), cuenta.getSaldo(), sucursal, idCajero);
				return ticket;
				
			}
			
		}else {//en caso de que la cuenta de la cual queremos retirar recurso, no existe
			System.out.println("no hay una cuenta asociada a ese cliente");	
			return ticket;

		}
		
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {

		Ticket ticket = null;
		
		if(buscarCuenta(numeroCuenta) !=null) {//la asignamos a un objeto cuenta para manipular su saldo
			Cuenta cuenta = buscarCuenta(numeroCuenta);
			//Validaciones
			//Si el monto a depositar es mayor que el saldo maximo de la cuenta
			if(monto>cuenta.getMaximo()) {
				System.out.println("El monto a depositar excede el saldo maximo de la cuenta");
				return ticket;
				//siguiente validacion similar, si el saldo de la cuenta más el monto a depositar exceden el saldo maximo permitido
			}else if(cuenta.getSaldo()+monto>cuenta.getMaximo()) {
				System.out.println("El deposito excederia el saldo maximo permitido en la cuenta");
				return ticket;
			}else {
				//si el deposito si puede realizarse actualizamos el saldo de la cuenta
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getNumeroCuenta(), cuenta.getSaldo(), sucursal, idCajero);
				return ticket;
			}
			
			}else {
				System.out.println("No hay una cuenta asociada a ese cliente");
				return ticket;
			}
		
		
	}

	@Override
	public Ticket transferir(int cuentaOrigen, int cuentaDestino, double monto) {
		
		Ticket ticket = null;
		if(buscarCuenta(cuentaOrigen)!= null && buscarCuenta(cuentaDestino)!=null){
			Cuenta origen = buscarCuenta(cuentaOrigen);
			Cuenta destino = buscarCuenta(cuentaDestino);
			//Validaciones
			//si la cuenta de origen tiene un saldo menor al que quiere transferir
			if(origen.getSaldo()<monto) {
				System.out.println("No hay fondos suficientes para realizar la transferencia");
				return ticket;
			//Si tiene saldo suficiente pero deja por debajo del saldo minimo
			}else if(origen.getSaldo()-monto<origen.getMinimo()) {
				System.out.println("La transferencia dejaria por debajo del minimo a la cuenta origen");
				return ticket;
			//si la transferencia excede el monto maximo de la cuenta destino
			}else if(monto>destino.getMaximo()) {
				System.out.println("El monto excede el saldo maximo permitido en la cuenta destino");
				return ticket;
			//Si el monto mas el saldo excede el saldo maximo
			}else if(destino.getSaldo()+monto>destino.getMaximo()) {
				System.out.println("El saldo de la cuenta destino excederia el maximo permitido");
				return ticket;
			}else {
				//Si transferencia puede realizarse
				origen.setSaldo(origen.getSaldo()-monto);
				destino.setSaldo(destino.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(), destino.getNumeroCuenta(), origen.getSaldo(), sucursal, idCajero);
				
				return ticket;
			}
			
			
		}else {
			System.out.println("La cuenta no existe");
			return ticket;
		}
		
		
		
	}
	
	
}
