package poo_1;

public class Furgoneta extends Coche {

	private int capacidad_carga;
	private int plazas_extra;
	
	public Furgoneta(int capacidad_carga, int plazas_extra) {
		super(); // Llama al constructor de la clase padre o súper
		this.capacidad_carga=capacidad_carga;
		this.plazas_extra=plazas_extra;
	}
	
	public Furgoneta() {
		
	}
	
	//GETTER
	public String dimeDatosFurgoneta() {
		return "La capacidad de carga es: " + capacidad_carga + " y las plazas son: "
				+ plazas_extra;
	}

	
	public void setDatosFurgo(int capacidad_carga, int plazas_extra) {
		this.capacidad_carga=capacidad_carga;
		this.plazas_extra=plazas_extra;
	}
	
	
}
