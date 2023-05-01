package graficos;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class PruebaColores {

	public static void main(String[] args) {
		
		MarcoColor mimarco = new MarcoColor();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}
}


class MarcoColor extends JFrame {
	
	public MarcoColor() {
		setTitle("Prueba con colores");
		setSize(400,400);
		LaminaColor milamina = new LaminaColor();
		add(milamina);		
		milamina.setBackground(Color.PINK);
	}
}


class LaminaColor extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			
			// RECTÁNGULO
			Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
			g2.setPaint(Color.BLUE);
			g2.draw(rectangulo);
			g2.setPaint(Color.RED);
			g2.fill(rectangulo);
		//	g2.draw(rectangulo);
			
			// ELIPSE
			Ellipse2D elipse = new Ellipse2D.Double();
			elipse.setFrame(rectangulo);
			g2.setPaint(new Color(0,250,255).brighter());
			g2.fill(elipse);
		//	g2.draw(elipse);
			
		// 	INSTANCIAR UN COLOR
			Color micolor = new Color(15,54,125);
			g2.setPaint(micolor); 

		}
	}
	
