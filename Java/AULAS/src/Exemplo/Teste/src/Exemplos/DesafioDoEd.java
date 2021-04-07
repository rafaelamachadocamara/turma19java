package Exemplos;

import java.util.Scanner;

public class DesafioDoEd {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//NOME, ANO NASCIMENTO, IDADE, É MAIS NOVO[A]/VELHO[A]
		
		final int ANO_ATUAL = 2021;
		
		String nome, nome2;
		char genero;
		int anoNascimento;
		int idade = 0;
		int maiorIdade = 0;
		int mesmaIdade;
		
		for(int i = 0; i < 2; i++) {
			System.out.printf("Digite o nome da %d pessoa: ",i+1);
			nome = leia.next();
			
			System.out.printf("%s digite o ano de nascimento: ", nome);
			anoNascimento = leia.nextInt();
			
			System.out.println("Digite seu genero F - Feminino | M - Masculino | O - Outros");
			genero = leia.next().toUpperCase().charAt(0);
			
			idade = ANO_ATUAL - anoNascimento;
			
			if(idade > maiorIdade) {
				maiorIdade = idade;
			}
		}
		
		
		
		
	}

}
