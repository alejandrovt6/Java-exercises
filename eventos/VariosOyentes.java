package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VariosOyentes {

	public static void main(String[] args) {
		
		MarcoPrincipal mimarco = new MarcoPrincipal();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
		
	}
}


class MarcoPrincipal extends JFrame {
	
	public MarcoPrincipal() {
		setTitle("Varios oyentes");
		setBounds(1300,100,300,200);
		LaminaPrincipal lamina = new LaminaPrincipal();
		add(lamina);
	}
}


class LaminaPrincipal extends JPanel {
	
	public LaminaPrincipal() {
		
		JButton botonNuevo = new JButton("Nuevo");
		add(botonNuevo);
		botonCerrar = new JButton("Cerrar todo");
		add(botonCerrar);
		OyenteNuevo mioyente = new OyenteNuevo();
		botonNuevo.addActionListener(mioyente);
	}
	
	private class OyenteNuevo implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			MarcoEmergente marco = new MarcoEmergente(botonCerrar);
			marco.setVisible(true);
			
		}
		
	}
	
		JButton botonCerrar;
	
}


class MarcoEmergente extends JFrame {
	
	public MarcoEmergente(JButton botonPrincipal) {
		
		contador++;
		setTitle("Ventana " + contador);
		setBounds(40*contador,40*contador,300,150);
		
		CierraTodo oyenteCerrar = new CierraTodo();
		botonPrincipal.addActionListener(oyenteCerrar);
		
	}
	
	private class CierraTodo implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			dispose();
			
		}
		
	}
	private static int contador = 0;
	
}