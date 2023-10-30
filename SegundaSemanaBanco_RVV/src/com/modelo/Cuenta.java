package com.modelo;

public class Cuenta {
	
	//definir una clase o modelo para crear cuentas de banco
	
	private int numerocuenta;
	private String nombre;
	private double saldo;
	private String tipodecuenta;
	private double minimo;
	private double maximo;
	
	public Cuenta() {}

	public Cuenta(int numerocuenta, String nombre, double saldo, String tipodecuenta, double minimo, double maximo) {
		super();
		this.numerocuenta = numerocuenta;
		this.nombre = nombre;
		this.saldo = saldo;
		this.tipodecuenta = tipodecuenta;
		this.minimo = minimo;
		this.maximo = maximo;
	}

	public int getNumerocuenta() {
		return numerocuenta;
	}

	public void setNumerocuenta(int numerocuenta) {
		this.numerocuenta = numerocuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTipodecuenta() {
		return tipodecuenta;
	}

	public void setTipodecuenta(String tipodecuenta) {
		this.tipodecuenta = tipodecuenta;
	}

	public double getMinimo() {
		return minimo;
	}

	public void setMinimo(double minimo) {
		this.minimo = minimo;
	}

	public double getMaximo() {
		return maximo;
	}

	public void setMaximo(double maximo) {
		this.maximo = maximo;
	}

	@Override
	public String toString() {
		return "Cuenta [numerocuenta=" + numerocuenta + ", nombre=" + nombre + ", saldo=" + saldo + ", tipodecuenta="
				+ tipodecuenta + ", minimo=" + minimo + ", maximo=" + maximo + "]";
	}
	
	

}
