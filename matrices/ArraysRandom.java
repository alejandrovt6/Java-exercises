package matrices;

public class ArraysRandom {

	public static void main(String[] args) {

		int[] matriz_random=new int[50];
		
		for(int i=0; i<matriz_random.length; i++) {
			matriz_random[i]=(int)Math.round(Math.random()*100);

		}
		
		for(int numeros:matriz_random) {
			System.out.print(numeros + " ");
		}
	}

}
