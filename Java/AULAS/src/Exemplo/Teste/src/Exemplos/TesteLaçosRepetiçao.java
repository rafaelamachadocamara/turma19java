package Exemplos;

public class TesteLa�osRepeti�ao {

	public static void main(String[] args) {
		
		int i = 1;
		
		while(i<=100) {
			System.out.println(i+", ");
			i++;
		}
		
		System.out.println("\nFim do la�o while \n");
		
		for(int j = 100 ; j>=0 ; j--){
			System.out.println(j+", ");
		}
		System.out.println("\nFim do la�o for \n");

	}

}
