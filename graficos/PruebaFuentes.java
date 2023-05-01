package graficos;

import java.awt.*;
import javax.swing.*;

public class PruebaFuentes {

	public static void main(String[] args) {

		MarcoConFuentes mimarco = new MarcoConFuentes();		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		mimarco.setVisible(true);
	}
}


class MarcoConFuentes extends JFrame {
	
	public MarcoConFuentes() {
		
		setTitle("Prueba con fuentes");
		setSize(400,400);
		LaminaConFuentes milamina = new LaminaConFuentes();
		add(milamina);	
		
		// TODOS LOS ELEMENTOS EN UN COLOR
		milamina.setForeground(Color.CYAN);
	}
}


class LaminaConFuentes extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;	
		
		Font mifuente = new Font("Arial", Font.BOLD, 26);
		g2.setFont(mifuente);
//		g2.setColor(Color.blue);
		g2.drawString("Alejandro", 100, 100);
		
		g2.setFont(new Font("Courier", Font.ITALIC, 20));
//		g2.setColor(Color.green);
		g2.drawString("Curso de Java", 100, 200);
	}
}