package Exemplos;

import java.util.Scanner;

public class LaçoRepeticao2 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);

		int idade;
		
		System.out.println("Entre com a sua idade");
		idade = leia.nextInt();
		
			do {
				System.out.println("Entre com a sua idade:");
				idade = leia.nextInt();
				System.out.printf("Sua idade: %d", idade);
			if(idade >=18) {
				System.out.println("Você é maior de idade");
			}
			else {
				System.out.println("Você é menor de idade.");
			}
			
		}while(idade >=1);
			}
			
	}


