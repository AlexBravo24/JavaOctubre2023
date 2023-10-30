package com;

public class Fisica {
	//Caracteristicas que tienen mi objeto de la clase fisica
	private String Mecánica;
	private String Electricidad;
	private String Termodinámica;
	
	//Vamos a crear estos atributos como objetos
	private EfectoSonido Acustica;
	private PropiedadesLuz Óptica;
	private Divisiónátomos FísicaNuclear;
	//Vacio metodos consturtor vacio
	public Fisica() {}
	//Vacio metodos consturtor con todos los argumentos

	public Fisica(String mecánica, String electricidad, String termodinámica, EfectoSonido acustica,
			PropiedadesLuz óptica, Divisiónátomos físicaNuclear) {
		super();
		Mecánica = mecánica;
		Electricidad = electricidad;
		Termodinámica = termodinámica;
		Acustica = acustica;
		Óptica = óptica;
		FísicaNuclear = físicaNuclear;
	}
//Metodos getters y setters
	public String getMecánica() {
		return Mecánica;
	}

	public void setMecánica(String mecánica) {
		Mecánica = mecánica;
	}

	public String getElectricidad() {
		return Electricidad;
	}

	public void setElectricidad(String electricidad) {
		Electricidad = electricidad;
	}

	public String getTermodinámica() {
		return Termodinámica;
	}

	public void setTermodinámica(String termodinámica) {
		Termodinámica = termodinámica;
	}

	public EfectoSonido getAcustica() {
		return Acustica;
	}

	public void setAcustica(EfectoSonido acustica) {
		Acustica = acustica;
	}

	public PropiedadesLuz getÓptica() {
		return Óptica;
	}

	public void setÓptica(PropiedadesLuz óptica) {
		Óptica = óptica;
	}

	public Divisiónátomos getFísicaNuclear() {
		return FísicaNuclear;
	}

	public void setFísicaNuclear(Divisiónátomos físicaNuclear) {
		FísicaNuclear = físicaNuclear;
	}
//Metodo toString
	@Override
	public String toString() {
		return "Fisica [Mecánica=" + Mecánica + ", Electricidad=" + Electricidad + ", Termodinámica=" + Termodinámica
				+ ", Acustica=" + Acustica + ", Óptica=" + Óptica + ", FísicaNuclear=" + FísicaNuclear + "]";
	}

	
	
}
