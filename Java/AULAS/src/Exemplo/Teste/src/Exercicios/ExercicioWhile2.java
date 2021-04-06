package Exercicios;

import java.util.Scanner;

public class ExercicioWhile2 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		final int LIMITE = 5;
		int idade;
		char sexo; //  feminino/masculino/outros
		char opcao; // calma/ nervosa/agressiva
		int contador = 1;
		char continua = 'S';
		int pessoasCalmas = 0;
		int mulheresNervosas = 0;
		int homensAgressivos = 0;
		int outrosCalmos = 0;
		int pessoasNervosasMais40Anos = 0;
		int pessoasCalmasMenos18Anos = 0;
		
		while(continua == 'S' && contador <= LIMITE) {
			System.out.println("Informe a sua idade:");
			idade = leia.nextInt();
			System.out.println("Digite o seu genero: 1 - Feminino 2 - masculino 3 - outros");
			sexo = leia.next().charAt(0);
			System.out.println("Digite o seu humor: 1 - calma 2 - nervosa 3 - agressiva ");
			opcao = leia.next().charAt(0);
			if (contador !=3) {
			System.out.print("Você deseja fazer a pesquisa? S - Sim N - Não ");
			continua = leia.next().toUpperCase().charAt(0);
			}
			
			if(opcao == '1') {
				pessoasCalmas++;
				}
			
			if (sexo == '1' && opcao == '2') {
				mulheresNervosas++;
			}
			if(sexo == '2' && opcao == '3') {
				homensAgressivos++;
			}
			if(sexo == '3' && opcao == '1') {
				outrosCalmos++;
			}
			if(opcao == '2' && idade >=40) {
				pessoasNervosasMais40Anos ++;
			}
			if(opcao == '1' && idade < 18) {
				pessoasCalmasMenos18Anos++;
				
				} 
			
				contador++;
			
		}
		System.out.println("pessoas Calmas" + pessoasCalmas);
		System.out.println("mulheres Nervosas" + mulheresNervosas);
		System.out.println("homens Agressivos" + homensAgressivos);
		System.out.println("outros Calmos" + outrosCalmos);
		System.out.println("pessoas Nervosas Mais 40 Anos" + pessoasNervosasMais40Anos);
		System.out.println("pessoas Calmas Menos 18 Anos" + pessoasCalmasMenos18Anos);
		System.out.println("Fim do programa!");
		
	}

}
