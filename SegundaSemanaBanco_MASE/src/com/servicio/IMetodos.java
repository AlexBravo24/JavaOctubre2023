package com.servicio;

import com.Respuesta.Ticket;
import com.modelo.Cuenta;

public interface IMetodos {

	//Esta interface va a tener declaradas las operaciones 
	//la clase cajero en este ejercicio
	//va a encargarse de resolver y definir como se realizaran 
	
	
	//Metodo para retornar el valor de una cuenta
	//Y la buscamos por numero de cuenta
	public Cuenta buscarCuenta(int numeroCuenta);
	//Metodo que retorna un ticket cuando se realiza un retiro
	//Para retirar necesitamos el numero dde cuenta y el monto
	public Ticket retirar(int numeroCuenta, double monto);
	
	public Ticket depositar(int numeroCuenta, double monto);
	
	public Ticket transferir(int cuentaOrigen,int cuentaDestino, double monto);
}
