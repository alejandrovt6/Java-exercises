package swing;

import javax.swing.*;


public class SintaxisRadio {

	public static void main(String[] args) {

		MarcoRadioSintaxis mimarco=new MarcoRadioSintaxis();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}


class MarcoRadioSintaxis extends JFrame {
	 
	public MarcoRadioSintaxis() {
		
		setVisible(true);
		setBounds(550,300,500,300);
		LaminaRadioSintaxis milamina=new LaminaRadioSintaxis();
		add(milamina);
	}
}


class LaminaRadioSintaxis extends JPanel {
	
	public LaminaRadioSintaxis() {
		
		ButtonGroup migrupo1=new ButtonGroup();
		
		JRadioButton boton1=new JRadioButton("Azul", false);
		JRadioButton boton2=new JRadioButton("Rojo", true);
		JRadioButton boton3=new JRadioButton("Verde", false);

		migrupo1.add(boton1);
		migrupo1.add(boton2);
		migrupo1.add(boton3);
		
		add(boton1);
		add(boton2);
		add(boton3);
		
		ButtonGroup migrupo2=new ButtonGroup();
		
		JRadioButton boton4=new JRadioButton("M", false);
		JRadioButton boton5=new JRadioButton("F", false);
		
		migrupo2.add(boton4);
		migrupo2.add(boton5);
		
		add(boton4);
		add(boton5);

	}
}