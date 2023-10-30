package com.respuesta;

import java.util.Date;

public class Ticket {
	
	//Es un objeto que va a responder cada vez que
	//una operación se realice con éxito
	
	private int folioOperación;
	private Date fechaHora;
	private int numeroCuenta;
	private double saldo;
	private String sucursal;
	private int idCajero;
	
	public Ticket() {
		
	}

	public Ticket(int folioOperación, Date fechaHora, int numeroCuenta, double saldo, String sucursal, int idCajero) {
		super();
		this.folioOperación = folioOperación;
		this.fechaHora = fechaHora;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.sucursal = sucursal;
		this.idCajero = idCajero;
	}

	public int getFolioOperación() {
		return folioOperación;
	}

	public void setFolioOperación(int folioOperación) {
		this.folioOperación = folioOperación;
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
		return "Ticket [folioOperación=" + folioOperación + ", fechaHora=" + fechaHora + ", numeroCuenta="
				+ numeroCuenta + ", saldo=" + saldo + ", sucursal=" + sucursal + ", idCajero=" + idCajero + "]";
	}

}
