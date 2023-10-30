package com;

public class Principal {

	public static void main(String[] args) {
		
		//en la programación orientada a objetos solo existe una clase principal
		//para ejecutar el proyecto o la aplicación
		//toda la logica y funciones quedan a cargo de los objetos que vayamos creando
		
		//crear un objeto o variable de nuestra clase pan
		//con el constructor vacio. Esto me va a permitir
		//asignarle valor a sus atributos posteriormente
		Pan bolillo = new Pan(); //bolillo es el objeto de la clase Pan
		
		//crear un objeto de la clase pan utilizando el constructor con todos sus parametros
		
		Pan cuernito = new Pan("Cuernito", "Harina, agua y mantequilla", 5, "Dorado", "chocolate", "suave", "mantequilla");
		
		//Pan.setPeso(50);
		
		//Assignarle nombre e ingredientes a mi bolillo
		//bolillo.nombre="Bolillo";
		//bolillo.ingredientes="Harina y agua";
		
		// si quiero mostrar en consola el valor o atributo de mis objetos
		System.out.println(bolillo);
		
		
		//cuernito.nombre=("Croissant"); es la forma incorrecta de acceder a los
		//de un objeto.
		//Una vez utilizamos los modificadores de acceso, no podemos cambiar los
		//valores de los atributos de los objetos creados
		
		System.out.println(cuernito);
		
		//probando un metodo set para asignarle un nombre al objeto bolillo
		
		bolillo.setNombre("Bolillo de 2 pesos");
		System.out.println(bolillo);
		
		//probar un metodo get para devolver unicamente en consola el sabor
		//del cuernito
		System.out.println(cuernito.getSabor());//equivalente a que imprimiera en consola
		//Sout("mantequilla);
		
		//¿Cual es la diferencia entre clase y objeto?
		//La clase es una plantilla donde vienen los atributos y métodos para crear los objetos
		//El objeto es la variable o instancia en sí creada a partir de la plantilla o clase
		//y ya con sus atributos definidos y creados
		
		//¿Cual es la diferencia entre objeto o instancia?
		Pan muffin = new Pan();//Objeto o instancia son lo mismo, el objeto es la instancia de la clase
		//Instanciando un nuevo Pan = Creando un nuevo Pan
		System.out.println(muffin);
	}

}
