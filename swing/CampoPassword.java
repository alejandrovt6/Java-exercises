package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class CampoPassword {

	public static void main(String[] args) {

		MarcoPassword mimarco=new MarcoPassword();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


class MarcoPassword extends JFrame {
	
	public MarcoPassword() {
		
		setBounds(400,300,550,400);
		LaminaPassword milamina=new LaminaPassword();
		add(milamina);
		setVisible(true);
	}
}


class LaminaPassword extends JPanel {
	
	public LaminaPassword() {
		
		setLayout(new BorderLayout());
		
		JPanel lamSup=new JPanel();
		lamSup.setLayout(new GridLayout(2,2));
		add(lamSup,BorderLayout.NORTH);
		
		JLabel etiqueta1=new JLabel("Usuario: ");
		JLabel etiqueta2=new JLabel("Contraseña: ");
		CompruebaPass mievento=new CompruebaPass();
		
		JTextField cUsu=new JTextField(15);
		cCon=new JPasswordField(15);
		cCon.getDocument().addDocumentListener(mievento);
		
		lamSup.add(etiqueta1);
		lamSup.add(cUsu);
		lamSup.add(etiqueta2);
		lamSup.add(cCon);
		
		JButton enviar=new JButton("Enviar");
		add(enviar,BorderLayout.SOUTH);
	}
	
	private class CompruebaPass implements DocumentListener {

		@Override
		public void insertUpdate(DocumentEvent e) {

			char [] pass;
			pass=cCon.getPassword();
			if(pass.length<8 || pass.length>12) {
				cCon.setBackground(Color.red);
			} else {
				cCon.setBackground(Color.WHITE);
			}
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	JPasswordField cCon;
}