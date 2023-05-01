package clases_internas;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador3 {
	
	public static void main(String[] args) {

		Reloj2 mireloj = new Reloj2();
		
		mireloj.enMarcha(3000, true);
		
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar");
		
		System.out.println(0);
	}

}


class Reloj2 {
	
	public void enMarcha(int intervalo, final boolean sonido) {
		
		// CLASE INTERNA
		class DameLaHora3 implements ActionListener{
			public void actionPerformed(ActionEvent evento) {
				Date ahora = new Date();
				System.out.println("Te pongo la hora cada 3 sg " + ahora);
				if(sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
			}	
		}
		
		ActionListener oyente = new DameLaHora3();
		
		Timer mitemporizador = new Timer(intervalo, oyente);
		
		mitemporizador.start();
	}
	
}
	
/*	private int intervalo;
	private boolean sonido;  
*/	
	
/*	public Reloj2(int intervalo, boolean sonido) {
		this.intervalo=intervalo;
		this.sonido=sonido;
*/		
		


	
