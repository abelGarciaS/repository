package model;

import java.nio.file.attribute.FileTime;

public class Alumno {

	private DatosP datosPersonales;
	private Integer numeroSeguridadSocial;
	private DatosC datosContactos;
	private FileTime fechaInscripcion;
	private model.TipoAlumno tipo;
	
	public Alumno() {
		setTipo(model.TipoAlumno.NORMAL);
		datosPersonales = new DatosP();
		datosContactos = new DatosC();
	}
	
	public Alumno(DatosP datosPersonales,Integer numeroSeguridadSocial,DatosC datosContactos, model.TipoAlumno tipo,FileTime fechaInscripcion) {
		setDatosPersonales(datosPersonales);
		setNumeroSeguridadSocial(numeroSeguridadSocial);
		setDatosContactos(datosContactos);
		setTipo(tipo);
		setFechaInscripcion(fechaInscripcion);
	}

	public DatosP getDatosPersonales() {
		return datosPersonales;
	}
	

	public void setDatosPersonales(DatosP datosPersonales) {
		this.datosPersonales = datosPersonales;
	}

	public Integer getNumeroSeguridadSocial() {
		return numeroSeguridadSocial;
	}

	public void setNumeroSeguridadSocial(Integer numeroSeguridadSocial) {
		this.numeroSeguridadSocial = numeroSeguridadSocial;
	}

	public DatosC getDatosContactos() {
		return datosContactos;
	}

	public void setDatosContactos(DatosC datosContactos) {
		this.datosContactos = datosContactos;
	}

	public FileTime getFechaInscripcion() {
		return fechaInscripcion;
	}

	public void setFechaInscripcion(FileTime fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}

	public model.TipoAlumno getTipo() {
		return tipo;
	}

	public void setTipo(model.TipoAlumno tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Alumno [datosPersonales=" + datosPersonales + ", numeroSeguridadSocial=" + numeroSeguridadSocial
				+ ", datosContactos=" + datosContactos + ", fechaInscripcion=" + fechaInscripcion + ", tipo=" + tipo
				+ "]";
	}
	
	

}
