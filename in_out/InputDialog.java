package in_out;

import javax.swing.*;

public class InputDialog {
	
	public static void main(String[] args) {
		
		String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
		
		String edad=JOptionPane.showInputDialog("Introduce tu edad");
		int edad_usuario = Integer.parseInt(edad);
		
		System.out.println("Hola " + nombre + " tienes " + edad_usuario + " años");
	}

}
