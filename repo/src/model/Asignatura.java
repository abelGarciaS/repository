package model;

public class Asignatura {

	private String nombre;
	private model.NombreAula NombreAula;
	private Alumno numeroMax;
	private Alumno[] lista;
	
	public Asignatura() {
		setNombreAula(model.NombreAula.A1);
	}
	
	public Asignatura(String nombre) {
		setNombre(nombre);
	}
	
	public Asignatura(String nombre,Alumno numeroMax ,Alumno[] lista, model.NombreAula clase) {
		setNombre(nombre);
		setLista(lista);
		setNumeroMax(numeroMax);
		setNombreAula(clase);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public model.NombreAula getNombreAula() {
		return NombreAula;
	}

	public void setNombreAula(model.NombreAula nombreAula) {
		NombreAula = nombreAula;
	}

	public Alumno getNumeroMax() {
		return numeroMax;
	}

	public void setNumeroMax(Alumno numeroMax) {
		this.numeroMax = numeroMax;
	}

	public Alumno[] getLista() {
		return lista;
	}

	public void setLista(Alumno[] lista) {
		this.lista = lista;
	}
	
	//METODOS
	
	

	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", NombreAula=" + NombreAula + ", numeroMax=" + numeroMax + ", lista="
				+ lista + "]";
	}
	
}
