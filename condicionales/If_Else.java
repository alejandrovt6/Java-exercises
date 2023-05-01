package condicionales;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {

			Scanner entrada=new Scanner(System.in);
			
			System.out.println("Introduce edad");
			int edad=entrada.nextInt();
			
			if (edad<=18) {
				System.out.println("Es menor de edad");
			}
			else {
				System.out.println("Es mayor de edad");	
	}
	}
}
