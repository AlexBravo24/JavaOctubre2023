package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {
	
	//Esta interface va a tener declaradas las operaciones
	//que la clase Cajero en este ejercicio
	//va a encargarse de resolver y definir CÓMO se 
	//realizarán
	
	//Metodo para retornar el valor de una cuenta
	//y la buscamos por numero de cuenta
	public Cuenta buscarCuenta(int numeroCuenta);
	//Método que retorna un ticket cuando se realiza un retiro
	//y para retirar necesitamos el numero de cta y el monto
	public Ticket retirar (int numeroCuenta, double monto);
	public Ticket depositar (int numeroCuenta, double monto);
	
	public Ticket transferir (int cuentaOrigen, int cuentaDestino, double monto);

}
