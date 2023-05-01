package graficos;

import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;

public class PruebaImagen {

	public static void main(String[] args) {

		MarcoImagen mimarco = new MarcoImagen();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class MarcoImagen extends JFrame {
	
	public MarcoImagen() {
		
		setTitle("Marco con imagen");
		setBounds(750,300,600,450);
		LaminaConImagen milamina = new LaminaConImagen();
		add(milamina);
	}
}


class LaminaConImagen extends JPanel {
	
	private Image imagen;	
	
	public LaminaConImagen() {
		
//		File miImagen = new File("src/graficos/coche.png");
		try {  
		imagen=ImageIO.read(new File("src/img/coche.png")); // COCHE
//		imagen=ImageIO.read(new File("src/img/bola.gif"));  // BOLA
		}
		catch(IOException e) {
			System.out.println("La imagen no se encuentra");
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
//		g.drawImage(imagen, 5, 5, null); // COCHE
		
		// REPETIR	
		int anchoImg=imagen.getWidth(this);
		int altoImg=imagen.getHeight(this);
		g.drawImage(imagen, 0, 0, null);  
		for(int i=0; i<300;i++) {
			for(int j=0;j<200;j++) {
				if(i+j>0) {
					g.copyArea(0, 0, anchoImg, altoImg, anchoImg*i, altoImg*j);
				}
			}
		}	
	}
}