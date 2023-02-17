package start;

import model.Academia;
import model.Alumno;
import model.Asignatura;

public class Principal {

	public static void main(String[] args) {
		Academia ac1 = new Academia("Lengua",new Asignatura());
		Asignatura As1 = new Asignatura();
		Alumno alu1 = new Alumno();
		System.out.println(ac1.getListaAsignaturas());
		System.out.println(As1.getLista());
		System.out.println(alu1.getDatosPersonales().getApellido1());
		System.out.println(alu1.getDatosPersonales().getApellido2());
		System.out.println(alu1.getDatosPersonales().getNombre());
		System.out.println(alu1);
		
	}

}
