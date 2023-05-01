package eventos;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;

public class EventosFoco {

	public static void main(String[] args) {

		MarcoFoco mimarco = new MarcoFoco();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoFoco extends JFrame {
	
	public MarcoFoco() {
		setVisible(true);
		setBounds(300,300,600,450);
		add(new LaminaFoco());
	}
}


class LaminaFoco extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		setLayout(null);
		
		cuadro1 = new JTextField();	
		cuadro2 = new JTextField();	
		
		cuadro1.setBounds(120,10,150,20);
		cuadro2.setBounds(120,50,150,20);
		
		add(cuadro1);
		add(cuadro2);
		
		LanzaFocos elfoco = new LanzaFocos();
		cuadro1.addFocusListener(elfoco);
	}
	
	private class LanzaFocos implements FocusListener {

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub

			String email = cuadro1.getText();
			boolean comprobar = false;
			for(int i=0;i<email.length();i++) {
				if(email.charAt(i)=='@') {
					comprobar=true;
				}
			}
			
			if(comprobar) {
				System.out.println("Correcto");
			} else {
				System.out.println("Incorrecto");
			}
		}
	}
	
	JTextField cuadro1;
	JTextField cuadro2;
}


