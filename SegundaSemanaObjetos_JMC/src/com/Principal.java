package com;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		//  En la POO solo existe una clase principal 
		//para ejecutar  el proyecto o aplicacion 
		
		//Toda la logica y funciones quedan a cargo de los 
		//objetos que vallamos creando 
		
		
		//Crear un objeto o variable de nuestra clase Pan
		//con el contructor vacio. esto me va a permitir 
		//asignarle valir a sus atribuyos posteriormente
		
		
		Pan bolillo = new Pan();
	    
		//Crear un objeto de nuestra clase Pan, pero utilizando
		//el constructor con todos los parametros
		
		
		Pan cuernito = new Pan("Cuernito", "Hariana, Agua, Mantequilla", 5,"Dorado" ,"Chocolate", "Suave","Chocolate");
		
		
		//Asignarle un nombre e ingresientes a mi bolillo
		
		
	//	bolillo.
	//	bolillo.ingredientes="Harina y agua";
		
		
		//Mostara en consola el valor o atributos de mis objetos 
		
		
		System.out.println(bolillo);
		
//		cuernito.nombre="Croissant"; //Forma incorrecta de acceder 
		//a los atributos de un objeto
		//Una vez utilizamos modificadores de acceso, no podemos cambiar 
		//los valores de los atributos de los objetos 
		
		
//		System.out.println(cuernito);
		
		//Probando un metodo set para asignarle un nombre al objeto bolillo
	   
		bolillo.setNombre("Bolillo de 2 pesos ");
		
		
		System.out.println(bolillo);
		
		
		//Probar un metodo get para devolver unicamente en consola 
		//el valor del sabor del cuernito
		
      	System.out.println(cuernito.getRelleno());
		
		System.out.println(cuernito.getPeso());
		System.out.println(bolillo.getPeso());
		
		//Actividad van a crear 2 plantilla para realizar objetos
		//lo que nos gusten
		//Deginir atributos
		//crear metodos y constructores
		// crear getters y setters 
		//crear el metodo toString
		
		
		//crear dos objetos de cada plantilla. uno vacio y otro con todos sus atributos 
		//lo creamos aqui en la calse principal
		// y los mandamos a imprimir a la consola 
		//Minimo 2 atributos
		
		
//		Perro Dalmata = new Perro();
//		
//		Perro Poodle = new Perro("Caniche", "Mediano", "Macho", "Blanco", "Dory",70, 50, 7);
//		
//		
//		Dalmata.setColor("Blanco y negro");
//		Dalmata.setSexo("Hembra");
//		Dalmata.setNombre("Manchas");
//		
//		System.out.println(Dalmata.getColor());
//		System.out.println(Poodle);
//	
//		Jabon Downy = new Jabon();
//		
//		Jabon Zote = new Jabon("lima", 1, "rosa", "Barra", "corona", 20.5f);
//		
//		Downy.setPrecio(80.90f);
//		Downy.setMarca("Procter & Gamble");
//	
//		
//		System.out.println("Downy pertenece a la marca "+Downy.getMarca());
//		System.out.println("El precio de Downy es "+Downy.getPrecio());
//		
//	JOptionPane.showMessageDialog(null, Zote.getMarca());
//	
	
	
	// cual es la diferencia de clase y objeto ?
	
	//la clase es una plantilla donde vienen los atributos y metodos 
	//para crear los objetos 
	
	//objeto es la variable o instancia en si creada 
	// a partir de esa plantilla o clase 
	//y ya con sus atributos definidos o asignados
	
	//¿ cual es la diferencia entre objeto e instancia?
	
	//Instanciando un nuevo pan = creando un nuevo pan
	Pan  muffin = new Pan();
	
	
	
	}
	
	
	

}
