package com;

public class Principal {

	public static void main(String[] args) {
		
		// en la poo solo existe una clase principal
		//para ejecutar el proyecto o aplicacion
		
		//toda la logica y funciones quedan a cargo de
		//los objetos que vayamos creando
		
		//crear un objeto o variable de nuestra clase Pan
		//con el constructor vacio. esto me va a permitir
		//asignarle valor a sus atributos posteriormente
		
		Pan bolillo = new Pan();
		
		//crear un objeto de nuestra clase pan, pero utilizando
		//el constructor con todos los parametros
		
		Pan cuernito =new Pan("cuernito", "harina, agua, mantequilla", 5, "Dorado", "Chocolate", "Suave", "chocolate");
		
//		Pan.setPeso(50);
		//Asignarle un nombre e ingrdientes a mi bolillo
		
//		bolillo.nombre="bolillo";
//		bolillo.ingredientes="harina y agua";
		
		//mostrar en consola el valor o atributos de mis objetos
		System.out.println(bolillo);
//		System.out.println(cuernito);
		
//		cuernito.nombre="croissant"; //forma incorrecta de acceder
		//a los atributos de un objeto
		//una vez utilizamos modificados de acceso, no podemos cambiar
		//los valores de los atributos de los objetos creados
		
		System.out.println(cuernito);
		
		//probando un metodo ser para asignarle un nombre al objeto bolillo
		
		bolillo.setNombre("bolillo de 2 pesos");
		
		System.out.println(bolillo);
		
		//probar un metodo get para devolver unicamente en consola
		//el valor del sabor del cuernito
		
		System.out.println(cuernito.getSabor()); //syso ("chocolate")
		
		//crear un nuevo personaje vacio
		
		Personaje ryu=new Personaje();
		Personaje ken=new Personaje("kenMasters", 100, 50, "shoryuken");
		
		ryu.setHabilidad("hadoken");
		
		System.out.println(ryu);
		System.out.println(ken);
		
		//actividad: crear 2 plantillas para realizar objetos
		//las que ustedes gusten
		//definen atributos
		//crean metodos constructores
		//crean getters y setters
		//crean el metodo toString()
		
		//crean dos objetos de cada plantilla. uno vacio, uino con todos los
		//atributos, los crean aqui en la clase principal
		//y los mandan a imprimir en consola
		
		
		PersonajesTarea jarochito23=new PersonajesTarea();
		PersonajesTarea se�oradelmetro=new PersonajesTarea("Se�ora del metro", "Paladin", "abuelita", 320, 10, 1, 50, 10);
		
		jarochito23.setClase("Estudihambre");
		
		System.out.println(jarochito23);
		System.out.println(se�oradelmetro);
		
		
		
		Armas espada=new Armas();
		Armas hacha=new Armas("hacha de madera", "tierra", 125, 80, 1.25);
		
		System.out.println(espada);
		System.out.println(hacha);
		
		
	//cual es la diferencia entre clase y objeto?
		//la clase es una plantilla donde vienen los atributos y metodos
		//para crear los objetos
		
		//objeto es una variable o instancia en si creada
		//a partir de esa plantilla
		//y ya con sus atributos definidos o asignados
		
		//cual es la diferencia entre objeto e instancia?
		//son lo mismo, el objeto es la instancia de la clase
		Pan muffin=new Pan();
		System.out.println(muffin);
		
	}

}