package poo_2;

import java.util.Date;
import java.util.GregorianCalendar;

public class MainPersona {

	public static void main(String[] args) {
		
		//ARRAY
		Persona[] lasPersonas=new Persona[3];
		
		lasPersonas[0]=new Empleado2("Luis Conde", 50000, 2009, 2, 25);
		lasPersonas[1]=new Alumno("Manuel Martos", "Derecho");
		lasPersonas[2]=new Alumno("Alejandro Martín", "Ingeniería");

		// FOR EACH. Se nombra la variable, en este caso p
		for (Persona p: lasPersonas) {
			System.out.println(p.dameNombre() + ", " + p.dameDescripcion());
		}	
	}
}









