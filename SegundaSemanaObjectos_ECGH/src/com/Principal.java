package com;

public class Principal {
	
	
	public static void main(String[] args) {
		//En la POO solo exite una clase principal
		//para ejecutar el proyecto o aplicación
		//Toda la lógca y funciones quedan a cargo de 
		//los objetos que vyamos creando 
		
		//Crear un objeto o variable de nuestra clase Pan
		//con el constructor vacío. Esto me va a permitir 
		//asignarle valor a sus atributos posteriormente
		
		Pan bolillo=new Pan();
		
		//crear un objeto de nuestra clase Pan, pero utilizando
		//el constructor con todo los parámetros
		Pan cuernito=new Pan("Cuernito", "Harina, agua, mantequilla", 5, "Dorado", "Chocolate", "Suave", "Chocolate");
		
		//Pan.setPeso(50);//Variable de clase para todos los panes
		//Se modifica en la plantilla del objeto utilizando static
		

//		bolillo.nombre="Bolillo";
//		bolillo.ingredientes="Harina y Agua";
		
		//Mostrar en consola en valor o atributos de mis objetos
	//	System.out.println(bolillo);
		
	//	System.out.println(cuernito);
		
//		cuernito.nombre="Croissant"; // Forma incorrcta de acceder
		//a los atributos de un objeto
		//Une vez utilizamos modificadores de acceso, no podemos cambiar
		//los valores de los atributos de los objetos creados
		
		
		System.out.println(cuernito);
		
		//Probando un método set para poner un nombre al objeto bolillo
		
		bolillo.setNombre("Bolillo de 2 pesos");
		
		System.out.println(bolillo);
		
		//Probar un método get para devolver unicamente en consola
		//el valor del sabor del Cuernito
		
		//System.out.println(cuernito.getSabor());//Syso("Chocolate");
		System.out.println();
		Libros libro1=new Libros();
		Libros libro2=new Libros("Odisea", "Gredos", "épica griega", 357, 199, "Pasta dura");
		
		libro1.setNombre("Harry Potter 1");
		libro1.setGénero("Fantasía");
		
		System.out.println(libro1);
		System.out.println(libro2);
		
		
		Smartphone iphone=new Smartphone();
		Smartphone galaxy=new Smartphone("Samsung", "S23",2023, "Snapdragon 8 Gen 2 for Samsung","Panel Dynamic AMOLED 2X");
		
		iphone.setMarca("Apple");
		iphone.setModelo("iPhone 14");
		iphone.setAño(2022);
		
		System.out.println();
		System.out.println(iphone);
		System.out.println(galaxy);
		
		//Cuál es la diferencia entre clase y obketo?
		//la clese es una plantilla donde vienen los atributos y métodos
		//para crear los objetos
		
		//Objeto es la variable o instancia en sí creada 
		//a partir de esa plantilla o clae 
		//y ya con sus atributos definidos o asignados
		
		//Cuál es la diferencia enre objeto e instancia?
		//Son lo mismo, el objeto es la instancia de la clase
		//Instanciando un nuevo pan = creando un nuevo pan
		
	//	Pan muffin=new Pan();
		
		
		
		
	}

}
