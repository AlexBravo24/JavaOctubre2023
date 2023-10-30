package com;

public class Principal {

	public static void main(String[] args) {
		
		// Puedo crear un objeto persona 
		
		Persona persona1 = new Empleado();
		//poliformismo dinamico o de asignacion
		
	//	System.out.println(persona1);
		
		
		//Crear o instacniar un empleado
		
		Empleado desarrollador = new Empleado();
		
		desarrollador.setEdad(25);
		desarrollador.setGenero("Masculino");
		desarrollador.setNombre("Josue");
		desarrollador.setCargo("Java developer backend");
		desarrollador.setSalario(25000);
		desarrollador.setRfc("ksfmksmfkskfm");
		
		System.out.println(desarrollador);
		
		
		Estudiante estudiante1 = new Estudiante();
		
		estudiante1.setNombre("Emannuel");
		estudiante1.setEdad(23);
		estudiante1.setGenero("Madculino");
		
		
		
		//probar el metodo o comportamiento propio de la clsde
		//persona llamado comer
		
		persona1.comer();
		
        //Probar nuevamente el metodo comer y veremos que este posee
		//dos formas
		
		persona1.comer("Pizzakdk");
		
		//Estos metodos tambien son heredados a las subclases o clases
		//hija, si es que las hay
		
		
		estudiante1.comer("sushi");
		
		desarrollador.comer(2, "tacos");
		
		
		
		//probando el metodo con retorno caminar()

//		persona1.caminar();
//		System.out.println(persona1.caminar()); //aqui si lo imprime
		
		
		//de igual forma lo podemos hacer poliformico
		
		
		System.out.println(persona1.caminar("en el centro"));
		
        //probando el metodo abstracto que la clase empleado ya definio
		
		desarrollador.dormir();
		
		// probando el metodo abstracto que el estudiante definio con estudiante
		estudiante1.dormir();
		
		
	}

}
