package com;

public class Divisiónátomos {
	
	private String núcleo;
	private double electrón;
	private double protón;
	
	public Divisiónátomos () {}

	public Divisiónátomos(String núcleo, double electrón, double protón) {
		super();
		this.núcleo = núcleo;
		this.electrón = electrón;
		this.protón = protón;
	}

	public String getNúcleo() {
		return núcleo;
	}

	public void setNúcleo(String núcleo) {
		this.núcleo = núcleo;
	}

	public double getElectrón() {
		return electrón;
	}

	public void setElectrón(double electrón) {
		this.electrón = electrón;
	}

	public double getProtón() {
		return protón;
	}

	public void setProtón(double protón) {
		this.protón = protón;
	}

	@Override
	public String toString() {
		return "Divisiónátomos [núcleo=" + núcleo + ", electrón=" + electrón + ", protón=" + protón + "]";
	}
	
	

}
