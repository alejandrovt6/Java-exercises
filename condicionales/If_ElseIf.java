package condicionales;

import java.util.Scanner;

public class If_ElseIf {

	public static void main(String[] args) {

		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce edad");
		int edad=entrada.nextInt();
		

		if (edad<18) {
			System.out.println("Eres menor");
		}
		
		else if (edad<=65) {
			System.out.println("Persona joven");
		}
		
		else if (edad>65) {
			System.out.println("Es jubilado");
		}
		
		else {
			System.out.println("Buen día");
		}
	}
}
