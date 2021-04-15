package VideoAulas;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioLacoRepeticao4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro: ");
		int n = leia.nextInt();
		
		for(int i = 0; i<n; i++) {
			
			System.out.print("Digite mais um numero: ");
			int x = leia.nextInt();
			System.out.print("Digite o ultimo numero: ");
			int y = leia.nextInt();
			
			if( y == 0) {
				System.out.println("Divisão Impossivel.");
			}
			else {
				double divisao = (double) x / y;
				System.out.printf("%.1f%n", divisao);
			}
			
		}
		
	}

}
