package VideoAulas;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int y;
		y = sc.nextInt();
		System.out.println("Voc� digitou: " + y);
		
		
		System.out.println("Digite um numero decimal");
		double w;
		w = sc.nextDouble();
		System.out.println("Voc� digitou: ");
		
		
		System.out.println("Digite uma palavra");
		String x;
		x = sc.next();
		System.out.println("Voc� digitou: " + x);
		sc.close();
	}

}
