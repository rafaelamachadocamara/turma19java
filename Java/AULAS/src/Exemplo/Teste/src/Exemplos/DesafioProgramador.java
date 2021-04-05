package Exemplos;

import java.util.Scanner;

public class DesafioProgramador {

	public static void main(String[] args) {
		//RECEBEU O AUXILIO ANTES
//NÃO PODE TER RECEBIDO BOLSA FAMILIA
//A CADA FILHO MAIS 50 REAIS
//CHEFA DE FAMILIA GANHA O DOBRO
//VALOR BASE 300 REAIS
//AUXILIO EMERGENCIA
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int chefa;
		int auxilioAnterior;
		int bolsaFamilia = 0;
		int filhos;
		int quantidadeFilhos = 50;
		int auxilio = 300;
		
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		System.out.println("Você é chefe de familia? 1 - SIM 2 - NÃO");
		chefa = leia.nextInt();
		System.out.println("Quantos filhos você tem?");
		filhos = leia.nextInt();
		
		if(chefa == 1 && auxilioAnterior == 2 && bolsaFamilia == 2 ) {
			auxilio *=2;
			quantidadeFilhos *= filhos;
			auxilio += quantidadeFilhos;
			System.out.println("Você recebera R$ " + auxilio);
		}
		
		
		else if(chefa == 2 && auxilioAnterior == 2 && bolsaFamilia == 2) {
			quantidadeFilhos *= filhos;
			auxilio += quantidadeFilhos;
			
		}
}
	
			
		}


	


