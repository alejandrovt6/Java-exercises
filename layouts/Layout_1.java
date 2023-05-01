package layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layout_1 {
	
	public static void main(String[] args) {
		
		MarcoLayout marco = new MarcoLayout();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
		
	}

}


class MarcoLayout extends JFrame {
	
	public MarcoLayout() {
		
		setTitle("Acciones");
		setBounds(600,350,600,300);
		PanelLayout lamina = new PanelLayout();
		//FlowLayout disposicion = new FlowLayout(FlowLayout.LEFT);
		//lamina.setLayout(new FlowLayout(FlowLayout.LEFT));
//		lamina.setLayout(new FlowLayout(FlowLayout.LEFT));
//		lamina.setLayout(new FlowLayout(FlowLayout.CENTER,20,80));
		PanelLayout2 lamina2 = new PanelLayout2();
		
		add(lamina,BorderLayout.NORTH);
		add(lamina2,BorderLayout.SOUTH);
	}
	
}


class PanelLayout extends JPanel {
	
	public PanelLayout() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JButton("Amarillo"));
		add(new JButton("Rojo"));

	}
}


class PanelLayout2 extends JPanel {
	
	public PanelLayout2() {
		setLayout(new BorderLayout(10,10));
		add(new JButton("Azul"),BorderLayout.WEST);
		add(new JButton("Verde"),BorderLayout.EAST);
		add(new JButton("Morado"),BorderLayout.CENTER);
	}
}