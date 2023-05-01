package swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EjemploRadio2 {

	public static void main(String[] args) {

		Marco_radio mimarco = new Marco_radio();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class Marco_radio extends JFrame {
	
	public Marco_radio() {
		
		setTitle("Prueba 2");
		setVisible(true);
		setBounds(550,300,500,350);
		Lamina_radio milamina=new Lamina_radio();
		add(milamina);
		
	}
}


class Lamina_radio extends JPanel {
	
	public Lamina_radio() {
		
		setLayout(new BorderLayout());
		texto = new JLabel("En un lugar de la Mancha...");
		texto.setFont(new Font("Serif", Font.PLAIN, 12));

		add(texto, BorderLayout.CENTER);
		
		lamina_botones = new JPanel();
		migrupo = new ButtonGroup();
		
		add(lamina_botones, BorderLayout.SOUTH);
		
		colocarBotones("Pequeño", false, 10);
		colocarBotones("Mediano", true, 14);
		colocarBotones("Grande", false, 18);
		colocarBotones("Enorme", false, 22);
		

	}
	
	public void colocarBotones(String nombre, boolean seleccionado, final int tamanio) {
		
		JRadioButton boton = new JRadioButton(nombre, seleccionado);
		migrupo.add(boton);
		lamina_botones.add(boton);
		
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				texto.setFont(new Font("Serif", Font.PLAIN, tamanio));		
			}			
		});
		
	}
	
	private ButtonGroup migrupo;
	private JLabel texto;
	private JPanel lamina_botones;
}
