package com;

public class Animal {
	
	private String nombre;
	private String especie;
	private String tipo;
	
	public Animal() {}

	public Animal(String nombre, String especie, String tipo) {
		super();
		this.nombre = nombre;
		this.especie = especie;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", especie=" + especie + ", tipo=" + tipo + "]";
	}
	
	public void comer(String comida) {
		//Este metodo va a ejecutar una impresion en consola con el mensaje que se declara
		System.out.println("El animal come ");
	}
	
	public void comer(String comida, int cantidad) {
		//Este metodo va a ejecutar una impresion en consola con el mensaje que se declara
		System.out.println("El animal come "+ comida+" "+ cantidad);
	}
	//Metodos con retorno en un tipo de dato
			public String sonido() {
				
				String sonido ="el perro ladra";
				return sonido;
				
			}
			
public String sonido1() {
				
				String sonido1 ="el gato maulla";
				return sonido1;
				
			}

}
