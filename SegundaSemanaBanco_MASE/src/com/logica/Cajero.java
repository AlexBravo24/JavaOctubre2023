package com.logica;
import java.util.Date;
import java.util.Map;

import com.Respuesta.Ticket;
import com.modelo.Cuenta;
import com.servicio.IMetodos;

public class Cajero implements IMetodos{
	
	//Clase que va a implementar las acciones o logica de las operaciones
	
	private Map<Integer, Cuenta> cuentas;
	private String sucursal;
	private int idCajero;
	
	//Solo lo declaramos como atributo de cajero para auxiliarnos
	private int folio=1;
	
	public Cajero() {}
	
	
	

	public Cajero(Map<Integer, Cuenta> cuentas, String sucursal, int idCajero) {
		super();
		this.cuentas = cuentas;
		this.sucursal = sucursal;
		this.idCajero = idCajero;
	}




	@Override
	public Cuenta buscarCuenta(int numeroCuenta) {
		
		///Como tenemos que retornnar el valor de una cuenta 
		//instanciamos una, momentaneamente vacia
		
		Cuenta cuenta= null;//nula porque si la cuenta no existe  retornamos valor nulo
		
		//Si la cuenta exixte, la asignamos a ella 
		cuenta= cuentas.get(numeroCuenta);
		
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		// Devolver el valor en un ticket instanciamos uno vacio de momento
		Ticket ticket = null;
		//Para hacer un retiro necesitamos buscar la cuenta de la cual retiramos recursos
		
		//Si el metodo localiza la cuenta y es diferente de nulo
		if(buscarCuenta(numeroCuenta)!=null) {//le asignamos un objeto
			
			//cuenta para manipular su saldo
			
			Cuenta cuenta = buscarCuenta(numeroCuenta);
			
			//Los cajero realizan ciertas validaciones para realizar llas operaciones
			
			if(monto>5000) {//Validamos la condicion que el cajero tiene de retiro por dia
				System.out.println("El monto excede los retiros por dia");
				return ticket;
				
				//Si el saldo puede retirarse , que la cuenta tenga fondos suficientes
				
			}else if(cuenta.getSaldo()<monto) {
				System.out.println();
				return ticket;
			}else if(cuenta.getSaldo()-monto<cuenta.getMinimo()) {
				System.out.println("El retiro dejaria el saldo de la cuenta del minimo que ya permite");
				return ticket;
			}else {//Si el retiro puede realizarse actualiza el saldo de la cuenta
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getNumeroCuenta(), cuenta.getSaldo(),sucursal,idCajero);
				return ticket;
				
			}
			
			
		}else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
		
		
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		
		if(buscarCuenta(numeroCuenta) !=null) {// la asignamos a un objeto
			//cuenta para manipular su saldo
			Cuenta cuenta = buscarCuenta(numeroCuenta);
		//Validaciones
		//Si el monto a depositar es mayor que el saldo maximo de la cuenta
		if (monto>cuenta.getMaximo()) {
			System.out.println("El monto a depositar excede el saldo máximo permitido en la cuenta");
			return ticket;
			//Siguiente validacion similar, si el saldo de la cuenta más el monto
			//a depositar exceden el saldo maximo permitido
		}else if(cuenta.getSaldo()+monto>cuenta.getMaximo()) {
			System.out.println("El deposito excederia el saldo maximo permitido en la cuenta");
			return ticket;
		}else { //Si el deposito si puede realizarse
			//Actualizamos el saldo de la cuenta
			cuenta.setSaldo(cuenta.getSaldo()+monto);
			//Creamos un nuevo ticket
			ticket = new Ticket(folio++, new Date(), cuenta.getNumeroCuenta(), cuenta.getSaldo(), sucursal,
					idCajero);
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

	
	
	//Clase que va a implementar las acciones o logica
	//de las operaciones
	
	
	
	
}
