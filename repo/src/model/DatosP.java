package model;

public class DatosP {

		private String nombre;
		private String Apellido1;
		private String Apellido2;
		public String getNombre() {
			return nombre;
		}
		
		public DatosP() {

		}
		
		public DatosP(String nombre, String Apellido1, String Apellido2) {
			setNombre(nombre);
			setApellido1( Apellido1);
			setApellido2( Apellido2);
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido1() {
			return Apellido1;
		}
		public void setApellido1(String apellido1) {
			Apellido1 = apellido1;
		}
		public String getApellido2() {
			return Apellido2;
		}
		public void setApellido2(String apellido2) {
			Apellido2 = apellido2;
		}

		@Override
		public String toString() {
			return "DatosP [nombre=" + nombre + ", Apellido1=" + Apellido1 + ", Apellido2=" + Apellido2 + "]";
		}
		
		
}
