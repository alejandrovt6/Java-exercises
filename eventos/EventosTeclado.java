package eventos;

import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventosTeclado {

	public static void main(String[] args) {

		MarcoConTeclas mimarco = new MarcoConTeclas();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


class MarcoConTeclas extends JFrame {
	
	public MarcoConTeclas() {
		setVisible(true);
		setTitle("Eventos teclado");
		setBounds(700,300,600,450);
		
		EventoTeclado tecla = new EventoTeclado();
		addKeyListener(tecla);

	}
}


class EventoTeclado implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		char letra=e.getKeyChar();
		System.out.println(letra);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int codigo = e.getKeyCode();
		System.out.println(codigo);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	
}