package Exemplos;

public class ExemploDados {

	public static void main(String[] args) {
		
		import java.util.Scanner;

		public class TesteVetor {

		    public static void main(String[] args) {
		        Scanner tc = new Scanner(System.in);

		        int valores[] = new int[6];

		        System.out.println("Sorteando valores:");
		        for (int x=0; x<6; x++) {

		            valores[x] = (int) ((Math.random()*6)+1);
		            System.out.printf("%dº valor : %d\n",x+1,valores[x]);

		        }
		    }
		}
	}
}
