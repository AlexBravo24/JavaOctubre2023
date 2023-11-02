package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO solo existe una clase principal
		//para ejecutar el proyecto o aplicación
		
		//Toda la lógica y funciones quedan a cargo de
		//los objetos que vayamos creando
		
		//Crear un objeto o variable de nuestra clase Pan
		//con el constructor vacio. Esto me va a permitir
		//asignarle valor a sus atributos posteriormente
		
		Pan bolillo = new Pan();
		
		//Crear un objeto de nuestra clase Pan, pero utilizando
		//el constructor con todos los parametros
		
		Pan cuernito = new Pan("Cuernito", "Harina, Agua y Mantequilla", 5, "Dorado", "Chocolate", "Suave", "Chocolate");

		//Pan.setPeso();
		
		//Asignale un nombre e ingredientes a mi bolillo
//		bolillo.nombre="Bolillo";
//		bolillo.ingredientes="Harina y Agua";
//		
		//Mostrar en consola el valor o atributos de mis objetos
		System.out.println(bolillo);
		
		// System.out.println(cuernito);
		
//		cuernito.nombre="Croissant"; //Forma incorrecta de acceder
		//a los atributos de un objeto
		//una vez utilizamos modificadores de acceso, no podemos cambiar
		//los valores de los atributos de los objetos creados
		
		System.out.println(cuernito);
		
		//Probando un método set para asignarle un nombre al objeto bolillo
		bolillo.setNombre("Bolillo de 2 pesos");
		
		System.out.println(bolillo);
		
		//Probar un método get para devolver unicamente en consola
		//el valor del sabor del Cuernito
		System.out.println(cuernito.getSabor());
		
		//--------------------------------------------
		//Crear un nuevo Personaje vacio
		
		Personaje ryu = new Personaje();
		
		Personaje ken = new Personaje("Ken Masters", 100, 50, "Shoryuken");
		
		ryu.setHabilidad("Hadoken");
		
		System.out.println(ryu);
		
		System.out.println(ken);
		
		
		//Actividad van a crear 2 plantillas para realizar objetos
		//Las que ustedes gusten
		//Definen atributes
		//Crean métodos constructores
		//Crean getters y setters
		//Crean el método toString()
		
		//Crean dos objetos de cada plantilla. Uno vacío, uno con todos
		//los atributos, los crean aqui en la clase principal
		//Y los mandan 
		
		//Plantilla 1: Animal
		

		//Crear un objeto o variable de nuestra clase Animal
		//con el constructor vacio. Esto me va a permitir
		//asignarle valor a sus atributos posteriormente
		Animal rockey = new Animal();
		
		//Crear un objeto de nuestra clase Pan, pero utilizando
		//el constructor con todos los parametros
		Animal firulais = new Animal("Firulais", "chihuahua", 5);
		
		//Asignale un nombre e ingredientes a mi bolillo
//		bolillo.nombre="Bolillo";
//		bolillo.ingredientes="Harina y Agua";
//		
		//Mostrar en consola el valor o atributos de mis objetos
		rockey.setRaza("pitbull");
		
		System.out.println(rockey);
		
		System.out.println(firulais);
		
	
	//Plantilla 2: Celular
	
	Celular apple = new Celular();
	
	Celular xiaomi = new Celular("Xiaomi", "Negro", "Android");
	
	apple.setSistema_operativo("iOS");
	
	System.out.println(apple);
	
	System.out.println(xiaomi);
	
	//¿Cuál es la diferencia entre clase y objeto?
	//La clase es una plantilla donde vienen los atributos y métodos
	//para crear los objetos
	
	//Objeto es la variable o instancia en sí creada
	//a partir de esa plantilla o clase
	//y ya con sus atributos definidos o asignados
	
	//¿Cual es la diferencia entre objeto e instancia?
	//Son lo mismo, el objeto es la instancia de la clase
	
	//Instanciando un nuevo pan = Creando un nuevo pan
	Pan muffin = new Pan();
	
	System.out.println(muffin);
	

	}

	
}