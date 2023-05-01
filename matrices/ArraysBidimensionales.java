package matrices;

public class ArraysBidimensionales {

	public static void main(String[] args) {

		int [][] matrizBi=new int[4][5];
		
		matrizBi[0][0]=44;
		matrizBi[0][1]=422;
		matrizBi[0][2]=414;
		matrizBi[0][3]=22;
		matrizBi[0][4]=11;

		matrizBi[1][0]=17;
		matrizBi[1][1]=44;
		matrizBi[1][2]=69;
		matrizBi[1][3]=87;
		matrizBi[1][4]=96;

		matrizBi[2][0]=15;
		matrizBi[2][1]=1;
		matrizBi[2][2]=5;
		matrizBi[2][3]=115;
		matrizBi[2][4]=152;

		matrizBi[3][0]=153;
		matrizBi[3][1]=154;
		matrizBi[3][2]=155;
		matrizBi[3][3]=156;
		matrizBi[3][4]=157;

		System.out.println("Valor almacenado en 1, 1: " + matrizBi[0][0]);
		
		for(int i=0; i<4; i++) {
			System.out.println(" ");
			for(int j=0; j<matrizBi[1].length; j++) {  // matrizBi.length = 5 
				System.out.print(matrizBi[i][j] + " ");
			}
		}
		
	}

}
