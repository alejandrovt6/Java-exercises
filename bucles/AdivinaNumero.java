package bucles;

import java.util.*;

public class AdivinaNumero {

	public static void main(String[] args) {
		
		int nrandom=(int)(Math.random()*100);

//		System.out.println(nrandom);
		
		
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		int intentos=0;
		
		while (numero!=nrandom) {
			intentos++;
			System.out.println("Introduce un número");
			
			numero=entrada.nextInt();
		
			if(nrandom<numero) {
				System.out.println("Más bajo");
			}
			
			else if(nrandom>numero) {
				System.out.println("Más alto");
			}
		}
		System.out.println("Correcto. Lo conseguiste en " + intentos + " intentos.");
	}

}
