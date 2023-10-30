package com;

public class Animal {

	private String habitat;
	private String anatomia;
	private String alimentacion;

	public Animal() {}

	public Animal(String habitat, String anatomia, String alimentacion) {
		super();
		this.habitat = habitat;
		this.anatomia = anatomia;
		this.alimentacion = alimentacion;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getAnatomia() {
		return anatomia;
	}

	public void setAnatomia(String anatomia) {
		this.anatomia = anatomia;
	}

	public String getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}

	@Override
	public String toString() {
		return "Animal [habitat=" + habitat + ", anatomia=" + anatomia + ", alimentacion=" + alimentacion + "]";
	} 
	
	
	
	
}
