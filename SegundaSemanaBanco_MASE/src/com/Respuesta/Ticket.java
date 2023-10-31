package com.Respuesta;

import java.util.Date;

public class Ticket {
	//Esun objeto que va a responder cada vez que la operaciòn se haga con exito
	
	
	private int folio;
	private Date fechaHora;
	private int numerocuenta;
	private double saldo;
	private String sucursal;
	private int idCajero;
	
	public Ticket() {}

	public Ticket(int folio, Date fechaHora, int numerocuenta, double saldo, String sucursal, int idCajero) {
		super();
		this.folio = folio;
		this.fechaHora = fechaHora;
		this.numerocuenta = numerocuenta;
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

	public int getNumerocuenta() {
		return numerocuenta;
	}

	public void setNumerocuenta(int numerocuenta) {
		this.numerocuenta = numerocuenta;
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
		return "Ticket [folio=" + folio + ", fechaHora=" + fechaHora + ", numerocuenta=" + numerocuenta + ", saldo="
				+ saldo + ", sucursal=" + sucursal + ", idCajero=" + idCajero + "]";
	}

	
}
