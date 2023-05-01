package swing;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PruebaChecks {

	public static void main(String[] args) {

		MarcoCheck mimarco=new MarcoCheck();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}



class MarcoCheck extends JFrame {
	
	public MarcoCheck() {
		
		setBounds(550,300,550,350);
		LaminaCheck milamina=new LaminaCheck();
		add(milamina);
		setVisible(true); // Siempre llamar al final

	}	
}


class LaminaCheck extends JPanel{
	
	public LaminaCheck() {
		
		setLayout(new BorderLayout());
		Font miletra=new Font("Serif",Font.PLAIN,24);
		texto=new JLabel("En un lugar de la Mancha...");
		texto.setFont(miletra);
		
		JPanel laminatexto=new JPanel();
		laminatexto.add(texto);
		add(laminatexto, BorderLayout.CENTER);
		
		check1=new JCheckBox("Negrita");
		check2=new JCheckBox("Cursiva");
		
		check1.addActionListener(new ManejaChecks());
		check2.addActionListener(new ManejaChecks());
		JPanel laminachecks=new JPanel();
		laminachecks.add(check1);
		laminachecks.add(check2);
		add(laminachecks,BorderLayout.SOUTH);
	}
	
	private class ManejaChecks implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int tipo=0;
			if(check1.isSelected()) tipo+=Font.BOLD;
			if(check2.isSelected()) tipo+=Font.ITALIC;
			texto.setFont(new Font("Serif",tipo,24));
				
			// En la API se da valor numérico al formato
		}
	}
	
	private JLabel texto;
	private JCheckBox check1,check2;
	
}