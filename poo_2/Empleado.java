package poo_2;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado implements Comparable, Trabajadores {  // Para ordenar
	
	private String nombre;
	
	private double sueldo;
	private Date altaContrato;
	
	private int Id;
	private static int IdSiguiente;
	
	// Ordenar por sueldo
	public int compareTo(Object miObjeto) {
		Empleado otroEmpleado=(Empleado) miObjeto;
		if(this.sueldo<otroEmpleado.sueldo) {
			return -1;
		}
		if(this.sueldo>otroEmpleado.sueldo) {
			return 1;
		}
		return 0;
	}
	
	public double establece_bonus(double gratificacion) {
		return Trabajadores.bonus_base+gratificacion;
	}
	
	
	public Empleado(String nom, double sue, int ahno, int mes, int dia) {	
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(ahno, mes-1,dia);
		altaContrato=calendario.getTime();	
		
		++IdSiguiente;
		Id=IdSiguiente;	
	}
	
	
	// Parámetros por defecto
	public String dameNombre() {
		return nombre;
	}
	
	public Empleado(String nom) {
		this(nom, 30000, 2000,01,01); // this llama al constructor que coincide con el 
									  // número de parámetros y se los añade
	}
	
	// GETTER Y SETTER 
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
}


