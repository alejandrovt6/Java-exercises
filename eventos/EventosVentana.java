package eventos;

import javax.swing.*;
import java.awt.event.*;

public class EventosVentana {

	public static void main(String[] args) {

		MarcoVentana mimarco = new MarcoVentana();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setTitle("Ventana 1");
		mimarco.setBounds(300,300,500,350);
		
		MarcoVentana mimarco2 = new MarcoVentana();
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
		// DISPOSE: Cierra ventana pero no acaba el programa
		mimarco2.setTitle("Ventana 2");
		mimarco2.setBounds(900,300,500,350);

	}
}


class MarcoVentana extends JFrame {
	
	public MarcoVentana() {
		
//		setTitle("Respondiendo");
//		setBounds(300,300,500,350);
		setVisible(true);
//		Mventana oyenteVentana = new Mventana();
//		addWindowListener(oyenteVentana);		
		addWindowListener(new Mventana());
	}
}


class Mventana extends WindowAdapter {
	
	// MÉTODOS WindowListener
	public void windowActivated(WindowEvent e) {
		
		System.out.println("Ventana activada");
	}
	public void windowClosed(WindowEvent e) {
		
		System.out.println("Ventana cerrada");
	}
	public void windowClosing(WindowEvent e) {
		
		System.out.println("Cerrando ventana");
	}
	public void windowDeactivated(WindowEvent e) {
		
		System.out.println("Ventana desactivada");
	}
	public void windowDeiconified(WindowEvent e) {
		
		System.out.println("Ventana restaurada");
	}
	public void windowIconified(WindowEvent e) {
		
		System.out.println("Ventana minimizada");		
	}
	
	public void windowOpened(WindowEvent e) {
		
		System.out.println("Ventana abierta");
	}
}
