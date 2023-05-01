package bucles;

import javax.swing.JOptionPane;

public class ComprobarMail1 {

	public static void main(String[] args) {

	boolean arroba=false;
	
	String mail=JOptionPane.showInputDialog("Introduce mail");
	
	for (int i=0; i<mail.length(); i++) {
		
		if(mail.charAt(i)=='@') {
			// Comillas simples los datos tipo char
			arroba=true;
		}
	}
	
	if(arroba==true) {
		System.out.println("Correcto");
	}
	else {
		System.out.println("Incorrecto");
	}
	
	
	}

}
