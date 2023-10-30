package com;

public class Fisica {
	//Caracteristicas que tienen mi objeto de la clase fisica
	private String Mec�nica;
	private String Electricidad;
	private String Termodin�mica;
	
	//Vamos a crear estos atributos como objetos
	private EfectoSonido Acustica;
	private PropiedadesLuz �ptica;
	private Divisi�n�tomos F�sicaNuclear;
	//Vacio metodos consturtor vacio
	public Fisica() {}
	//Vacio metodos consturtor con todos los argumentos

	public Fisica(String mec�nica, String electricidad, String termodin�mica, EfectoSonido acustica,
			PropiedadesLuz �ptica, Divisi�n�tomos f�sicaNuclear) {
		super();
		Mec�nica = mec�nica;
		Electricidad = electricidad;
		Termodin�mica = termodin�mica;
		Acustica = acustica;
		�ptica = �ptica;
		F�sicaNuclear = f�sicaNuclear;
	}
//Metodos getters y setters
	public String getMec�nica() {
		return Mec�nica;
	}

	public void setMec�nica(String mec�nica) {
		Mec�nica = mec�nica;
	}

	public String getElectricidad() {
		return Electricidad;
	}

	public void setElectricidad(String electricidad) {
		Electricidad = electricidad;
	}

	public String getTermodin�mica() {
		return Termodin�mica;
	}

	public void setTermodin�mica(String termodin�mica) {
		Termodin�mica = termodin�mica;
	}

	public EfectoSonido getAcustica() {
		return Acustica;
	}

	public void setAcustica(EfectoSonido acustica) {
		Acustica = acustica;
	}

	public PropiedadesLuz get�ptica() {
		return �ptica;
	}

	public void set�ptica(PropiedadesLuz �ptica) {
		�ptica = �ptica;
	}

	public Divisi�n�tomos getF�sicaNuclear() {
		return F�sicaNuclear;
	}

	public void setF�sicaNuclear(Divisi�n�tomos f�sicaNuclear) {
		F�sicaNuclear = f�sicaNuclear;
	}
//Metodo toString
	@Override
	public String toString() {
		return "Fisica [Mec�nica=" + Mec�nica + ", Electricidad=" + Electricidad + ", Termodin�mica=" + Termodin�mica
				+ ", Acustica=" + Acustica + ", �ptica=" + �ptica + ", F�sicaNuclear=" + F�sicaNuclear + "]";
	}

	
	
}
