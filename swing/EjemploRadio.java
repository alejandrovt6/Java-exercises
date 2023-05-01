package swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EjemploRadio {

	public static void main(String[] args) {

		Marco_radio mimarco = new Marco_radio();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class Marco_radio extends JFrame {
	
	public Marco_radio() {
		
		setTitle("Prueba 1");
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
		add(texto, BorderLayout.CENTER);
		
		ButtonGroup migrupo = new ButtonGroup();
		
		boton1 = new JRadioButton("Pequeño", false);
		boton2 = new JRadioButton("Mediano", true);
		boton3 = new JRadioButton("Grande", false);
		boton4 = new JRadioButton("Muy grande", false);
		
		JPanel lamina_radio = new JPanel();
		
		Evento_radio mievento = new Evento_radio();
		boton1.addActionListener(mievento);
		boton2.addActionListener(mievento);
		boton3.addActionListener(mievento);
		boton4.addActionListener(mievento);

		migrupo.add(boton1);
		migrupo.add(boton2);
		migrupo.add(boton3);
		migrupo.add(boton4);

		lamina_radio.add(boton1);
		lamina_radio.add(boton2);
		lamina_radio.add(boton3);
		lamina_radio.add(boton4);
		
		add(lamina_radio, BorderLayout.SOUTH);

	}
	
	private class Evento_radio implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==boton1) {
				texto.setFont(new Font("Serif", Font.PLAIN, 10));
			} else if (e.getSource()==boton2) {
				texto.setFont(new Font("Serif", Font.PLAIN, 14));
			} else if (e.getSource()==boton3) {
				texto.setFont(new Font("Serif", Font.PLAIN, 18));
			} else if (e.getSource()==boton4) {
				texto.setFont(new Font("Serif", Font.PLAIN, 22));
			}
		
		}
		
	}
	
	private JLabel texto;
	private JRadioButton boton1,boton2,boton3,boton4;
}