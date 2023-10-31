 package com;

public class Persona {

	
	
		
		// Esta clase serà la clase padre o superclase
		
		private String nombre;
		private int edad;
		private String genero;

		public Persona() {}

		public Persona(String nombre, int edad, String genero) {
			super();
			this.nombre = nombre;
			this.edad = edad;
			this.genero = genero;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
		}

 
		//Metodos propios de una clase
		//Nos permiten definir comportamiento y acciones de un objeto en particular
		
		
		//Metodos que no retornan un tipo de dato
		//no significa que no realice una accion por eso utilizamos el modificador void
		
		public void comer() {
			//Este metodo va a ejecutar una impresion en consola con el mensaje que se declara
			System.out.println("Estoy comiendo");
		}
			//El Poliformismo consiste en la capacidad de un metodo
			 //de ejecutar diversas acciones
			 //y de poseer varias formas
			 public void comer(String comida) {
				 
				 System.out.println("Estoy comiendo: "+ comida);
			 }
		public void comer(int cantidad, String comida) {
			System.out.println("Estoy comiendo "+ cantidad + "  " + comida );
		}
		
		//Metodos con retorno en un tipo de dato
		public String caminar() {
			
			String caminata ="estoy caminando";
			return caminata;
			
		}
		
public String caminar(String lugar) {
			
			String caminata ="estoy caminando"+ lugar;
			return caminata;
			
		}
		
		





}


