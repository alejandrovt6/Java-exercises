package matrices;

public class ArraysBid2 {

	public static void main(String[] args) {

		int [][] matrix={
				{10,15,18,19,21},
				{85,47,41,23,87,96},
				{8,65,23,14,78},
				{2,31,21,41,58}			
		};
		
		
		for(int i=0; i<4; i++) {
			System.out.println(" ");
			for(int j=0; j<5; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}	
		System.out.println("\n");
		System.out.println("*************");
			
		// CON BUCLE FOR EACH
		for(int[]fila:matrix) {
			System.out.println();
			for(int z: fila) {
				System.out.print(z + " ");
			}	
		}
	}
}
