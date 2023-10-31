package com;

public class Principal {

	public static void main(String[] args) {
		
		
		// La programaciòn POO solo existe una clase para ejecutar todo 
		// el proyecto o aplicacion
		
		// Toda la logica y funciones quedan a cargo 
		// de los objetos que vayamos creando
		
		
		
		//Crear un objeto o variable nuestra clase pan
		
		//
		Pan bolillo = new Pan();
		
		//Creando un objeto de nuestra clase pan 
		//pero utilizando el constructor con todos los parametros
		
		Pan cuernito = new Pan("Cuernito", "harina, agua, mantequilla", 5, "Dorado", "Chocolate", "Suave", "Chocolate", 100);
		
		
		// Asignarle un nombre e ingredientes a mi bolillo
//		bolillo.nombre="Bolillo";
//		bolillo.ingredientes="Harina y agua";
//		
		//Mostrar en consola el valor o atributos de mis objetos
		System.out.println(bolillo);
//		System.out.println(cuernito);
		
		//cuernito.nombre="Croissant"; forma incorrecta de acceder
		// a los atributos de un objeto
		//Una vez utilizando modificadores de acceso, no podemos
		//cambiar los valores de los atributos de los objetos creados
		
		
		System.out.println(cuernito);
		//Probamos un metodo set para asignarle un nombre
		//al objeto bolillo
		
		bolillo.setNombre("Bolillo de dos pesos");
		
		System.out.println(bolillo);
		
		//Probar un mètodo get para devolver unicamente en consola 
		//el valor del sabor del cuernito
		
		System.out.println(cuernito.getSabor()); //syso("Chocolate")
		
		//Crear un nuevo Personaje vacio
		
		Personaje ryu = new Personaje();
		
		Personaje ken = new Personaje("Ken Masters", 100, 50, "Shoryuken");
		
		ryu.setHabilidad("Hadoken");
		
		System.out.println(ryu);
		System.out.println(ken);
		
		
		
		
		Ropa marca = new Ropa();
		
		Ropa paca = new Ropa("Rosa", "M", 2, 1525);
		
		marca.setColor("Rosa");
		
		System.out.println(marca);
		System.out.println(paca);
		
		
		
		
		Zapatos nuevos = new Zapatos ();
		Zapatos uso = new Zapatos ("Cafè", null, 24, 1025);
		
		nuevos.setNumero(25);
		
		System.out.println(nuevos);
		System.out.println(uso);
		
		//Actividad: Crear 2 plantillas para realizar objetos
		// las que sean
		// Definen  atributos 
		//Crean metodos constructores 
		//Crean  getters y setters
		//Crean el metodos  toString
		//minimo 3 atributos cada objeto
		
		//crean dos objetos en cada plantilla. uno Vacio, uno con 
		//ttodos los atributos, los crean aqui en la clase principal
		//Y los mandan a imprimir en consola
		
		//¿Cuà es la diferencia entre clase y objeto?
		//Clase plantilla donde vienen los atributos y metodos para crear objetos
		//Objeto es la variable o instancia  creada a partir de esta plantilla, ya con los atributos 
		
		
		//diferencia entre objeto e instancia
		//Son lo mismo, el objeto es la instancia de la clase
		
		Pan muffin = new Pan();
		

	}

}
