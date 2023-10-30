package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO solo existe una clase principal
		//para ejecutar el proyecto o aplicación
		
		//Toda la lógica y funciones quedan a cargo de
		//los objetos que vayamos creando
		
		//Crear un objeto o variable de nuestra clase Pan
		//con el constructor vacio. esto me va a permitir
		//asiganrle valor a sus atributos posteriormente
		
		
		Pan bolillo = new Pan();
		
		//Crear un objeto de nuestra clase Pan, pero utilizando
		//el constructor con todos los parametros
		
		Pan cuernito = new Pan("Cuernito", "Harina, Agua, Mantequilla", 5, "Dorado", "Chocolate", "Suave", "Chocolate");
		
//		Pan.setPeso(50);
		
		//Asignarle un nombre e ingredientes a mi bolillo
//		bolillo.nombre="Bolillo";
//		bolillo.ingredientes="Harina y Agua";
		
		//Mostrar en consola el valor o atributos de mis objetos
		System.out.println(bolillo);
		
//		System.out.println(cuernito);
		
		//Cuernito.nombre="Croissant"; //Forma incorrecta de acceder
		//a los atributos de un objeto
		//Una vez utilizamos modificdores de acceso, no podemos cambiar
		//los valores de los atributos de los objetos creados
		
		System.out.println(cuernito);
		//Probando un método set para asignarle un nombre al objeto bolillo
		
		bolillo.setNombre("Bolillo de 2 pesos");
		
		System.out.println(bolillo);
		
		//Probar un método get para devolver unicamente en consola
		//el valor del sabor del Cuernito
		System.out.println(cuernito.getSabor()); //syso("Chocolate")
		
		//Crear un nuevo Personaje vacio
		
		Personaje ryu = new Personaje();
		
		Personaje ken = new Personaje("Ken Masters", 100, 50, "Shoryuken");
		
		ryu.setHabilidad("Hadoken");
		
		System.out.println(ryu);
		System.out.println(ken);
		
		//Actividad van a crear 2 plantillas para realizar objetos
		//Las que ustedes gusten
		//Definen atributos
		//Crean metodos constructores
		//Crean getters y setters
		//Crean el metodo toString ()
		//Minimo 3 atributos cada objeto
		
		//Crean dos objetos de cada plantilla. Uno vació, uno con todos
		//los atributos, los crean aqui en la clase principal
		//y los mandan a imprimir en consola
		
		//¿Cual es la diferencia entre clase y objeto?
		//La clase es una plantilla donde vienen los atributos y métodos
		//para crear los objetos
		
		//Objeto es la variable o instancia en si creada
		//a partir de esa plantilla o clase
		//y ya con sus atributos definidos y asignados
		
		//¿Cual es la diferencia entre objeto e instancia?
		//Son lo mismo, el objeto es la instancia de la clase
		
		//Instanciando un nuevo pan = Creando un nuevo pan		
        Pan muffin = new Pan();
		
		System.out.println(muffin);
		
		//Automvil
		
		Automovil BMW = new Automovil();
		
		Automovil VW = new Automovil("VW", 2015, "azul", 170);
		
		BMW.setColor("blanco");
		
		System.out.println(BMW);
		System.out.println(VW);
		
		//Dirección
		
		Dirección casa = new Dirección();
		
		Dirección trabajo = new Dirección("Atlacomulco", 22, 54149, "Estado de México", "Tlalnepantla de Baz");
		
		casa.setCalle("Durango");
		
		System.out.println(casa);
		System.out.println(trabajo);
		
		
		
		
		
	}

}
