package bucles;

import java.util.Scanner;

public class NumeroConDoWhile {

	public static void main(String[] args) {
			
			int nrandom=(int)(Math.random()*100);
			
			Scanner entrada=new Scanner(System.in);
			
			int numero=0;
			int intentos=0;
			
			// do{lineas} while(condicion);
			do {
				intentos++;
				System.out.println("Introduce un número");
				
				numero=entrada.nextInt();
			
				if(nrandom<numero) {
					System.out.println("Más bajo");
				}
				
				else if(nrandom>numero) {
					System.out.println("Más alto");
				}
				
			}while (numero !=nrandom);
				
			System.out.println("Correcto. Lo conseguiste en " + intentos + "intentos.");
		}

	}

