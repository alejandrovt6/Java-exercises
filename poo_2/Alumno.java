package poo_2;

public class Alumno extends Persona {
	
	public Alumno(String nom, String car) {
		
		super(nom);
		carrera=car;		
	}
	
	public String dameDescripcion() {
		return "Este alumno está estudiando " + carrera;
	}
	
	private String carrera;
}
