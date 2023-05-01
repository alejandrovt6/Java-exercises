package poo_2;

public class Pruebas {

	public static void main(String[] args) {

		Empleados trabajador1=new Empleados("Paco");
		Empleados trabajador2=new Empleados("Ana");
		Empleados trabajador3=new Empleados("Antonio");
		Empleados trabajador4=new Empleados("Maria");

		trabajador1.cambiaSeccion("RRHH");
		
		System.out.println(trabajador1.devuelveDatos() + "\n" + 
		trabajador2.devuelveDatos() + "\n" + 
		trabajador3.devuelveDatos() + "\n" + 
		trabajador4.devuelveDatos());
/*		System.out.println(trabajador2.devuelveDatos());
		System.out.println(trabajador3.devuelveDatos());
		System.out.println(trabajador4.devuelveDatos());
*/
		System.out.println(Empleados.dameIdSiguiente());
	}
}


class Empleados{
	
	private final String nombre; // final no permite cambiar la constante
	private String seccion;
	private int Id;
	private static int IdSiguiente=1;
//	public static int Id; // static no comparte variables en los objetos

	// CONSTRUCTOR
	public Empleados(String nom) {
		nombre=nom;
		seccion="Administración";
		Id=IdSiguiente;
		IdSiguiente++;
	}
	
	//GETTER Y SETTER
	public void cambiaSeccion(String seccion) {
		this.seccion=seccion;
	}
	
	
	public String devuelveDatos() {
		return "El nombre es: " + nombre + " la sección es: " + seccion + 
				" y el ID es: " + Id;
	}
	
	public static String dameIdSiguiente() {
		return "El Id Siguiente es: " + IdSiguiente;
	}		
}
