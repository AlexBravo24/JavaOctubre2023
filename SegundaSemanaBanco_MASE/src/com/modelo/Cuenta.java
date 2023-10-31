package com.modelo;

public class Cuenta {

	//Definir una clase o modelo para crear cuentas de Banco
	
	private int numeroCuenta;
	private String NombreUsuario;
	private double saldo;
	private String tipoCuenta;
	private double minimo;
	private double maximo;
	
	
	public Cuenta() {}


	public Cuenta(int numeroCuenta, String nombreUsuario, double saldo, String tipoCuenta, double minimo,
			double maximo) {
		super();
		this.numeroCuenta = numeroCuenta;
		NombreUsuario = nombreUsuario;
		this.saldo = saldo;
		this.tipoCuenta = tipoCuenta;
		this.minimo = minimo;
		this.maximo = maximo;
	}


	public int getNumeroCuenta() {
		return numeroCuenta;
	}


	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}


	public String getNombreUsuario() {
		return NombreUsuario;
	}


	public void setNombreUsuario(String nombreUsuario) {
		NombreUsuario = nombreUsuario;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public String getTipoCuenta() {
		return tipoCuenta;
	}


	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
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
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", NombreUsuario=" + NombreUsuario + ", saldo=" + saldo
				+ ", tipoCuenta=" + tipoCuenta + ", minimo=" + minimo + ", maximo=" + maximo + "]";
	}




}
