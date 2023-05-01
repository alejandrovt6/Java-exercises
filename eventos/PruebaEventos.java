package eventos;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PruebaEventos {

	public static void main(String[] args) {

		MarcoBotones mimarco = new MarcoBotones();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


class MarcoBotones extends JFrame {
	
	public MarcoBotones() {
		
		setTitle("Botones y eventos");
		setBounds(700,300,500,300);
		LaminaBotones milamina = new LaminaBotones();
		add(milamina);
	}	
}


class LaminaBotones extends JPanel {
	
	JButton botonAzul = new JButton("Blue");
	JButton botonVerde = new JButton("Green");
	JButton botonAmarillo = new JButton("Yellow");
	
	public LaminaBotones() {
		
		add(botonAzul);
		add(botonVerde);
		add(botonAmarillo);
		
		ColorFondo Azul = new ColorFondo(Color.blue);
		ColorFondo Verde = new ColorFondo(Color.green);
		ColorFondo Amarillo = new ColorFondo(Color.yellow);

		botonAzul.addActionListener(Azul);
		botonVerde.addActionListener(Verde);
		botonAmarillo.addActionListener(Amarillo);
	}
	
	// CLASE INTERNA
		//ActionListener: Hacer clicK
	private class ColorFondo implements ActionListener { 
		
		private Color ColorDeFondo;
		
		public ColorFondo(Color c) {
			
			ColorDeFondo = c;
		}
		
		public void actionPerformed(ActionEvent e) {
			
			setBackground(ColorDeFondo);
		}				
	}
}


