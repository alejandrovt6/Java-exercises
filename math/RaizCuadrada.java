package math;

import java.math.*;

public class RaizCuadrada {

	public static void main(String[] args) {

		double raiz = Math.sqrt(27);

		System.out.println(raiz);
		
		// REDONDEAR
	    double num = 27;
	    int decimalPlaces = 2;

	    double sqrt = Math.sqrt(num);

	    double factor = Math.pow(10, decimalPlaces);
	    double roundedSqrt = Math.round(sqrt * factor) / factor;

	    System.out.println(roundedSqrt); 
	  }	
	}
