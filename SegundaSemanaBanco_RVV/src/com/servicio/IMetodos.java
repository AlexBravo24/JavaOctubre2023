package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {

	
	//esta interface va a tener declaradas las operaciones
	//que la clase cajero en este ejercicio
	//va a encargarse de resolver y definir como se realizaran
	
	//metodo para retornar el valor de una cuenta
	//y la buscamos por numero de cuenta
	public Cuenta buscarcuenta(int numerocuenta);
	//metodo que retorna un ticket cuando se realiza un retiro
	//y para retirar necesitamos el numero de cuenta y el monto
	public Ticket retirar(int numerocuenta, double monto);
	public Ticket depositar(int numerocuenta, double monto);
	
	public Ticket transferir(int cuentaorigen, int cuentadestino, double monto);
	
	
	
	
	
}