package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Basico;
import entities.Medio;

public class CadEstudante {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		char opcao;
		
		//menu
		do {
			System.out.println("ESCOLA ED+");
			System.out.println("AQUI OU VAI OU VAI MESMO!!!!");
			System.out.println();
			System.out.println("1 - BÁSICO\n2- MÉDIO\n3 - GRADUAÇÃO\n4 - PÓS\n5 - MESTRADO\n6 - SAIR");
			System.out.println("DIGITE A OPÇÃO SELECIONADA: ");
			opcao = leia.next().charAt(0);
			if(opcao == '1') {
				
				System.out.println("Digite a matricula do aluno");
				int matricula = leia.nextInt();
				System.out.println("Digite o cpf do aluno: ");
				String cpf = leia.next();
				System.out.println("Digite o dia de aniversario do aluno: ");
				int diaAniversario = leia.nextInt();
				
				Basico aluno = new Basico(matricula,cpf,diaAniversario);
				
				System.out.println("Digite a nota:");
				double nota = leia.nextDouble();
				aluno.incluirPontos(nota);
				if(aluno.getPontos() <=5) {
					System.out.println("Ainda não");
				} 
				else {
					System.out.println("Parabens!");
				}
				System.out.println("Qual o dia de hoje?");
				int diaAtual = leia.nextInt();
				aluno.bonusDiaAniversario(diaAtual);
				System.out.println("PONTOS ATUAIS: "+aluno.getPontos());
				System.out.println("Continua 1 - Sim ou 2 - não?");
				opcao = leia.next().charAt(0);
				
			}
			
			else if (opcao == '2') {
				System.out.println("Digite a matricula do aluno");
				int matricula = leia.nextInt();
				System.out.println("Digite o cpf do aluno: ");
				String cpf = leia.next();
				
				Medio aluno = new Medio(matricula, cpf, opcao);
				
				System.out.println("Digite a nota:");
				double nota = leia.nextDouble();
				aluno.incluirPontos(nota);
				if(aluno.getPontos() <=5) {
					System.out.println("Ainda não");
				} 
				else {
					System.out.println("Parabens!");
				}
				aluno.imprimirBoletim();
				System.out.println("Continua 1 - Sim ou 2 - não?");
				opcao = leia.next().charAt(0);
			}
		}while (opcao != '6');
		
		System.out.println("FIM DO PROGRAMA");
	}
	

}
