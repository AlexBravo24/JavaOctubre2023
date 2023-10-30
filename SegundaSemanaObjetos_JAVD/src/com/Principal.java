package com;

public class Principal {

	public static void main(String[] args) {
		
		//En la POO solo existe una clase principal
		//para ejecutar el proyecto o aplicaión
		
		//Toda la lógica y funciones quedan a cargo de
		//los objetos que vayamos creando
		
		//Crear un objeto o variable de nuestra clase Pan
		//con el constructor vacío. Esto me va a permitir
		//asignarle valor a sus atributos posteriormente
		
		Pan bolillo = new Pan();
		
		//Crear un objeto de nuestra Clase Pan, pero utilizando
		//el constructor con todos los parametros
		
		Pan cuernito = new Pan("Cuernito", "Harina, Agua, Mantequilla", "Dorado", "Chocolate", "Suave", "Chocolate", 5);		
		
		//Asignarle un nombre e ingredientes a mi bolillo
		//bolillo.nombre="Bolillo";
		//bolillo.ingredientes="Harina y Agua";
		
		//Meter en consola el valor o atributos de mis objetos
		System.out.println(bolillo);
		
//		System.out.println(cuernito);
		
		//cuernito.nombre="Croissant";//Forma incorrecta de acceder
		//a los atributos de un objeto
		//Una vez utilizamos modificadores de acceso, no podemos cambiar
		//los valores de los atributos de los objetos creados 		
		
		System.out.println(cuernito);
		
		//Probando un método set para asignarle un nombre al objeto bolillo
		bolillo.setNombre("Bolillo de 2 pesos");
		
		System.out.println(bolillo);
		
		//Probar un método get para devolver unicamente en consola
		//el valor del sabor del Cuernito
		System.out.println(cuernito.getSabor());//System.out.println("Chocolate");
		
		//Crear un vuevo personaje vacío
		Personaje ryu= new Personaje();
		
		Personaje ken = new Personaje("Ken Masters", "Shoryuken", 100, 50);
		
		ryu.setHabilidad("Hadoken");
		
		System.out.println(ryu);
		System.out.println(ken);
		
		//Actividad: Van a crear 2 plantillas para crear objetos
		//Las que ustedes gusten
		//Definen atributos
		//Crean métodos constructores
		//Crean Getters and Setters
		//Crean el método toString()
		//Mínimo 3 atributos cada objeto
		
		//Crean dos objetos de cada plantilla. Uno vacío, uno con todos
		//los atributos, los crean aquí en la clase principal
		//Y los mandan a imprimir en consola
		
		System.out.println("------------Probando Objeto Perro----------");
		Perro golden = new Perro();
		Perro mastin = new Perro("Mastín napolitano", "Gris", "Macho");
		
		golden.setRaza("Golden");
		
		System.out.println(golden);
		System.out.println(mastin);
		
		System.out.println("------------Probando Objeto Carro----------");
		Carro toyota = new Carro();
		Carro chevrolet = new Carro("Chevrolet", "Camaro", "Rojo");
		
		toyota.setMarca("Toyota");
		
		System.out.println(toyota);
		System.out.println(chevrolet);
		
		//¿Cuál es la diferencia entre clase y objeto?
		//La clase es una plantilla donde vienen los atributos y métodos
		//para crear los objetos
		
		//Objeto es la variable o instancia en sí creada
		//a partir de esa plantilla o clase
		//y ya con sus atributos definidos o asignados
		
		//¿Cuál es la diferencia entre objeto e instancia?
		//Son lo mismo, el objeto es la instancia de la clase
		
		//Instanciando un nuevo pan = Creando un nuevo pan
		Pan muffin = new Pan();
		System.out.println(muffin);

	}

}
