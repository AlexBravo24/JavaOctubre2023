package com;

public class Divisi�n�tomos {
	
	private String n�cleo;
	private double electr�n;
	private double prot�n;
	
	public Divisi�n�tomos () {}

	public Divisi�n�tomos(String n�cleo, double electr�n, double prot�n) {
		super();
		this.n�cleo = n�cleo;
		this.electr�n = electr�n;
		this.prot�n = prot�n;
	}

	public String getN�cleo() {
		return n�cleo;
	}

	public void setN�cleo(String n�cleo) {
		this.n�cleo = n�cleo;
	}

	public double getElectr�n() {
		return electr�n;
	}

	public void setElectr�n(double electr�n) {
		this.electr�n = electr�n;
	}

	public double getProt�n() {
		return prot�n;
	}

	public void setProt�n(double prot�n) {
		this.prot�n = prot�n;
	}

	@Override
	public String toString() {
		return "Divisi�n�tomos [n�cleo=" + n�cleo + ", electr�n=" + electr�n + ", prot�n=" + prot�n + "]";
	}
	
	

}
