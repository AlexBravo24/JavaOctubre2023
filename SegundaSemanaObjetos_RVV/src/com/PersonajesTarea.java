package com;

public class PersonajesTarea {
	private String nombre;
	private String clase;
	private String Raza;
	private int nivel;
	private int hp;
	private int stamina;
	private int mana;
	private int fuerza;
	 
	public PersonajesTarea() {}

	public PersonajesTarea(String nombre, String clase, String raza, int nivel, int hp, int stamina, int mana,
			int fuerza) {
		super();
		this.nombre = nombre;
		this.clase = clase;
		Raza = raza;
		this.nivel = nivel;
		this.hp = hp;
		this.stamina = stamina;
		this.mana = mana;
		this.fuerza = fuerza;
	}

	@Override
	public String toString() {
		return "PersonajesTarea [nombre=" + nombre + ", clase=" + clase + ", Raza=" + Raza + ", nivel=" + nivel
				+ ", hp=" + hp + ", stamina=" + stamina + ", mana=" + mana + ", fuerza=" + fuerza + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getRaza() {
		return Raza;
	}

	public void setRaza(String raza) {
		Raza = raza;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	
	
	

}
