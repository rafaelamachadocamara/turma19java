package Exemplos;

import java.util.Scanner;

public class LaçoCondicional1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int idade;
		String nome;
		
		System.out.println("Digite a sua idade");
		idade = leia.nextInt();
		leia.nextLine();
		System.out.println("Digite o seu nome");
		nome = leia.nextLine();
		System.out.printf("\nSeu nome: %s", nome);
		System.out.printf("\nSua idade: %d", idade);
		
		if(idade >=18) {
			System.out.println("\nVocê é maior de idade");
		}
		else if(idade >=1 && idade <18) {
			System.out.println("\nVocê é menor de idade");
		}
		else {
			System.out.println("\nVocê entrou com uma idade invalida");
		}
	}

}
