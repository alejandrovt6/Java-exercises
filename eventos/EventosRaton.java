package eventos;

import java.awt.event.*;

import javax.swing.JFrame;

public class EventosRaton {

	public static void main(String[] args) {

		MarcoRaton mimarco = new MarcoRaton();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoRaton extends JFrame {
	
	public MarcoRaton() {
		setVisible(true);
		setBounds(700,300,600,450);
		
		EventoRaton mieventoraton = new EventoRaton();
		addMouseListener(mieventoraton);
	}
	
}


class EventoRaton implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Has clicked");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Just pressed");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Just released the key");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Just entered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Just exited");
	}
	
}


