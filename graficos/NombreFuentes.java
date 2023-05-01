package graficos;

import java.awt.GraphicsEnvironment;

import javax.swing.JOptionPane;

public class NombreFuentes {

	public static void main(String[] args) {
		
		String fuente = JOptionPane.showInputDialog("Introduce fuente");
		
		boolean estalafuente = false;

		String [] nombresFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for(String nombreFuente: nombresFuentes) {			
		//	System.out.println(nombreFuente);
			
			if(nombreFuente.equals(fuente)) {
				estalafuente = true;
			}		
		}
		
		if(estalafuente) {
			System.out.println("Fuente instalada");
		} else {
			System.out.println("No está instalada la fuente");
		}
	}
}
