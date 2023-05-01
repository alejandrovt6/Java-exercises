package bucles;

import javax.swing.*;

public class PesoIdeal {

	public static void main(String[] args) {

		String genero="";
		
		do {
			genero=JOptionPane.showInputDialog("Introduce tu género (H/M)");
		} while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		// Este metodo equals NO distingue de minúsculas y mayúsculas
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
		
		int pesoideal=0;
		
		if(genero.equalsIgnoreCase("H")) {
			pesoideal=altura-110;
		}
		
		else if(genero.equalsIgnoreCase("M")) {
			pesoideal=altura-120;
		}
		
		System.out.println("Tu peso ideal es: " + pesoideal);
	}

}
