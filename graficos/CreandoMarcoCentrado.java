package graficos;

import java.awt.Toolkit;
import java.awt.*;
import javax.swing.*;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		
		MarcoCentrado mimarco = new MarcoCentrado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}
}


class MarcoCentrado extends JFrame {
	
	public MarcoCentrado() {
		
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
		
		Dimension tamanoPantalla=mipantalla.getScreenSize();
		
		int alturaPantalla=tamanoPantalla.height;
		int anchoPantalla=tamanoPantalla.width;
		
		setSize(anchoPantalla/2, alturaPantalla/2);
		setLocation(anchoPantalla/4, alturaPantalla/4);
		
		setTitle("Marco centrado");

		// Pildoras
		Image miIcono=mipantalla.getImage("src/img/icon1.jpg");
		setIconImage(miIcono);
		
		// Chat GPT
//		ImageIcon miIcono = new ImageIcon("src/graficos/icon1.jpg");
//		setIconImage(miIcono.getImage());
		
	}
}