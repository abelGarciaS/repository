package model;

public class Academia {

		private String nombre;
		private Asignatura listaAsignaturas;
		public Academia() {
	
		}
		
		public Academia (String nombre, Asignatura asignatura) {
			setNombre(nombre);
			listaAsignaturas = new Asignatura();

		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public Asignatura getListaAsignaturas() {
			return listaAsignaturas;
		}

		public void setListaAsignaturas(Asignatura listaAsignaturas) {
			this.listaAsignaturas = listaAsignaturas;
		}
		
		
	
		@Override
		public String toString() {
			return "Academia [nombre=" + nombre + ", listaAsignaturas=" + listaAsignaturas + "]";
		}
		
		
}
