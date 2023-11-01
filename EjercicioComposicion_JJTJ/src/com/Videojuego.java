package com;

public class Videojuego {
	
	private String juego;
	private String cuenta;
	private String contrase�a;
	private Personaje personaje;
	private Clase clasepersonaje;
	private Atributos atributospersonaje;
	
	public Videojuego() {}

	public Videojuego(String juego, String cuenta, String contrase�a, Personaje personaje, Clase clasepersonaje,
			Atributos atributospersonaje) {
		super();
		this.juego = juego;
		this.cuenta = cuenta;
		this.contrase�a = contrase�a;
		this.personaje = personaje;
		this.clasepersonaje = clasepersonaje;
		this.atributospersonaje = atributospersonaje;
	}

	public String getJuego() {
		return juego;
	}

	public void setJuego(String juego) {
		this.juego = juego;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public Personaje getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}

	public Clase getClasepersonaje() {
		return clasepersonaje;
	}

	public void setClasepersonaje(Clase clasepersonaje) {
		this.clasepersonaje = clasepersonaje;
	}

	public Atributos getAtributospersonaje() {
		return atributospersonaje;
	}

	public void setAtributospersonaje(Atributos atributospersonaje) {
		this.atributospersonaje = atributospersonaje;
	}

	@Override
	public String toString() {
		return "VideoJuego [juego=" + juego + ", cuenta=" + cuenta + ", contrase�a=" + contrase�a + ", personaje="
				+ personaje + ", clasepersonaje=" + clasepersonaje + ", atributospersonaje=" + atributospersonaje + "]";
	}

	
	

}
