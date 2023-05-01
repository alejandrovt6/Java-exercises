package graficos;

import java.awt.Frame;

import javax.swing.*;

public class CreandoMarco {

	public static void main(String[] args) {
		
		miMarco marco1 = new miMarco();
		
		marco1.setVisible(true);		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Estos 2 se pueden colocar también en el constructor
	}
}



class miMarco extends JFrame{
	
	public miMarco() {
	//	setSize(500,500); // width, height
	//	setLocation(500,300); //x, y
		setBounds(500,300,500,500); // ubicación, dimensión
	//	setResizable(false); 
	//	setExtendedState(Frame.MAXIMIZED_BOTH);
		setTitle("Mi ventana");
	}
}
