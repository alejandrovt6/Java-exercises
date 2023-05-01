package matrices;

import javax.swing.*;

public class ArraysInput {

	public static void main(String[] args) {

		 String [] paises = new String[4];

		 for(int i=0; i<4; i++) {
			paises[i]=JOptionPane.showInputDialog("Introduce país" + (i+1));
		 }
		 
		 for(String elemento:paises) {
			 System.out.println("Pais: " + elemento);
		 }
	}

}
