package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Biquini;

public class CadVendas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		char opcao;
		do {
			System.out.println("BEM VINDES A LOJA GENNER!");
			System.out.println("\nEscolha uma categoria para navegar em nosso site");
			System.out.println();
			System.out.println(
					" 1 - Biquini \n 2 - Calça \n 3 - Camisa \n 4 - Casaco \n 5 - Chinelo \n 6 - Meia \n 7- Sandalia \n 8 - Sunga \n 9 - Tenis \n 0 - Sair");
			opcao = leia.next().charAt(0);
			if (opcao == '1') {
				System.out.println("Você escolheu biquini!");
				Biquini prod1 = new Biquini("Biquini Rosa", "333", "Genner", "38", 10,99.90);
				System.out.println("Descrição do produto:" + prod1.getDescricao());
				System.out.println("O preço deste Biquini é R$:"+ prod1.getValorBiquini());
				System.out.println("Digite o tamanho que você deseja:");
				prod1.getTamanho();
				System.out.println("Digite o numero de quantidade desejada:");
			}

		} while (opcao != '1' || opcao != '2' || opcao != '3' || opcao != '4' || opcao != '5' || opcao != '6'
				|| opcao != '7' || opcao != '8' || opcao != '9' || opcao != '0');
				System.out.println("Opção Invalida.");

	}
}