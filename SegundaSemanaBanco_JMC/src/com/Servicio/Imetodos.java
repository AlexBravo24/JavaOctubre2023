package com.Servicio;

import com.modelo.Cuenta;//importar  este paquete que estan
import com.respuesta.Ticket;//fuera de este paquete

public interface Imetodos {

	//Esta interfcace va a tener declaradas las operaciones 
	//que la clase cajero en este ejercicio
	//va a encargarse de resolver y difinit como 
	//se realizaran
	
	//Metodo para retornar el valor de una cuenta
	//y la buscamos por numero de cuenta
	public Cuenta buscarCuenta(int numeroCuenta);
	
   //Metodo que retorna un ticket cuando se realiza un retiro 
	//y para retirar necesitamos el numero de cta y el monto
	public Ticket retirar(int numeroCuenta, double monto);
    public Ticket depositar(int numeroCuenta,double monto);
    public Ticket transferir(int cuentaOrigen,int cuentaDestino,double monto);
}
