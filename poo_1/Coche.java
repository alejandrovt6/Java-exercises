package poo_1;

public class Coche {

	// Atributos fijos comunes
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	
	// Atributos variables
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	
	// MÉTODO CONSTRUCTOR. Damos estado inicial al objeto
	public Coche() {
		ruedas=4;
		largo=200;
		ancho=300;
		motor=1600;
		peso_plataforma=500;
	}

	// GETTER - Obtenemos un valor
	public String dime_largo() {
		return "El largo del coche es " + largo + " cm.";
	}
	 
	public String dime_color() {
		return "El color del coche es " + color;
	}
	

	public String dime_datos_comunes() {
		return "La plataforma del vehículo tiene: " + ruedas + " ruedas" + "  mide: " + largo +
				" cm de largo y " + ancho + " cm de ancho" + " su motor es: " + motor + " CV" +
				" y su peso es de: " + peso_plataforma + " kg.";			
	}

	public String dime_peso_total() {
		int peso_carroceria=1750;
		peso_total=peso_plataforma+peso_carroceria;
		if(asientos_cuero==true) {
			peso_total=peso_total+50;
		}
		if(climatizador==true) {
			peso_total=peso_total+20;
		}
		return "El peso del coche es " + peso_total;
	}
	
	public String dime_asientos() {
		if(asientos_cuero) {
			return "El coche tiene asientos de cuero";
		} else {
			return "El coche tiene asientos de serie";
		}
	}

	public String dime_climatizador() {
		if(climatizador) {
			return "El coche incorpora climatizador";
		} else {
			return "El coche lleva aire acondicionado";
		}
	}
	
	public int precio_coche() {
		int precio_final=10000;
		if(asientos_cuero==true) {
			precio_final+=2000;
		}
		if(climatizador==true) {
			precio_final+=1500;
		}
		return precio_final;
	}

	// SETTER - modificamos un valor
	//public void establece_color() { color="azul"; }
	public void establece_color(String color_coche) {
		color=color_coche;
	}
	
	public void establece_pesoTotal(int peso_total_coche) {
		peso_total=peso_total_coche;
	}
	
	public void configura_asientos(String asientos_cuero) {
		if(asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero=true;
		} else {
			this.asientos_cuero=false;
		}
	}
	
	public void configura_climatizador(String climatizador) {
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador=true;
		} else {
			this.climatizador=false;
		}
	}
	
	
	// SINTAXIS
	//GETTER: public dato_a_devolver nombre_método(){ código + return }
	// SETTER: public void nombre_método(){ código }
		// un método void no devuelve datos
	//equals para comparar cadenas de caracteres
	//ignore case ignora misnúsc y mayusc
}
