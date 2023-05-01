package in_out;

import javax.swing.JOptionPane;

public class InOutNumbers {

	public static void main(String[] args) {

		double x=10000.0;
		// imprime con forma: redondea decimales
		System.out.printf("%1.2f", x/3);
		
		System.out.println(" ");
		System.out.println("***********");
		
		String num1=JOptionPane.showInputDialog("Introduce un número");
		
		double num2=Double.parseDouble(num1);
		
		System.out.print("La raiz de " + num2 + " es ");
		System.out.printf("%1.2f", Math.sqrt(num2));
	}

}
