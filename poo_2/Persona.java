package poo_2;

public abstract class Persona {
	
	public abstract String dameDescripcion(); //declara método abstracto
	private String nombre;
	
	
	public Persona(String nom) {
		nombre=nom;	
	}	
	
	public String dameNombre() {
		return nombre;
	}
}
