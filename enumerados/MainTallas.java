package enumerados;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainTallas {
	
//1.	enum Talla {PEQUEÑO, MEDIANO, GRANDE, MUY_GRANDE};
	
	enum Talla {
		PEQUEÑO("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");

		private Talla(String abreviatura) {
			this.abreviatura=abreviatura;
		}
		
		public String dameAbreviatura(){
			return abreviatura;
		}
		
		private String abreviatura;
	}

	public static void main(String[] args) {

/*1.	Talla S=Talla.PEQUEÑO;
		Talla M=Talla.MEDIANO;
		Talla L=Talla.GRANDE;
		Talla XL=Talla.MUY_GRANDE;
*/
		Scanner entrada=new Scanner(System.in);
		System.out.println("Escribe una talla: PEQUEÑO, MEDIANO,GRANDE, MUY_GRANDE");
		String entrada_datos=entrada.next().toUpperCase();
		
		Talla la_talla=Enum.valueOf(Talla.class, entrada_datos);
		
		System.out.println("Talla = " + la_talla);
		System.out.println("Abreviatura = " + la_talla.abreviatura);
	}

}
