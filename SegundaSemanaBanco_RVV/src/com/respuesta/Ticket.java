package com.respuesta;

import java.util.Date;

public class Ticket {
	
	//es un objeto que va a responder cada vez que una operacion
	//se realice con exito
	
	private int foliooperacion;
	private Date fechahora;
	private int numerocuenta;
	private double saldo;
	private String sucursal;
	private int idcajero;
	
	public Ticket() {}

	public Ticket(int foliooperacion, Date fechahora, int numerocuenta, double saldo, String sucursal, int idcajero) {
		super();
		this.foliooperacion = foliooperacion;
		this.fechahora = fechahora;
		this.numerocuenta = numerocuenta;
		this.saldo = saldo;
		this.sucursal = sucursal;
		this.idcajero = idcajero;
	}

	public int getFoliooperacion() {
		return foliooperacion;
	}

	public void setFoliooperacion(int foliooperacion) {
		this.foliooperacion = foliooperacion;
	}

	public Date getFechahora() {
		return fechahora;
	}

	public void setFechahora(Date fechahora) {
		this.fechahora = fechahora;
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

	public int getIdcajero() {
		return idcajero;
	}

	public void setIdcajero(int idcajero) {
		this.idcajero = idcajero;
	}

	@Override
	public String toString() {
		return "Ticket [foliooperacion=" + foliooperacion + ", fechahora=" + fechahora + ", numerocuenta="
				+ numerocuenta + ", saldo=" + saldo + ", sucursal=" + sucursal + ", idcajero=" + idcajero + "]";
	}

}
