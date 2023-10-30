package com.respuesta;

import java.util.Date;

public class Ticket {
	
	//Es un objeto que va a responder cada vez que
	//una operaci�n se realice con �xito
	
	private int folioOperaci�n;
	private Date fechaHora;
	private int numeroCuenta;
	private double saldo;
	private String sucursal;
	private int idCajero;
	
	public Ticket() {
		
	}

	public Ticket(int folioOperaci�n, Date fechaHora, int numeroCuenta, double saldo, String sucursal, int idCajero) {
		super();
		this.folioOperaci�n = folioOperaci�n;
		this.fechaHora = fechaHora;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.sucursal = sucursal;
		this.idCajero = idCajero;
	}

	public int getFolioOperaci�n() {
		return folioOperaci�n;
	}

	public void setFolioOperaci�n(int folioOperaci�n) {
		this.folioOperaci�n = folioOperaci�n;
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
		return "Ticket [folioOperaci�n=" + folioOperaci�n + ", fechaHora=" + fechaHora + ", numeroCuenta="
				+ numeroCuenta + ", saldo=" + saldo + ", sucursal=" + sucursal + ", idCajero=" + idCajero + "]";
	}

}
