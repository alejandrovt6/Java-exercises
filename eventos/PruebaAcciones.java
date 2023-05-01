package eventos;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import java.awt.Color;
import java.awt.event.*;

public class PruebaAcciones {

	public static void main(String[] args) {
		
		MarcoAccion marco = new MarcoAccion();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}
}


class MarcoAccion extends JFrame {
	
	public MarcoAccion() {
		
		setTitle("Prueba Acciones");
		setBounds(600,350,600,300);
		PanelAccion lamina = new PanelAccion();
		add(lamina);
	}	
}


class PanelAccion extends JPanel {
		
	public PanelAccion() {
		
		AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/iconos/bola_amarilla.jpg"), Color.yellow);
		AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/iconos/bola_azul.png"), Color.blue);
		AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/iconos/bola_roja.jpg"), Color.red);

		/*JButton amarillo = new JButton(accionAmarillo);
		add(amarillo);*/
		
		add(new JButton(accionAmarillo));
		add(new JButton(accionAzul));
		add(new JButton(accionRojo));

		/*
		JButton amarillo = new JButton("Amarillo");
		JButton azul = new JButton("Azul");
		JButton rojo = new JButton("Rojo");
		
		add(amarillo);
		add(azul);
		add(rojo); */
		
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
//		KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_amarillo");
		ActionMap mapaAccion = getActionMap();
		mapaAccion.put("fondo_amarillo", accionAmarillo);
		
//		KeyStroke teclaAzul = KeyStroke.getKeyStroke("ctrl B");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");
		mapaAccion.put("fondo_azul", accionAzul);
		
//		KeyStroke teclaRojo = KeyStroke.getKeyStroke("ctrl R");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rojo");
		mapaAccion.put("fondo_rojo", accionRojo);
	}	
	
	private class AccionColor extends AbstractAction {

		public AccionColor(String nombre, Icon icono, Color colorBoton) {
			
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color " + nombre);
			putValue("color_fondo", colorBoton);
		}
		 
		public void actionPerformed(ActionEvent e) {
			Color c = (Color)getValue("color_fondo");
			setBackground(c);
			
			System.out.println("Nombre: " + getValue(Action.NAME) + " Descripción: " + getValue(Action.SHORT_DESCRIPTION));
			
		}	
	}
}


