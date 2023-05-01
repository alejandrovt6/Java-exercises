package poo_1;

import javax.swing.*;

public class MainVehiculo {
	
	public static void main(String[] args) {
		
		// INSTANCIAR CLASE
		// NombreClase NombreObjeto = new NombreConstructor
		Coche Renault = new Coche(); 
		
		// Prueba con furgoneta
		Furgoneta furgo1 = new Furgoneta();
		furgo1.setDatosFurgo(500, 5);
		System.out.println(furgo1.dimeDatosFurgoneta());
		
		// Renault.establece_color();
		// Renault.establece_color("amarillo");
		Renault.establece_color(JOptionPane.showInputDialog("Introduce color"));
		System.out.println(Renault.dime_color());

//		System.out.println(Renault.dime_largo());
	
		System.out.println(Renault.dime_datos_comunes());
		
		Renault.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
		
		System.out.println(Renault.dime_asientos());
		
		Renault.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
		
		System.out.println(Renault.dime_climatizador());

	//  Renault.dime_peso_total();
		
		System.out.println(Renault.dime_peso_total());
		
		System.out.println("El precio final del coche es: " + Renault.precio_coche());

	//	System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");
		
		
		// EJS HERENCIA
		Coche micoche1=new Coche();
		micoche1.establece_color("Rojo");
		
		Furgoneta mifurgo1=new Furgoneta(7, 580);
		mifurgo1.establece_color("azul");
		mifurgo1.configura_asientos("Si");
		mifurgo1.configura_climatizador("Si");
		System.out.println(micoche1.dime_datos_comunes() + " " + micoche1.dime_color());
		System.out.println(mifurgo1.dime_datos_comunes() + " " + mifurgo1.dimeDatosFurgoneta());
	}

}
