package eventos;

import java.awt.event.*;

import javax.swing.JFrame;

public class EventosRaton2 {

	public static void main(String[] args) {

		MarcoRaton2 mimarco = new MarcoRaton2();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoRaton2 extends JFrame {
	
	public MarcoRaton2() {
		setVisible(true);
		setBounds(700,300,600,450);
		
		EventoRaton2 mieventoraton2 = new EventoRaton2();
		addMouseListener(mieventoraton2);
		
		EventoRaton3 mieventoraton3 = new EventoRaton3();
		addMouseMotionListener(mieventoraton3);
	}
	
}


class EventoRaton2 extends MouseAdapter {
	
	public void mouseClicked(MouseEvent e) {
		
		System.out.println("Coordenada X: " + e.getX() + " Coordenada Y: " + e.getY());
		System.out.println(e.getClickCount());
	}
	
	public void mousePressed(MouseEvent e) {
		
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println("You pressed left button");
		} else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("You pressed mouse wheel");
		} else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("You pressed right button");
		}
	}

}


class EventoRaton3 implements MouseMotionListener {

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You are dragging");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You are moving");
	}
	
}


