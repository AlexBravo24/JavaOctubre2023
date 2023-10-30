package com.respuesta;

import java.util.Date;

public class Ticket {

	//Objeto que va a responder cada vez que una operacion se realice con exito
	
	
	private int folio;
	private Date fechaHora;
	private int numeroCuenta;
	private double saldo;
	private String sucursal;
	private int idCajero;
	
	
	private Ticket() {}


	public Ticket(int folio, Date fechaHora, int numeroCuenta, double saldo, String sucursal, int idCajero) {
		super();
		this.folio = folio;
		this.fechaHora = fechaHora;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.sucursal = sucursal;
		this.idCajero = idCajero;
	}


	public int getFolio() {
		return folio;
	}


	public void setFolio(int folio) {
		this.folio = folio;
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
		return "Ticket [folio=" + folio + ", fechaHora=" + fechaHora + ", numeroCuenta=" + numeroCuenta + ", saldo="
				+ saldo + ", sucursal=" + sucursal + ", idCajero=" + idCajero + "]";
	}
	
	
	
	
	
}
