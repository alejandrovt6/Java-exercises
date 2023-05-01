package poo_2;

public class Jefatura extends Empleado implements Jefes {
// Cuando implementamos interfaz, estamos obligados a desarrollar todos los métodos
// Con final class otra clase o método no podrá heredar de ellos
	
	public Jefatura(String nom, double sue, int ahno, int mes, int dia) {
		
		super(nom, sue, ahno, mes, dia);
	}
	
	private double incentivo;
	
	
	// MÉTODO INTERFAZ
	public String tomar_decisiones(String decision) {
		return "Un miembro de la dirección ha tomado la decisión de: " + decision;
	}
	
	public double establece_bonus(double gratificacion) {
		double prima=2000;
		return Trabajadores.bonus_base+gratificacion+prima;
	}
	
	
	// GETTER
	public double dameSueldo() {	
		double sueldoJefe=super.dameSueldo();
		return sueldoJefe + incentivo;
	}

	// SETTER
	public void estableceIncentivo(double b) {
		incentivo=b;
	}
}
