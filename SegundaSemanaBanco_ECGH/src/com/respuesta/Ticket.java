package com.respuesta;

import java.util.Date;

public class Ticket {
	
	//Es un objeto que va responder cada vez que
	//una operacion se realice con exito
	
	private int folioOperacion;
	private Date fechaHora;
	private int numeroCuenta;
	private double saldo;
	private String sucursal;
	private int idCajero;
	
	
	public Ticket() {}


	public Ticket(int folioOperacion, Date fechaHora, int numeroCuenta, double saldo, String sucursal, int idCajero) {
		super();
		this.folioOperacion = folioOperacion;
		this.fechaHora = fechaHora;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.sucursal = sucursal;
		this.idCajero = idCajero;
	}


	public int getFolioOperacion() {
		return folioOperacion;
	}


	public void setFolioOperacion(int folioOperacion) {
		this.folioOperacion = folioOperacion;
	}


	public Date getFechaHora() {
		return fechaHora;
	}


	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}


	public int getNumeroCuenta() {
		return numeroCuenta;
	}


	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public String getSucursal() {
		return sucursal;
	}


	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}


	public int getIdCajero() {
		return idCajero;
	}


	public void setIdCajero(int idCajero) {
		this.idCajero = idCajero;
	}


	@Override
	public String toString() {
		return "Ticket [folioOperacion=" + folioOperacion + ", fechaHora=" + fechaHora + ", numeroCuenta="
				+ numeroCuenta + ", saldo=" + saldo + ", sucursal=" + sucursal + ", idCajero=" + idCajero + "]";
	};
	
	
	
	
	
	
	
	

}
