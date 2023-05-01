package poo_2;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado2 extends Persona {
	
	public Empleado2(String nom, double sue, int ahno, int mes, int dia) {
		
		super(nom); //Llamamos al constructor de la superclase
		
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(ahno, mes-1,dia);
		altaContrato=calendario.getTime();	
		
		++IdSiguiente;
		Id=IdSiguiente;
	}
	

	// GETTER Y SETTER 	
	public String dameDescripcion() {
		return "Este empleado tiene un Id " + Id + " con un sueldo de " + sueldo;
	}
	
	public double dameSueldo() {
		return sueldo;
	}
	
	public Date dameFechaContrato() {
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {
		double aumento=sueldo*(porcentaje/100);
		sueldo+=aumento;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
	private static int IdSiguiente;
	private int Id;
}


