package VideoAulas;

import java.util.Scanner;

public class LacoRepeticaoWhile {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int x = leia.nextInt();
		int soma = 0;
		
		while (x != 0) {
			soma += x;
			x = leia.nextInt();
		}
		
		System.out.println("A soma desses numeros deu: "+soma);
		leia.close();
	}
}
