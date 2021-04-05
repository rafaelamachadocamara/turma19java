package Exemplos;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3;
		
		
		
		System.out.println("Digite o primeiro numero");
		n1 = leia.nextInt();
		System.out.println("Digite o segundo numero");
		n2 = leia.nextInt();
		System.out.println("Digite o terceiro numero");
		n3 = leia.nextInt();

		if ((n1 > n2) && (n1 > n3)) {
			
			System.out.println("A primeira opção possui o maior numero");
		} 
		else if((n2 > n1) && (n2 > n3)) {
			
			System.out.println("A segunda opção possui o maior numero");

		}
		else {
			System.out.println("A terceira opção possui o maior numero");

		}
			
			
	}

}
