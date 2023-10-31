package com;

public class Principal {
	
	public static void main(String[] args) {
		
	
	Persona persona1 = new Persona("Arasandi", 24, "Femenino");
	 System.out.println(persona1);

	 
	 Empleado desarrollador =new Empleado();
	 
	 desarrollador.setEdad(24);
	 desarrollador.setGenero("Femenino");
	 desarrollador.setNombre("Arasandi");
	 desarrollador.setPuesto("Desarrollador");
	 desarrollador.setRFC("SOEA991011");
	 desarrollador.setSalario("40000");
	
	 System.out.println(desarrollador);
	
	
	 Estudiante estudiante1 = new Estudiante();
	 estudiante1.setNombre("Arasandi");
	 estudiante1.setEdad(24);
	 estudiante1.setEscuela("TESVG");
	 estudiante1.setCarrera("ISC");
	 estudiante1.setGenero("F");
	 estudiante1.setMatricula(2018123057);
	 
	 System.out.println(estudiante1);
	 
	 //Metodo o comportamiento propio comer
	 persona1.comer();
	 
	 //Probar nuevamente el metodo comer
	 //Y vemos que este ya pasee dos formas
	 
	 persona1.comer("Pizza");
	 
	 //Estos metodos tambien son heredados a las subclases o clases hija si son las que hay
	 
		persona1.comer("sushi");
		 desarrollador.comer(3, "Tacos");
		 
		 //Probando el mètodo con retorno caminar
		 persona1.caminar();
		 System.out.println(persona1.caminar());
		 
		 //De igual forma podemos volverlo polimorfico
		 
		 System.out.println(persona1.caminar("en el centro"));
	 }
	}

