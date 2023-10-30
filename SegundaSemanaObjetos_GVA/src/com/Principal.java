package com;

public class Principal {

	public static void main(String[] args) {
		
		//En la POO solo existe una clase principal 
		//para ejecutar el proyecto o aplicación 
		
		//Toda la lógica y funciones quedan a cargo de 
		//los objetos que vayamos creando 
		
		//Crear un objeto o variable de nuestra clase Pan 
		//con el constructor vacío. ESto me va a permitit
		//asignarle valor a sus atributos posteriormente 
		
		Pan bolillo = new Pan();
		
		//Crear un objeto de nuestra clase Pan, pero utilizando 
		//el constructor con todos los parámetros 
		
		Pan cuernito = new Pan("Cuernito", "Harina, Agua, Mantequilla", 5, "Dorado", "Chocolate", "Suave", "Chocolate");
		
		//Pan.setPeso(50);
		//Asignarle un nombre e ingredientes a mi bolillo
		//bolillo.nombre = "Bolillo";
		//bolillo.ingredientes = "Harina y agua";
		
		//Mostrar en consola el valor o atributos de mis objetos
		System.out.println(bolillo);
		
		//System.out.println(cuernito);
		
		//cuernito.nombre = "Croissant"; //Forma incorrecta de acceder 
		//a los atributos de un objeto
		//Una vez utilizamos modificadores de acceso, no podemos cambiar 
		//los valores de los atributos de los objetos creados
		
		System.out.println(cuernito);
		
		//Probando un método Set para asignarle un nombre al objeto bolillo
		bolillo.setNombre("Bolillo de 2 pesos");
		
		System.out.println(bolillo);
		
		//Probar un método get para devolver únicamente en consola 
		//el valor del sabor
		System.out.println(cuernito.getSabor()); //Syso("Chocolate")
		
		
		//Crear un nuevo personaje vacío
		
		Personaje ryu = new Personaje();
				
		ryu.setHabilidad("Hadoken");
		
		Personaje ken = new Personaje("Ken", 100, 50, "Shoryuken");
				
		//Atajo para asignar atributos Ctrl + espacio
		
		System.out.println(ryu);
		System.out.println(ken);
				
		//Actividad van a crear 2 plantillas para realizar objetos 
		//Las que ustedes gusten 
		//Definen atributos 
		//Crean métodos constructores 
		//Crean getters y setters 
		//Crean el método toString()
		
		//Crean dos objetos de cada plantilla. Uno vacio, uno con todos los atributos,
		//los crean aquí en la clase principal 
		//Y los mandan a imprimir en consola
		
		//Plantilla - Autos 
		Auto jetta = new Auto();
		
		jetta.setMarca("Volkswagen");
		System.out.println(jetta);
		
		Auto ibiza = new Auto("Seat", 2018, "$200,000", "Negro");
		System.out.println(ibiza);
		//Plantilla - Equipo
		
		Equipo barcelona = new Equipo("Barcelona", 1899, "Camp Nou", "Azul y Rojo", "Xavi Hernandez");
		System.out.println(barcelona);
		
		Equipo realMadrid = new Equipo();
		
		realMadrid.setEstadio("Santiago Bernabeu");
		System.out.println(realMadrid);
		
		//¿Cuál es la diferencia entre clase y objeto?
		//La clase es una plantilla donde vienen los atributos y métodos
		//para crear los objetos 
		
		//Objeto es la variable o instancia en sí creada
		//a partir de esa plantilla o clase 
		//y ya con sus atributos definidos o asignados
		
		//¿Cuál es la diferencia entre objeto e instancia?
		//Son los mismo, el objeto es la instancia de la clase
		//Instanciando un nuevo pan = Creando un nuevo pan 
		Pan muffin = new Pan();
		
		System.out.println(muffin);
		
	}

}
