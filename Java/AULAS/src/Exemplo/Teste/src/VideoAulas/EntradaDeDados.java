package VideoAulas;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);
		
		
		System.out.println("Digite um numero decimal");
		double w;
		w = sc.nextDouble();
		System.out.println("Você digitou: ");
		
		
		System.out.println("Digite uma palavra");
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		sc.close();
	}

}
