package matrices;

public class UsoArrays {

	public static void main(String[] args) {

		int [] mi_matriz_1=new int[5];
		
		mi_matriz_1[0]=5;
		mi_matriz_1[1]=34;
		mi_matriz_1[2]=11;
		mi_matriz_1[3]=13;
		mi_matriz_1[4]=9;
		

		int [] mi_matriz_2={8, 6, 4, 88, 52};
		
		int [] mi_matriz_3={8, 6, 4, 88, 52, 5, 8, 6, 8, 9, 77, 85};


//		System.out.println(mi_matriz[0]);

		for(int i=0; i<5; i++) {
			System.out.println(mi_matriz_1[i]);
			System.out.println("Valor del índice " + i + " = " + mi_matriz_1[i]);
		}
		
		System.out.println("***********");
		
		for(int i=0; i<5; i++) {
			System.out.println("Valor del índice " + i + " = " + mi_matriz_2[i]);
		}
		
		System.out.println("***********");

		
		for(int i=0; i<mi_matriz_3.length; i++) {
			System.out.println("Valor del índice " + i + " = " + mi_matriz_3[i]);

		}

	}

}
