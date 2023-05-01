package in_out;

import java.util.*;

public class InOut {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre");
		String nombre = entrada.nextLine();
		
		System.out.println("Introduce tu edad");
		int edad = entrada.nextInt();
		
		System.out.println("Hola " + nombre + " el año que viene tendrás " + (edad+1) + " años");
	}

}
