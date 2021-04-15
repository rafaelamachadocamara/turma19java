package VideoAulas;

import java.util.Scanner;

public class EstruturaRepetitivaFor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int n = leia.nextInt();
		
		int soma = 0;
		
		for(int i = 0; i < n; i++) {
			int x = leia.nextInt();
			soma = soma + x;
		}
		System.out.println(soma);
		
		leia.close();
	}
			
}

