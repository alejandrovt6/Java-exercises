package matrices;

public class UsoArrays2 {

	public static void main(String[] args) {
		
		 String [] paises=new String[5];
		 
		 paises[0]="España";
		 paises[1]="Alemania";
		 paises[2]="Francia";
		 paises[3]="Holanda";
		 paises[4]="Italia";
		 
		 String [] ciudades= {"Madrid", "Paris", "Berlin", "Moscú", "Londres"};		 

		 for(int i=0; i<paises.length; i++) {
			 System.out.println("País " + (i+1) + ": " + paises[i]);
		 }
		 
		 System.out.println("*********");
		 
		 for(String countries:paises) {
			 System.out.println("País: " + countries);
		 }
		 
		 System.out.println("*********");
		 
		 for(String cities:ciudades) {
			 System.out.println("Ciudad: " + cities);
		 }

	}

}
